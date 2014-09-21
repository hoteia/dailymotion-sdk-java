package fr.zebasto.dailymotion.sdk.api.endpoint;

import fr.zebasto.dailymotion.sdk.api.annotation.Connection;
import fr.zebasto.dailymotion.sdk.api.annotation.Endpoint;
import fr.zebasto.dailymotion.sdk.api.communication.ApiError;
import fr.zebasto.dailymotion.sdk.api.communication.ApiResponse;
import fr.zebasto.dailymotion.sdk.api.communication.HttpMethod;
import fr.zebasto.dailymotion.sdk.api.dto.Contest;
import fr.zebasto.dailymotion.sdk.api.dto.User;
import fr.zebasto.dailymotion.sdk.api.dto.Video;

import java.util.Map;

/**
 * Class description
 *
 * @author Bastien Cecchinato
 * @since 1.0.0
 */
public interface ContestEndpoint {
    /**
     *
     * @param parameters
     * @return
     * @throws ApiError
     */
    @Endpoint(value = "/contests", target = Contest.class, method = HttpMethod.GET)
    ApiResponse<Contest> findAll(Map<String, Object> parameters) throws ApiError;

    /**
     *
     * @param id
     * @param parameters
     * @return
     * @throws ApiError
     */
    @Endpoint(value = "/contest/{id}", target = Contest.class, method = HttpMethod.GET)
    ApiResponse<Contest> findById(String id, Map<String, Object> parameters) throws ApiError;

    /**
     *
     * @param id
     * @param parameters
     * @return
     * @throws ApiError
     */
    @Endpoint(value = "/contest/{id}/members", target = User.class, method = HttpMethod.GET)
    ApiResponse<User> findUsersByContestId(String id, Map<String, Object> parameters) throws ApiError;

    /**
     *
     * @param id
     * @param parameters
     * @return
     * @throws ApiError
     */
    @Connection(value = "/contest/{id}/videos", target = Video.class, method = HttpMethod.GET)
    ApiResponse<Video> findVideosByContestId(String id, Map<String, Object> parameters) throws ApiError;
}
