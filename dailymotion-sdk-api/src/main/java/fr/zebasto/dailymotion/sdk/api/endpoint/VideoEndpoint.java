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
public interface VideoEndpoint {
    /**
     *
     * @param parameters
     * @return
     * @throws ApiError
     */
    @Endpoint(value = "/videos", target = Video.class, method = HttpMethod.GET)
    ApiResponse<Video> findAll(Map<String, Object> parameters) throws ApiError;

    /**
     *
     * @param id
     * @param parameters
     * @return
     * @throws ApiError
     */
    @Endpoint(value = "/video/{id}", target = Video.class, method = HttpMethod.GET)
    ApiResponse<Video> findById(String id, Map<String, Object> parameters) throws ApiError;

    /**
     *
     * @param parameters
     * @return
     * @throws ApiError
     */
    @Endpoint(value = "/me/videos", target = Video.class, method = HttpMethod.POST)
    ApiResponse<Video> create(Map<String, Object> parameters) throws ApiError;

    /**
     *
     * @param id
     * @param parameters
     * @return
     * @throws ApiError
     */
    @Endpoint(value = "/video/{id}", target = Video.class, method = HttpMethod.POST)
    ApiResponse<Video> update(String id, Map<String, Object> parameters) throws ApiError;

    /**
     *
     * @param id
     * @throws ApiError
     */
    @Endpoint(value = "/video/{id}", target = Video.class, method = HttpMethod.DELETE)
    void delete(String id) throws ApiError;

    /**
     * @param id
     * @param parameters
     * @return
     * @throws ApiError
     */
    @Connection(value = "/video/{id}/contests", target = Contest.class, method = HttpMethod.GET)
    ApiResponse<Contest> findContestsByVideoId(String id, Map<String, Object> parameters) throws ApiError;

    /**
     * @param id
     * @param parameters
     * @return
     * @throws ApiError
     */
    @Connection(value = "/video/{id}/groups", target = Group.class, method = HttpMethod.GET)
    ApiResponse<Group> findGroupsByVideoId(String id, Map<String, Object> parameters) throws ApiError;

    /**
     * @param id
     * @param parameters
     * @return
     * @throws ApiError
     */
    @Connection(value = "/video/{id}/groups/{group}", target = Group.class, method = HttpMethod.GET, params = 2)
    ApiResponse<Group> findGroupByVideoId(String id, String group, Map<String, Object> parameters) throws ApiError;

    /**
     * @param parameters
     * @return
     * @throws ApiError
     */
    @Connection(value = "/video/{id}/groups/{group}", target = Group.class, method = HttpMethod.POST, params = 2)
    ApiResponse<Group> addGroupToVideo(String id, String group, Map<String, Object> parameters) throws ApiError;

    /**
     * @param parameters
     * @return
     * @throws ApiError
     */
    @Connection(value = "/video/{id}/groups/{group}", target = Group.class, method = HttpMethod.DELETE, params = 2)
    void removeGroupFromVideo(String id, String group, Map<String, Object> parameters) throws ApiError;

    /**
     * @param id
     * @param parameters
     * @return
     * @throws ApiError
     */
    @Connection(value = "/video/{id}/playlists", target = Playlist.class, method = HttpMethod.GET)
    ApiResponse<Playlist> findPlaylistsByVIdeoId(String id, Map<String, Object> parameters) throws ApiError;

    /**
     * @param id
     * @param parameters
     * @return
     * @throws ApiError
     */
    @Connection(value = "/video/{id}/playlists/{playlist}", target = Playlist.class, method = HttpMethod.GET, params = 2)
    ApiResponse<Playlist> findPlaylistByVideoId(String id, String playlist, Map<String, Object> parameters) throws ApiError;

    /**
     * @param parameters
     * @return
     * @throws ApiError
     */
    @Connection(value = "/video/{id}/playlists/{playlist}", target = Playlist.class, method = HttpMethod.POST, params = 2)
    ApiResponse<Playlist> addPlaylistToVideo(String id, String playlist, Map<String, Object> parameters) throws ApiError;

    /**
     * @param parameters
     * @return
     * @throws ApiError
     */
    @Connection(value = "/video/{id}/playlists/{playlist}", target = Playlist.class, method = HttpMethod.DELETE, params = 2)
    void removePlaylistFromVideo(String id, String playlist, Map<String, Object> parameters) throws ApiError;

    /**
     * @param id
     * @param parameters
     * @return
     * @throws ApiError
     */
    @Connection(value = "/video/{id}/related", target = Video.class, method = HttpMethod.GET)
    ApiResponse<Video> findRelatedByVideoId(String id, Map<String, Object> parameters) throws ApiError;

    /**
     * @param id
     * @param parameters
     * @return
     * @throws ApiError
     */
    @Connection(value = "/video/{id}/comments", target = Comment.class, method = HttpMethod.GET)
    ApiResponse<Comment> findCommentsByVIdeoId(String id, Map<String, Object> parameters) throws ApiError;

    /**
     * @param parameters
     * @return
     * @throws ApiError
     */
    @Connection(value = "/video/{id}/comments", target = Comment.class, method = HttpMethod.POST)
    ApiResponse<Comment> addCommentToVideo(String id, Map<String, Object> parameters) throws ApiError;

    /**
     * @param parameters
     * @return
     * @throws ApiError
     */
    @Connection(value = "/video/{id}/comments/{comment}", target = Comment.class, method = HttpMethod.DELETE, params = 2)
    void removeCommentFromVideo(String id, String comment, Map<String, Object> parameters) throws ApiError;

    /**
     * @param id
     * @param parameters
     * @return
     * @throws ApiError
     */
    @Connection(value = "/video/{id}/records", target = Record.class, method = HttpMethod.GET)
    ApiResponse<Record> findRecordsByVIdeoId(String id, Map<String, Object> parameters) throws ApiError;

    /**
     * @param parameters
     * @return
     * @throws ApiError
     */
    @Connection(value = "/video/{id}/records", target = Record.class, method = HttpMethod.POST)
    ApiResponse<Record> addRecordToVideo(String id, Map<String, Object> parameters) throws ApiError;

    /**
     * @param parameters
     * @return
     * @throws ApiError
     */
    @Connection(value = "/video/{id}/records/{record}", target = Record.class, method = HttpMethod.DELETE, params = 2)
    void removeRecordFromVideo(String id, String record, Map<String, Object> parameters) throws ApiError;

    /**
     * @param parameters
     * @return
     * @throws ApiError
     */
    @Connection(value = "/video/{id}/reports", target = Report.class, method = HttpMethod.POST)
    ApiResponse<Record> addReportToVideo(String id, Map<String, Object> parameters) throws ApiError;

    /**
     * @param parameters
     * @return
     * @throws ApiError
     */
    @Connection(value = "/video/{id}/reports/{report}", target = Report.class, method = HttpMethod.DELETE, params = 2)
    void removeReportFromVideo(String id, String report, Map<String, Object> parameters) throws ApiError;

    /**
     * @param id
     * @param parameters
     * @return
     * @throws ApiError
     */
    @Connection(value = "/video/{id}/strongtags", target = Strongtag.class, method = HttpMethod.GET)
    ApiResponse<Strongtag> findStrongtagsByVIdeoId(String id, Map<String, Object> parameters) throws ApiError;

    /**
     * @param id
     * @param parameters
     * @return
     * @throws ApiError
     */
    @Connection(value = "/video/{id}/subtitles", target = Subtitle.class, method = HttpMethod.GET)
    ApiResponse<Subtitle> findSubtitlesByVIdeoId(String id, Map<String, Object> parameters) throws ApiError;

    /**
     * @param parameters
     * @return
     * @throws ApiError
     */
    @Connection(value = "/video/{id}/subtitles", target = Subtitle.class, method = HttpMethod.POST)
    ApiResponse<Subtitle> addSubtitleToVideo(String id, Map<String, Object> parameters) throws ApiError;

    /**
     * @param parameters
     * @return
     * @throws ApiError
     */
    @Connection(value = "/video/{id}/subtitles/{subtitle}", target = Subtitle.class, method = HttpMethod.DELETE, params = 2)
    void removeSubtitleFromVideo(String id, String subtitle, Map<String, Object> parameters) throws ApiError;
}
