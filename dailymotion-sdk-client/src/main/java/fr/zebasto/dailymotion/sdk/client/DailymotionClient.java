package fr.zebasto.dailymotion.sdk.client;


import fr.zebasto.dailymotion.sdk.api.ApiError;
import fr.zebasto.dailymotion.sdk.api.ApiResponse;
import fr.zebasto.dailymotion.sdk.api.Connection;
import fr.zebasto.dailymotion.sdk.api.Endpoint;

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
public interface DailymotionClient {

    /**
     * Performs a GET HTTP request on Dailymotion API
     *
     * @param endPoint The endpoint to call
     * @return The response containing the list of E elements
     */
    ApiResponse<?> doGet(Endpoint endPoint) throws ApiError;

    /**
     * Performs a GET HTTP request on Dailymotion API
     *
     * @param endPoint The endpoint to call
     * @param params   The list of parameters given for the request
     * @return The response containing the list of E elements
     */
    ApiResponse<?> doGet(Endpoint endPoint, Map<String, List<String>> params) throws ApiError;

    /**
     * Performs a GET HTTP request on Dailymotion API
     *
     * @param endPoint The endpoint to call
     * @param id       The id that will be used to filter the request on the endpoint
     * @return The response containing the list of E elements
     */
    ApiResponse<?> doGet(Endpoint endPoint, String id) throws ApiError;

    /**
     * Performs a GET HTTP request on Dailymotion API
     *
     * @param endPoint The endpoint to call
     * @param id       The id that will be used to filter the request on the endpoint
     * @param params   The list of parameters given for the request
     * @return The response containing the list of E elements
     */
    ApiResponse<?> doGet(Endpoint endPoint, String id, Map<String, List<String>> params) throws ApiError;

    /**
     * Performs a GET HTTP request on Dailymotion API
     *
     * @param connection The connection to call
     * @param id         The id that will be used to filter the request on the endpoint
     * @return The response containing the list of T elements
     */
    ApiResponse<?> doGet(Connection connection, String id) throws ApiError;

    /**
     * Performs a GET HTTP request on Dailymotion API
     *
     * @param connection The connection to call
     * @param id         The id that will be used to filter the request on the endpoint
     * @param params     The list of parameters given for the request
     * @return The response containing the list of T elements
     */
    ApiResponse<?> doGet(Connection connection, String id, Map<String, List<String>> params) throws ApiError;

    /**
     * Performs a GET HTTP request on Dailymotion API
     *
     * @param connection The connection to call
     * @param id         The id that will be used to filter the request on the endpoint
     * @param subId      The id that will be used to filter the request on the connection
     * @return The response containing the list of T elements
     */
    ApiResponse<?> doGet(Connection connection, String id, String subId) throws ApiError;

    /**
     * Performs a GET HTTP request on Dailymotion API
     *
     * @param connection The connection to call
     * @param id         The id that will be used to filter the request on the endpoint
     * @param subId      The id that will be used to filter the request on the connection
     * @param params     The list of parameters given for the request
     * @return The response containing the list of T elements
     */
    ApiResponse<?> doGet(Connection connection, String id, String subId, Map<String, List<String>> params) throws ApiError;

    /**
     * Performs a POST HTTP request on Dailymotion API
     *
     * @param endPoint The endpoint to call
     * @return The response containing the list of E elements
     */
    ApiResponse<?> doPost(Endpoint endPoint) throws ApiError;

    /**
     * Performs a POST HTTP request on Dailymotion API
     *
     * @param endPoint The endpoint to call
     * @param params   The list of parameters given for the request
     * @return The response containing the list of E elements
     */
    ApiResponse<?> doPost(Endpoint endPoint, Map<String, List<String>> params) throws ApiError;

    /**
     * Performs a POST HTTP request on Dailymotion API
     *
     * @param endPoint The endpoint to call
     * @param id       The id that will be used to filter the request on the endpoint
     * @return The response containing the list of E elements
     */
    ApiResponse<?> doPost(Endpoint endPoint, String id) throws ApiError;

    /**
     * Performs a POST HTTP request on Dailymotion API
     *
     * @param endPoint The endpoint to call
     * @param id       The id that will be used to filter the request on the endpoint
     * @param params   The list of parameters given for the request
     * @return The response containing the list of E elements
     */
    ApiResponse<?> doPost(Endpoint endPoint, String id, Map<String, List<String>> params) throws ApiError;

    /**
     * Performs a POST HTTP request on Dailymotion API
     *
     * @param connection The connection to call
     * @param id         The id that will be used to filter the request on the endpoint
     * @return The response containing the list of E elements
     */
    ApiResponse<?> doPost(Connection connection, String id) throws ApiError;

    /**
     * Performs a POST HTTP request on Dailymotion API
     *
     * @param connection The connection to call
     * @param id         The id that will be used to filter the request on the endpoint
     * @param params     The list of parameters given for the request
     * @return The response containing the list of T elements
     */
    ApiResponse<?> doPost(Connection connection, String id, Map<String, List<String>> params) throws ApiError;

    /**
     * Performs a POST HTTP request on Dailymotion API
     *
     * @param connection The connection to call
     * @param id         The id that will be used to filter the request on the endpoint
     * @param subId      The id that will be used to filter the request on the connection
     * @return The response containing the list of T elements
     */
    ApiResponse<?> doPost(Connection connection, String id, String subId) throws ApiError;

    /**
     * Performs a POST HTTP request on Dailymotion API
     *
     * @param connection The connection to call
     * @param id         The id that will be used to filter the request on the endpoint
     * @param subId      The id that will be used to filter the request on the connection
     * @param params     The list of parameters given for the request
     * @return The response containing the list of T elements
     */
    ApiResponse<?> doPost(Connection connection, String id, String subId, Map<String, List<String>> params) throws ApiError;

    /**
     * Performs a DELETE HTTP request on Dailymotion API
     *
     * @param endPoint The endpoint to call
     * @param id       The id that will be used to filter the request on the endpoint
     * @return The response containing the list of E elements
     */
    ApiResponse<?> doDelete(Endpoint endPoint, String id) throws ApiError;

    /**
     * Performs a DELETE HTTP request on Dailymotion API
     *
     * @param connection The connection to call
     * @param id         The id that will be used to filter the request on the endpoint
     * @return The response containing the list of T elements
     */
    ApiResponse<?> doDelete(Connection connection, String id) throws ApiError;

    /**
     * Performs a DELETE HTTP request on Dailymotion API
     *
     * @param connection The connection to call
     * @param id         The id that will be used to filter the request on the endpoint
     * @param subId      The id that will be used to filter the request on the connection
     * @return The response containing the list of T elements
     */
    ApiResponse<?> doDelete(Connection connection, String id, String subId) throws ApiError;
}
