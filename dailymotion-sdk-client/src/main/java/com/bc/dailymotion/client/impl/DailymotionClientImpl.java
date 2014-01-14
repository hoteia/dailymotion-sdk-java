package com.bc.dailymotion.client.impl;

import checkers.nullness.quals.NonNull;
import com.bc.dailymotion.api.ApiResponse;
import com.bc.dailymotion.api.Connection;
import com.bc.dailymotion.api.Endpoint;
import com.bc.dailymotion.api.type.ConnectionType;
import com.bc.dailymotion.api.type.EndpointType;
import com.bc.dailymotion.client.DailymotionClient;
import com.bc.dailymotion.client.filter.OAuth2RequestFilter;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.ning.http.client.AsyncHttpClientConfig;
import org.jboss.netty.handler.codec.http.HttpMethod;
import org.resthub.web.Client;
import org.resthub.web.JsonHelper;
import org.resthub.web.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.io.IOException;
import java.text.MessageFormat;
import java.util.List;
import java.util.Map;

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
 * <li>/endpoint/{id}/connection{sudId}</li>
 * </ul>
 * And also takes some optional parameters defined with a Map<String, List<String>>
 * Support the HTTP Methods :
 * <ul>
 * <li>GET</li>
 * <li>POST</li>
 * <li>PUT</li>
 * </ul>
 * More details on <url>http://www.dailymotion.com/doc/api/graph-api.html</url>
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
    private static Logger LOGGER = LoggerFactory.getLogger(DailymotionClientImpl.class);

    /**
     * Scheme used for OAuth
     */
    @Value("${dailymotion.auth.scheme}")
    private String scheme;

    /**
     * Method used to build a request and fetch the response of the Dailymotion API
     *
     * @param method   The HTTP Method used for the call
     * @param endPoint The endpoint to call
     * @param type     The type of request
     * @param id       The id to insert (can be null)
     * @param params   The optional parameters
     * @param <T>      The parametrized type of the expected return type
     * @return The response object containing a list of T elements
     */
    private <T> ApiResponse<T> doRequest(@NonNull final HttpMethod method, @NonNull Class<? extends Endpoint<T>> endPoint, @NonNull EndpointType type, String id, Map<String, List<String>> params) {
        LOGGER.trace("[IN] doRequest with parameters {},{},{},{},{}", method, endPoint, type, id, params);
        try {
            String endpointUrl = (String) endPoint.getField(type.toString()).get(null);
            LOGGER.debug("endpointUrl has value [{}]", endpointUrl);

            Assert.notNull(endpointUrl, "Endpoint url not found !");

            String url;
            if (id != null) {
                url = MessageFormat.format("{0}/{1}", this.dailymotionRootUrl, MessageFormat.format(endpointUrl, id));
            } else {
                url = MessageFormat.format("{0}/{1}", this.dailymotionRootUrl, endpointUrl);
            }

            Response response = this.callDailymotionAPI(method, url, params);
            Assert.notNull(response, "Response from WS is null");

            JsonHelper helper = new JsonHelper();
            ApiResponse<T> apiResponse = helper.getObjectMapper().reader(ApiResponse.class).readValue(response.getBody());
            LOGGER.trace("ApiResponse from URL {} is {}", url, apiResponse);
            return apiResponse;
        } catch (IllegalAccessException | NoSuchFieldException | IOException e) {
            LOGGER.error("An error occurred in doRequest, exception thrown is ", e);
        }

        return null;
    }

    /**
     * Method used to build a request and fetch the response of the DailyMotion API
     *
     * @param method     The HTTP Method used for the call
     * @param connection The connection to call
     * @param type       The type of request
     * @param id         The id to insert
     * @param subId      The second id to insert (can be null)
     * @param params     The optional parameters
     * @param <E>        The parametrized type of the parent endpoint type
     * @param <T>        The parametrized type of the expected return type
     * @return The response object containing a list of T elements
     */
    private <E, T> ApiResponse<T> doRequest(@NonNull final HttpMethod method, @NonNull Class<? extends Connection<E, T>> connection, @NonNull ConnectionType type, @NonNull String id, String subId, Map<String, List<String>> params) {
        try {
            String endpointUrl = (String) connection.getSuperclass().getField(EndpointType.ID.toString()).get(null);
            String connectionUrl = (String) connection.getField(type.toString()).get(null);

            String url;
            if (subId != null) {
                url = MessageFormat.format("{0}/{1}/{2}", this.dailymotionRootUrl, MessageFormat.format(endpointUrl, id), MessageFormat.format(connectionUrl, subId));
            } else {
                url = MessageFormat.format("{0}/{1}/{2}", this.dailymotionRootUrl, MessageFormat.format(endpointUrl, id), connectionUrl);
            }

            Response response = this.callDailymotionAPI(method, url, params);
            Assert.notNull(response, "Response from WS is null");

            JsonHelper helper = new JsonHelper();
            ApiResponse<T> apiResponse = helper.getObjectMapper().reader(ApiResponse.class).readValue(response.getBody());
            LOGGER.trace("ApiResponse from URL {} is {}", url, apiResponse);
            return apiResponse;
        } catch (IllegalAccessException | NoSuchFieldException | IOException e) {
            LOGGER.error("An error occurred in doRequest, exception thrown is ", e);
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
    private Response callDailymotionAPI(@NonNull final HttpMethod method, @NonNull final String url, final Map<String, List<String>> params) {
        LOGGER.trace("[IN] callDailymotionAPI with parameters {}, {}, {}", method, url, params);

        Client.RequestHolder requestHolder = this.httpClient.url(url);
        if (params != null) {
            params.forEach((key, value) -> {
                requestHolder.setQueryParameter(key, this.arrayToString(value));
            });
        }

        if (HttpMethod.GET.equals(method)) {
            return requestHolder.get();
        } else if (HttpMethod.POST.equals(method)) {
            return requestHolder.post();
        } else if (HttpMethod.DELETE.equals(method)) {
            return requestHolder.delete();
        } else {
            throw new UnsupportedOperationException(MessageFormat.format("The given HttpMethod ({0}) isn't allowed here", method));
        }
    }

    /**
     * Concatenates a List of String
     *
     * @param array The List of String to concatenate
     * @return The String concatenated
     */
    private String arrayToString(@NonNull List<String> array) {
        Assert.notEmpty(array);

        LOGGER.trace("[IN] arrayToString with parameter {}", array);
        return array.size() > 1 ? array.get(0) + "," + this.arrayToString(array.subList(1, array.size())) : array.get(0);
    }

    /**
     * Initialize the following components ;
     * <ul>
     * <li>HTTP Client for invocation of Rest Service</li>
     * <li>Eventually use a Proxy</li>
     * </ul>
     */
    @Override
    public void afterPropertiesSet() throws Exception {
        Assert.notNull(this.dailymotionRootUrl, "The DailyMotion root url is null");
        Assert.notNull(this.useProxy, "The boolean useProxy is null");
        Assert.notNull(this.proxyHost, "The proxyHost is null, if you don't use a proxy, set it to empty !");
        Assert.notNull(this.proxyPort, "The proxyPort is null, if you don't use a proxy, set it to 0 !");
        Assert.notNull(this.username, "The username is null");
        Assert.notNull(this.password, "The password is null");
        Assert.notNull(this.clientId, "The clientId is null, you need to get one on your DailyMotion account");
        Assert.notNull(this.clientSecret, "The clientSecret is null, you need to get one on your DailyMotion account");

        OAuth2RequestFilter filter = new OAuth2RequestFilter(MessageFormat.format("{0}/{1}", this.dailymotionRootUrl, "oauth/token"), this.clientId, this.clientSecret);
        filter.setCredentials(this.username, this.password);
        filter.setProxy(this.useProxy, this.proxyHost, this.proxyPort);
        filter.setSchemeName(this.scheme);

        AsyncHttpClientConfig.Builder builder = new AsyncHttpClientConfig.Builder();
        builder.setRequestTimeoutInMs(this.timeout);
        builder.addRequestFilter(filter);
        this.httpClient = new Client(builder);
        if (this.useProxy) {
            this.httpClient.setProxy(this.proxyHost, this.proxyPort);
            LOGGER.debug("Using proxy with url {}:{}", this.proxyHost, this.proxyPort);
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public <E> ApiResponse<E> doGet(@NonNull Class<? extends Endpoint<E>> endPoint, @NonNull EndpointType type) {
        return this.doRequest(HttpMethod.GET, endPoint, type, null, null);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public <E> ApiResponse<E> doGet(@NonNull Class<? extends Endpoint<E>> endPoint, @NonNull EndpointType type, @NonNull Map<String, List<String>> params) {
        return this.doRequest(HttpMethod.GET, endPoint, type, null, params);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public <E> ApiResponse<E> doGet(@NonNull Class<? extends Endpoint<E>> endPoint, @NonNull EndpointType type, @NonNull String id) {
        return this.doRequest(HttpMethod.GET, endPoint, type, id, null);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public <E> ApiResponse<E> doGet(@NonNull Class<? extends Endpoint<E>> endPoint, @NonNull EndpointType type, @NonNull String id, @NonNull Map<String, List<String>> params) {
        return this.doRequest(HttpMethod.GET, endPoint, type, id, params);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public <E, T> ApiResponse<T> doGet(@NonNull Class<? extends Connection<E, T>> connection, @NonNull ConnectionType type, @NonNull String id) {
        return this.doRequest(HttpMethod.GET, connection, type, id, null, null);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public <E, T> ApiResponse<T> doGet(@NonNull Class<? extends Connection<E, T>> connection, @NonNull ConnectionType type, @NonNull String id, @NonNull Map<String, List<String>> params) {
        return this.doRequest(HttpMethod.GET, connection, type, id, null, params);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public <E, T> ApiResponse<T> doGet(@NonNull Class<? extends Connection<E, T>> connection, @NonNull ConnectionType type, @NonNull String id, @NonNull String subId) {
        return this.doRequest(HttpMethod.GET, connection, type, id, subId, null);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public <E, T> ApiResponse<T> doGet(@NonNull Class<? extends Connection<E, T>> connection, @NonNull ConnectionType type, @NonNull String id, @NonNull String subId, @NonNull Map<String, List<String>> params) {
        return this.doRequest(HttpMethod.GET, connection, type, id, subId, params);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public <E> ApiResponse<E> doPost(@NonNull Class<? extends Endpoint<E>> endPoint, @NonNull EndpointType type) {
        return this.doRequest(HttpMethod.POST, endPoint, type, null, null);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public <E> ApiResponse<E> doPost(@NonNull Class<? extends Endpoint<E>> endPoint, @NonNull EndpointType type, @NonNull Map<String, List<String>> params) {
        return this.doRequest(HttpMethod.POST, endPoint, type, null, params);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public <E> ApiResponse<E> doPost(@NonNull Class<? extends Endpoint<E>> endPoint, @NonNull EndpointType type, @NonNull String id) {
        return this.doRequest(HttpMethod.POST, endPoint, type, id, null);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public <E> ApiResponse<E> doPost(@NonNull Class<? extends Endpoint<E>> endPoint, @NonNull EndpointType type, @NonNull String id, @NonNull Map<String, List<String>> params) {
        return this.doRequest(HttpMethod.POST, endPoint, type, id, params);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public <E, T> ApiResponse<T> doPost(@NonNull Class<? extends Connection<E, T>> connection, @NonNull ConnectionType type, @NonNull String id) {
        return this.doRequest(HttpMethod.POST, connection, type, id, null, null);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public <E, T> ApiResponse<T> doPost(@NonNull Class<? extends Connection<E, T>> connection, @NonNull ConnectionType type, @NonNull String id, @NonNull Map<String, List<String>> params) {
        return this.doRequest(HttpMethod.POST, connection, type, id, null, params);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public <E, T> ApiResponse<T> doPost(@NonNull Class<? extends Connection<E, T>> connection, @NonNull ConnectionType type, @NonNull String id, @NonNull String subId) {
        return this.doRequest(HttpMethod.POST, connection, type, id, subId, null);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public <E, T> ApiResponse<T> doPost(@NonNull Class<? extends Connection<E, T>> connection, @NonNull ConnectionType type, @NonNull String id, @NonNull String subId, @NonNull Map<String, List<String>> params) {
        return this.doRequest(HttpMethod.POST, connection, type, id, subId, params);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public <E> ApiResponse<E> doDelete(@NonNull Class<? extends Endpoint<E>> endPoint, @NonNull EndpointType type) {
        return this.doRequest(HttpMethod.DELETE, endPoint, type, null, null);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public <E> ApiResponse<E> doDelete(@NonNull Class<? extends Endpoint<E>> endPoint, @NonNull EndpointType type, @NonNull Map<String, List<String>> params) {
        return this.doRequest(HttpMethod.DELETE, endPoint, type, null, params);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public <E> ApiResponse<E> doDelete(@NonNull Class<? extends Endpoint<E>> endPoint, @NonNull EndpointType type, @NonNull String id) {
        return this.doRequest(HttpMethod.DELETE, endPoint, type, id, null);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public <E> ApiResponse<E> doDelete(@NonNull Class<? extends Endpoint<E>> endPoint, @NonNull EndpointType type, @NonNull String id, @NonNull Map<String, List<String>> params) {
        return this.doRequest(HttpMethod.DELETE, endPoint, type, id, params);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public <E, T> ApiResponse<T> doDelete(@NonNull Class<? extends Connection<E, T>> connection, @NonNull ConnectionType type, @NonNull String id) {
        return this.doRequest(HttpMethod.DELETE, connection, type, id, null, null);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public <E, T> ApiResponse<T> doDelete(@NonNull Class<? extends Connection<E, T>> connection, @NonNull ConnectionType type, @NonNull String id, @NonNull Map<String, List<String>> params) {
        return this.doRequest(HttpMethod.DELETE, connection, type, id, null, params);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public <E, T> ApiResponse<T> doDelete(@NonNull Class<? extends Connection<E, T>> connection, @NonNull ConnectionType type, @NonNull String id, @NonNull String subId) {
        return this.doRequest(HttpMethod.DELETE, connection, type, id, subId, null);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public <E, T> ApiResponse<T> doDelete(@NonNull Class<? extends Connection<E, T>> connection, @NonNull ConnectionType type, @NonNull String id, @NonNull String subId, @NonNull Map<String, List<String>> params) {
        return this.doRequest(HttpMethod.DELETE, connection, type, id, subId, params);
    }
}
