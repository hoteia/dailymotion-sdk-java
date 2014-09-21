package fr.zebasto.dailymotion.sdk.client;

import com.ning.http.client.AsyncHttpClientConfig;
import com.ning.http.client.ProxyServer;
import fr.zebasto.dailymotion.sdk.api.Entity;
import fr.zebasto.dailymotion.sdk.api.annotation.Connection;
import fr.zebasto.dailymotion.sdk.api.annotation.Endpoint;
import fr.zebasto.dailymotion.sdk.api.communication.ApiError;
import fr.zebasto.dailymotion.sdk.api.communication.ApiResponse;
import fr.zebasto.dailymotion.sdk.api.communication.HttpMethod;
import fr.zebasto.dailymotion.sdk.api.endpoint.*;
import fr.zebasto.dailymotion.sdk.client.lang.GenericConstants;
import fr.zebasto.dailymotion.sdk.client.lang.GenericErrorMessages;
import fr.zebasto.dailymotion.sdk.client.support.ApiTypeReference;
import fr.zebasto.dailymotion.sdk.client.support.OAuth2RequestFilter;
import org.resthub.web.Client;
import org.resthub.web.Http;
import org.resthub.web.JsonHelper;
import org.resthub.web.Response;
import org.resthub.web.exception.ClientExceptionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import javax.annotation.PostConstruct;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
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
public class DailymotionClient implements InvocationHandler {
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
    private static final Logger LOGGER = LoggerFactory.getLogger(DailymotionClient.class);

    /**
     * Map containing the different classes for responses
     */
    private Map<Class, ApiTypeReference> availableResponses = new HashMap<>();

    /**
     * Scheme used for OAuth
     */
    @Value("${dailymotion.auth.scheme}")
    private String scheme;

    private ActivityEndpoint activityEndpoint = (ActivityEndpoint) this.getProxy(ActivityEndpoint.class);
    private ChannelEndpoint channelEndpoint = (ChannelEndpoint) this.getProxy(ChannelEndpoint.class);
    private CommentEndpoint commentEndpoint = (CommentEndpoint) this.getProxy(CommentEndpoint.class);
    private ContestEndpoint contestEndpoint = (ContestEndpoint) this.getProxy(ContestEndpoint.class);
    private GroupEndpoint groupEndpoint = (GroupEndpoint) this.getProxy(GroupEndpoint.class);
    private PlaylistEndpoint playlistEndpoint = (PlaylistEndpoint) this.getProxy(PlaylistEndpoint.class);
    private RecordEndpoint recordEndpoint = (RecordEndpoint) this.getProxy(RecordEndpoint.class);
    private ReportEndpoint reportEndpoint = (ReportEndpoint) this.getProxy(ReportEndpoint.class);
    private StrongtagEndpoint strongtagEndpoint = (StrongtagEndpoint) this.getProxy(StrongtagEndpoint.class);
    private SubtitleEndpoint subtitleEndpoint = (SubtitleEndpoint) this.getProxy(SubtitleEndpoint.class);
    private UserEndpoint userEndpoint = (UserEndpoint) this.getProxy(UserEndpoint.class);
    private VideoEndpoint videoEndpoint = (VideoEndpoint) this.getProxy(VideoEndpoint.class);

    /**
     * Initialize the following components ;
     * <ul>
     * <li>HTTP Client for invocation of Rest Service</li>
     * <li>Eventually use a Proxy</li>
     * </ul>
     */
    @PostConstruct
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
     * Method used to build a request and fetch the response of the Dailymotion API
     *
     * @param endPoint The endpoint to call
     * @param id       The id to insert (can be null)
     * @param params   The optional parameters
     * @return The response object containing a list of T elements
     */
    private ApiResponse<? extends Entity> doRequest(Endpoint endPoint, String id, Map<String, List<String>> params) throws ApiError {
        LOGGER.trace("[IN] doRequest with parameters {},{}.{},{},{},{}", endPoint.method(), endPoint.getClass().getSimpleName(), endPoint, id, params);
        try {
            String endpointUrl = endPoint.value();
            Assert.notNull(endpointUrl, GenericErrorMessages.ENDPOINT_NOT_FOUND.toString());

            LOGGER.debug("endpointUrl has value [{}]", endpointUrl);

            String url;
            if (id != null) {
                url = MessageFormat.format(GenericConstants.TWO_PARAMETERS.toString(), this.dailymotionRootUrl, MessageFormat.format(endpointUrl, id));
            } else {
                url = MessageFormat.format(GenericConstants.TWO_PARAMETERS.toString(), this.dailymotionRootUrl, endpointUrl);
            }

            ApiResponse<? extends Entity> apiResponse = this.handleResponse(this.handleRequest(endPoint.method(), url, params), endPoint.target());
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
     * @param connection The connection to call
     * @param id         The id to insert
     * @param subId      The second id to insert (can be null)
     * @param params     The optional parameters
     * @return The response object containing a list of T elements
     */
    private ApiResponse<? extends Entity> doRequest(Connection connection, String id, String subId, Map<String, List<String>> params) throws ApiError {
        LOGGER.trace("[IN] doRequest with parameters {},{}.{},{},{},{},{}", connection.method(), connection.getClass().getSimpleName(), connection, id, subId, params);
        try {
            String endpointUrl = connection.value();

            Assert.notNull(endpointUrl, GenericErrorMessages.ENDPOINT_NOT_FOUND.toString());

            LOGGER.debug("endpointUrl has value [{}]", endpointUrl);

            String url;
            if (subId != null) {
                url = MessageFormat.format(GenericConstants.TWO_PARAMETERS.toString(), this.dailymotionRootUrl, MessageFormat.format(endpointUrl, id, subId));
            } else {
                url = MessageFormat.format(GenericConstants.TWO_PARAMETERS.toString(), this.dailymotionRootUrl, MessageFormat.format(endpointUrl, id));
            }

            ApiResponse<? extends Entity> apiResponse = this.handleResponse(this.handleRequest(connection.method(), url, params), connection.target());
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
    private <E extends Entity> ApiResponse<E> handleResponse(Response response, Class<E> clazz) throws ClassNotFoundException, ApiError {
        Assert.notNull(response, GenericErrorMessages.RESPONSE_IS_NULL.toString());

        if (response.getStatus() >= Http.BAD_REQUEST && response.getStatus() < Http.INTERNAL_SERVER_ERROR) {
            throw JsonHelper.deserialize(response.getBody(), ApiError.class);
        } else if (response.getStatus() >= Http.INTERNAL_SERVER_ERROR) {
            throw ClientExceptionFactory.createHttpExceptionFromStatusCode(response.getStatus());
        }

        Assert.notNull(response.getBody(), GenericErrorMessages.RESPONSE_BODY_IS_NULL.toString());
        LOGGER.debug("Response from WS is {}", response.getBody());
        return JsonHelper.deserialize(response.getBody(), this.getApiTypeReference(clazz));
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

    private <E extends Entity> ApiTypeReference<E> getApiTypeReference(Class<E> clazz) {
        if (!this.availableResponses.containsKey(clazz)) {
            this.availableResponses.put(clazz, new ApiTypeReference<E>());
        }
        return (ApiTypeReference<E>) this.availableResponses.get(clazz);
    }

    @Override
    public Object invoke(Object o, Method method, Object[] objects) throws Throwable {
        if (method.isAnnotationPresent(Endpoint.class)) {
            return this.doRequest(method.getAnnotation(Endpoint.class), (String) objects[0], (Map<String, List<String>>) objects[1]);
        } else if (method.isAnnotationPresent(Connection.class)) {
            boolean twoParams = (method.getAnnotation(Connection.class).params() == 2);
            return this.doRequest(method.getAnnotation(Connection.class), (String) objects[0], (twoParams ? (String) objects[1] : null), (Map<String, List<String>>) objects[twoParams ? 2 : 1]);
        } else {
            return new ApiError(-1, "Method is annotated with an unknown annotation", "UnknownAnnotation");
        }
    }

    /**
     * @param clazz
     * @return
     */
    private Object getProxy(Class clazz) {
        return Proxy.newProxyInstance(clazz.getClassLoader(), new Class[]{clazz.getClass()}, this);
    }
}
