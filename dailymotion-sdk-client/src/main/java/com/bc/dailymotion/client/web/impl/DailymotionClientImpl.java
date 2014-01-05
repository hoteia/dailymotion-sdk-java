package com.bc.dailymotion.client.web.impl;

import com.bc.dailymotion.api.Response;
import com.bc.dailymotion.api.connection.Connection;
import com.bc.dailymotion.api.endpoint.Endpoint;
import com.bc.dailymotion.client.web.DailymotionClient;
import com.ning.http.client.AsyncHttpClientConfig;
import org.jboss.netty.handler.codec.http.HttpMethod;
import org.modelmapper.ModelMapper;
import org.resthub.web.Client;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.util.Assert;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by a528122 on 27/12/13.
 */
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
     * HTTP Client used for API calls
     */
    private Client httpClient = new Client();

    /**
     * Mapper used for REST responses
     */
    private ModelMapper modelMapper;

    /**
     * Static logger used for traces
     */
    private static Logger LOGGER = LoggerFactory.getLogger(DailymotionClient.class);

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
    private <T> Response<T> doRequest(final HttpMethod method, Class<? extends Endpoint<T>> endPoint, Endpoint.EndpointType type, String id, Map<String, List<String>> params) {
        Assert.notNull(method);
        Assert.notNull(endPoint);
        Assert.notNull(type);

        try {
            String endpointUrl = (String) endPoint.getField(type.toString()).get(null);

            String url;
            if (id != null) {
                url = MessageFormat.format("{0}/{1}", this.dailymotionRootUrl, MessageFormat.format(endpointUrl, id));
            } else {
                url = MessageFormat.format("{0}/{1}", this.dailymotionRootUrl, endpointUrl);
            }

            if (params != null && !params.isEmpty()) {
                url = MessageFormat.format("{0}?{1}", url, this.mapToString(params));
            }
            String body = this.callDailymotionAPI(method, url);
            return modelMapper.map(null, null);
        } catch (IllegalAccessException | NoSuchFieldException e) {
            e.printStackTrace();
        }

        return null;
    }

    /**
     * Method used to build a request and fetch the response of the Dailymotion API
     *
     * @param method     The HTTP Method used for the call
     * @param connection The connection to call
     * @param type       The type of request
     * @param id         The id to insert
     * @param subId      The second to insert (can be null)
     * @param params     The optional parameters
     * @param <E>        The parametrized type of the parent endpoint type
     * @param <T>        The parametrized type of the expected return type
     * @return The response object containing a list of T elements
     */
    private <E, T> Response<T> doRequest(final HttpMethod method, Class<? extends Connection<E, T>> connection, Connection.ConnectionType type, String id, String subId, Map<String, List<String>> params) {
        Assert.notNull(method);
        Assert.notNull(connection);
        Assert.notNull(type);
        Assert.notNull(id);

        try {
            String endpointUrl = (String) connection.getSuperclass().getField(Endpoint.EndpointType.ID.toString()).get(null);
            String connectionUrl = (String) connection.getField(type.toString()).get(null);

            String url;
            if (subId != null) {
                url = MessageFormat.format("{0}/{1}/{2}", this.dailymotionRootUrl, MessageFormat.format(endpointUrl, id), MessageFormat.format(connectionUrl, subId));
            } else {
                url = MessageFormat.format("{0}/{1}/{2}", this.dailymotionRootUrl, MessageFormat.format(endpointUrl, id), connectionUrl);
            }

            if (params != null && !params.isEmpty()) {
                url = MessageFormat.format("{0}?{1}", url, this.mapToString(params));
            }
            String body = this.callDailymotionAPI(method, url);
            return modelMapper.map(null, null);
        } catch (IllegalAccessException | NoSuchFieldException e) {
            e.printStackTrace();
        }

        return null;
    }

    /**
     * Request content from Dailymotion using the given HTTP method with the given URL and Content
     *
     * @param method The HTTP Method used for the call
     * @param url    The url to use
     * @return Returns the JSON response if any
     */
    private String callDailymotionAPI(final HttpMethod method, final String url) {
        LOGGER.trace("[IN] callDailymotionAPI with parameters {}, {}", method, url);
        org.resthub.web.Response response;
        if (HttpMethod.GET.equals(method)) {
            response = this.httpClient.url(url).get();
        } else if (HttpMethod.POST.equals(method)) {
            response = this.httpClient.url(url).post();
        } else if (HttpMethod.DELETE.equals(method)) {
            response = this.httpClient.url(url).delete();
        } else {
            throw new UnsupportedOperationException(MessageFormat.format("The given HttpMethod ({0}) isn't allowed here", method));
        }
        LOGGER.debug("Response from URL {} is {}", url, response.getBody());
        return response.getBody();
    }

    /**
     * Concatenates a List of String with a given concatenator
     *
     * @param map The Map of String to concatenate
     * @return The String concatenated
     */
    private String mapToString(Map<String, List<String>> map) {
        LOGGER.trace("[IN] mapToString with parameter {}", map);
        return this.mapToString(new ArrayList<>(map.keySet()), map);
    }

    /**
     * Transforms a map to a concatenated string
     *
     * @param array The list of keys in the map
     * @param map   The Map of String to concatenate
     * @return The String representation of the map
     */
    private String mapToString(List<String> array, Map<String, List<String>> map) {
        LOGGER.trace("[IN] arrayToString with parameter {}", array);
        return array.get(0) + "=" + this.arrayToString(map.get(array.get(0))) + (array.size() > 1 ? "&" + this.mapToString(array.subList(1, array.size()), map) : "");
    }

    /**
     * Concatenates a List of String with a given concatenator
     *
     * @param array The List of String to concatenate
     * @return The String concatenated
     */
    private String arrayToString(List<String> array) {
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
        Assert.notNull(this.dailymotionRootUrl);
        Assert.notNull(this.useProxy);
        Assert.notNull(this.proxyHost);
        Assert.notNull(this.proxyPort);

        AsyncHttpClientConfig.Builder builder = new AsyncHttpClientConfig.Builder();
        builder.setRequestTimeoutInMs(this.timeout);
        this.httpClient = new Client(builder);
        if (this.useProxy) {
            this.httpClient.setProxy(this.proxyHost, this.proxyPort);
        }
    }

    @Override
    public <E> Response<E> doGet(Class<? extends Endpoint<E>> endPoint, Endpoint.EndpointType type) {
        return this.doRequest(HttpMethod.GET, endPoint, type, null, null);
    }

    @Override
    public <E> Response<E> doGet(Class<? extends Endpoint<E>> endPoint, Endpoint.EndpointType type, Map<String, List<String>> params) {
        return this.doRequest(HttpMethod.GET, endPoint, type, null, params);
    }

    @Override
    public <E> Response<E> doGet(Class<? extends Endpoint<E>> endPoint, Endpoint.EndpointType type, String id) {
        return this.doRequest(HttpMethod.GET, endPoint, type, id, null);
    }

    @Override
    public <E> Response<E> doGet(Class<? extends Endpoint<E>> endPoint, Endpoint.EndpointType type, String id, Map<String, List<String>> params) {
        return this.doRequest(HttpMethod.GET, endPoint, type, id, params);
    }

    @Override
    public <E, T> Response<T> doGet(Class<? extends Connection<E, T>> connection, Connection.ConnectionType type, String id) {
        return this.doRequest(HttpMethod.GET, connection, type, id, null, null);
    }

    @Override
    public <E, T> Response<T> doGet(Class<? extends Connection<E, T>> connection, Connection.ConnectionType type, String id, Map<String, List<String>> params) {
        return this.doRequest(HttpMethod.GET, connection, type, id, null, params);
    }

    @Override
    public <E, T> Response<T> doGet(Class<? extends Connection<E, T>> connection, Connection.ConnectionType type, String id, String subId) {
        return this.doRequest(HttpMethod.GET, connection, type, id, subId, null);
    }

    @Override
    public <E, T> Response<T> doGet(Class<? extends Connection<E, T>> connection, Connection.ConnectionType type, String id, String subId, Map<String, List<String>> params) {
        return this.doRequest(HttpMethod.GET, connection, type, id, subId, params);
    }

    @Override
    public <E> Response<E> doPost(Class<? extends Endpoint<E>> endPoint, Endpoint.EndpointType type) {
        return null;
    }

    @Override
    public <E> Response<E> doPost(Class<? extends Endpoint<E>> endPoint, Endpoint.EndpointType type, Map<String, List<String>> params) {
        return null;
    }

    @Override
    public <E> Response<E> doPost(Class<? extends Endpoint<E>> endPoint, Endpoint.EndpointType type, String id) {
        return null;
    }

    @Override
    public <E> Response<E> doPost(Class<? extends Endpoint<E>> endPoint, Endpoint.EndpointType type, String id, Map<String, List<String>> params) {
        return null;
    }

    @Override
    public <E, T> Response<T> doPost(Class<? extends Connection<E, T>> connection, Connection.ConnectionType type, String id) {
        return null;
    }

    @Override
    public <E, T> Response<T> doPost(Class<? extends Connection<E, T>> connection, Connection.ConnectionType type, String id, Map<String, List<String>> params) {
        return null;
    }

    @Override
    public <E, T> Response<T> doPost(Class<? extends Connection<E, T>> connection, Connection.ConnectionType type, String id, String subId) {
        return null;
    }

    @Override
    public <E, T> Response<T> doPost(Class<? extends Connection<E, T>> connection, Connection.ConnectionType type, String id, String subId, Map<String, List<String>> params) {
        return null;
    }

    @Override
    public <E> Response<E> doDelete(Class<? extends Endpoint<E>> endPoint, Endpoint.EndpointType type) {
        return null;
    }

    @Override
    public <E> Response<E> doDelete(Class<? extends Endpoint<E>> endPoint, Endpoint.EndpointType type, Map<String, List<String>> params) {
        return null;
    }

    @Override
    public <E> Response<E> doDelete(Class<? extends Endpoint<E>> endPoint, Endpoint.EndpointType type, String id) {
        return null;
    }

    @Override
    public <E> Response<E> doDelete(Class<? extends Endpoint<E>> endPoint, Endpoint.EndpointType type, String id, Map<String, List<String>> params) {
        return null;
    }

    @Override
    public <E, T> Response<T> doDelete(Class<? extends Connection<E, T>> connection, Connection.ConnectionType type, String id) {
        return null;
    }

    @Override
    public <E, T> Response<T> doDelete(Class<? extends Connection<E, T>> connection, Connection.ConnectionType type, String id, Map<String, List<String>> params) {
        return null;
    }

    @Override
    public <E, T> Response<T> doDelete(Class<? extends Connection<E, T>> connection, Connection.ConnectionType type, String id, String subId) {
        return null;
    }

    @Override
    public <E, T> Response<T> doDelete(Class<? extends Connection<E, T>> connection, Connection.ConnectionType type, String id, String subId, Map<String, List<String>> params) {
        return null;
    }
}
