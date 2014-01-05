package com.bc.dailymotion.client;

import checkers.nullness.quals.NonNull;
import com.bc.dailymotion.api.Connection;
import com.bc.dailymotion.api.Connection.ConnectionType;
import com.bc.dailymotion.api.Endpoint;
import com.bc.dailymotion.api.Endpoint.EndpointType;
import com.bc.dailymotion.api.Response;

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
     * @param type     The type of request see {@link com.bc.dailymotion.api.Endpoint.EndpointType}
     * @param <E>      The parametrized type of expected return type
     * @return The response containing the list of E elements
     */
    <E> Response<E> doGet(@NonNull Class<? extends Endpoint<E>> endPoint, @NonNull EndpointType type);

    /**
     * Performs a GET HTTP request on Dailymotion API
     *
     * @param endPoint The endpoint to call
     * @param type     The type of request see {@link com.bc.dailymotion.api.Endpoint.EndpointType}
     * @param params   The list of parameters given for the request
     * @param <E>      The parametrized type of expected return type
     * @return The response containing the list of E elements
     */
    <E> Response<E> doGet(@NonNull Class<? extends Endpoint<E>> endPoint, @NonNull EndpointType type, @NonNull Map<String, List<String>> params);

    /**
     * Performs a GET HTTP request on Dailymotion API
     *
     * @param endPoint The endpoint to call
     * @param type     The type of request see {@link com.bc.dailymotion.api.Endpoint.EndpointType}
     * @param id       The id that will be used to filter the request on the endpoint
     * @param <E>      The parametrized type of expected return type
     * @return The response containing the list of E elements
     */
    <E> Response<E> doGet(@NonNull Class<? extends Endpoint<E>> endPoint, @NonNull EndpointType type, @NonNull String id);

    /**
     * Performs a GET HTTP request on Dailymotion API
     *
     * @param endPoint The endpoint to call
     * @param type     The type of request see {@link com.bc.dailymotion.api.Endpoint.EndpointType}
     * @param id       The id that will be used to filter the request on the endpoint
     * @param params   The list of parameters given for the request
     * @param <E>      The parametrized type of expected return type
     * @return The response containing the list of E elements
     */
    <E> Response<E> doGet(@NonNull Class<? extends Endpoint<E>> endPoint, @NonNull EndpointType type, @NonNull String id, @NonNull Map<String, List<String>> params);

    /**
     * Performs a GET HTTP request on Dailymotion API
     *
     * @param connection The connection to call
     * @param type       The type of request see {@link com.bc.dailymotion.api.Connection.ConnectionType}
     * @param id         The id that will be used to filter the request on the endpoint
     * @param <E>        The parametrized type of the parent endpoint
     * @param <T>        The parametrized type of expected return type
     * @return The response containing the list of T elements
     */
    <E, T> Response<T> doGet(@NonNull Class<? extends Connection<E, T>> connection, @NonNull ConnectionType type, @NonNull String id);

    /**
     * Performs a GET HTTP request on Dailymotion API
     *
     * @param connection The connection to call
     * @param type       The type of request see {@link com.bc.dailymotion.api.Connection.ConnectionType}
     * @param id         The id that will be used to filter the request on the endpoint
     * @param params     The list of parameters given for the request
     * @param <E>        The parametrized type of the parent endpoint
     * @param <T>        The parametrized type of expected return type
     * @return The response containing the list of T elements
     */
    <E, T> Response<T> doGet(@NonNull Class<? extends Connection<E, T>> connection, @NonNull ConnectionType type, @NonNull String id, @NonNull Map<String, List<String>> params);

    /**
     * Performs a GET HTTP request on Dailymotion API
     *
     * @param connection The connection to call
     * @param type       The type of request see {@link com.bc.dailymotion.api.Connection.ConnectionType}
     * @param id         The id that will be used to filter the request on the endpoint
     * @param subId      The id that will be used to filter the request on the connection
     * @param <E>        The parametrized type of the parent endpoint
     * @param <T>        The parametrized type of expected return type
     * @return The response containing the list of T elements
     */
    <E, T> Response<T> doGet(@NonNull Class<? extends Connection<E, T>> connection, @NonNull ConnectionType type, @NonNull String id, @NonNull String subId);

    /**
     * Performs a GET HTTP request on Dailymotion API
     *
     * @param connection The connection to call
     * @param type       The type of request see {@link com.bc.dailymotion.api.Connection.ConnectionType}
     * @param id         The id that will be used to filter the request on the endpoint
     * @param subId      The id that will be used to filter the request on the connection
     * @param params     The list of parameters given for the request
     * @param <E>        The parametrized type of the parent endpoint
     * @param <T>        The parametrized type of expected return type
     * @return The response containing the list of T elements
     */
    <E, T> Response<T> doGet(@NonNull Class<? extends Connection<E, T>> connection, @NonNull ConnectionType type, @NonNull String id, @NonNull String subId, @NonNull Map<String, List<String>> params);

    /**
     * Performs a POST HTTP request on Dailymotion API
     *
     * @param endPoint The endpoint to call
     * @param type     The type of request see {@link com.bc.dailymotion.api.Endpoint.EndpointType}
     * @param <E>      The parametrized type of expected return type
     * @return The response containing the list of E elements
     */
    <E> Response<E> doPost(@NonNull Class<? extends Endpoint<E>> endPoint, @NonNull EndpointType type);

    /**
     * Performs a POST HTTP request on Dailymotion API
     *
     * @param endPoint The endpoint to call
     * @param type     The type of request see {@link com.bc.dailymotion.api.Endpoint.EndpointType}
     * @param params   The list of parameters given for the request
     * @param <E>      The parametrized type of expected return type
     * @return The response containing the list of E elements
     */
    <E> Response<E> doPost(@NonNull Class<? extends Endpoint<E>> endPoint, @NonNull EndpointType type, @NonNull Map<String, List<String>> params);

    /**
     * Performs a POST HTTP request on Dailymotion API
     *
     * @param endPoint The endpoint to call
     * @param type     The type of request see {@link com.bc.dailymotion.api.Endpoint.EndpointType}
     * @param id       The id that will be used to filter the request on the endpoint
     * @param <E>      The parametrized type of expected return type
     * @return The response containing the list of E elements
     */
    <E> Response<E> doPost(@NonNull Class<? extends Endpoint<E>> endPoint, @NonNull EndpointType type, @NonNull String id);

    /**
     * Performs a POST HTTP request on Dailymotion API
     *
     * @param endPoint The endpoint to call
     * @param type     The type of request see {@link com.bc.dailymotion.api.Endpoint.EndpointType}
     * @param id       The id that will be used to filter the request on the endpoint
     * @param params   The list of parameters given for the request
     * @param <E>      The parametrized type of expected return type
     * @return The response containing the list of E elements
     */
    <E> Response<E> doPost(@NonNull Class<? extends Endpoint<E>> endPoint, @NonNull EndpointType type, @NonNull String id, @NonNull Map<String, List<String>> params);

    /**
     * Performs a POST HTTP request on Dailymotion API
     *
     * @param connection The connection to call
     * @param type       The type of request see {@link com.bc.dailymotion.api.Connection.ConnectionType}
     * @param id         The id that will be used to filter the request on the endpoint
     * @param <E>        The parametrized type of the parent endpoint
     * @param <T>        The parametrized type of expected return type
     * @return The response containing the list of E elements
     */
    <E, T> Response<T> doPost(@NonNull Class<? extends Connection<E, T>> connection, @NonNull ConnectionType type, @NonNull String id);

    /**
     * Performs a POST HTTP request on Dailymotion API
     *
     * @param connection The connection to call
     * @param type       The type of request see {@link com.bc.dailymotion.api.Connection.ConnectionType}
     * @param id         The id that will be used to filter the request on the endpoint
     * @param params     The list of parameters given for the request
     * @param <E>        The parametrized type of the parent endpoint
     * @param <T>        The parametrized type of expected return type
     * @return The response containing the list of T elements
     */
    <E, T> Response<T> doPost(@NonNull Class<? extends Connection<E, T>> connection, @NonNull ConnectionType type, @NonNull String id, @NonNull Map<String, List<String>> params);

    /**
     * Performs a POST HTTP request on Dailymotion API
     *
     * @param connection The connection to call
     * @param type       The type of request see {@link com.bc.dailymotion.api.Connection.ConnectionType}
     * @param id         The id that will be used to filter the request on the endpoint
     * @param subId      The id that will be used to filter the request on the connection
     * @param <E>        The parametrized type of the parent endpoint
     * @param <T>        The parametrized type of expected return type
     * @return The response containing the list of T elements
     */
    <E, T> Response<T> doPost(@NonNull Class<? extends Connection<E, T>> connection, @NonNull ConnectionType type, @NonNull String id, @NonNull String subId);

    /**
     * Performs a POST HTTP request on Dailymotion API
     *
     * @param connection The connection to call
     * @param type       The type of request see {@link com.bc.dailymotion.api.Connection.ConnectionType}
     * @param id         The id that will be used to filter the request on the endpoint
     * @param subId      The id that will be used to filter the request on the connection
     * @param params     The list of parameters given for the request
     * @param <E>        The parametrized type of the parent endpoint
     * @param <T>        The parametrized type of expected return type
     * @return The response containing the list of T elements
     */
    <E, T> Response<T> doPost(@NonNull Class<? extends Connection<E, T>> connection, @NonNull ConnectionType type, @NonNull String id, @NonNull String subId, @NonNull Map<String, List<String>> params);

    /**
     * Performs a DELETE HTTP request on Dailymotion API
     *
     * @param endPoint The endpoint to call
     * @param type     The type of request see {@link com.bc.dailymotion.api.Endpoint.EndpointType}
     * @param <E>      The parametrized type of expected return type
     * @return The response containing the list of E elements
     */
    <E> Response<E> doDelete(@NonNull Class<? extends Endpoint<E>> endPoint, @NonNull EndpointType type);

    /**
     * Performs a DELETE HTTP request on Dailymotion API
     *
     * @param endPoint The endpoint to call
     * @param type     The type of request see {@link com.bc.dailymotion.api.Endpoint.EndpointType}
     * @param params   The list of parameters given for the request
     * @param <E>      The parametrized type of expected return type
     * @return The response containing the list of E elements
     */
    <E> Response<E> doDelete(@NonNull Class<? extends Endpoint<E>> endPoint, @NonNull EndpointType type, @NonNull Map<String, List<String>> params);

    /**
     * Performs a DELETE HTTP request on Dailymotion API
     *
     * @param endPoint The endpoint to call
     * @param type     The type of request see {@link com.bc.dailymotion.api.Endpoint.EndpointType}
     * @param id       The id that will be used to filter the request on the endpoint
     * @param <E>      The parametrized type of expected return type
     * @return The response containing the list of E elements
     */
    <E> Response<E> doDelete(@NonNull Class<? extends Endpoint<E>> endPoint, @NonNull EndpointType type, @NonNull String id);

    /**
     * Performs a DELETE HTTP request on Dailymotion API
     *
     * @param endPoint The endpoint to call
     * @param type     The type of request see {@link com.bc.dailymotion.api.Endpoint.EndpointType}
     * @param id       The id that will be used to filter the request on the endpoint
     * @param params   The list of parameters given for the request
     * @param <E>      The parametrized type of expected return type
     * @return The response containing the list of E elements
     */
    <E> Response<E> doDelete(@NonNull Class<? extends Endpoint<E>> endPoint, @NonNull EndpointType type, @NonNull String id, @NonNull Map<String, List<String>> params);

    /**
     * Performs a DELETE HTTP request on Dailymotion API
     *
     * @param connection The connection to call
     * @param type       The type of request see {@link com.bc.dailymotion.api.Connection.ConnectionType}
     * @param id         The id that will be used to filter the request on the endpoint
     * @param <E>        The parametrized type of the parent endpoint
     * @param <T>        The parametrized type of expected return type
     * @return The response containing the list of T elements
     */
    <E, T> Response<T> doDelete(@NonNull Class<? extends Connection<E, T>> connection, @NonNull ConnectionType type, @NonNull String id);

    /**
     * Performs a DELETE HTTP request on Dailymotion API
     *
     * @param connection The connection to call
     * @param type       The type of request see {@link com.bc.dailymotion.api.Connection.ConnectionType}
     * @param id         The id that will be used to filter the request on the endpoint
     * @param params     The list of parameters given for the request
     * @param <E>        The parametrized type of the parent endpoint
     * @param <T>        The parametrized type of expected return type
     * @return The response containing the list of T elements
     */
    <E, T> Response<T> doDelete(@NonNull Class<? extends Connection<E, T>> connection, @NonNull ConnectionType type, @NonNull String id, @NonNull Map<String, List<String>> params);

    /**
     * Performs a DELETE HTTP request on Dailymotion API
     *
     * @param connection The connection to call
     * @param type       The type of request see {@link com.bc.dailymotion.api.Connection.ConnectionType}
     * @param id         The id that will be used to filter the request on the endpoint
     * @param subId      The id that will be used to filter the request on the connection
     * @param <E>        The parametrized type of the parent endpoint
     * @param <T>        The parametrized type of expected return type
     * @return The response containing the list of T elements
     */
    <E, T> Response<T> doDelete(@NonNull Class<? extends Connection<E, T>> connection, @NonNull ConnectionType type, @NonNull String id, @NonNull String subId);

    /**
     * Performs a DELETE HTTP request on Dailymotion API
     *
     * @param connection The connection to call
     * @param type       The type of request see {@link com.bc.dailymotion.api.Connection.ConnectionType}
     * @param id         The id that will be used to filter the request on the endpoint
     * @param subId      The id that will be used to filter the request on the connection
     * @param params     The list of parameters given for the request
     * @param <E>        The parametrized type of the parent endpoint
     * @param <T>        The parametrized type of expected return type
     * @return The response containing the list of T elements
     */
    <E, T> Response<T> doDelete(@NonNull Class<? extends Connection<E, T>> connection, @NonNull ConnectionType type, @NonNull String id, @NonNull String subId, @NonNull Map<String, List<String>> params);
}
