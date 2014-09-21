package fr.zebasto.dailymotion.sdk.api.endpoint;

import fr.zebasto.dailymotion.sdk.api.annotation.Endpoint;
import fr.zebasto.dailymotion.sdk.api.communication.ApiError;
import fr.zebasto.dailymotion.sdk.api.communication.ApiResponse;
import fr.zebasto.dailymotion.sdk.api.communication.HttpMethod;
import fr.zebasto.dailymotion.sdk.api.dto.Activity;

import java.util.Map;

/**
 * Class description
 *
 * @author Bastien Cecchinato
 * @since 1.0.0
 */
public interface ActivityEndpoint {
    /**
     * @param parameters
     * @return
     * @throws ApiError
     */
    @Endpoint(value = "/activities", target = Activity.class, method = HttpMethod.GET)
    ApiResponse<Activity> findAll(Map<String, Object> parameters) throws ApiError;

    /**
     * @param id
     * @param parameters
     * @return
     * @throws ApiError
     */
    @Endpoint(value = "/activity/{id}", target = Activity.class, method = HttpMethod.GET)
    ApiResponse<Activity> findById(String id, Map<String, Object> parameters) throws ApiError;
}
