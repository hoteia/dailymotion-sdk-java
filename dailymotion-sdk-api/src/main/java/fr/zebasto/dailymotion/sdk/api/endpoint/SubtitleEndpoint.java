package fr.zebasto.dailymotion.sdk.api.endpoint;

import fr.zebasto.dailymotion.sdk.api.annotation.Endpoint;
import fr.zebasto.dailymotion.sdk.api.communication.ApiError;
import fr.zebasto.dailymotion.sdk.api.communication.ApiResponse;
import fr.zebasto.dailymotion.sdk.api.communication.HttpMethod;
import fr.zebasto.dailymotion.sdk.api.dto.Subtitle;

import java.util.Map;

/**
 * Class description
 *
 * @author Bastien Cecchinato
 * @since 1.0.0
 */
public interface SubtitleEndpoint {
    /**
     *
     * @param parameters
     * @return
     * @throws ApiError
     */
    @Endpoint(value = "/video/{id}/subtitle", target = Subtitle.class, method = HttpMethod.GET)
    ApiResponse<Subtitle> findAll(Map<String, Object> parameters) throws ApiError;

    /**
     *
     * @param id
     * @param parameters
     * @return
     * @throws ApiError
     */
    @Endpoint(value = "/subtitle/{id}", target = Subtitle.class, method = HttpMethod.GET)
    ApiResponse<Subtitle> findById(String id, Map<String, Object> parameters) throws ApiError;

    /**
     *
     * @param parameters
     * @return
     * @throws ApiError
     */
    @Endpoint(value = "/video/{id}/subtitle", target = Subtitle.class, method = HttpMethod.POST)
    ApiResponse<Subtitle> create(Map<String, Object> parameters) throws ApiError;

    /**
     *
     * @param id
     * @param parameters
     * @return
     * @throws ApiError
     */
    @Endpoint(value = "/subtitle/{id}", target = Subtitle.class, method = HttpMethod.POST)
    ApiResponse<Subtitle> update(String id, Map<String, Object> parameters) throws ApiError;

    /**
     *
     * @param id
     * @return
     * @throws ApiError
     */
    @Endpoint(value = "/subtitle/{id}", target = Subtitle.class, method = HttpMethod.DELETE)
    void delete(String id) throws ApiError;
}
