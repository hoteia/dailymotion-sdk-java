package fr.zebasto.dailymotion.sdk.api.endpoint;

import fr.zebasto.dailymotion.sdk.api.annotation.Connection;
import fr.zebasto.dailymotion.sdk.api.annotation.Endpoint;
import fr.zebasto.dailymotion.sdk.api.communication.ApiError;
import fr.zebasto.dailymotion.sdk.api.communication.ApiResponse;
import fr.zebasto.dailymotion.sdk.api.communication.HttpMethod;
import fr.zebasto.dailymotion.sdk.api.dto.Group;
import fr.zebasto.dailymotion.sdk.api.dto.User;
import fr.zebasto.dailymotion.sdk.api.dto.Video;

import java.util.Map;

/**
 * Class description
 *
 * @author Bastien Cecchinato
 * @since 1.0.0
 */
public interface GroupEndpoint {
    /**
     *
     * @param parameters
     * @return
     * @throws ApiError
     */
    @Endpoint(value = "/groups", target = Group.class, method = HttpMethod.GET)
    ApiResponse<Group> findAll(Map<String, Object> parameters) throws ApiError;

    /**
     *
     * @param id
     * @param parameters
     * @return
     * @throws ApiError
     */
    @Endpoint(value = "/group/{id}", target = Group.class, method = HttpMethod.GET)
    ApiResponse<Group> findById(String id, Map<String, Object> parameters) throws ApiError;

    /**
     *
     * @param parameters
     * @return
     * @throws ApiError
     */
    @Endpoint(value = "/me/groups", target = Group.class, method = HttpMethod.POST)
    ApiResponse<Group> create(Map<String, Object> parameters) throws ApiError;

    /**
     *
     * @param id
     * @param parameters
     * @return
     * @throws ApiError
     */
    @Endpoint(value = "/group/{id}", target = Group.class, method = HttpMethod.POST)
    ApiResponse<Group> update(String id, Map<String, Object> parameters) throws ApiError;

    /**
     *
     * @param id
     * @throws ApiError
     */
    @Endpoint(value = "/group/{id}", target = Group.class, method = HttpMethod.DELETE)
    void delete(String id) throws ApiError;

    /**
     *
     * @param id
     * @param parameters
     * @return
     * @throws ApiError
     */
    @Connection(value = "/group/{id}/members", target = User.class, method = HttpMethod.GET)
    ApiResponse<User> findUsersByGroupId(String id, Map<String, Object> parameters) throws ApiError;

    /**
     *
     * @param user
     * @param parameters
     * @return
     * @throws ApiError
     */
    @Connection(value = "/group/{id}/members/{user}", target = User.class, method = HttpMethod.POST, params = 2)
    ApiResponse<User> findUserByGroupId(String id, String user, Map<String, Object> parameters) throws ApiError;

    /**
     *
     * @param id
     * @param user
     * @param parameters
     * @return
     * @throws ApiError
     */
    @Connection(value = "/group/{id}/members/{user}", target = User.class, method = HttpMethod.POST, params = 2)
    ApiResponse<User> addUserToGroup(String id, String user, Map<String, Object> parameters) throws ApiError;

    /**
     *
     * @param id
     * @param user
     * @throws ApiError
     */
    @Connection(value = "/group/{id}/members/{user}", target = User.class, method = HttpMethod.DELETE, params = 2)
    void removeUserFromGroup(String id, String user) throws ApiError;

    /**
     *
     * @param id
     * @param video
     * @param parameters
     * @return
     * @throws ApiError
     */
    @Connection(value = "/group/{id}/videos", target = Video.class, method = HttpMethod.GET)
    ApiResponse<Video> findVideosByGroupId(String id, String video, Map<String, Object> parameters) throws ApiError;

    /**
     *
     * @param video
     * @param parameters
     * @return
     * @throws ApiError
     */
    @Connection(value = "/group/{id}/videos/{video}", target = Video.class, method = HttpMethod.POST, params = 2)
    ApiResponse<Video> findVideoByGroupId(String id, String video, Map<String, Object> parameters) throws ApiError;

    /**
     *
     * @param id
     * @param video
     * @param parameters
     * @return
     * @throws ApiError
     */
    @Connection(value = "/group/{id}/videos/{video}", target = Video.class, method = HttpMethod.POST, params = 2)
    ApiResponse<Video> addVideoToGroup(String id, String video, Map<String, Object> parameters) throws ApiError;

    /**
     *
     * @param id
     * @param video
     * @throws ApiError
     */
    @Connection(value = "/group/{id}/videos/{video}", target = Video.class, method = HttpMethod.DELETE, params = 2)
    void removeVideoFromGroup(String id, String video) throws ApiError;
}
