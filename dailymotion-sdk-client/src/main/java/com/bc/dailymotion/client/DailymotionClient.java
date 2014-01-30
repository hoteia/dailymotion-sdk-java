package com.bc.dailymotion.client;

import com.bc.dailymotion.api.ApiResponse;
import com.bc.dailymotion.api.Connection;
import com.bc.dailymotion.api.Endpoint;

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
     * @return The response containing the list of E elements
     */
    ApiResponse<?> doGet(Endpoint endPoint);

    /**
     * Performs a GET HTTP request on Dailymotion API
     *
     * @param endPoint The endpoint to call
     * @param params   The list of parameters given for the request
     * @return The response containing the list of E elements
     */
    ApiResponse<?> doGet(Endpoint endPoint, Map<String, List<String>> params);

    /**
     * Performs a GET HTTP request on Dailymotion API
     *
     * @param endPoint The endpoint to call
     * @param id       The id that will be used to filter the request on the endpoint
     * @return The response containing the list of E elements
     */
    ApiResponse<?> doGet(Endpoint endPoint, String id);

    /**
     * Performs a GET HTTP request on Dailymotion API
     *
     * @param endPoint The endpoint to call
     * @param id       The id that will be used to filter the request on the endpoint
     * @param params   The list of parameters given for the request
     * @return The response containing the list of E elements
     */
    ApiResponse<?> doGet(Endpoint endPoint, String id, Map<String, List<String>> params);

    /**
     * Performs a GET HTTP request on Dailymotion API
     *
     * @param connection The connection to call
     * @param id         The id that will be used to filter the request on the endpoint
     * @return The response containing the list of T elements
     */
    ApiResponse<?> doGet(Connection connection, String id);

    /**
     * Performs a GET HTTP request on Dailymotion API
     *
     * @param connection The connection to call
     * @param id         The id that will be used to filter the request on the endpoint
     * @param params     The list of parameters given for the request
     * @return The response containing the list of T elements
     */
    ApiResponse<?> doGet(Connection connection, String id, Map<String, List<String>> params);

    /**
     * Performs a GET HTTP request on Dailymotion API
     *
     * @param connection The connection to call
     * @param id         The id that will be used to filter the request on the endpoint
     * @param subId      The id that will be used to filter the request on the connection
     * @return The response containing the list of T elements
     */
    ApiResponse<?> doGet(Connection connection, String id, String subId);

    /**
     * Performs a GET HTTP request on Dailymotion API
     *
     * @param connection The connection to call
     * @param id         The id that will be used to filter the request on the endpoint
     * @param subId      The id that will be used to filter the request on the connection
     * @param params     The list of parameters given for the request
     * @return The response containing the list of T elements
     */
    ApiResponse<?> doGet(Connection connection, String id, String subId, Map<String, List<String>> params);

    /**
     * Performs a POST HTTP request on Dailymotion API
     *
     * @param endPoint The endpoint to call
     * @return The response containing the list of E elements
     */
    ApiResponse<?> doPost(Endpoint endPoint);

    /**
     * Performs a POST HTTP request on Dailymotion API
     *
     * @param endPoint The endpoint to call
     * @param params   The list of parameters given for the request
     * @return The response containing the list of E elements
     */
    ApiResponse<?> doPost(Endpoint endPoint, Map<String, List<String>> params);

    /**
     * Performs a POST HTTP request on Dailymotion API
     *
     * @param endPoint The endpoint to call
     * @param id       The id that will be used to filter the request on the endpoint
     * @return The response containing the list of E elements
     */
    ApiResponse<?> doPost(Endpoint endPoint, String id);

    /**
     * Performs a POST HTTP request on Dailymotion API
     *
     * @param endPoint The endpoint to call
     * @param id       The id that will be used to filter the request on the endpoint
     * @param params   The list of parameters given for the request
     * @return The response containing the list of E elements
     */
    ApiResponse<?> doPost(Endpoint endPoint, String id, Map<String, List<String>> params);

    /**
     * Performs a POST HTTP request on Dailymotion API
     *
     * @param connection The connection to call
     * @param id         The id that will be used to filter the request on the endpoint
     * @return The response containing the list of E elements
     */
    ApiResponse<?> doPost(Connection connection, String id);

    /**
     * Performs a POST HTTP request on Dailymotion API
     *
     * @param connection The connection to call
     * @param id         The id that will be used to filter the request on the endpoint
     * @param params     The list of parameters given for the request
     * @return The response containing the list of T elements
     */
    ApiResponse<?> doPost(Connection connection, String id, Map<String, List<String>> params);

    /**
     * Performs a POST HTTP request on Dailymotion API
     *
     * @param connection The connection to call
     * @param id         The id that will be used to filter the request on the endpoint
     * @param subId      The id that will be used to filter the request on the connection
     * @return The response containing the list of T elements
     */
    ApiResponse<?> doPost(Connection connection, String id, String subId);

    /**
     * Performs a POST HTTP request on Dailymotion API
     *
     * @param connection The connection to call
     * @param id         The id that will be used to filter the request on the endpoint
     * @param subId      The id that will be used to filter the request on the connection
     * @param params     The list of parameters given for the request
     * @return The response containing the list of T elements
     */
    ApiResponse<?> doPost(Connection connection, String id, String subId, Map<String, List<String>> params);

    /**
     * Performs a DELETE HTTP request on Dailymotion API
     *
     * @param endPoint The endpoint to call
     * @return The response containing the list of E elements
     */
    ApiResponse<?> doDelete(Endpoint endPoint);

    /**
     * Performs a DELETE HTTP request on Dailymotion API
     *
     * @param endPoint The endpoint to call
     * @param params   The list of parameters given for the request
     * @return The response containing the list of E elements
     */
    ApiResponse<?> doDelete(Endpoint endPoint, Map<String, List<String>> params);

    /**
     * Performs a DELETE HTTP request on Dailymotion API
     *
     * @param endPoint The endpoint to call
     * @param id       The id that will be used to filter the request on the endpoint
     * @return The response containing the list of E elements
     */
    ApiResponse<?> doDelete(Endpoint endPoint, String id);

    /**
     * Performs a DELETE HTTP request on Dailymotion API
     *
     * @param endPoint The endpoint to call
     * @param id       The id that will be used to filter the request on the endpoint
     * @param params   The list of parameters given for the request
     * @return The response containing the list of E elements
     */
    ApiResponse<?> doDelete(Endpoint endPoint, String id, Map<String, List<String>> params);

    /**
     * Performs a DELETE HTTP request on Dailymotion API
     *
     * @param connection The connection to call
     * @param id         The id that will be used to filter the request on the endpoint
     * @return The response containing the list of T elements
     */
    ApiResponse<?> doDelete(Connection connection, String id);

    /**
     * Performs a DELETE HTTP request on Dailymotion API
     *
     * @param connection The connection to call
     * @param id         The id that will be used to filter the request on the endpoint
     * @param params     The list of parameters given for the request
     * @return The response containing the list of T elements
     */
    ApiResponse<?> doDelete(Connection connection, String id, Map<String, List<String>> params);

    /**
     * Performs a DELETE HTTP request on Dailymotion API
     *
     * @param connection The connection to call
     * @param id         The id that will be used to filter the request on the endpoint
     * @param subId      The id that will be used to filter the request on the connection
     * @return The response containing the list of T elements
     */
    ApiResponse<?> doDelete(Connection connection, String id, String subId);

    /**
     * Performs a DELETE HTTP request on Dailymotion API
     *
     * @param connection The connection to call
     * @param id         The id that will be used to filter the request on the endpoint
     * @param subId      The id that will be used to filter the request on the connection
     * @param params     The list of parameters given for the request
     * @return The response containing the list of T elements
     */
    ApiResponse<?> doDelete(Connection connection, String id, String subId, Map<String, List<String>> params);
}
