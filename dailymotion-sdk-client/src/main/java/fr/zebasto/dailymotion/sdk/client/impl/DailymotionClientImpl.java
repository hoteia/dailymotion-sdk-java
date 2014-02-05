package fr.zebasto.dailymotion.sdk.client.impl;

import com.ning.http.client.AsyncHttpClientConfig;
import com.ning.http.client.ProxyServer;
import fr.zebasto.dailymotion.sdk.api.ApiError;
import fr.zebasto.dailymotion.sdk.api.ApiResponse;
import fr.zebasto.dailymotion.sdk.api.Connection;
import fr.zebasto.dailymotion.sdk.api.Endpoint;
import fr.zebasto.dailymotion.sdk.api.dto.*;
import fr.zebasto.dailymotion.sdk.client.DailymotionClient;
import fr.zebasto.dailymotion.sdk.client.constants.GenericConstants;
import fr.zebasto.dailymotion.sdk.client.constants.GenericErrorMessages;
import fr.zebasto.dailymotion.sdk.client.filter.OAuth2RequestFilter;
import org.jboss.netty.handler.codec.http.HttpMethod;
import org.resthub.web.Client;
import org.resthub.web.Http;
import org.resthub.web.JsonHelper;
import org.resthub.web.Response;
import org.resthub.web.exception.ClientExceptionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.text.MessageFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;

/**
 * Implementation of DailyMotion Client
 * Handles the following URL patterns :
 * <ul>
 * <li>/endpoints</li>
 * <li>/endpoint/{id}</li>
 * <li>/me/endpoint</li>
 * </ul>
 * And the following connection patterns :
 * <ul>
 * <li>/endpoint/{id}/connection</li>
 * <li>/endpoint/{id}/connection/{subId}</li>
 * </ul>
 * And also takes some optional parameters given in a map
 * Support the HTTP Methods :
 * <ul>
 * <li>GET</li>
 * <li>POST</li>
 * <li>PUT</li>
 * </ul>
 *
 * @see <a href="http://www.dailymotion.com/doc/api/graph-api.html">http://www.dailymotion.com/doc/api/graph-api.html</a>
 */
@Service(value = "dailymotionClient")
public class DailymotionClientImpl implements DailymotionClient, InitializingBean {
    /**
     * Root URL for Dailymotion SDK
     */
    @Value("${dailymotion.api.url}")
    private String dailymotionRootUrl;

    /**
     * Indicate if we use a proxy to reach the Media Controller/CAS Service
     */
    @Value("${dailymotion.api.useProxy}")
    private boolean useProxy;

    /**
     * Host of the Proxy
     */
    @Value("${dailymotion.api.proxyHost}")
    private String proxyHost;

    /**
     * Port of the Proxy
     */
    @Value("${dailymotion.api.proxyPort}")
    private int proxyPort;

    /**
     * Technical timeout for Media Controller requests
     */
    @Value("${dailymotion.api.timeout}")
    private int timeout;

    /**
     * Username used for the OAuth protocol
     */
    @Value("${dailymotion.auth.username}")
    private String username;

    /**
     * Password used for the OAuth protocol
     */
    @Value("${dailymotion.auth.password}")
    private String password;

    /**
     * ClientId defined on your Dailymotion App
     */
    @Value("${dailymotion.auth.clientId}")
    private String clientId;

    /**
     * ClientSecret defined on your Dailymotion App
     */
    @Value("${dailymotion.auth.clientSecret}")
    private String clientSecret;

    /**
     * HTTP Client used for API calls
     */
    private Client httpClient = new Client();

    /**
     * Static logger used for traces
     */
    private static final Logger LOGGER = LoggerFactory.getLogger(DailymotionClientImpl.class);

    /**
     * Map containing the different classes for responses
     */
    private Map<Class, ApiResponse<?>> availableResponses;

    /**
     * Scheme used for OAuth
     */
    @Value("${dailymotion.auth.scheme}")
    private String scheme;

    /**
     * Initialize the following components ;
     * <ul>
     * <li>HTTP Client for invocation of Rest Service</li>
     * <li>Eventually use a Proxy</li>
     * </ul>
     */
    @Override
    public void afterPropertiesSet() {
        Assert.notNull(this.dailymotionRootUrl, "The DailyMotion root url is null");
        Assert.notNull(this.useProxy, "The boolean useProxy is null");
        Assert.notNull(this.proxyHost, "The proxyHost is null, if you don't use a proxy, set it to empty !");
        Assert.notNull(this.proxyPort, "The proxyPort is null, if you don't use a proxy, set it to 0 !");
        Assert.notNull(this.username, "The username is null");
        Assert.notNull(this.password, "The password is null");
        Assert.notNull(this.clientId, "The clientId is null, you need to get one on your DailyMotion account");
        Assert.notNull(this.clientSecret, "The clientSecret is null, you need to get one on your DailyMotion account");

        OAuth2RequestFilter filter = new OAuth2RequestFilter(MessageFormat.format(GenericConstants.TWO_PARAMETERS.toString(), this.dailymotionRootUrl, "oauth/token"), this.clientId, this.clientSecret);
        filter.setCredentials(this.username, this.password);
        filter.setProxy(this.useProxy, this.proxyHost, this.proxyPort);
        filter.setSchemeName(this.scheme);

        AsyncHttpClientConfig.Builder builder = new AsyncHttpClientConfig.Builder();
        builder.setRequestTimeoutInMs(this.timeout);
        builder.addRequestFilter(filter);
        if (this.useProxy) {
            builder.setProxyServer(new ProxyServer(this.proxyHost, this.proxyPort));
            LOGGER.debug("Using proxy with url {}:{}", this.proxyHost, this.proxyPort);
        }
        this.httpClient = new Client(builder);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ApiResponse<?> doGet(Endpoint endPoint) throws ApiError {
        Assert.notNull(endPoint, GenericErrorMessages.NO_NULL_ALLOWED.toString());
        Assert.isTrue(!"ID".equals(endPoint.toString()), GenericErrorMessages.TYPE_ID_NOT_ALLOWED.toString());
        return this.doRequest(HttpMethod.GET, endPoint, null, null);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ApiResponse<?> doGet(Endpoint endPoint, Map<String, List<String>> params) throws ApiError {
        Assert.noNullElements(new Object[]{endPoint, params}, GenericErrorMessages.NO_NULL_ALLOWED.toString());
        Assert.isTrue(!"ID".equals(endPoint.toString()), GenericErrorMessages.TYPE_ID_NOT_ALLOWED.toString());
        return this.doRequest(HttpMethod.GET, endPoint, null, params);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ApiResponse<?> doGet(Endpoint endPoint, String id) throws ApiError {
        Assert.noNullElements(new Object[]{endPoint, id}, GenericErrorMessages.NO_NULL_ALLOWED.toString());
        return this.doRequest(HttpMethod.GET, endPoint, id, null);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ApiResponse<?> doGet(Endpoint endPoint, String id, Map<String, List<String>> params) throws ApiError {
        Assert.noNullElements(new Object[]{endPoint, id, params}, GenericErrorMessages.NO_NULL_ALLOWED.toString());
        return this.doRequest(HttpMethod.GET, endPoint, id, params);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ApiResponse<?> doGet(Connection connection, String id) throws ApiError {
        Assert.noNullElements(new Object[]{connection, id}, GenericErrorMessages.NO_NULL_ALLOWED.toString());
        return this.doRequest(HttpMethod.GET, connection, id, null, null);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ApiResponse<?> doGet(Connection connection, String id, Map<String, List<String>> params) throws ApiError {
        Assert.noNullElements(new Object[]{connection, id, params}, GenericErrorMessages.NO_NULL_ALLOWED.toString());
        return this.doRequest(HttpMethod.GET, connection, id, null, params);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ApiResponse<?> doGet(Connection connection, String id, String subId) throws ApiError {
        Assert.noNullElements(new Object[]{connection, id, subId}, GenericErrorMessages.NO_NULL_ALLOWED.toString());
        return this.doRequest(HttpMethod.GET, connection, id, subId, null);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ApiResponse<?> doGet(Connection connection, String id, String subId, Map<String, List<String>> params) throws ApiError {
        Assert.noNullElements(new Object[]{connection, id, subId, params}, GenericErrorMessages.NO_NULL_ALLOWED.toString());
        return this.doRequest(HttpMethod.GET, connection, id, subId, params);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ApiResponse<?> doPost(Endpoint endPoint) throws ApiError {
        Assert.notNull(endPoint, GenericErrorMessages.NO_NULL_ALLOWED.toString());
        Assert.isTrue(!"ID".equals(endPoint.toString()), GenericErrorMessages.TYPE_ID_NOT_ALLOWED.toString());
        return this.doRequest(HttpMethod.POST, endPoint, null, null);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ApiResponse<?> doPost(Endpoint endPoint, Map<String, List<String>> params) throws ApiError {
        Assert.noNullElements(new Object[]{endPoint, params}, GenericErrorMessages.NO_NULL_ALLOWED.toString());
        Assert.isTrue(!"ID".equals(endPoint.toString()), GenericErrorMessages.TYPE_ID_NOT_ALLOWED.toString());
        return this.doRequest(HttpMethod.POST, endPoint, null, params);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ApiResponse<?> doPost(Endpoint endPoint, String id) throws ApiError {
        Assert.noNullElements(new Object[]{endPoint, id}, GenericErrorMessages.NO_NULL_ALLOWED.toString());
        return this.doRequest(HttpMethod.POST, endPoint, id, null);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ApiResponse<?> doPost(Endpoint endPoint, String id, Map<String, List<String>> params) throws ApiError {
        Assert.noNullElements(new Object[]{endPoint, id, params}, GenericErrorMessages.NO_NULL_ALLOWED.toString());
        return this.doRequest(HttpMethod.POST, endPoint, id, params);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ApiResponse<?> doPost(Connection connection, String id) throws ApiError {
        Assert.noNullElements(new Object[]{connection, id}, GenericErrorMessages.NO_NULL_ALLOWED.toString());
        return this.doRequest(HttpMethod.POST, connection, id, null, null);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ApiResponse<?> doPost(Connection connection, String id, Map<String, List<String>> params) throws ApiError {
        Assert.noNullElements(new Object[]{connection, id, params}, GenericErrorMessages.NO_NULL_ALLOWED.toString());
        return this.doRequest(HttpMethod.POST, connection, id, null, params);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ApiResponse<?> doPost(Connection connection, String id, String subId) throws ApiError {
        Assert.noNullElements(new Object[]{connection, id, subId}, GenericErrorMessages.NO_NULL_ALLOWED.toString());
        return this.doRequest(HttpMethod.POST, connection, id, subId, null);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ApiResponse<?> doPost(Connection connection, String id, String subId, Map<String, List<String>> params) throws ApiError {
        Assert.noNullElements(new Object[]{connection, id, subId, params}, GenericErrorMessages.NO_NULL_ALLOWED.toString());
        return this.doRequest(HttpMethod.POST, connection, id, subId, params);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ApiResponse<?> doDelete(Endpoint endPoint, String id) throws ApiError {
        Assert.noNullElements(new Object[]{endPoint, id}, GenericErrorMessages.NO_NULL_ALLOWED.toString());
        Assert.isTrue(!"ALL".equals(endPoint.toString()), GenericErrorMessages.TYPE_ALL_NOT_ALLOWED.toString());
        Assert.isTrue(!"ME".equals(endPoint.toString()), GenericErrorMessages.TYPE_ME_NOT_ALLOWED.toString());
        return this.doRequest(HttpMethod.DELETE, endPoint, id, null);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ApiResponse<?> doDelete(Connection connection, String id) throws ApiError {
        Assert.noNullElements(new Object[]{connection, id}, GenericErrorMessages.NO_NULL_ALLOWED.toString());
        Assert.isTrue(!"ALL".equals(connection.toString()), GenericErrorMessages.TYPE_ALL_NOT_ALLOWED.toString());
        Assert.isTrue(!"ME".equals(connection.toString()), GenericErrorMessages.TYPE_ME_NOT_ALLOWED.toString());
        return this.doRequest(HttpMethod.DELETE, connection, id, null, null);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ApiResponse<?> doDelete(Connection connection, String id, String subId) throws ApiError {
        Assert.noNullElements(new Object[]{connection, id, subId}, GenericErrorMessages.NO_NULL_ALLOWED.toString());
        Assert.isTrue(!"ALL".equals(connection.toString()), GenericErrorMessages.TYPE_ALL_NOT_ALLOWED.toString());
        Assert.isTrue(!"ME".equals(connection.toString()), GenericErrorMessages.TYPE_ME_NOT_ALLOWED.toString());
        return this.doRequest(HttpMethod.DELETE, connection, id, subId, null);
    }

    /**
     * Method used to build a request and fetch the response of the Dailymotion API
     *
     * @param method   The HTTP Method used for the call
     * @param endPoint The endpoint to call
     * @param id       The id to insert (can be null)
     * @param params   The optional parameters
     * @return The response object containing a list of T elements
     */
    private ApiResponse<?> doRequest(final HttpMethod method, Endpoint endPoint, String id, Map<String, List<String>> params) throws ApiError {
        LOGGER.trace("[IN] doRequest with parameters {},{}.{},{},{},{}", method, endPoint.getClass().getSimpleName(), endPoint, id, params);
        try {
            String endpointUrl = endPoint.getValue();
            Assert.notNull(endpointUrl, GenericErrorMessages.ENDPOINT_NOT_FOUND.toString());

            LOGGER.debug("endpointUrl has value [{}]", endpointUrl);

            String url;
            if (id != null) {
                url = MessageFormat.format(GenericConstants.TWO_PARAMETERS.toString(), this.dailymotionRootUrl, MessageFormat.format(endpointUrl, id));
            } else {
                url = MessageFormat.format(GenericConstants.TWO_PARAMETERS.toString(), this.dailymotionRootUrl, endpointUrl);
            }

            ApiResponse<?> apiResponse = this.handleResponse(this.handleRequest(method, url, params), endPoint.getClazz());
            LOGGER.trace("ApiResponse from URL {} is {}", url, apiResponse);
            return apiResponse;
        } catch (ClassNotFoundException | ExecutionException | InterruptedException e) {
            LOGGER.error(GenericErrorMessages.ERROR_ON_DO_REQUEST.toString(), e);
        }

        return null;
    }

    /**
     * Method used to build a request and fetch the response of the DailyMotion API
     *
     * @param method     The HTTP Method used for the call
     * @param connection The connection to call
     * @param id         The id to insert
     * @param subId      The second id to insert (can be null)
     * @param params     The optional parameters
     * @return The response object containing a list of T elements
     */
    private ApiResponse<?> doRequest(final HttpMethod method, Connection connection, String id, String subId, Map<String, List<String>> params) throws ApiError {
        LOGGER.trace("[IN] doRequest with parameters {},{}.{},{},{},{},{}", method, connection.getClass().getSimpleName(), connection, id, subId, params);
        try {
            String endpointUrl = connection.getParent().getValue();
            String connectionUrl = connection.getValue();

            Assert.notNull(endpointUrl, GenericErrorMessages.ENDPOINT_NOT_FOUND.toString());
            Assert.notNull(connectionUrl, GenericErrorMessages.CONNECTION_NOT_FOUND.toString());

            LOGGER.debug("endpointUrl has value [{}] and connectionUrl has value [{}]", endpointUrl, connectionUrl);

            String url;
            if (subId != null) {
                url = MessageFormat.format(GenericConstants.THREE_PARAMETERS.toString(), this.dailymotionRootUrl, MessageFormat.format(endpointUrl, id), MessageFormat.format(connectionUrl, subId));
            } else {
                url = MessageFormat.format(GenericConstants.THREE_PARAMETERS.toString(), this.dailymotionRootUrl, MessageFormat.format(endpointUrl, id), connectionUrl);
            }

            ApiResponse<?> apiResponse = this.handleResponse(this.handleRequest(method, url, params), connection.getClazz());
            LOGGER.trace("ApiResponse from URL {} is {}", url, apiResponse);
            return apiResponse;
        } catch (ClassNotFoundException | ExecutionException | InterruptedException e) {
            LOGGER.error(GenericErrorMessages.ERROR_ON_DO_REQUEST.toString(), e);
        }

        return null;
    }

    /**
     * Request content from DailyMotion using the given HTTP method with the given URL and Content
     *
     * @param method The HTTP Method used for the call
     * @param url    The url to use
     * @param params The optional parameters
     * @return Returns the JSON response if any
     */
    private Response handleRequest(final HttpMethod method, final String url, final Map<String, List<String>> params) throws ExecutionException, InterruptedException {
        LOGGER.trace("[IN] callDailymotionAPI with parameters {}, {}, {}", method, url, params);

        Client.RequestHolder requestHolder = this.httpClient.url(url);
        if (params != null) {
            for (Map.Entry<String, List<String>> entry : params.entrySet()) {
                requestHolder.setQueryParameter(entry.getKey(), this.arrayToString(entry.getValue()));
            }
        }

        LOGGER.info("Calling DailyMotion API using URL {}", url);

        if (HttpMethod.GET.equals(method)) {
            return requestHolder.asyncGet().get();
        } else if (HttpMethod.POST.equals(method)) {
            return requestHolder.asyncPost().get();
        } else if (HttpMethod.DELETE.equals(method)) {
            return requestHolder.asyncDelete().get();
        } else {
            throw new UnsupportedOperationException(MessageFormat.format("The given HttpMethod ({0}) isn't allowed here", method));
        }
    }

    /**
     * Handles the response from DailyMotion API
     *
     * @param response The response from the API
     * @param clazz    The class expected in response
     * @return The ApiResponse that represents the JSON return from WS
     * @throws ClassNotFoundException
     * @throws ApiError
     */
    private ApiResponse<?> handleResponse(Response response, Class clazz) throws ClassNotFoundException, ApiError {
        Assert.notNull(response, GenericErrorMessages.RESPONSE_IS_NULL.toString());

        if (response.getStatus() >= Http.BAD_REQUEST && response.getStatus() < Http.INTERNAL_SERVER_ERROR) {
            throw JsonHelper.deserialize(response.getBody(), ApiError.class);
        } else if (response.getStatus() >= Http.INTERNAL_SERVER_ERROR) {
            throw ClientExceptionFactory.createHttpExceptionFromStatusCode(response.getStatus());
        }

        Assert.notNull(response.getBody(), GenericErrorMessages.RESPONSE_BODY_IS_NULL.toString());
        return JsonHelper.deserialize(response.getBody(), this.getResponseClass(clazz));
    }

    /**
     * Concatenates a List of String
     *
     * @param array The List of String to concatenate
     * @return The String concatenated
     */
    private String arrayToString(List<String> array) {
        Assert.notEmpty(array, GenericErrorMessages.NO_EMPTY_ALLOWED.toString());

        LOGGER.trace("[IN] arrayToString with parameter {}", array);
        return array.size() > 1 ? array.get(0) + "," + this.arrayToString(array.subList(1, array.size())) : array.get(0);
    }

    /**
     * Method used to get ApiResponse class from given class
     *
     * @param clazz The class expected in response
     * @return The ApiResponse class
     * @throws ClassNotFoundException
     */
    private Class<? extends ApiResponse> getResponseClass(Class clazz) throws ClassNotFoundException {
        Assert.notNull(clazz, GenericErrorMessages.NO_NULL_ALLOWED.toString());

        if (this.availableResponses == null) {
            this.availableResponses = new HashMap<>();
            this.availableResponses.put(Activity.class, new ApiResponse<Activity>());
            this.availableResponses.put(Channel.class, new ApiResponse<Channel>());
            this.availableResponses.put(Comment.class, new ApiResponse<Comment>());
            this.availableResponses.put(Contest.class, new ApiResponse<Contest>());
            this.availableResponses.put(Group.class, new ApiResponse<Group>());
            this.availableResponses.put(Playlist.class, new ApiResponse<Playlist>());
            this.availableResponses.put(Record.class, new ApiResponse<Record>());
            this.availableResponses.put(Strongtag.class, new ApiResponse<Strongtag>());
            this.availableResponses.put(Subtitle.class, new ApiResponse<Subtitle>());
            this.availableResponses.put(User.class, new ApiResponse<User>());
            this.availableResponses.put(Video.class, new ApiResponse<Video>());
        }

        if (this.availableResponses.containsKey(clazz)) {
            return this.availableResponses.get(clazz).getClass();
        } else {
            throw new ClassNotFoundException(MessageFormat.format("The given Class ({0}) isn't allowed here {}", clazz.getSimpleName()));
        }
    }
}
