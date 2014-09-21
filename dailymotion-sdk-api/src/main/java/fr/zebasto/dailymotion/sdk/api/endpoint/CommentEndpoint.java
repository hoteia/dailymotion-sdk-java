package fr.zebasto.dailymotion.sdk.api.endpoint;

import fr.zebasto.dailymotion.sdk.api.annotation.Endpoint;
import fr.zebasto.dailymotion.sdk.api.communication.ApiError;
import fr.zebasto.dailymotion.sdk.api.communication.ApiResponse;
import fr.zebasto.dailymotion.sdk.api.communication.HttpMethod;
import fr.zebasto.dailymotion.sdk.api.dto.Comment;

import java.util.Map;

/**
 * Class description
 *
 * @author Bastien Cecchinato
 * @since 1.0.0
 */
public interface CommentEndpoint {
    /**
     *
     * @param parameters
     * @return
     * @throws ApiError
     */
    @Endpoint(value = "/video/{id}/comments", target = Comment.class, method = HttpMethod.GET)
    ApiResponse<Comment> findAll(Map<String, Object> parameters) throws ApiError;

    /**
     *
     * @param id
     * @param parameters
     * @return
     * @throws ApiError
     */
    @Endpoint(value = "/comment/{id}", target = Comment.class, method = HttpMethod.GET)
    ApiResponse<Comment> findById(String id, Map<String, Object> parameters) throws ApiError;

    /**
     *
     * @param parameters
     * @return
     * @throws ApiError
     */
    @Endpoint(value = "/video/{id}/comments", target = Comment.class, method = HttpMethod.POST)
    ApiResponse<Comment> create(Map<String, Object> parameters) throws ApiError;

    /**
     *
     * @param id
     * @param parameters
     * @return
     * @throws ApiError
     */
    @Endpoint(value = "/comment/{id}", target = Comment.class, method = HttpMethod.POST)
    ApiResponse<Comment> update(String id, Map<String, Object> parameters) throws ApiError;

    /**
     *
     * @param id
     * @return
     * @throws ApiError
     */
    @Endpoint(value = "/comment/{id}", target = Comment.class, method = HttpMethod.DELETE)
    void delete(String id) throws ApiError;
}
