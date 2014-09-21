package fr.zebasto.dailymotion.sdk.api.endpoint;


import fr.zebasto.dailymotion.sdk.api.annotation.Connection;
import fr.zebasto.dailymotion.sdk.api.annotation.Endpoint;
import fr.zebasto.dailymotion.sdk.api.communication.ApiError;
import fr.zebasto.dailymotion.sdk.api.communication.ApiResponse;
import fr.zebasto.dailymotion.sdk.api.communication.HttpMethod;
import fr.zebasto.dailymotion.sdk.api.dto.*;

import java.util.Map;

/**
 * Class description
 *
 * @author Bastien Cecchinato
 * @since 1.0.0
 */
public interface UserEndpoint {
    /**
     * @param parameters
     * @return
     * @throws ApiError
     */
    @Endpoint(value = "/users", target = User.class, method = HttpMethod.GET)
    ApiResponse<User> findAll(Map<String, Object> parameters) throws ApiError;

    /**
     * @param id
     * @param parameters
     * @return
     * @throws ApiError
     */
    @Endpoint(value = "/user/{id}", target = User.class, method = HttpMethod.GET)
    ApiResponse<User> findById(String id, Map<String, Object> parameters) throws ApiError;

    /**
     * @param id
     * @param parameters
     * @return
     * @throws ApiError
     */
    @Endpoint(value = "/user/{id}", target = User.class, method = HttpMethod.POST)
    ApiResponse<User> update(String id, Map<String, Object> parameters) throws ApiError;

    /**
     * @param id
     * @param parameters
     * @return
     * @throws ApiError
     */
    @Connection(value = "/user/{id}/children", target = User.class, method = HttpMethod.GET)
    ApiResponse<User> findChildrenByUserId(String id, Map<String, Object> parameters) throws ApiError;

    /**
     * @param id
     * @param parameters
     * @return
     * @throws ApiError
     */
    @Connection(value = "/user/{id}/fans", target = User.class, method = HttpMethod.GET)
    ApiResponse<User> findFansByUserId(String id, Map<String, Object> parameters) throws ApiError;

    /**
     * @param id
     * @param parameters
     * @return
     * @throws ApiError
     */
    @Connection(value = "/user/{id}/following", target = User.class, method = HttpMethod.GET)
    ApiResponse<User> findFollowersByUserId(String id, Map<String, Object> parameters) throws ApiError;

    /**
     * @param id
     * @param parameters
     * @return
     * @throws ApiError
     */
    @Connection(value = "/user/{id}/following/{user}", target = User.class, method = HttpMethod.GET, params = 2)
    ApiResponse<User> findFollowerByUserId(String id, String user, Map<String, Object> parameters) throws ApiError;

    /**
     * @param user
     * @param parameters
     * @return
     * @throws ApiError
     */
    @Connection(value = "/me/following/{user}", target = User.class, method = HttpMethod.POST)
    ApiResponse<User> addFollowerToMe(String user, Map<String, Object> parameters) throws ApiError;

    /**
     * @param user
     * @param parameters
     * @return
     * @throws ApiError
     */
    @Connection(value = "/me/following/{user}", target = User.class, method = HttpMethod.DELETE)
    void removeFollowerFromMe(String user, Map<String, Object> parameters) throws ApiError;

    /**
     * @param id
     * @param parameters
     * @return
     * @throws ApiError
     */
    @Connection(value = "/user/{id}/friends", target = User.class, method = HttpMethod.GET)
    ApiResponse<User> findFriendsByUserId(String id, Map<String, Object> parameters) throws ApiError;

    /**
     * @param id
     * @param parameters
     * @return
     * @throws ApiError
     */
    @Connection(value = "/user/{id}/friends/{user}", target = User.class, method = HttpMethod.GET, params = 2)
    ApiResponse<User> findFriendByUserId(String id, String user, Map<String, Object> parameters) throws ApiError;

    /**
     * @param user
     * @param parameters
     * @return
     * @throws ApiError
     */
    @Connection(value = "/me/friends/{user}", target = User.class, method = HttpMethod.POST)
    ApiResponse<User> addFriendToMe(String user, Map<String, Object> parameters) throws ApiError;

    /**
     * @param user
     * @param parameters
     * @return
     * @throws ApiError
     */
    @Connection(value = "/me/friends/{user}", target = User.class, method = HttpMethod.DELETE)
    void removeFriendFromMe(String user, Map<String, Object> parameters) throws ApiError;

    /**
     * @param id
     * @param parameters
     * @return
     * @throws ApiError
     */
    @Connection(value = "/user/{id}/offers", target = User.class, method = HttpMethod.GET)
    ApiResponse<User> findOffersByUserId(String id, Map<String, Object> parameters) throws ApiError;

    /**
     * @param id
     * @param parameters
     * @return
     * @throws ApiError
     */
    @Connection(value = "/user/{id}/parents", target = User.class, method = HttpMethod.GET)
    ApiResponse<User> findParentsByUserId(String id, Map<String, Object> parameters) throws ApiError;

    /**
     * @param id
     * @param parameters
     * @return
     * @throws ApiError
     */
    @Connection(value = "/user/{id}/parents/{user}", target = User.class, method = HttpMethod.GET, params = 2)
    ApiResponse<User> findParentByUserId(String id, String user, Map<String, Object> parameters) throws ApiError;

    /**
     * @param user
     * @param parameters
     * @return
     * @throws ApiError
     */
    @Connection(value = "/me/parents/{user}", target = User.class, method = HttpMethod.POST)
    ApiResponse<User> addParentToMe(String user, Map<String, Object> parameters) throws ApiError;

    /**
     * @param user
     * @param parameters
     * @return
     * @throws ApiError
     */
    @Connection(value = "/me/parents/{user}", target = User.class, method = HttpMethod.DELETE)
    void removeParentFromMe(String user, Map<String, Object> parameters) throws ApiError;

    /**
     * @param id
     * @param parameters
     * @return
     * @throws ApiError
     */
    @Connection(value = "/user/{id}/favorites", target = Video.class, method = HttpMethod.GET)
    ApiResponse<Video> findFavoritesByUserId(String id, Map<String, Object> parameters) throws ApiError;

    /**
     * @param id
     * @param parameters
     * @return
     * @throws ApiError
     */
    @Connection(value = "/user/{id}/favorites/{video}", target = Video.class, method = HttpMethod.GET, params = 2)
    ApiResponse<Video> findFavoriteByUserId(String id, String video, Map<String, Object> parameters) throws ApiError;

    /**
     * @param video
     * @param parameters
     * @return
     * @throws ApiError
     */
    @Connection(value = "/me/favorites/{video}", target = Video.class, method = HttpMethod.POST)
    ApiResponse<Video> addFavoriteToMe(String video, Map<String, Object> parameters) throws ApiError;

    /**
     * @param video
     * @param parameters
     * @return
     * @throws ApiError
     */
    @Connection(value = "/me/favorites/{video}", target = Video.class, method = HttpMethod.DELETE)
    void removeFavoriteFromMe(String video, Map<String, Object> parameters) throws ApiError;

    /**
     * @param id
     * @param parameters
     * @return
     * @throws ApiError
     */
    @Connection(value = "/user/{id}/features", target = Video.class, method = HttpMethod.GET)
    ApiResponse<Video> findFeaturesByUserId(String id, Map<String, Object> parameters) throws ApiError;

    /**
     * @param id
     * @param parameters
     * @return
     * @throws ApiError
     */
    @Connection(value = "/user/{id}/features/{video}", target = Video.class, method = HttpMethod.GET, params = 2)
    ApiResponse<Video> findFeatureByUserId(String id, String video, Map<String, Object> parameters) throws ApiError;

    /**
     * @param parameters
     * @return
     * @throws ApiError
     */
    @Connection(value = "/me/features/{video}", target = Video.class, method = HttpMethod.POST)
    ApiResponse<Video> addFeatureToMe(String video, Map<String, Object> parameters) throws ApiError;

    /**
     * @param parameters
     * @return
     * @throws ApiError
     */
    @Connection(value = "/me/features/{video}", target = Video.class, method = HttpMethod.DELETE)
    void removeFeatureFromMe(String video, Map<String, Object> parameters) throws ApiError;

    /**
     * @param id
     * @param parameters
     * @return
     * @throws ApiError
     */
    @Connection(value = "/user/{id}/subscriptions", target = Video.class, method = HttpMethod.GET)
    ApiResponse<Video> findSubscriptionsByUserId(String id, Map<String, Object> parameters) throws ApiError;

    /**
     * @param id
     * @param parameters
     * @return
     * @throws ApiError
     */
    @Connection(value = "/user/{id}/videos", target = Video.class, method = HttpMethod.GET)
    ApiResponse<Video> findVideosByUserId(String id, Map<String, Object> parameters) throws ApiError;

    /**
     * @param parameters
     * @return
     * @throws ApiError
     */
    @Connection(value = "/me/videos/{video}", target = Video.class, method = HttpMethod.POST)
    ApiResponse<Video> addVideoToMe(String video, Map<String, Object> parameters) throws ApiError;

    /**
     * @param parameters
     * @return
     * @throws ApiError
     */
    @Connection(value = "/me/videos/{video}", target = Video.class, method = HttpMethod.DELETE)
    void removeVideoFromMe(String video, Map<String, Object> parameters) throws ApiError;

    /**
     * @param id
     * @param parameters
     * @return
     * @throws ApiError
     */
    @Connection(value = "/user/{id}/activities", target = Activity.class, method = HttpMethod.GET)
    ApiResponse<Activity> findActivitiesByUserId(String id, Map<String, Object> parameters) throws ApiError;

    /**
     * @param id
     * @param parameters
     * @return
     * @throws ApiError
     */
    @Connection(value = "/user/{id}/feed", target = Activity.class, method = HttpMethod.GET)
    ApiResponse<Activity> findFeedByUserId(String id, Map<String, Object> parameters) throws ApiError;

    /**
     * @param id
     * @param parameters
     * @return
     * @throws ApiError
     */
    @Connection(value = "/user/{id}/contests", target = Contest.class, method = HttpMethod.GET)
    ApiResponse<Contest> findContestsByUserId(String id, Map<String, Object> parameters) throws ApiError;

    /**
     * @param id
     * @param parameters
     * @return
     * @throws ApiError
     */
    @Connection(value = "/user/{id}/groups", target = Group.class, method = HttpMethod.GET)
    ApiResponse<Group> findGroupsByUserId(String id, Map<String, Object> parameters) throws ApiError;

    /**
     * @param parameters
     * @return
     * @throws ApiError
     */
    @Connection(value = "/me/groups/{group}", target = Group.class, method = HttpMethod.POST)
    ApiResponse<Group> addGroupToMe(String group, Map<String, Object> parameters) throws ApiError;

    /**
     * @param parameters
     * @return
     * @throws ApiError
     */
    @Connection(value = "/me/groups/{group}", target = Group.class, method = HttpMethod.DELETE)
    void removeGroupFromMe(String group, Map<String, Object> parameters) throws ApiError;

    /**
     * @param id
     * @param parameters
     * @return
     * @throws ApiError
     */
    @Connection(value = "/user/{id}/playlists", target = Playlist.class, method = HttpMethod.GET)
    ApiResponse<Playlist> findPlaylistsByUserId(String id, Map<String, Object> parameters) throws ApiError;

    /**
     * @param parameters
     * @return
     * @throws ApiError
     */
    @Connection(value = "/me/playlists/{playlist}", target = Playlist.class, method = HttpMethod.POST)
    ApiResponse<Playlist> addPlaylistToMe(String playlist, Map<String, Object> parameters) throws ApiError;

    /**
     * @param parameters
     * @return
     * @throws ApiError
     */
    @Connection(value = "/me/playlists/{playlist}", target = Playlist.class, method = HttpMethod.DELETE)
    void removePlaylistFromMe(String playlist, Map<String, Object> parameters) throws ApiError;
}