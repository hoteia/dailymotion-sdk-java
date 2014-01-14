package com.bc.dailymotion.client;

import com.bc.dailymotion.api.ApiResponse;
import com.bc.dailymotion.api.Connection;
import com.bc.dailymotion.api.Endpoint;
import com.bc.dailymotion.api.type.ConnectionType;
import com.bc.dailymotion.api.type.EndpointType;

import java.util.List;
import java.util.Map;

/**
 * Interface of DailyMotion Client
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
 * More details on <url>http://www.dailymotion.com/doc/api/graph-api.html</url>
 */
public interface DailymotionClient {

    /**
     * Performs a GET HTTP request on Dailymotion API
     *
     * @param endPoint The endpoint to call
     * @param type     The type of request see {@link com.bc.dailymotion.api.type.EndpointType}
     * @param <E>      The parametrized type of expected return type
     * @return The response containing the list of E elements
     */
    <E> ApiResponse<E> doGet(Class<? extends Endpoint<E>> endPoint, EndpointType type);

    /**
     * Performs a GET HTTP request on Dailymotion API
     *
     * @param endPoint The endpoint to call
     * @param type     The type of request see {@link com.bc.dailymotion.api.type.EndpointType}
     * @param params   The list of parameters given for the request
     * @param <E>      The parametrized type of expected return type
     * @return The response containing the list of E elements
     */
    <E> ApiResponse<E> doGet(Class<? extends Endpoint<E>> endPoint, EndpointType type, Map<String, List<String>> params);

    /**
     * Performs a GET HTTP request on Dailymotion API
     *
     * @param endPoint The endpoint to call
     * @param type     The type of request see {@link com.bc.dailymotion.api.type.EndpointType}
     * @param id       The id that will be used to filter the request on the endpoint
     * @param <E>      The parametrized type of expected return type
     * @return The response containing the list of E elements
     */
    <E> ApiResponse<E> doGet(Class<? extends Endpoint<E>> endPoint, EndpointType type, String id);

    /**
     * Performs a GET HTTP request on Dailymotion API
     *
     * @param endPoint The endpoint to call
     * @param type     The type of request see {@link com.bc.dailymotion.api.type.EndpointType}
     * @param id       The id that will be used to filter the request on the endpoint
     * @param params   The list of parameters given for the request
     * @param <E>      The parametrized type of expected return type
     * @return The response containing the list of E elements
     */
    <E> ApiResponse<E> doGet(Class<? extends Endpoint<E>> endPoint, EndpointType type, String id, Map<String, List<String>> params);

    /**
     * Performs a GET HTTP request on Dailymotion API
     *
     * @param connection The connection to call
     * @param type       The type of request see {@link com.bc.dailymotion.api.type.ConnectionType}
     * @param id         The id that will be used to filter the request on the endpoint
     * @param <E>        The parametrized type of the parent endpoint
     * @param <T>        The parametrized type of expected return type
     * @return The response containing the list of T elements
     */
    <E, T> ApiResponse<T> doGet(Class<? extends Connection<E, T>> connection, ConnectionType type, String id);

    /**
     * Performs a GET HTTP request on Dailymotion API
     *
     * @param connection The connection to call
     * @param type       The type of request see {@link com.bc.dailymotion.api.type.ConnectionType}
     * @param id         The id that will be used to filter the request on the endpoint
     * @param params     The list of parameters given for the request
     * @param <E>        The parametrized type of the parent endpoint
     * @param <T>        The parametrized type of expected return type
     * @return The response containing the list of T elements
     */
    <E, T> ApiResponse<T> doGet(Class<? extends Connection<E, T>> connection, ConnectionType type, String id, Map<String, List<String>> params);

    /**
     * Performs a GET HTTP request on Dailymotion API
     *
     * @param connection The connection to call
     * @param type       The type of request see {@link com.bc.dailymotion.api.type.ConnectionType}
     * @param id         The id that will be used to filter the request on the endpoint
     * @param subId      The id that will be used to filter the request on the connection
     * @param <E>        The parametrized type of the parent endpoint
     * @param <T>        The parametrized type of expected return type
     * @return The response containing the list of T elements
     */
    <E, T> ApiResponse<T> doGet(Class<? extends Connection<E, T>> connection, ConnectionType type, String id, String subId);

    /**
     * Performs a GET HTTP request on Dailymotion API
     *
     * @param connection The connection to call
     * @param type       The type of request see {@link com.bc.dailymotion.api.type.ConnectionType}
     * @param id         The id that will be used to filter the request on the endpoint
     * @param subId      The id that will be used to filter the request on the connection
     * @param params     The list of parameters given for the request
     * @param <E>        The parametrized type of the parent endpoint
     * @param <T>        The parametrized type of expected return type
     * @return The response containing the list of T elements
     */
    <E, T> ApiResponse<T> doGet(Class<? extends Connection<E, T>> connection, ConnectionType type, String id, String subId, Map<String, List<String>> params);

    /**
     * Performs a POST HTTP request on Dailymotion API
     *
     * @param endPoint The endpoint to call
     * @param type     The type of request see {@link com.bc.dailymotion.api.type.EndpointType}
     * @param <E>      The parametrized type of expected return type
     * @return The response containing the list of E elements
     */
    <E> ApiResponse<E> doPost(Class<? extends Endpoint<E>> endPoint, EndpointType type);

    /**
     * Performs a POST HTTP request on Dailymotion API
     *
     * @param endPoint The endpoint to call
     * @param type     The type of request see {@link com.bc.dailymotion.api.type.EndpointType}
     * @param params   The list of parameters given for the request
     * @param <E>      The parametrized type of expected return type
     * @return The response containing the list of E elements
     */
    <E> ApiResponse<E> doPost(Class<? extends Endpoint<E>> endPoint, EndpointType type, Map<String, List<String>> params);

    /**
     * Performs a POST HTTP request on Dailymotion API
     *
     * @param endPoint The endpoint to call
     * @param type     The type of request see {@link com.bc.dailymotion.api.type.EndpointType}
     * @param id       The id that will be used to filter the request on the endpoint
     * @param <E>      The parametrized type of expected return type
     * @return The response containing the list of E elements
     */
    <E> ApiResponse<E> doPost(Class<? extends Endpoint<E>> endPoint, EndpointType type, String id);

    /**
     * Performs a POST HTTP request on Dailymotion API
     *
     * @param endPoint The endpoint to call
     * @param type     The type of request see {@link com.bc.dailymotion.api.type.EndpointType}
     * @param id       The id that will be used to filter the request on the endpoint
     * @param params   The list of parameters given for the request
     * @param <E>      The parametrized type of expected return type
     * @return The response containing the list of E elements
     */
    <E> ApiResponse<E> doPost(Class<? extends Endpoint<E>> endPoint, EndpointType type, String id, Map<String, List<String>> params);

    /**
     * Performs a POST HTTP request on Dailymotion API
     *
     * @param connection The connection to call
     * @param type       The type of request see {@link com.bc.dailymotion.api.type.ConnectionType}
     * @param id         The id that will be used to filter the request on the endpoint
     * @param <E>        The parametrized type of the parent endpoint
     * @param <T>        The parametrized type of expected return type
     * @return The response containing the list of E elements
     */
    <E, T> ApiResponse<T> doPost(Class<? extends Connection<E, T>> connection, ConnectionType type, String id);

    /**
     * Performs a POST HTTP request on Dailymotion API
     *
     * @param connection The connection to call
     * @param type       The type of request see {@link com.bc.dailymotion.api.type.ConnectionType}
     * @param id         The id that will be used to filter the request on the endpoint
     * @param params     The list of parameters given for the request
     * @param <E>        The parametrized type of the parent endpoint
     * @param <T>        The parametrized type of expected return type
     * @return The response containing the list of T elements
     */
    <E, T> ApiResponse<T> doPost(Class<? extends Connection<E, T>> connection, ConnectionType type, String id, Map<String, List<String>> params);

    /**
     * Performs a POST HTTP request on Dailymotion API
     *
     * @param connection The connection to call
     * @param type       The type of request see {@link com.bc.dailymotion.api.type.ConnectionType}
     * @param id         The id that will be used to filter the request on the endpoint
     * @param subId      The id that will be used to filter the request on the connection
     * @param <E>        The parametrized type of the parent endpoint
     * @param <T>        The parametrized type of expected return type
     * @return The response containing the list of T elements
     */
    <E, T> ApiResponse<T> doPost(Class<? extends Connection<E, T>> connection, ConnectionType type, String id, String subId);

    /**
     * Performs a POST HTTP request on Dailymotion API
     *
     * @param connection The connection to call
     * @param type       The type of request see {@link com.bc.dailymotion.api.type.ConnectionType}
     * @param id         The id that will be used to filter the request on the endpoint
     * @param subId      The id that will be used to filter the request on the connection
     * @param params     The list of parameters given for the request
     * @param <E>        The parametrized type of the parent endpoint
     * @param <T>        The parametrized type of expected return type
     * @return The response containing the list of T elements
     */
    <E, T> ApiResponse<T> doPost(Class<? extends Connection<E, T>> connection, ConnectionType type, String id, String subId, Map<String, List<String>> params);

    /**
     * Performs a DELETE HTTP request on Dailymotion API
     *
     * @param endPoint The endpoint to call
     * @param type     The type of request see {@link com.bc.dailymotion.api.type.EndpointType}
     * @param <E>      The parametrized type of expected return type
     * @return The response containing the list of E elements
     */
    <E> ApiResponse<E> doDelete(Class<? extends Endpoint<E>> endPoint, EndpointType type);

    /**
     * Performs a DELETE HTTP request on Dailymotion API
     *
     * @param endPoint The endpoint to call
     * @param type     The type of request see {@link com.bc.dailymotion.api.type.EndpointType}
     * @param params   The list of parameters given for the request
     * @param <E>      The parametrized type of expected return type
     * @return The response containing the list of E elements
     */
    <E> ApiResponse<E> doDelete(Class<? extends Endpoint<E>> endPoint, EndpointType type, Map<String, List<String>> params);

    /**
     * Performs a DELETE HTTP request on Dailymotion API
     *
     * @param endPoint The endpoint to call
     * @param type     The type of request see {@link com.bc.dailymotion.api.type.EndpointType}
     * @param id       The id that will be used to filter the request on the endpoint
     * @param <E>      The parametrized type of expected return type
     * @return The response containing the list of E elements
     */
    <E> ApiResponse<E> doDelete(Class<? extends Endpoint<E>> endPoint, EndpointType type, String id);

    /**
     * Performs a DELETE HTTP request on Dailymotion API
     *
     * @param endPoint The endpoint to call
     * @param type     The type of request see {@link com.bc.dailymotion.api.type.EndpointType}
     * @param id       The id that will be used to filter the request on the endpoint
     * @param params   The list of parameters given for the request
     * @param <E>      The parametrized type of expected return type
     * @return The response containing the list of E elements
     */
    <E> ApiResponse<E> doDelete(Class<? extends Endpoint<E>> endPoint, EndpointType type, String id, Map<String, List<String>> params);

    /**
     * Performs a DELETE HTTP request on Dailymotion API
     *
     * @param connection The connection to call
     * @param type       The type of request see {@link com.bc.dailymotion.api.type.ConnectionType}
     * @param id         The id that will be used to filter the request on the endpoint
     * @param <E>        The parametrized type of the parent endpoint
     * @param <T>        The parametrized type of expected return type
     * @return The response containing the list of T elements
     */
    <E, T> ApiResponse<T> doDelete(Class<? extends Connection<E, T>> connection, ConnectionType type, String id);

    /**
     * Performs a DELETE HTTP request on Dailymotion API
     *
     * @param connection The connection to call
     * @param type       The type of request see {@link com.bc.dailymotion.api.type.ConnectionType}
     * @param id         The id that will be used to filter the request on the endpoint
     * @param params     The list of parameters given for the request
     * @param <E>        The parametrized type of the parent endpoint
     * @param <T>        The parametrized type of expected return type
     * @return The response containing the list of T elements
     */
    <E, T> ApiResponse<T> doDelete(Class<? extends Connection<E, T>> connection, ConnectionType type, String id, Map<String, List<String>> params);

    /**
     * Performs a DELETE HTTP request on Dailymotion API
     *
     * @param connection The connection to call
     * @param type       The type of request see {@link com.bc.dailymotion.api.type.ConnectionType}
     * @param id         The id that will be used to filter the request on the endpoint
     * @param subId      The id that will be used to filter the request on the connection
     * @param <E>        The parametrized type of the parent endpoint
     * @param <T>        The parametrized type of expected return type
     * @return The response containing the list of T elements
     */
    <E, T> ApiResponse<T> doDelete(Class<? extends Connection<E, T>> connection, ConnectionType type, String id, String subId);

    /**
     * Performs a DELETE HTTP request on Dailymotion API
     *
     * @param connection The connection to call
     * @param type       The type of request see {@link com.bc.dailymotion.api.type.ConnectionType}
     * @param id         The id that will be used to filter the request on the endpoint
     * @param subId      The id that will be used to filter the request on the connection
     * @param params     The list of parameters given for the request
     * @param <E>        The parametrized type of the parent endpoint
     * @param <T>        The parametrized type of expected return type
     * @return The response containing the list of T elements
     */
    <E, T> ApiResponse<T> doDelete(Class<? extends Connection<E, T>> connection, ConnectionType type, String id, String subId, Map<String, List<String>> params);
}
