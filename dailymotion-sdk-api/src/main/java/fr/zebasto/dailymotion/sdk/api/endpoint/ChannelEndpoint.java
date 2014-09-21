package fr.zebasto.dailymotion.sdk.api.endpoint;

import fr.zebasto.dailymotion.sdk.api.annotation.Connection;
import fr.zebasto.dailymotion.sdk.api.annotation.Endpoint;
import fr.zebasto.dailymotion.sdk.api.communication.ApiError;
import fr.zebasto.dailymotion.sdk.api.communication.ApiResponse;
import fr.zebasto.dailymotion.sdk.api.communication.HttpMethod;
import fr.zebasto.dailymotion.sdk.api.dto.Channel;
import fr.zebasto.dailymotion.sdk.api.dto.User;
import fr.zebasto.dailymotion.sdk.api.dto.Video;

import java.util.Map;

/**
 * Class description
 *
 * @author Bastien Cecchinato
 * @since 1.0.0
 */
public interface ChannelEndpoint {
    /**
     * @param parameters
     * @return
     * @throws ApiError
     */
    @Endpoint(value = "/channels", target = Channel.class, method = HttpMethod.GET)
    ApiResponse<Channel> findAll(Map<String, Object> parameters) throws ApiError;

    /**
     * @param id
     * @param parameters
     * @return
     * @throws ApiError
     */
    @Endpoint(value = "/channel/{id}", target = Channel.class, method = HttpMethod.GET)
    ApiResponse<Channel> findById(String id, Map<String, Object> parameters) throws ApiError;

    /**
     * @param id
     * @param parameters
     * @return
     * @throws ApiError
     */
    @Connection(value = "/channel/{id}/users", target = User.class, method = HttpMethod.GET)
    ApiResponse<User> findUsersByChannelId(String id, Map<String, Object> parameters) throws ApiError;

    /**
     * @param id
     * @param parameters
     * @return
     * @throws ApiError
     */
    @Connection(value = "/channel/{id}/videos", target = Video.class, method = HttpMethod.GET)
    ApiResponse<Video> findVideosByChannelId(String id, Map<String, Object> parameters) throws ApiError;
}