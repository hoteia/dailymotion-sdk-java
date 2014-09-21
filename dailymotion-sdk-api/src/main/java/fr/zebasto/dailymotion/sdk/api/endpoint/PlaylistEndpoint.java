package fr.zebasto.dailymotion.sdk.api.endpoint;

import fr.zebasto.dailymotion.sdk.api.annotation.Connection;
import fr.zebasto.dailymotion.sdk.api.annotation.Endpoint;
import fr.zebasto.dailymotion.sdk.api.communication.ApiError;
import fr.zebasto.dailymotion.sdk.api.communication.ApiResponse;
import fr.zebasto.dailymotion.sdk.api.communication.HttpMethod;
import fr.zebasto.dailymotion.sdk.api.dto.Playlist;
import fr.zebasto.dailymotion.sdk.api.dto.Video;

import java.util.Map;

/**
 * Class description
 *
 * @author Bastien Cecchinato
 * @since 1.0.0
 */
public interface PlaylistEndpoint {
    /**
     *
     * @param parameters
     * @return
     * @throws ApiError
     */
    @Endpoint(value = "/playlists", target = Playlist.class, method = HttpMethod.GET)
    ApiResponse<Playlist> findAll(Map<String, Object> parameters) throws ApiError;

    /**
     *
     * @param id
     * @param parameters
     * @return
     * @throws ApiError
     */
    @Endpoint(value = "/playlist/{id}", target = Playlist.class, method = HttpMethod.GET)
    ApiResponse<Playlist> findById(String id, Map<String, Object> parameters) throws ApiError;

    /**
     *
     * @param parameters
     * @return
     * @throws ApiError
     */
    @Endpoint(value = "/me/playlists", target = Playlist.class, method = HttpMethod.POST)
    ApiResponse<Playlist> create(Map<String, Object> parameters) throws ApiError;

    /**
     *
     * @param id
     * @param parameters
     * @return
     * @throws ApiError
     */
    @Endpoint(value = "/playlist/{id}", target = Playlist.class, method = HttpMethod.POST)
    ApiResponse<Playlist> update(String id, Map<String, Object> parameters) throws ApiError;

    /**
     *
     * @param id
     * @throws ApiError
     */
    @Endpoint(value = "/playlist/{id}", target = Playlist.class, method = HttpMethod.DELETE)
    void delete(String id) throws ApiError;

    /**
     *
     * @param id
     * @param parameters
     * @return
     * @throws ApiError
     */
    @Connection(value = "/playlist/{id}/videos", target = Video.class, method = HttpMethod.GET)
    ApiResponse<Video> findVideosByPlaylistId(String id, Map<String, Object> parameters) throws ApiError;

    /**
     *
     * @param id
     * @param video
     * @param parameters
     * @return
     * @throws ApiError
     */
    @Connection(value = "/playlist/{id}/videos/{video}", target = Video.class, method = HttpMethod.GET, params = 2)
    ApiResponse<Video> findVideoByPlaylistId(String id, String video, Map<String, Object> parameters) throws ApiError;

    /**
     *
     * @param id
     * @param video
     * @param parameters
     * @return
     * @throws ApiError
     */
    @Connection(value = "/playlist/{id}/videos/{id}", target = Video.class, method = HttpMethod.POST, params = 2)
    ApiResponse<Video> addVideoToPlaylist(String id, String video, Map<String, Object> parameters) throws ApiError;

    /**
     *
     * @param id
     * @param videos
     * @param parameters
     * @return
     * @throws ApiError
     */
    @Connection(value = "/playlist/{id}/videos?ids={videos}", target = Video.class, method = HttpMethod.POST, params = 2)
    ApiResponse<Video> addVideosToPlaylist(String id, String[] videos, Map<String, Object> parameters) throws ApiError;

    /**
     *
     * @param id
     * @param video
     * @throws ApiError
     */
    @Connection(value = "/playlist/{id}/video/{id}", target = Video.class, method = HttpMethod.DELETE, params = 2)
    void removeVideoFromPlaylist(String id, String video) throws ApiError;
}
