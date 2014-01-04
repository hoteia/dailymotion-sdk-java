package com.bc.dailymotion.client.web.impl;

import com.bc.dailymotion.client.web.DailymotionClient;
import com.ning.http.client.AsyncHttpClientConfig;
import org.jboss.netty.handler.codec.http.HttpMethod;
import org.modelmapper.ModelMapper;
import org.resthub.web.Client;
import org.resthub.web.Response;
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


    @Override
    public <E> E doGet(final E endPoint, final String id) {
        return this.doRequest(HttpMethod.GET, endPoint, id, null);
    }

    @Override
    public <E> E doGet(final E endPoint, final String id, final Map<String, List<String>> params) {
        return this.doRequest(HttpMethod.GET, endPoint, id, params, null);
    }

    @Override
    public <E, F> E doGet(final E endPoint, final F subEndpoint, final String id) {
        return this.doRequest(HttpMethod.GET, endPoint, subEndpoint, id, null);
    }

    @Override
    public <E, F> E doGet(final E endPoint, final F subEndpoint, final String id, final Map<String, List<String>> params) {
        return this.doRequest(HttpMethod.GET, endPoint, subEndpoint, id, params, null);
    }

    @Override
    public <E> E doPost(final E endPoint, final String id, final String content) {
        return this.doRequest(HttpMethod.GET, endPoint, id, content);
    }

    @Override
    public <E> E doPost(final E endPoint, final String id, final Map<String, List<String>> params, final String content) {
        return this.doRequest(HttpMethod.GET, endPoint, id, params, content);
    }

    @Override
    public <E, F> E doPost(final E endPoint, final F subEndpoint, final String id, final String content) {
        return this.doRequest(HttpMethod.GET, endPoint, subEndpoint, id, content);
    }

    @Override
    public <E, F> E doPost(final E endPoint, final F subEndpoint, final String id, final Map<String, List<String>> params, final String content) {
        return this.doRequest(HttpMethod.GET, endPoint, subEndpoint, id, params, content);
    }

    @Override
    public <E> E doPut(final E endPoint, final String id, final String content) {
        return this.doRequest(HttpMethod.GET, endPoint, id, content);
    }

    @Override
    public <E> E doPut(final E endPoint, final String id, final Map<String, List<String>> params, final String content) {
        return this.doRequest(HttpMethod.GET, endPoint, id, params, content);
    }

    @Override
    public <E, F> E doPut(final E endPoint, final F subEndpoint, final String id, final String content) {
        return this.doRequest(HttpMethod.GET, endPoint, subEndpoint, id, content);
    }

    @Override
    public <E, F> E doPut(final E endPoint, final F subEndpoint, final String id, final Map<String, List<String>> params, final String content) {
        return this.doRequest(HttpMethod.GET, endPoint, subEndpoint, id, params, content);
    }

    @Override
    public <E> E doDelete(final E endPoint, final String id) {
        return this.doRequest(HttpMethod.GET, endPoint, id, null);
    }

    @Override
    public <E> E doDelete(final E endPoint, final String id, final Map<String, List<String>> params) {
        return this.doRequest(HttpMethod.GET, endPoint, id, params, null);
    }

    @Override
    public <E, F> E doDelete(final E endPoint, final F subEndpoint, final String id) {
        return this.doRequest(HttpMethod.GET, endPoint, subEndpoint, id, null);
    }

    @Override
    public <E, F> E doDelete(final E endPoint, final F subEndpoint, final String id, final Map<String, List<String>> params) {
        return this.doRequest(HttpMethod.GET, endPoint, subEndpoint, id, params, null);
    }

    /**
     * Request content from Dailymotion using the given HTTP method without parameters
     *
     * @param endpoint The endpoint class used to fetch data
     * @param id       The id to fetch
     * @param content
     * @param <E>      The endpoint class
     * @return The object representation of the response
     */
    private <E> E doRequest(final HttpMethod method, final E endpoint, final String id, final String content) {
        Assert.notNull(endpoint, "The given endpoint is null");
        Assert.notNull(id, "The given id is null");

        LOGGER.trace("[IN] callDailymotionAPI with parameters {}, {}, {}", endpoint, id);
        try {
            String endpointName = (String) endpoint.getClass().getField("ENDPOINT").get(null);
            LOGGER.debug("endpointName has value [{}]", endpointName);
            String url = MessageFormat.format("{0}/{1}/{2}", this.dailymotionRootUrl, endpointName, id);
            LOGGER.debug("url has value [{}]", url);
            return callDailymotionAPI(method, endpoint, url, content);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            LOGGER.error("An error occurred while trying to reflect field ENDPOINT on class {}", endpoint.getClass().getSimpleName(), e);
        }
        return null;
    }

    /**
     * Request content from Dailymotion using the given HTTP method without parameters
     *
     * @param method
     * @param endpoint
     * @param id
     * @param params
     * @param content
     * @param <E>
     * @return
     */
    private <E> E doRequest(final HttpMethod method, final E endpoint, final String id, final Map<String, List<String>> params, final String content) {
        Assert.notNull(endpoint, "The given endpoint is null");
        Assert.notNull(id, "The given id is null");

        LOGGER.trace("[IN] callDailymotionAPI with parameters {}, {}, {}", endpoint, id, params);
        try {
            String endpointName = (String) endpoint.getClass().getField("ENDPOINT").get(null);
            LOGGER.debug("endpointName has value [{}]", endpointName);
            String url = MessageFormat.format("{0}/{1}/{2}?{3}", this.dailymotionRootUrl, endpointName, id, this.mapToString(params));
            LOGGER.debug("url has value [{}]", url);
            return callDailymotionAPI(method, endpoint, url, content);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            LOGGER.error("An error occurred while trying to reflect field ENDPOINT on class {}", endpoint.getClass().getSimpleName(), e);
        }
        return null;
    }

    /**
     * Request content from Dailymotion using the given HTTP method without parameters
     *
     * @param method
     * @param endpoint
     * @param subEndpoint
     * @param id
     * @param content
     * @param <E>
     * @param <F>
     * @return
     */
    private <E, F> E doRequest(final HttpMethod method, final E endpoint, final F subEndpoint, final String id, final String content) {
        Assert.notNull(endpoint, "The given endpoint is null");
        Assert.notNull(subEndpoint, "The given subendpoint is null");
        Assert.notNull(id, "The given id is null");

        LOGGER.trace("[IN] callDailymotionAPI with parameters {}, {}, {}", endpoint, subEndpoint, id);
        try {
            String endpointName = (String) endpoint.getClass().getField("ENDPOINT").get(null);
            LOGGER.debug("endpointName has value [{}]", endpointName);
            String subEndpointName = (String) subEndpoint.getClass().getField("ENDPOINT").get(null);
            LOGGER.debug("subEndpointName has value [{}]", subEndpointName);
            String url = MessageFormat.format("{0}/{1}/{2}/{3}?{4}", this.dailymotionRootUrl, endpointName, id, subEndpointName);
            LOGGER.debug("url has value [{}]", url);
            return callDailymotionAPI(method, endpoint, url, content);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            LOGGER.error("An error occurred while trying to reflect field ENDPOINT on class {}", endpoint.getClass().getSimpleName(), e);
        }
        return null;
    }

    /**
     * Request content from Dailymotion using the given HTTP method without parameters
     *
     * @param method
     * @param endpoint
     * @param subEndpoint
     * @param id
     * @param params
     * @param content
     * @param <E>
     * @param <F>
     * @return
     */
    private <E, F> E doRequest(final HttpMethod method, final E endpoint, final F subEndpoint, final String id, final Map<String, List<String>> params, final String content) {
        Assert.notNull(endpoint, "The given endpoint is null");
        Assert.notNull(subEndpoint, "The given subendpoint is null");
        Assert.notNull(id, "The given id is null");

        LOGGER.trace("[IN] callDailymotionAPI with parameters {}, {}, {}, {}", endpoint, subEndpoint, id, params);
        try {
            String endpointName = (String) endpoint.getClass().getField("ENDPOINT").get(null);
            LOGGER.debug("endpointName has value [{}]", endpointName);
            String subEndpointName = (String) subEndpoint.getClass().getField("ENDPOINT").get(null);
            LOGGER.debug("subEndpointName has value [{}]", subEndpointName);
            String url = MessageFormat.format("{0}/{1}/{2}/{3}?{4}", this.dailymotionRootUrl, endpointName, id, subEndpointName, this.mapToString(params));
            LOGGER.debug("url has value [{}]", url);
            return callDailymotionAPI(method, endpoint, url, content);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            LOGGER.error("An error occurred while trying to reflect field ENDPOINT on class {}", endpoint.getClass().getSimpleName(), e);
        }
        return null;
    }

    /**
     * Request content from Dailymotion using the given HTTP method with the given URL and Content
     *
     * @param method
     * @param endpoint
     * @param url
     * @param content
     * @param <E>
     * @return
     */
    private <E> E callDailymotionAPI(final HttpMethod method, final E endpoint, final String url, final String content) {
        LOGGER.trace("[IN] callDailymotionAPI with parameters {}, {}, {}", endpoint, url, content);
        Response response;
        if (HttpMethod.GET.equals(method)) {
            response = this.httpClient.url(url).jsonGet();
        } else if (HttpMethod.POST.equals(method)) {
            response = this.httpClient.url(url).jsonPost(content);
        } else if (HttpMethod.PUT.equals(method)) {
            response = this.httpClient.url(url).jsonPut(content);
        } else if (HttpMethod.DELETE.equals(method)) {
            response = this.httpClient.url(url).delete();
        } else {
            throw new UnsupportedOperationException(MessageFormat.format("The given HttpMethod ({0}) isn't allowed here", method));
        }
        LOGGER.debug("Response from URL {} is {}", url, response.getBody());
        return null;
    }

    /**
     * Concatenates a List of String with a given concatenator
     *
     * @param map The Map of String to concatenate
     * @return The String concatenated
     */
    private String mapToString(Map<String, List<String>> map) {
        LOGGER.trace("[IN] mapToString with parameter {}", map);
        return mapToString(new ArrayList<>(map.keySet()), map);
    }

    /**
     * @param array
     * @param map
     * @return
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
     * <li>Request/Reponse filter for CAS service</li>
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
            this.httpClient.setProxy(proxyHost, proxyPort);
        }
    }
}
