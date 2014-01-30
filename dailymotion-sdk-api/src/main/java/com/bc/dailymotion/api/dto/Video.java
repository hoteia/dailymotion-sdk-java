package com.bc.dailymotion.api.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.security.Timestamp;
import java.util.Date;
import java.util.List;

/**
 * Created by Bastien on 04/01/2014.
 */
public class Video {
    /**
     * A boolean indicating that the video is in 3D format (true) or not (false).
     * No access_token required for reading.
     * Returns boolean.
     */
    @JsonProperty("3D")
    private boolean threeD;

    /**
     * An error message explaining why the access to the video can’t be granted.
     * No access_token required for reading.
     * Returns dict, min size: 1, max size: 150.
     */
    private String access_error;

    /**
     * Defines is video accepts associated ads
     * No access_token required for reading.
     * Returns boolean.
     */
    private boolean ads;

    /**
     * If true, allows comments to be posted on this video.
     * No access_token required for reading. This field is writable.
     * Returns boolean.
     */
    private boolean allow_comments;

    /**
     * Tell if the video can be embeded outside of Dailymotion
     * No access_token required for reading.
     * Returns boolean.
     */
    private boolean allow_embed;

    /**
     * is it possible to add this video to groups
     * No access_token required for reading. This field is writable.
     * Returns boolean.
     */
    private boolean allowed_in_groups;

    /**
     * is it possible to add this video to playlists
     * No access_token required for reading. This field is writable.
     * Returns boolean.
     */
    private boolean allowed_in_playlists;

    /**
     * The aspect ratio of the video frame (i.e.: 1.33333 for 4/3, 1.77777 for 16/9...).
     * No access_token required for reading.
     * Returns number, min value: 0.
     */
    private double aspect_ratio;

    /**
     * The current audience for a live event from the audience meter. Null if audience shouldn’t be accounted.
     * No access_token required for reading.
     * Returns number, min value: 0.
     */
    private int audience;

    /**
     * The video available formats
     * No access_token required for reading.
     * Returns array, min size: 1, max size: 150.
     */
    private List<Double> available_formats;

    /**
     * The total number of times a video has been added to users’ favorites.
     * No access_token required for reading.
     * Returns number, min value: 0.
     */
    private int bookmarks_total;

    /**
     * True if the live is privately available.
     * No access_token required for reading. This field is writable.
     * Returns boolean.
     */
    private boolean broadcasting;

    /**
     * The short channel name of the video.
     * This field can be used as filter. No access_token required for reading. This field is writable.
     * Return a channel. You can request sub-fields by using channel.<sub-field> notation.
     */
    private Channel channel;

    /**
     * The total number of comments on the video.
     * No access_token required for reading.
     * Returns number, min value: 0.
     */
    private int comments_total;

    /**
     * The country of the video (declarative, may be null).
     * This field can be used as filter. No access_token required for reading. This field is writable.
     * Returns string, min size: 1, max size: 150.
     */
    private String country;

    /**
     * Limit the result set to videos created after a specific timestamp
     * This field can be used as filter but can’t be read nor written.
     * Returns date.
     */
    private Timestamp created_after;

    /**
     * Limit the result set to videos created before a specific timestamp
     * This field can be used as filter but can’t be read nor written.
     * Returns date.
     */
    private Timestamp created_before;

    /**
     * The date the video was uploaded to the site.
     * No access_token required for reading.
     * Returns date.
     */
    private Date created_time;

    /**
     * The description of the video.
     * No access_token required for reading. This field is writable.
     * Returns string, min size: 1, max size: 2000.
     */
    private String description;

    /**
     * The duration of the video in seconds.
     * No access_token required for reading.
     * Returns number, min value: 0.
     */
    private int duration;

    /**
     * The HTML embed code.
     * No access_token required for reading.
     * Returns string, min size: 1, max size: 150.
     */
    private String embed_html;

    /**
     * The URL to embed the video.
     * No access_token required for reading.
     * Returns url.
     */
    private String embed_url;

    /**
     * When the video status is processing, this parameter indicates a number between 0 and 100 corresponding to the percentage of encoding already completed. For other statuses this parameter is -1.
     * No access_token required for reading.
     * Returns number, min value: -1, max value: 100.
     */
    private int encoding_progress;

    /**
     * the end date of the stream
     * No access_token required for reading. This field is writable.
     * Returns date.
     */
    private Date end_time;

    /**
     * The name of pushd event sent on video deletion
     * No access_token required for reading.
     * Returns string, min size: 1, max size: 150.
     */
    private String event_delete;

    /**
     * The name of pushd event sent on video deletion
     * No access_token required for reading.
     * Returns string, min size: 1, max size: 150.
     */
    private String event_live_offair;

    /**
     * The name of pushd event sent on video modification
     * No access_token required for reading.
     * Returns string, min size: 1, max size: 150.
     */
    private String event_live_onair;

    /**
     * The name of pushd event sent on video modification
     * No access_token required for reading.
     * Returns string, min size: 1, max size: 150.
     */
    private String event_modify;

    /**
     * True if the video is explicit.
     * No access_token required for reading. This field is writable.
     * Returns boolean.
     */
    private boolean explicit;

    /**
     * returns sprite url of snapshot of the video if it exists
     * No access_token required for reading.
     * Returns url.
     */
    private String filmstrip_small_url;

    /**
     * A list of filters available to reduce the result set.
     * This field can be used as filter but can’t be read nor written.
     * Returns array, allowed values: featured, hd, official, creative, creative-official, ugc, buzz, buzz-premium, 3d, live, all-live, live-upcoming, no-live, premium, premium-paidvideos, premium-offers, no-premium, quicklist, history, with-poster, without-poster, what-to-watch.
     */
    private String filters;

    /**
     * genre extended data
     * No access_token required for reading. This field is writable.
     * Returns string, min size: 1, max size: 150.
     */
    private String genre;

    /**
     * A list of countries where the video is or isn’t accessible. The list of countries start with the “deny” or “allow” keyword to define if this is a black or a whitelist. Examples: [“fr”, “us”, “it”] or [“allow”, “fr”, “us”, “it”] will both allow the video to be accessed in France, US and Italy and deny all other countries. [“deny”, “us”] will deny the access to the video from the US and allow it everywhere else. An empty list or [“allow”] (the default) will allow it from everywhere.
     * No access_token required for reading.
     * Returns array, min size: 1, max size: 150.
     */
    private List<String> geoblocking;

    /**
     * Geolocalization for the video. Result is an array with the longitude and latitude using point notation. Longitude range is from -180.0 (West) to 180.0 (East). Latitude range is from -90.0 (South) to 90.0 (North). Example: [-122.4006, 37.7821]
     * No access_token required for reading. This field is writable.
     * Returns array, min size: 1, max size: 150.
     */
    private List<Double> geoloc;

    /**
     * The video object ID
     * No access_token required for reading.
     * Returns the object id.
     */
    private String id;

    /**
     * Limit the result to a specified list of video ids.
     * This field can be used as filter but can’t be read nor written.
     * Returns array, min size: 1, max size: 150.
     */
    private String ids;

    /**
     * The detected ISRC (International Standard Recording Code) of the soundtrack
     * No access_token required for reading.
     * Returns string, min size: 1, max size: 150.
     */
    private String isrc;

    /**
     * The language of the video (declarative).
     * This field can be used as filter. No access_token required for reading. This field is writable.
     * Returns string, min size: 1, max size: 150.
     */
    private String language;

    /**
     * True if the user can launch an ads break for this live stream
     * manage_videos scope required for reading. manage_videos scope required for writing.
     * Returns boolean.
     */
    private boolean live_ad_break;

    /**
     * The URL to publish fragmented live stream on (current logged user need to own the video in order to retrieve this field)
     * No access_token required for reading.
     * Returns url.
     */
    private String live_frag_publish_url;

    /**
     * The URL to publish live source stream on (current logged user need to own the video in order to retrieve this field)
     * No access_token required for reading.
     * Returns url.
     */
    private String live_publish_url;

    /**
     * The list of blocking rules per country and device to be applied on the video. Each rule has the following format : country/[country code]/media/[media id] Available country codes are : ar, at, br, ca, ch, cn, de, dk, es, fr, gb, gr, ie, in, it, js, jp, kr, mx, nl, pl, pr, pt, ro, ru, se, tr, us, other. Available medias id are : iptv, mobile, tvhz, web, other.
     * No access_token required for reading.
     * Returns array, min size: 1, max size: 150.
     */
    private List<String> mediablocking;

    /**
     * actors playing in the movie
     * No access_token required for reading. This field is writable.
     * Returns string, min size: 1, max size: 150.
     */
    private String metadata_credit_actors;

    /**
     * director of the movie
     * No access_token required for reading. This field is writable.
     * Returns string, min size: 1, max size: 150.
     */
    private String metadata_credit_director;

    /**
     * Genre of the video
     * No access_token required for reading. This field is writable.
     * Returns string, allowed values: drama, comedy, realitytelevision, animation, documentary, sitcom, gameshow, sciencefiction, talkshow, fantasy, action, anime, adventure, soapopera, miniseries, news, crimefiction, romance, sports, variety, thriller, music.
     */
    private String metadata_genre;

    /**
     * Original language (ISO 3166) of the video
     * No access_token required for reading. This field is writable.
     * Returns string, min size: 1, max size: 150.
     */
    private String metadata_original_language;

    /**
     * Original title of the video
     * No access_token required for reading. This field is writable.
     * Returns string, min size: 1, max size: 150.
     */
    private String metadata_original_title;

    /**
     * Date (RFC 822) of release or production
     * No access_token required for reading. This field is writable.
     * Returns string, min size: 1, max size: 150.
     */
    private String metadata_released;

    /**
     * e
     * show episode number/name
     * No access_token required for reading. This field is writable.
     * Returns string, min size: 1, max size: 150.
     */
    private String metadata_show_episod;

    /**
     * show season number/name
     * No access_token required for reading. This field is writable.
     * Returns string, min size: 1, max size: 150.
     */
    private String metadata_show_season;

    /**
     * Visa number
     * No access_token required for reading. This field is writable.
     * Returns string, min size: 1, max size: 150.
     */
    private String metadata_visa;

    /**
     * The stream mode, can be vod, simulcast or live.
     * No access_token required for reading. This field is writable.
     * Returns string, allowed values: vod, simulcast, live.
     */
    private String mode;

    /**
     * True if the live is moderated.
     * No access_token required for reading.
     * Returns boolean.
     */
    boolean moderated;

    /**
     * Limit the result set to videos modified after a specific timestamp
     * This field can be used as filter but can’t be read nor written.
     * Returns date.
     */
    private Timestamp modified_after;

    /**
     * Limit the result set to videos modified before a specific timestamp
     * This field can be used as filter but can’t be read nor written.
     * Returns date.
     */
    private Timestamp modified_before;

    /**
     * The date the video was last modified.
     * No access_token required for reading.
     * Returns date.
     */
    private Timestamp modified_time;

    /**
     * The detected MUYAP (Turkish Phonographic Industry Society Identifier) of the soundtrack
     * No access_token required for reading.
     * Returns string, min size: 1, max size: 150.
     */
    private String muyap;

    /**
     * True if the video is in mode live and currently airing.
     * No access_token required for reading.
     * Returns boolean.
     */
    private boolean onair;

    /**
     * The id of the owner of the video (use owner.screenname to show the user name).
     * This field can be used as filter. No access_token required for reading.
     * Return a user. You can request sub-fields by using owner.<sub-field> notation.
     */
    private User owner;

    /**
     * True is the access to the video is subject to conditions
     * No access_token required for reading.
     * Returns boolean.
     */
    private boolean paywall;

    /**
     * True if the video has a poster
     * No access_token required for reading.
     * Returns boolean.
     */
    private boolean poster;

    /**
     * The URL of the video poster (135x180).
     * No access_token required for reading.
     * Returns url.
     */
    private String poster_135x180_url;

    /**
     * The URL of the video poster (180x240).
     * No access_token required for reading.
     * Returns url.
     */
    private String poster_180x240_url;

    /**
     * The URL of the video poster (270x360).
     * No access_token required for reading.
     * Returns url.
     */
    private String poster_270x360_url;

    /**
     * The URL of the video poster (360x480).
     * No access_token required for reading.
     * Returns url.
     */
    private String poster_360x480_url;

    /**
     * The URL of the video poster (45x60).
     * No access_token required for reading.
     * Returns url.
     */
    private String poster_45x60_url;

    /**
     * The URL of the video poster (95x120).
     * No access_token required for reading.
     * Returns url.
     */
    private String poster_90x120_url;

    /**
     * The URL of the video poster (540x720).
     * No access_token required for reading.
     * Returns url.
     */
    private String poster_url;

    /**
     * The price and duration for a tvod or svod video
     * No access_token required for reading.
     * Returns string, min size: 1, max size: 150.
     */
    private String price_details;

    /**
     * True if the video is private.
     * This field can be used as filter. No access_token required for reading. This field is writable.
     * Returns boolean.
     */
    @JsonProperty("private")
    private boolean private_;

    /**
     * True if the video is published (may still wait for encoding, see status field for more info).
     * No access_token required for reading. This field is writable.
     * Returns boolean.
     */
    private boolean published;

    /**
     * The average number of stars the video has (float between 0 and 5).
     * No access_token required for reading.
     * Returns number, min value: 0, max value: 5.
     */
    private float rating;

    /**
     * The number of users who voted for the video.
     * No access_token required for reading.
     * Returns number, min value: 0.
     */
    private int ratings_total;

    /**
     * The recurrence of the stream
     * No access_token required for reading.
     * Returns string, allowed values: once, daily, weekly.
     */
    private String recurrence;
    /**
     * The standard rental duration of the video in hours. Will be null if the video is not behind a paywall
     * No access_token required for reading. This field is writable.
     * Returns string, allowed values: 3, 24, 48.
     */
    private int rental_duration;

    /**
     * The price as float in the current currency. Will be null if the video is not behind a paywall. See currency field of the /locale endpoint to get the current currency.
     * No access_token required for reading. This field is writable.
     * Returns string, min size: 1, max size: 150.
     */
    private float rental_price;

    /**
     * The price, formatted with currency according to the request localization. Will be null if the video is not behind a paywall
     * No access_token required for reading.
     * Returns string, min size: 1, max size: 150.
     */
    private String rental_price_formatted;

    /**
     * Timelapse of video free preview, in seconds
     * No access_token required for reading. This field is writable.
     * Returns number, min value: 0.
     */
    private int rental_start_time;

    /**
     * Full text search for videos
     * This field can be used as filter but can’t be read nor written.
     * Returns string, min size: 1, max size: 150.
     */
    private String search;
    /**
     * urls to share content in social networks
     * No access_token required for reading.
     * Returns dict, min size: 1, max size: 150.
     */
    private String sharing_urls;

    /**
     * Change result ordering
     * This field can be used as filter but can’t be read nor written.
     * Returns string, allowed values: recent, visited, visited-hour, visited-today, visited-week, visited-month, commented, commented-hour, commented-today, commented-week, commented-month, rated, rated-hour, rated-today, rated-week, rated-month, relevance, random, ranking.
     */
    private String sort;

    /**
     * Get available information about the soundtrack
     * No access_token required for reading.
     * Returns dict, min size: 1, max size: 150.
     */
    private String soundtrack_info;

    /**
     * The started time of the stream
     * No access_token required for reading. This field is writable.
     * Returns date.
     */
    private Date start_time;

    /**
     * The state of the video. A video requires the published status to be watchable.
     * No access_token required for reading.
     * Returns string, allowed values: waiting, processing, ready, published, rejected, deleted, encoding_error.
     */
    private String status;

    /**
     * The URL of the full HD format (1080p, 3Mbps).
     * No access_token required for reading.
     * Returns url.
     */
    private String stream_h264_hd1080_url;

    /**
     * The URL of the high definition video (720p, 1.6Mbps).
     * No access_token required for reading.
     * Returns url.
     */
    private String stream_h264_hd_url;

    /**
     * The URL of the high quality video (480p, 975kbps).
     * No access_token required for reading.
     * Returns url.
     */
    private String stream_h264_hq_url;

    /**
     * The URL of the very low definition, low bandwidth video stream (144p, 60kbps).
     * No access_token required for reading.
     * Returns url.
     */
    private String stream_h264_l1_url;

    /**
     * The URL of the very low definition, higher bandwidth video stream (144p, 105kbps).
     * No access_token required for reading.
     * Returns url.
     */
    private String stream_h264_l2_url;

    /**
     * The URL of the low definition video stream (240p, 255kbps).
     * No access_token required for reading.
     * Returns url.
     */
    private String stream_h264_ld_url;

    /**
     * The URL of the medium quality video (380p, 520kbps).
     * No access_token required for reading.
     * Returns url.
     */
    private String stream_h264_url;

    /**
     * The URL of the adaptative bitrate manifest using Apple HTTP Live Streaming protocol.
     * No access_token required for reading.
     * Returns url.
     */
    private String stream_hls_url;

    /**
     * The URL of the live using HTTP Dynamic Streaming protocol.
     * No access_token required for reading.
     * Returns url.
     */
    private String stream_live_hds_url;

    /**
     * The URL of the live using HTTP Live Streaming protocol.
     * No access_token required for reading.
     * Returns url.
     */
    private String stream_live_hls_url;

    /**
     * The URL of the live using RTMP protocol.
     * No access_token required for reading.
     * Returns url.
     */
    private String stream_live_rtmp_url;

    /**
     * The URL of the free preview of premium content
     * No access_token required for reading.
     * Returns url.
     */
    private String stream_premium_preview_hls_url;

    /**
     * The URL of the free preview of premium content
     * No access_token required for reading.
     * Returns url.
     */
    private String stream_premium_preview_mp4_url;

    /**
     * The URL of the free preview of premium content
     * No access_token required for reading.
     * Returns url.
     */
    private String stream_premium_preview_web_url;

    /**
     * The URL of the video source
     * No access_token required for reading.
     * Returns url.
     */
    private String stream_source_url;

    /**
     * The list of strong tags for the video.
     * This field can be used as filter. No access_token required for reading.
     * Returns array, min size: 1, max size: 150.
     */
    private List<Strongtag> strongtags;

    /**
     * True if the video is behind svod paywall
     * No access_token required for reading.
     * Returns boolean.
     */
    private boolean svod;

    /**
     * The URL of the legacy SWF embed player (use this only to embed player into a flash movie, otherwise use ``embed_url)
     * No access_token required for reading.
     * Returns url.
     */
    private String swf_url;

    /**
     * sync_allowed
     * No access_token required for reading.
     * Returns boolean.
     */
    private boolean sync_allowed;

    /**
     * The list of tags for the video.
     * This field can be used as filter. No access_token required for reading. This field is writable.
     * Returns array, min size: 1, max size: 150.
     */
    private List<String> tags;

    /**
     * The date the video was taken (declarative).
     * No access_token required for reading. This field is writable.
     * Returns date.
     */
    private Date taken_time;

    /**
     * The URL of the video thumbnail (120px height).
     * No access_token required for reading.
     * Returns url.
     */
    private String thumbnail_120_url;

    /**
     * The URL of the video thumbnail (180px height).
     * No access_token required for reading.
     * Returns url.
     */
    private String thumbnail_180_url;

    /**
     * The URL of the video thumbnail (240px height).
     * No access_token required for reading.
     * Returns url.
     */
    private String thumbnail_240_url;

    /**
     * The URL of the video thumbnail (360px height).
     * No access_token required for reading.
     * Returns url.
     */
    private String thumbnail_360_url;

    /**
     * The URL of the video thumbnail (480px height).
     * No access_token required for reading.
     * Returns url.
     */
    private String thumbnail_480_url;

    /**
     * The URL of the video thumbnail (60px height).
     * No access_token required for reading.
     * Returns url.
     */
    private String thumbnail_60_url;

    /**
     * The URL of the video thumbnail (720px height).
     * No access_token required for reading.
     * Returns url.
     */
    private String thumbnail_720_url;

    /**
     * The URL of the video raw thumbnail (full size respecting ratio). Some users have the right to change this value by providing an URL to a custom thumbnail. To extract the preview from a live stream, use extract: live
     * No access_token required for reading. This field is writable.
     * Returns url.
     */
    private String thumbnail_url;

    /**
     * The title of the video.
     * No access_token required for reading. This field is writable.
     * Returns string, min size: 1, max size: 255.
     */
    private String title;

    /**
     * True if the video is begind tvod paywall
     * No access_token required for reading.
     * Returns boolean.
     */
    private boolean tvod;

    /**
     * The content type of the video (can be official, creative or null).
     * No access_token required for reading. This field is writable.
     * Returns string, allowed values: ugc, creative, official.
     */
    private String type;

    /**
     * The detected UPC (Universal Product Code) of the soundtrack
     * No access_token required for reading.
     * Returns string, min size: 1, max size: 150.
     */
    private String upc;

    /**
     * The URL of the video on Dailymotion site. Writing this parameter defines where to download the video source. You may either use this parameter at video creation time or change this parameter later if you want to change the source video afterward. To change an existing video, the authenticated user may need some additional rights like motionmaker right. When replacing an existing source, the video will put offline for some minute during the re-encoding. You may use the GET /file/upload API ressource to upload a video file and create a URL to provide to this method or use an existing URL pointing to a video file. Writing to this parameter is subject to rate limiting.
     * No access_token required for reading. This field is writable.
     * Returns url.
     */
    private String url;

    /**
     * The number of views in the last 24 sliding hours.
     * No access_token required for reading.
     * Returns number, min value: 0.
     */
    private int views_last_day;

    /**
     * The number of views in the last sliding hour.
     * No access_token required for reading.
     * Returns number, min value: 0.
     */
    private int views_last_hour;

    /**
     * The number of views in the last 30 sliding days.
     * No access_token required for reading.
     * Returns number, min value: 0.
     */
    private int views_last_month;

    /**
     * The number of views in the last 7 sliding days.
     * No access_token required for reading.
     * Returns number, min value: 0.
     */
    private int views_last_week;

    /**
     * The number of views on the video since its privateation.
     * No access_token required for reading.
     * Returns number, min value: 0.
     */
    private int views_total;

    /**
     * Returns the threeD
     *
     * @return the threeD
     */
    public boolean isThreeD() {
        return threeD;
    }

    /**
     * Set the ThreeD
     *
     * @param threeD the ThreeD to set
     */
    public void setThreeD(boolean threeD) {
        this.threeD = threeD;
    }

    /**
     * Returns the Access_error
     *
     * @return the Access_error
     */
    public String getAccess_error() {
        return access_error;
    }

    /**
     * Set the Access_error
     *
     * @param access_error the Access_error to set
     */
    public void setAccess_error(String access_error) {
        this.access_error = access_error;
    }

    /**
     * Returns the ads
     *
     * @return the ads
     */
    public boolean isAds() {
        return ads;
    }

    /**
     * Set the Ads
     *
     * @param ads the Ads to set
     */
    public void setAds(boolean ads) {
        this.ads = ads;
    }

    /**
     * Returns the allow_comments
     *
     * @return the allow_comments
     */
    public boolean isAllow_comments() {
        return allow_comments;
    }

    /**
     * Set the Allow_comments
     *
     * @param allow_comments the Allow_comments to set
     */
    public void setAllow_comments(boolean allow_comments) {
        this.allow_comments = allow_comments;
    }

    /**
     * Returns the allow_embed
     *
     * @return the allow_embed
     */
    public boolean isAllow_embed() {
        return allow_embed;
    }

    /**
     * Set the Allow_embed
     *
     * @param allow_embed the Allow_embed to set
     */
    public void setAllow_embed(boolean allow_embed) {
        this.allow_embed = allow_embed;
    }

    /**
     * Returns the allowed_in_groups
     *
     * @return the allowed_in_groups
     */
    public boolean isAllowed_in_groups() {
        return allowed_in_groups;
    }

    /**
     * Set the Allowed_in_groups
     *
     * @param allowed_in_groups the Allowed_in_groups to set
     */
    public void setAllowed_in_groups(boolean allowed_in_groups) {
        this.allowed_in_groups = allowed_in_groups;
    }

    /**
     * Returns the allowed_in_playlists
     *
     * @return the allowed_in_playlists
     */
    public boolean isAllowed_in_playlists() {
        return allowed_in_playlists;
    }

    /**
     * Set the Allowed_in_playlists
     *
     * @param allowed_in_playlists the Allowed_in_playlists to set
     */
    public void setAllowed_in_playlists(boolean allowed_in_playlists) {
        this.allowed_in_playlists = allowed_in_playlists;
    }

    /**
     * Returns the Aspect_ratio
     *
     * @return the Aspect_ratio
     */
    public double getAspect_ratio() {
        return aspect_ratio;
    }

    /**
     * Set the Aspect_ratio
     *
     * @param aspect_ratio the Aspect_ratio to set
     */
    public void setAspect_ratio(double aspect_ratio) {
        this.aspect_ratio = aspect_ratio;
    }

    /**
     * Returns the Audience
     *
     * @return the Audience
     */
    public int getAudience() {
        return audience;
    }

    /**
     * Set the Audience
     *
     * @param audience the Audience to set
     */
    public void setAudience(int audience) {
        this.audience = audience;
    }

    /**
     * Returns the Available_formats
     *
     * @return the Available_formats
     */
    public List<Double> getAvailable_formats() {
        return available_formats;
    }

    /**
     * Set the Available_formats
     *
     * @param available_formats the Available_formats to set
     */
    public void setAvailable_formats(List<Double> available_formats) {
        this.available_formats = available_formats;
    }

    /**
     * Returns the Bookmarks_total
     *
     * @return the Bookmarks_total
     */
    public int getBookmarks_total() {
        return bookmarks_total;
    }

    /**
     * Set the Bookmarks_total
     *
     * @param bookmarks_total the Bookmarks_total to set
     */
    public void setBookmarks_total(int bookmarks_total) {
        this.bookmarks_total = bookmarks_total;
    }

    public boolean isBroadcasting() {
        return broadcasting;
    }

    /**
     * Set the Broadcasting
     *
     * @param broadcasting the Broadcasting to set
     */
    public void setBroadcasting(boolean broadcasting) {
        this.broadcasting = broadcasting;
    }

    /**
     * Returns the Channel
     *
     * @return the Channel
     */
    public Channel getChannel() {
        return channel;
    }

    /**
     * Set the Channel
     *
     * @param channel the Channel to set
     */
    public void setChannel(Channel channel) {
        this.channel = channel;
    }

    /**
     * Returns the Comments_total
     *
     * @return the Comments_total
     */
    public int getComments_total() {
        return comments_total;
    }

    /**
     * Set the Comments_total
     *
     * @param comments_total the Comments_total to set
     */
    public void setComments_total(int comments_total) {
        this.comments_total = comments_total;
    }

    /**
     * Returns the Country
     *
     * @return the Country
     */
    public String getCountry() {
        return country;
    }

    /**
     * Set the Country
     *
     * @param country the Country to set
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * Returns the Created_after
     *
     * @return the Created_after
     */
    public Timestamp getCreated_after() {
        return created_after;
    }

    /**
     * Set the Created_after
     *
     * @param created_after the Created_after to set
     */
    public void setCreated_after(Timestamp created_after) {
        this.created_after = created_after;
    }

    /**
     * Returns the Created_before
     *
     * @return the Created_before
     */
    public Timestamp getCreated_before() {
        return created_before;
    }

    /**
     * Set the Created_before
     *
     * @param created_before the Created_before to set
     */
    public void setCreated_before(Timestamp created_before) {
        this.created_before = created_before;
    }

    /**
     * Returns the Created_time
     *
     * @return the Created_time
     */
    public Date getCreated_time() {
        return created_time;
    }

    /**
     * Set the Created_time
     *
     * @param created_time the Created_time to set
     */
    public void setCreated_time(Date created_time) {
        this.created_time = created_time;
    }

    /**
     * Returns the Description
     *
     * @return the Description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Set the Description
     *
     * @param description the Description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Returns the Duration
     *
     * @return the Duration
     */
    public int getDuration() {
        return duration;
    }

    /**
     * Set the Duration
     *
     * @param duration the Duration to set
     */
    public void setDuration(int duration) {
        this.duration = duration;
    }

    /**
     * Returns the Embed_html
     *
     * @return the Embed_html
     */
    public String getEmbed_html() {
        return embed_html;
    }

    /**
     * Set the Embed_html
     *
     * @param embed_html the Embed_html to set
     */
    public void setEmbed_html(String embed_html) {
        this.embed_html = embed_html;
    }

    /**
     * Returns the Embed_url
     *
     * @return the Embed_url
     */
    public String getEmbed_url() {
        return embed_url;
    }

    /**
     * Set the Embed_url
     *
     * @param embed_url the Embed_url to set
     */
    public void setEmbed_url(String embed_url) {
        this.embed_url = embed_url;
    }

    /**
     * Returns the Encoding_progress
     *
     * @return the Encoding_progress
     */
    public int getEncoding_progress() {
        return encoding_progress;
    }

    /**
     * Set the Encoding_progress
     *
     * @param encoding_progress the Encoding_progress to set
     */
    public void setEncoding_progress(int encoding_progress) {
        this.encoding_progress = encoding_progress;
    }

    /**
     * Returns the End_time
     *
     * @return the End_time
     */
    public Date getEnd_time() {
        return end_time;
    }

    /**
     * Set the End_time
     *
     * @param end_time the End_time to set
     */
    public void setEnd_time(Date end_time) {
        this.end_time = end_time;
    }

    /**
     * Returns the Event_delete
     *
     * @return the Event_delete
     */
    public String getEvent_delete() {
        return event_delete;
    }

    /**
     * Set the Event_delete
     *
     * @param event_delete the Event_delete to set
     */
    public void setEvent_delete(String event_delete) {
        this.event_delete = event_delete;
    }

    /**
     * Returns the Event_live_offair
     *
     * @return the Event_live_offair
     */
    public String getEvent_live_offair() {
        return event_live_offair;
    }

    /**
     * Set the Event_live_offair
     *
     * @param event_live_offair the Event_live_offair to set
     */
    public void setEvent_live_offair(String event_live_offair) {
        this.event_live_offair = event_live_offair;
    }

    /**
     * Returns the Event_live_onair
     *
     * @return the Event_live_onair
     */
    public String getEvent_live_onair() {
        return event_live_onair;
    }

    /**
     * Set the Event_live_onair
     *
     * @param event_live_onair the Event_live_onair to set
     */
    public void setEvent_live_onair(String event_live_onair) {
        this.event_live_onair = event_live_onair;
    }

    /**
     * Returns the Event_modify
     *
     * @return the Event_modify
     */
    public String getEvent_modify() {
        return event_modify;
    }

    /**
     * Set the Event_modify
     *
     * @param event_modify the Event_modify to set
     */
    public void setEvent_modify(String event_modify) {
        this.event_modify = event_modify;
    }

    /**
     * Returns the explicit
     *
     * @return the explicit
     */
    public boolean isExplicit() {
        return explicit;
    }

    /**
     * Set the Explicit
     *
     * @param explicit the Explicit to set
     */
    public void setExplicit(boolean explicit) {
        this.explicit = explicit;
    }

    /**
     * Returns the Filmstrip_small_url
     *
     * @return the Filmstrip_small_url
     */
    public String getFilmstrip_small_url() {
        return filmstrip_small_url;
    }

    /**
     * Set the Filmstrip_small_url
     *
     * @param filmstrip_small_url the Filmstrip_small_url to set
     */
    public void setFilmstrip_small_url(String filmstrip_small_url) {
        this.filmstrip_small_url = filmstrip_small_url;
    }

    /**
     * Returns the Filters
     *
     * @return the Filters
     */
    public String getFilters() {
        return filters;
    }

    /**
     * Set the Filters
     *
     * @param filters the Filters to set
     */
    public void setFilters(String filters) {
        this.filters = filters;
    }

    /**
     * Returns the Genre
     *
     * @return the Genre
     */
    public String getGenre() {
        return genre;
    }

    /**
     * Set the Genre
     *
     * @param genre the Genre to set
     */
    public void setGenre(String genre) {
        this.genre = genre;
    }

    /**
     * Returns the Geoblocking
     *
     * @return the Geoblocking
     */
    public List<String> getGeoblocking() {
        return geoblocking;
    }

    /**
     * Set the Geoblocking
     *
     * @param geoblocking the Geoblocking to set
     */
    public void setGeoblocking(List<String> geoblocking) {
        this.geoblocking = geoblocking;
    }

    /**
     * Returns the Geoloc
     *
     * @return the Geoloc
     */
    public List<Double> getGeoloc() {
        return geoloc;
    }

    /**
     * Set the Geoloc
     *
     * @param geoloc the Geoloc to set
     */
    public void setGeoloc(List<Double> geoloc) {
        this.geoloc = geoloc;
    }

    /**
     * Returns the Id
     *
     * @return the Id
     */
    public String getId() {
        return id;
    }

    /**
     * Set the Id
     *
     * @param id the Id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Returns the Ids
     *
     * @return the Ids
     */
    public String getIds() {
        return ids;
    }

    /**
     * Set the Ids
     *
     * @param ids the Ids to set
     */
    public void setIds(String ids) {
        this.ids = ids;
    }

    /**
     * Returns the Isrc
     *
     * @return the Isrc
     */
    public String getIsrc() {
        return isrc;
    }

    /**
     * Set the Isrc
     *
     * @param isrc the Isrc to set
     */
    public void setIsrc(String isrc) {
        this.isrc = isrc;
    }

    /**
     * Returns the Language
     *
     * @return the Language
     */
    public String getLanguage() {
        return language;
    }

    /**
     * Set the Language
     *
     * @param language the Language to set
     */
    public void setLanguage(String language) {
        this.language = language;
    }

    /**
     * Returns the live_ad_break
     *
     * @return the live_ad_break
     */
    public boolean isLive_ad_break() {
        return live_ad_break;
    }

    /**
     * Set the Live_ad_break
     *
     * @param live_ad_break the Live_ad_break to set
     */
    public void setLive_ad_break(boolean live_ad_break) {
        this.live_ad_break = live_ad_break;
    }

    /**
     * Returns the Live_frag_publish_url
     *
     * @return the Live_frag_publish_url
     */
    public String getLive_frag_publish_url() {
        return live_frag_publish_url;
    }

    /**
     * Set the Live_frag_publish_url
     *
     * @param live_frag_publish_url the Live_frag_publish_url to set
     */
    public void setLive_frag_publish_url(String live_frag_publish_url) {
        this.live_frag_publish_url = live_frag_publish_url;
    }

    /**
     * Returns the Live_publish_url
     *
     * @return the Live_publish_url
     */
    public String getLive_publish_url() {
        return live_publish_url;
    }

    /**
     * Set the Live_publish_url
     *
     * @param live_publish_url the Live_publish_url to set
     */
    public void setLive_publish_url(String live_publish_url) {
        this.live_publish_url = live_publish_url;
    }

    /**
     * Returns the Mediablocking
     *
     * @return the Mediablocking
     */
    public List<String> getMediablocking() {
        return mediablocking;
    }

    /**
     * Set the Mediablocking
     *
     * @param mediablocking the Mediablocking to set
     */
    public void setMediablocking(List<String> mediablocking) {
        this.mediablocking = mediablocking;
    }

    /**
     * Returns the Metadata_credit_actors
     *
     * @return the Metadata_credit_actors
     */
    public String getMetadata_credit_actors() {
        return metadata_credit_actors;
    }

    /**
     * Set the Metadata_credit_actors
     *
     * @param metadata_credit_actors the Metadata_credit_actors to set
     */
    public void setMetadata_credit_actors(String metadata_credit_actors) {
        this.metadata_credit_actors = metadata_credit_actors;
    }

    /**
     * Returns the Metadata_credit_director
     *
     * @return the Metadata_credit_director
     */
    public String getMetadata_credit_director() {
        return metadata_credit_director;
    }

    /**
     * Set the Metadata_credit_director
     *
     * @param metadata_credit_director the Metadata_credit_director to set
     */
    public void setMetadata_credit_director(String metadata_credit_director) {
        this.metadata_credit_director = metadata_credit_director;
    }

    /**
     * Returns the Metadata_genre
     *
     * @return the Metadata_genre
     */
    public String getMetadata_genre() {
        return metadata_genre;
    }

    /**
     * Set the Metadata_genre
     *
     * @param metadata_genre the Metadata_genre to set
     */
    public void setMetadata_genre(String metadata_genre) {
        this.metadata_genre = metadata_genre;
    }

    /**
     * Returns the Metadata_original_language
     *
     * @return the Metadata_original_language
     */
    public String getMetadata_original_language() {
        return metadata_original_language;
    }

    /**
     * Set the Metadata_original_language
     *
     * @param metadata_original_language the Metadata_original_language to set
     */
    public void setMetadata_original_language(String metadata_original_language) {
        this.metadata_original_language = metadata_original_language;
    }

    /**
     * Returns the Metadata_original_title
     *
     * @return the Metadata_original_title
     */
    public String getMetadata_original_title() {
        return metadata_original_title;
    }

    /**
     * Set the Metadata_original_title
     *
     * @param metadata_original_title the Metadata_original_title to set
     */
    public void setMetadata_original_title(String metadata_original_title) {
        this.metadata_original_title = metadata_original_title;
    }

    /**
     * Returns the Metadata_released
     *
     * @return the Metadata_released
     */
    public String getMetadata_released() {
        return metadata_released;
    }

    /**
     * Set the Metadata_released
     *
     * @param metadata_released the Metadata_released to set
     */
    public void setMetadata_released(String metadata_released) {
        this.metadata_released = metadata_released;
    }

    /**
     * Returns the Metadata_show_episod
     *
     * @return the Metadata_show_episod
     */
    public String getMetadata_show_episod() {
        return metadata_show_episod;
    }

    /**
     * Set the Metadata_show_episod
     *
     * @param metadata_show_episod the Metadata_show_episod to set
     */
    public void setMetadata_show_episod(String metadata_show_episod) {
        this.metadata_show_episod = metadata_show_episod;
    }

    /**
     * Returns the Metadata_show_season
     *
     * @return the Metadata_show_season
     */
    public String getMetadata_show_season() {
        return metadata_show_season;
    }

    /**
     * Set the Metadata_show_season
     *
     * @param metadata_show_season the Metadata_show_season to set
     */
    public void setMetadata_show_season(String metadata_show_season) {
        this.metadata_show_season = metadata_show_season;
    }

    /**
     * Returns the Metadata_visa
     *
     * @return the Metadata_visa
     */
    public String getMetadata_visa() {
        return metadata_visa;
    }

    /**
     * Set the Metadata_visa
     *
     * @param metadata_visa the Metadata_visa to set
     */
    public void setMetadata_visa(String metadata_visa) {
        this.metadata_visa = metadata_visa;
    }

    /**
     * Returns the Mode
     *
     * @return the Mode
     */
    public String getMode() {
        return mode;
    }

    /**
     * Set the Mode
     *
     * @param mode the Mode to set
     */
    public void setMode(String mode) {
        this.mode = mode;
    }

    /**
     * Returns the moderated
     *
     * @return the moderated
     */
    public boolean isModerated() {
        return moderated;
    }

    /**
     * Set the Moderated
     *
     * @param moderated the Moderated to set
     */
    public void setModerated(boolean moderated) {
        this.moderated = moderated;
    }

    /**
     * Returns the Modified_after
     *
     * @return the Modified_after
     */
    public Timestamp getModified_after() {
        return modified_after;
    }

    /**
     * Set the Modified_after
     *
     * @param modified_after the Modified_after to set
     */
    public void setModified_after(Timestamp modified_after) {
        this.modified_after = modified_after;
    }

    /**
     * Returns the Modified_before
     *
     * @return the Modified_before
     */
    public Timestamp getModified_before() {
        return modified_before;
    }

    /**
     * Set the Modified_before
     *
     * @param modified_before the Modified_before to set
     */
    public void setModified_before(Timestamp modified_before) {
        this.modified_before = modified_before;
    }

    /**
     * Returns the Modified_time
     *
     * @return the Modified_time
     */
    public Timestamp getModified_time() {
        return modified_time;
    }

    /**
     * Set the Modified_time
     *
     * @param modified_time the Modified_time to set
     */
    public void setModified_time(Timestamp modified_time) {
        this.modified_time = modified_time;
    }

    /**
     * Returns the Muyap
     *
     * @return the Muyap
     */
    public String getMuyap() {
        return muyap;
    }

    /**
     * Set the Muyap
     *
     * @param muyap the Muyap to set
     */
    public void setMuyap(String muyap) {
        this.muyap = muyap;
    }

    /**
     * Returns the onair
     *
     * @return the onair
     */
    public boolean isOnair() {
        return onair;
    }

    /**
     * Set the Onair
     *
     * @param onair the Onair to set
     */
    public void setOnair(boolean onair) {
        this.onair = onair;
    }

    /**
     * Returns the Owner
     *
     * @return the Owner
     */
    public User getOwner() {
        return owner;
    }

    /**
     * Set the Owner
     *
     * @param owner the Owner to set
     */
    public void setOwner(User owner) {
        this.owner = owner;
    }

    /**
     * Returns the paywall
     *
     * @return the paywall
     */
    public boolean isPaywall() {
        return paywall;
    }

    /**
     * Set the Paywall
     *
     * @param paywall the Paywall to set
     */
    public void setPaywall(boolean paywall) {
        this.paywall = paywall;
    }

    /**
     * Returns the poster
     *
     * @return the poster
     */
    public boolean isPoster() {
        return poster;
    }

    /**
     * Set the Poster
     *
     * @param poster the Poster to set
     */
    public void setPoster(boolean poster) {
        this.poster = poster;
    }

    /**
     * Returns the Poster_135x180_url
     *
     * @return the Poster_135x180_url
     */
    public String getPoster_135x180_url() {
        return poster_135x180_url;
    }

    /**
     * Set the Poster_135x180_url
     *
     * @param poster_135x180_url the Poster_135x180_url to set
     */
    public void setPoster_135x180_url(String poster_135x180_url) {
        this.poster_135x180_url = poster_135x180_url;
    }

    /**
     * Returns the Poster_180x240_url
     *
     * @return the Poster_180x240_url
     */
    public String getPoster_180x240_url() {
        return poster_180x240_url;
    }

    /**
     * Set the Poster_180x240_url
     *
     * @param poster_180x240_url the Poster_180x240_url to set
     */
    public void setPoster_180x240_url(String poster_180x240_url) {
        this.poster_180x240_url = poster_180x240_url;
    }

    /**
     * Returns the Poster_270x360_url
     *
     * @return the Poster_270x360_url
     */
    public String getPoster_270x360_url() {
        return poster_270x360_url;
    }

    /**
     * Set the Poster_270x360_url
     *
     * @param poster_270x360_url the Poster_270x360_url to set
     */
    public void setPoster_270x360_url(String poster_270x360_url) {
        this.poster_270x360_url = poster_270x360_url;
    }

    /**
     * Returns the Poster_360x480_url
     *
     * @return the Poster_360x480_url
     */
    public String getPoster_360x480_url() {
        return poster_360x480_url;
    }

    /**
     * Set the Poster_360x480_url
     *
     * @param poster_360x480_url the Poster_360x480_url to set
     */
    public void setPoster_360x480_url(String poster_360x480_url) {
        this.poster_360x480_url = poster_360x480_url;
    }

    /**
     * Returns the Poster_45x60_url
     *
     * @return the Poster_45x60_url
     */
    public String getPoster_45x60_url() {
        return poster_45x60_url;
    }

    /**
     * Set the Poster_45x60_url
     *
     * @param poster_45x60_url the Poster_45x60_url to set
     */
    public void setPoster_45x60_url(String poster_45x60_url) {
        this.poster_45x60_url = poster_45x60_url;
    }

    /**
     * Returns the Poster_90x120_url
     *
     * @return the Poster_90x120_url
     */
    public String getPoster_90x120_url() {
        return poster_90x120_url;
    }

    /**
     * Set the Poster_90x120_url
     *
     * @param poster_90x120_url the Poster_90x120_url to set
     */
    public void setPoster_90x120_url(String poster_90x120_url) {
        this.poster_90x120_url = poster_90x120_url;
    }

    /**
     * Returns the Poster_url
     *
     * @return the Poster_url
     */
    public String getPoster_url() {
        return poster_url;
    }

    /**
     * Set the Poster_url
     *
     * @param poster_url the Poster_url to set
     */
    public void setPoster_url(String poster_url) {
        this.poster_url = poster_url;
    }

    /**
     * Returns the Price_details
     *
     * @return the Price_details
     */
    public String getPrice_details() {
        return price_details;
    }

    /**
     * Set the Price_details
     *
     * @param price_details the Price_details to set
     */
    public void setPrice_details(String price_details) {
        this.price_details = price_details;
    }

    public boolean isPrivate_() {
        return private_;
    }

    /**
     * Set the Private_
     *
     * @param private_ the Private_ to set
     */
    public void setPrivate_(boolean private_) {
        this.private_ = private_;
    }

    public boolean isPublished() {
        return published;
    }

    /**
     * Set the Published
     *
     * @param published the Published to set
     */
    public void setPublished(boolean published) {
        this.published = published;
    }

    /**
     * Returns the Rating
     *
     * @return the Rating
     */
    public float getRating() {
        return rating;
    }

    /**
     * Set the Rating
     *
     * @param rating the Rating to set
     */
    public void setRating(float rating) {
        this.rating = rating;
    }

    /**
     * Returns the Ratings_total
     *
     * @return the Ratings_total
     */
    public int getRatings_total() {
        return ratings_total;
    }

    /**
     * Set the Ratings_total
     *
     * @param ratings_total the Ratings_total to set
     */
    public void setRatings_total(int ratings_total) {
        this.ratings_total = ratings_total;
    }

    /**
     * Returns the Recurrence
     *
     * @return the Recurrence
     */
    public String getRecurrence() {
        return recurrence;
    }

    /**
     * Set the Recurrence
     *
     * @param recurrence the Recurrence to set
     */
    public void setRecurrence(String recurrence) {
        this.recurrence = recurrence;
    }

    /**
     * Returns the Rental_duration
     *
     * @return the Rental_duration
     */
    public int getRental_duration() {
        return rental_duration;
    }

    /**
     * Set the Rental_duration
     *
     * @param rental_duration the Rental_duration to set
     */
    public void setRental_duration(int rental_duration) {
        this.rental_duration = rental_duration;
    }

    /**
     * Returns the Rental_price
     *
     * @return the Rental_price
     */
    public float getRental_price() {
        return rental_price;
    }

    /**
     * Set the Rental_price
     *
     * @param rental_price the Rental_price to set
     */
    public void setRental_price(float rental_price) {
        this.rental_price = rental_price;
    }

    /**
     * Returns the Rental_price_formatted
     *
     * @return the Rental_price_formatted
     */
    public String getRental_price_formatted() {
        return rental_price_formatted;
    }

    /**
     * Set the Rental_price_formatted
     *
     * @param rental_price_formatted the Rental_price_formatted to set
     */
    public void setRental_price_formatted(String rental_price_formatted) {
        this.rental_price_formatted = rental_price_formatted;
    }

    /**
     * Returns the Rental_start_time
     *
     * @return the Rental_start_time
     */
    public int getRental_start_time() {
        return rental_start_time;
    }

    /**
     * Set the Rental_start_time
     *
     * @param rental_start_time the Rental_start_time to set
     */
    public void setRental_start_time(int rental_start_time) {
        this.rental_start_time = rental_start_time;
    }

    /**
     * Returns the Search
     *
     * @return the Search
     */
    public String getSearch() {
        return search;
    }

    /**
     * Set the Search
     *
     * @param search the Search to set
     */
    public void setSearch(String search) {
        this.search = search;
    }

    /**
     * Returns the Sharing_urls
     *
     * @return the Sharing_urls
     */
    public String getSharing_urls() {
        return sharing_urls;
    }

    /**
     * Set the Sharing_urls
     *
     * @param sharing_urls the Sharing_urls to set
     */
    public void setSharing_urls(String sharing_urls) {
        this.sharing_urls = sharing_urls;
    }

    /**
     * Returns the Sort
     *
     * @return the Sort
     */
    public String getSort() {
        return sort;
    }

    /**
     * Set the Sort
     *
     * @param sort the Sort to set
     */
    public void setSort(String sort) {
        this.sort = sort;
    }

    /**
     * Returns the Soundtrack_info
     *
     * @return the Soundtrack_info
     */
    public String getSoundtrack_info() {
        return soundtrack_info;
    }

    /**
     * Set the Soundtrack_info
     *
     * @param soundtrack_info the Soundtrack_info to set
     */
    public void setSoundtrack_info(String soundtrack_info) {
        this.soundtrack_info = soundtrack_info;
    }

    /**
     * Returns the Start_time
     *
     * @return the Start_time
     */
    public Date getStart_time() {
        return start_time;
    }

    /**
     * Set the Start_time
     *
     * @param start_time the Start_time to set
     */
    public void setStart_time(Date start_time) {
        this.start_time = start_time;
    }

    /**
     * Returns the Status
     *
     * @return the Status
     */
    public String getStatus() {
        return status;
    }

    /**
     * Set the Status
     *
     * @param status the Status to set
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * Returns the Stream_h264_hd1080_url
     *
     * @return the Stream_h264_hd1080_url
     */
    public String getStream_h264_hd1080_url() {
        return stream_h264_hd1080_url;
    }

    /**
     * Set the Stream_h264_hd1080_url
     *
     * @param stream_h264_hd1080_url the Stream_h264_hd1080_url to set
     */
    public void setStream_h264_hd1080_url(String stream_h264_hd1080_url) {
        this.stream_h264_hd1080_url = stream_h264_hd1080_url;
    }

    /**
     * Returns the Stream_h264_hd_url
     *
     * @return the Stream_h264_hd_url
     */
    public String getStream_h264_hd_url() {
        return stream_h264_hd_url;
    }

    /**
     * Set the Stream_h264_hd_url
     *
     * @param stream_h264_hd_url the Stream_h264_hd_url to set
     */
    public void setStream_h264_hd_url(String stream_h264_hd_url) {
        this.stream_h264_hd_url = stream_h264_hd_url;
    }

    /**
     * Returns the Stream_h264_hq_url
     *
     * @return the Stream_h264_hq_url
     */
    public String getStream_h264_hq_url() {
        return stream_h264_hq_url;
    }

    /**
     * Set the Stream_h264_hq_url
     *
     * @param stream_h264_hq_url the Stream_h264_hq_url to set
     */
    public void setStream_h264_hq_url(String stream_h264_hq_url) {
        this.stream_h264_hq_url = stream_h264_hq_url;
    }

    /**
     * Returns the Stream_h264_l1_url
     *
     * @return the Stream_h264_l1_url
     */
    public String getStream_h264_l1_url() {
        return stream_h264_l1_url;
    }

    /**
     * Set the Stream_h264_l1_url
     *
     * @param stream_h264_l1_url the Stream_h264_l1_url to set
     */
    public void setStream_h264_l1_url(String stream_h264_l1_url) {
        this.stream_h264_l1_url = stream_h264_l1_url;
    }

    /**
     * Returns the Stream_h264_l2_url
     *
     * @return the Stream_h264_l2_url
     */
    public String getStream_h264_l2_url() {
        return stream_h264_l2_url;
    }

    /**
     * Set the Stream_h264_l2_url
     *
     * @param stream_h264_l2_url the Stream_h264_l2_url to set
     */
    public void setStream_h264_l2_url(String stream_h264_l2_url) {
        this.stream_h264_l2_url = stream_h264_l2_url;
    }

    /**
     * Returns the Stream_h264_ld_url
     *
     * @return the Stream_h264_ld_url
     */
    public String getStream_h264_ld_url() {
        return stream_h264_ld_url;
    }

    /**
     * Set the Stream_h264_ld_url
     *
     * @param stream_h264_ld_url the Stream_h264_ld_url to set
     */
    public void setStream_h264_ld_url(String stream_h264_ld_url) {
        this.stream_h264_ld_url = stream_h264_ld_url;
    }

    /**
     * Returns the Stream_h264_url
     *
     * @return the Stream_h264_url
     */
    public String getStream_h264_url() {
        return stream_h264_url;
    }

    /**
     * Set the Stream_h264_url
     *
     * @param stream_h264_url the Stream_h264_url to set
     */
    public void setStream_h264_url(String stream_h264_url) {
        this.stream_h264_url = stream_h264_url;
    }

    /**
     * Returns the Stream_hls_url
     *
     * @return the Stream_hls_url
     */
    public String getStream_hls_url() {
        return stream_hls_url;
    }

    /**
     * Set the Stream_hls_url
     *
     * @param stream_hls_url the Stream_hls_url to set
     */
    public void setStream_hls_url(String stream_hls_url) {
        this.stream_hls_url = stream_hls_url;
    }

    /**
     * Returns the Stream_live_hds_url
     *
     * @return the Stream_live_hds_url
     */
    public String getStream_live_hds_url() {
        return stream_live_hds_url;
    }

    /**
     * Set the Stream_live_hds_url
     *
     * @param stream_live_hds_url the Stream_live_hds_url to set
     */
    public void setStream_live_hds_url(String stream_live_hds_url) {
        this.stream_live_hds_url = stream_live_hds_url;
    }

    /**
     * Returns the Stream_live_hls_url
     *
     * @return the Stream_live_hls_url
     */
    public String getStream_live_hls_url() {
        return stream_live_hls_url;
    }

    /**
     * Set the Stream_live_hls_url
     *
     * @param stream_live_hls_url the Stream_live_hls_url to set
     */
    public void setStream_live_hls_url(String stream_live_hls_url) {
        this.stream_live_hls_url = stream_live_hls_url;
    }

    /**
     * Returns the Stream_live_rtmp_url
     *
     * @return the Stream_live_rtmp_url
     */
    public String getStream_live_rtmp_url() {
        return stream_live_rtmp_url;
    }

    /**
     * Set the Stream_live_rtmp_url
     *
     * @param stream_live_rtmp_url the Stream_live_rtmp_url to set
     */
    public void setStream_live_rtmp_url(String stream_live_rtmp_url) {
        this.stream_live_rtmp_url = stream_live_rtmp_url;
    }

    /**
     * Returns the Stream_premium_preview_hls_url
     *
     * @return the Stream_premium_preview_hls_url
     */
    public String getStream_premium_preview_hls_url() {
        return stream_premium_preview_hls_url;
    }

    /**
     * Set the Stream_premium_preview_hls_url
     *
     * @param stream_premium_preview_hls_url the Stream_premium_preview_hls_url to set
     */
    public void setStream_premium_preview_hls_url(String stream_premium_preview_hls_url) {
        this.stream_premium_preview_hls_url = stream_premium_preview_hls_url;
    }

    /**
     * Returns the Stream_premium_preview_mp4_url
     *
     * @return the Stream_premium_preview_mp4_url
     */
    public String getStream_premium_preview_mp4_url() {
        return stream_premium_preview_mp4_url;
    }

    /**
     * Set the Stream_premium_preview_mp4_url
     *
     * @param stream_premium_preview_mp4_url the Stream_premium_preview_mp4_url to set
     */
    public void setStream_premium_preview_mp4_url(String stream_premium_preview_mp4_url) {
        this.stream_premium_preview_mp4_url = stream_premium_preview_mp4_url;
    }

    /**
     * Returns the Stream_premium_preview_web_url
     *
     * @return the Stream_premium_preview_web_url
     */
    public String getStream_premium_preview_web_url() {
        return stream_premium_preview_web_url;
    }

    /**
     * Set the Stream_premium_preview_web_url
     *
     * @param stream_premium_preview_web_url the Stream_premium_preview_web_url to set
     */
    public void setStream_premium_preview_web_url(String stream_premium_preview_web_url) {
        this.stream_premium_preview_web_url = stream_premium_preview_web_url;
    }

    /**
     * Returns the Stream_source_url
     *
     * @return the Stream_source_url
     */
    public String getStream_source_url() {
        return stream_source_url;
    }

    /**
     * Set the Stream_source_url
     *
     * @param stream_source_url the Stream_source_url to set
     */
    public void setStream_source_url(String stream_source_url) {
        this.stream_source_url = stream_source_url;
    }

    /**
     * Returns the Strongtags
     *
     * @return the Strongtags
     */
    public List<Strongtag> getStrongtags() {
        return strongtags;
    }

    /**
     * Set the Strongtags
     *
     * @param strongtags the Strongtags to set
     */
    public void setStrongtags(List<Strongtag> strongtags) {
        this.strongtags = strongtags;
    }

    public boolean isSvod() {
        return svod;
    }

    /**
     * Set the Svod
     *
     * @param svod the Svod to set
     */
    public void setSvod(boolean svod) {
        this.svod = svod;
    }

    /**
     * Returns the Swf_url
     *
     * @return the Swf_url
     */
    public String getSwf_url() {
        return swf_url;
    }

    /**
     * Set the Swf_url
     *
     * @param swf_url the Swf_url to set
     */
    public void setSwf_url(String swf_url) {
        this.swf_url = swf_url;
    }

    public boolean isSync_allowed() {
        return sync_allowed;
    }

    /**
     * Set the Sync_allowed
     *
     * @param sync_allowed the Sync_allowed to set
     */
    public void setSync_allowed(boolean sync_allowed) {
        this.sync_allowed = sync_allowed;
    }

    /**
     * Returns the Tags
     *
     * @return the Tags
     */
    public List<String> getTags() {
        return tags;
    }

    /**
     * Set the Tags
     *
     * @param tags the Tags to set
     */
    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    /**
     * Returns the Taken_time
     *
     * @return the Taken_time
     */
    public Date getTaken_time() {
        return taken_time;
    }

    /**
     * Set the Taken_time
     *
     * @param taken_time the Taken_time to set
     */
    public void setTaken_time(Date taken_time) {
        this.taken_time = taken_time;
    }

    /**
     * Returns the Thumbnail_120_url
     *
     * @return the Thumbnail_120_url
     */
    public String getThumbnail_120_url() {
        return thumbnail_120_url;
    }

    /**
     * Set the Thumbnail_120_url
     *
     * @param thumbnail_120_url the Thumbnail_120_url to set
     */
    public void setThumbnail_120_url(String thumbnail_120_url) {
        this.thumbnail_120_url = thumbnail_120_url;
    }

    /**
     * Returns the Thumbnail_180_url
     *
     * @return the Thumbnail_180_url
     */
    public String getThumbnail_180_url() {
        return thumbnail_180_url;
    }

    /**
     * Set the Thumbnail_180_url
     *
     * @param thumbnail_180_url the Thumbnail_180_url to set
     */
    public void setThumbnail_180_url(String thumbnail_180_url) {
        this.thumbnail_180_url = thumbnail_180_url;
    }

    /**
     * Returns the Thumbnail_240_url
     *
     * @return the Thumbnail_240_url
     */
    public String getThumbnail_240_url() {
        return thumbnail_240_url;
    }

    /**
     * Set the Thumbnail_240_url
     *
     * @param thumbnail_240_url the Thumbnail_240_url to set
     */
    public void setThumbnail_240_url(String thumbnail_240_url) {
        this.thumbnail_240_url = thumbnail_240_url;
    }

    /**
     * Returns the Thumbnail_360_url
     *
     * @return the Thumbnail_360_url
     */
    public String getThumbnail_360_url() {
        return thumbnail_360_url;
    }

    /**
     * Set the Thumbnail_360_url
     *
     * @param thumbnail_360_url the Thumbnail_360_url to set
     */
    public void setThumbnail_360_url(String thumbnail_360_url) {
        this.thumbnail_360_url = thumbnail_360_url;
    }

    /**
     * Returns the Thumbnail_480_url
     *
     * @return the Thumbnail_480_url
     */
    public String getThumbnail_480_url() {
        return thumbnail_480_url;
    }

    /**
     * Set the Thumbnail_480_url
     *
     * @param thumbnail_480_url the Thumbnail_480_url to set
     */
    public void setThumbnail_480_url(String thumbnail_480_url) {
        this.thumbnail_480_url = thumbnail_480_url;
    }

    /**
     * Returns the Thumbnail_60_url
     *
     * @return the Thumbnail_60_url
     */
    public String getThumbnail_60_url() {
        return thumbnail_60_url;
    }

    /**
     * Set the Thumbnail_60_url
     *
     * @param thumbnail_60_url the Thumbnail_60_url to set
     */
    public void setThumbnail_60_url(String thumbnail_60_url) {
        this.thumbnail_60_url = thumbnail_60_url;
    }

    /**
     * Returns the Thumbnail_720_url
     *
     * @return the Thumbnail_720_url
     */
    public String getThumbnail_720_url() {
        return thumbnail_720_url;
    }

    /**
     * Set the Thumbnail_720_url
     *
     * @param thumbnail_720_url the Thumbnail_720_url to set
     */
    public void setThumbnail_720_url(String thumbnail_720_url) {
        this.thumbnail_720_url = thumbnail_720_url;
    }

    /**
     * Returns the Thumbnail_url
     *
     * @return the Thumbnail_url
     */
    public String getThumbnail_url() {
        return thumbnail_url;
    }

    /**
     * Set the Thumbnail_url
     *
     * @param thumbnail_url the Thumbnail_url to set
     */
    public void setThumbnail_url(String thumbnail_url) {
        this.thumbnail_url = thumbnail_url;
    }

    /**
     * Returns the Title
     *
     * @return the Title
     */
    public String getTitle() {
        return title;
    }

    /**
     * Set the Title
     *
     * @param title the Title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isTvod() {
        return tvod;
    }

    /**
     * Set the Tvod
     *
     * @param tvod the Tvod to set
     */
    public void setTvod(boolean tvod) {
        this.tvod = tvod;
    }

    /**
     * Returns the Type
     *
     * @return the Type
     */
    public String getType() {
        return type;
    }

    /**
     * Set the Type
     *
     * @param type the Type to set
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Returns the Upc
     *
     * @return the Upc
     */
    public String getUpc() {
        return upc;
    }

    /**
     * Set the Upc
     *
     * @param upc the Upc to set
     */
    public void setUpc(String upc) {
        this.upc = upc;
    }

    /**
     * Returns the Url
     *
     * @return the Url
     */
    public String getUrl() {
        return url;
    }

    /**
     * Set the Url
     *
     * @param url the Url to set
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * Returns the Views_last_day
     *
     * @return the Views_last_day
     */
    public int getViews_last_day() {
        return views_last_day;
    }

    /**
     * Set the Views_last_day
     *
     * @param views_last_day the Views_last_day to set
     */
    public void setViews_last_day(int views_last_day) {
        this.views_last_day = views_last_day;
    }

    /**
     * Returns the Views_last_hour
     *
     * @return the Views_last_hour
     */
    public int getViews_last_hour() {
        return views_last_hour;
    }

    /**
     * Set the Views_last_hour
     *
     * @param views_last_hour the Views_last_hour to set
     */
    public void setViews_last_hour(int views_last_hour) {
        this.views_last_hour = views_last_hour;
    }

    /**
     * Returns the Views_last_month
     *
     * @return the Views_last_month
     */
    public int getViews_last_month() {
        return views_last_month;
    }

    /**
     * Set the Views_last_month
     *
     * @param views_last_month the Views_last_month to set
     */
    public void setViews_last_month(int views_last_month) {
        this.views_last_month = views_last_month;
    }

    /**
     * Returns the Views_last_week
     *
     * @return the Views_last_week
     */
    public int getViews_last_week() {
        return views_last_week;
    }

    /**
     * Set the Views_last_week
     *
     * @param views_last_week the Views_last_week to set
     */
    public void setViews_last_week(int views_last_week) {
        this.views_last_week = views_last_week;
    }

    /**
     * Returns the Views_total
     *
     * @return the Views_total
     */
    public int getViews_total() {
        return views_total;
    }

    /**
     * Set the Views_total
     *
     * @param views_total the Views_total to set
     */
    public void setViews_total(int views_total) {
        this.views_total = views_total;
    }

    /**
     * {@docRoot}
     */
    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.DEFAULT_STYLE);
    }

    /**
     * {@docRoot}
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Video video = (Video) o;

        if (id != null ? !id.equals(video.id) : video.id != null) return false;

        return true;
    }

    /**
     * {@docRoot}
     */
    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }
}
