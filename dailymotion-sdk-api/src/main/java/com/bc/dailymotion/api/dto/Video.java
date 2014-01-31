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
    @JsonProperty(value = "3D")
    private boolean threeD;

    /**
     * An error message explaining why the access to the video can’t be granted.
     * No access_token required for reading.
     * Returns dict, min size: 1, max size: 150.
     */
    @JsonProperty(value = "access_error")
    private String accessError;

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
    @JsonProperty(value = "allow_comments")
    private boolean allowComments;

    /**
     * Tell if the video can be embeded outside of Dailymotion
     * No access_token required for reading.
     * Returns boolean.
     */
    @JsonProperty(value = "allow_embed")
    private boolean allowEmbed;

    /**
     * is it possible to add this video to groups
     * No access_token required for reading. This field is writable.
     * Returns boolean.
     */
    @JsonProperty(value = "allowed_in_groups")
    private boolean allowedInGroups;

    /**
     * is it possible to add this video to playlists
     * No access_token required for reading. This field is writable.
     * Returns boolean.
     */
    @JsonProperty(value = "allowed_in_playlists")
    private boolean allowedInPlaylists;

    /**
     * The aspect ratio of the video frame (i.e.: 1.33333 for 4/3, 1.77777 for 16/9...).
     * No access_token required for reading.
     * Returns number, min value: 0.
     */
    @JsonProperty(value = "aspect_ratio")
    private double aspectRatio;

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
    @JsonProperty(value = "available_formats")
    private List<Double> availableFormats;

    /**
     * The total number of times a video has been added to users’ favorites.
     * No access_token required for reading.
     * Returns number, min value: 0.
     */
    @JsonProperty(value = "bookmarks_total")
    private int bookmarksTotal;

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
    @JsonProperty(value = "comments_total")
    private int commentsTotal;

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
    @JsonProperty(value = "created_after")
    private Timestamp createdAfter;

    /**
     * Limit the result set to videos created before a specific timestamp
     * This field can be used as filter but can’t be read nor written.
     * Returns date.
     */
    @JsonProperty(value = "created_before")
    private Timestamp createdBefore;

    /**
     * The date the video was uploaded to the site.
     * No access_token required for reading.
     * Returns date.
     */
    @JsonProperty(value = "created_time")
    private Date createdTime;

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
    @JsonProperty(value = "embed_html")
    private String embedHtml;

    /**
     * The URL to embed the video.
     * No access_token required for reading.
     * Returns url.
     */
    @JsonProperty(value = "embed_url")
    private String embedUrl;

    /**
     * When the video status is processing, this parameter indicates a number between 0 and 100 corresponding to the percentage of encoding already completed. For other statuses this parameter is -1.
     * No access_token required for reading.
     * Returns number, min value: -1, max value: 100.
     */
    @JsonProperty(value = "encoding_progress")
    private int encodingProgress;

    /**
     * the end date of the stream
     * No access_token required for reading. This field is writable.
     * Returns date.
     */
    @JsonProperty(value = "end_time")
    private Date endTime;

    /**
     * The name of pushd event sent on video deletion
     * No access_token required for reading.
     * Returns string, min size: 1, max size: 150.
     */
    @JsonProperty(value = "event_delete")
    private String eventDelete;

    /**
     * The name of pushd event sent on video deletion
     * No access_token required for reading.
     * Returns string, min size: 1, max size: 150.
     */
    @JsonProperty(value = "event_live_offair")
    private String eventLiveOffair;

    /**
     * The name of pushd event sent on video modification
     * No access_token required for reading.
     * Returns string, min size: 1, max size: 150.
     */
    @JsonProperty(value = "event_live_onair")
    private String eventLiveOnair;

    /**
     * The name of pushd event sent on video modification
     * No access_token required for reading.
     * Returns string, min size: 1, max size: 150.
     */
    @JsonProperty(value = "event_modify")
    private String eventModify;

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
    @JsonProperty(value = "filmstrip_small_url")
    private String filmstripSmallUrl;

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
    @JsonProperty(value = "live_ad_break")
    private boolean liveAdBreak;

    /**
     * The URL to publish fragmented live stream on (current logged user need to own the video in order to retrieve this field)
     * No access_token required for reading.
     * Returns url.
     */
    @JsonProperty(value = "live_frag_publish_url")
    private String liveFragPublishUrl;

    /**
     * The URL to publish live source stream on (current logged user need to own the video in order to retrieve this field)
     * No access_token required for reading.
     * Returns url.
     */
    @JsonProperty(value = "live_publish_url")
    private String livePublishUrl;

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
    @JsonProperty(value = "metadata_credit_actors")
    private String metadataCreditActors;

    /**
     * director of the movie
     * No access_token required for reading. This field is writable.
     * Returns string, min size: 1, max size: 150.
     */
    @JsonProperty(value = "metadata_credit_director")
    private String metadataCreditDirector;

    /**
     * Genre of the video
     * No access_token required for reading. This field is writable.
     * Returns string, allowed values: drama, comedy, realitytelevision, animation, documentary, sitcom, gameshow, sciencefiction, talkshow, fantasy, action, anime, adventure, soapopera, miniseries, news, crimefiction, romance, sports, variety, thriller, music.
     */
    @JsonProperty(value = "metadata_genre")
    private String metadataGenre;

    /**
     * Original language (ISO 3166) of the video
     * No access_token required for reading. This field is writable.
     * Returns string, min size: 1, max size: 150.
     */
    @JsonProperty(value = "metadata_original_language")
    private String metadataOriginalLanguage;

    /**
     * Original title of the video
     * No access_token required for reading. This field is writable.
     * Returns string, min size: 1, max size: 150.
     */
    @JsonProperty(value = "metadata_original_title")
    private String metadataOriginalTitle;

    /**
     * Date (RFC 822) of release or production
     * No access_token required for reading. This field is writable.
     * Returns string, min size: 1, max size: 150.
     */
    @JsonProperty(value = "metadata_released")
    private String metadataReleased;

    /**
     * e
     * show episode number/name
     * No access_token required for reading. This field is writable.
     * Returns string, min size: 1, max size: 150.
     */
    @JsonProperty(value = "metadata_show_episod")
    private String metadataShowEpisod;

    /**
     * show season number/name
     * No access_token required for reading. This field is writable.
     * Returns string, min size: 1, max size: 150.
     */
    @JsonProperty(value = "metadata_show_season")
    private String metadataShowSeason;

    /**
     * Visa number
     * No access_token required for reading. This field is writable.
     * Returns string, min size: 1, max size: 150.
     */
    @JsonProperty(value = "metadata_visa")
    private String metadataVisa;

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
    private boolean moderated;

    /**
     * Limit the result set to videos modified after a specific timestamp
     * This field can be used as filter but can’t be read nor written.
     * Returns date.
     */
    @JsonProperty(value = "modified_after")
    private Timestamp modifiedAfter;

    /**
     * Limit the result set to videos modified before a specific timestamp
     * This field can be used as filter but can’t be read nor written.
     * Returns date.
     */
    @JsonProperty(value = "modified_before")
    private Timestamp modifiedBefore;

    /**
     * The date the video was last modified.
     * No access_token required for reading.
     * Returns date.
     */
    @JsonProperty(value = "modified_time")
    private Timestamp modifiedTime;

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
    @JsonProperty(value = "poster_135x180_url")
    private String poster135x180Url;

    /**
     * The URL of the video poster (180x240).
     * No access_token required for reading.
     * Returns url.
     */
    @JsonProperty(value = "poster_180x240_url")
    private String poster180x240Url;

    /**
     * The URL of the video poster (270x360).
     * No access_token required for reading.
     * Returns url.
     */
    @JsonProperty(value = "poster_270x360_url")
    private String poster270x360Url;

    /**
     * The URL of the video poster (360x480).
     * No access_token required for reading.
     * Returns url.
     */
    @JsonProperty(value = "poster_360x480_url")
    private String poster360x480Url;

    /**
     * The URL of the video poster (45x60).
     * No access_token required for reading.
     * Returns url.
     */
    @JsonProperty(value = "poster_45x60_url")
    private String poster45x60Url;

    /**
     * The URL of the video poster (95x120).
     * No access_token required for reading.
     * Returns url.
     */
    @JsonProperty(value = "poster_90x120_url")
    private String poster90x120Url;

    /**
     * The URL of the video poster (540x720).
     * No access_token required for reading.
     * Returns url.
     */
    @JsonProperty(value = "poster_url")
    private String posterUrl;

    /**
     * The price and duration for a tvod or svod video
     * No access_token required for reading.
     * Returns string, min size: 1, max size: 150.
     */
    @JsonProperty(value = "price_details")
    private String priceDetails;

    /**
     * True if the video is private.
     * This field can be used as filter. No access_token required for reading. This field is writable.
     * Returns boolean.
     */
    @JsonProperty(value = "private")
    private boolean pRivate;

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
    @JsonProperty(value = "ratings_total")
    private int ratingsTotal;

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
    @JsonProperty(value = "rental_duration")
    private int rentalDuration;

    /**
     * The price as float in the current currency. Will be null if the video is not behind a paywall. See currency field of the /locale endpoint to get the current currency.
     * No access_token required for reading. This field is writable.
     * Returns string, min size: 1, max size: 150.
     */
    @JsonProperty(value = "rental_price")
    private float rentalPrice;

    /**
     * The price, formatted with currency according to the request localization. Will be null if the video is not behind a paywall
     * No access_token required for reading.
     * Returns string, min size: 1, max size: 150.
     */
    @JsonProperty(value = "rental_price_formatted")
    private String rentalPriceFormatted;

    /**
     * Timelapse of video free preview, in seconds
     * No access_token required for reading. This field is writable.
     * Returns number, min value: 0.
     */
    @JsonProperty(value = "rental_start_time")
    private int rentalStartTime;

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
    @JsonProperty(value = "sharing_urls")
    private String sharingUrls;

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
    @JsonProperty(value = "soundtrack_info")
    private String soundtrackInfo;

    /**
     * The started time of the stream
     * No access_token required for reading. This field is writable.
     * Returns date.
     */
    @JsonProperty(value = "start_time")
    private Date startTime;

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
    @JsonProperty(value = "stream_h264_hd1080_url")
    private String streamH264Hd1080Url;

    /**
     * The URL of the high definition video (720p, 1.6Mbps).
     * No access_token required for reading.
     * Returns url.
     */
    @JsonProperty(value = "stream_h264_hd_url")
    private String streamH264HdUrl;

    /**
     * The URL of the high quality video (480p, 975kbps).
     * No access_token required for reading.
     * Returns url.
     */
    @JsonProperty(value = "stream_h264_hq_url")
    private String streamH264HqUrl;

    /**
     * The URL of the very low definition, low bandwidth video stream (144p, 60kbps).
     * No access_token required for reading.
     * Returns url.
     */
    @JsonProperty(value = "stream_h264_l1_url")
    private String streamH264L1Url;

    /**
     * The URL of the very low definition, higher bandwidth video stream (144p, 105kbps).
     * No access_token required for reading.
     * Returns url.
     */
    @JsonProperty(value = "stream_h264_l2_url")
    private String streamH264L2Url;

    /**
     * The URL of the low definition video stream (240p, 255kbps).
     * No access_token required for reading.
     * Returns url.
     */
    @JsonProperty(value = "stream_h264_ld_url")
    private String streamH264LdUrl;

    /**
     * The URL of the medium quality video (380p, 520kbps).
     * No access_token required for reading.
     * Returns url.
     */
    @JsonProperty(value = "stream_h264_url")
    private String streamH264Url;

    /**
     * The URL of the adaptative bitrate manifest using Apple HTTP Live Streaming protocol.
     * No access_token required for reading.
     * Returns url.
     */
    @JsonProperty(value = "stream_hls_url")
    private String streamHlsUrl;

    /**
     * The URL of the live using HTTP Dynamic Streaming protocol.
     * No access_token required for reading.
     * Returns url.
     */
    @JsonProperty(value = "stream_live_hds_url")
    private String streamLiveHdsUrl;

    /**
     * The URL of the live using HTTP Live Streaming protocol.
     * No access_token required for reading.
     * Returns url.
     */
    @JsonProperty(value = "stream_live_hls_url")
    private String streamLiveHlsUrl;

    /**
     * The URL of the live using RTMP protocol.
     * No access_token required for reading.
     * Returns url.
     */
    @JsonProperty(value = "stream_live_rtmp_url")
    private String streamLiveRtmpUrl;

    /**
     * The URL of the free preview of premium content
     * No access_token required for reading.
     * Returns url.
     */
    @JsonProperty(value = "stream_premium_preview_hls_url")
    private String streamPremiumPreviewHlsUrl;

    /**
     * The URL of the free preview of premium content
     * No access_token required for reading.
     * Returns url.
     */
    @JsonProperty(value = "stream_premium_preview_mp4_url")
    private String streamPremiumPreviewMp4Url;

    /**
     * The URL of the free preview of premium content
     * No access_token required for reading.
     * Returns url.
     */
    @JsonProperty(value = "stream_premium_preview_web_url")
    private String streamPremiumPreviewWebUrl;

    /**
     * The URL of the video source
     * No access_token required for reading.
     * Returns url.
     */
    @JsonProperty(value = "stream_source_url")
    private String streamSourceUrl;

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
     * The URL of the legacy SWF embed player (use this only to embed player into a flash movie, otherwise use ``embedUrl)
     * No access_token required for reading.
     * Returns url.
     */
    @JsonProperty(value = "swf_url")
    private String swfUrl;

    /**
     * syncAllowed
     * No access_token required for reading.
     * Returns boolean.
     */
    @JsonProperty(value = "sync_allowed")
    private boolean syncAllowed;

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
    @JsonProperty(value = "taken_time")
    private Date takenTime;

    /**
     * The URL of the video thumbnail (120px height).
     * No access_token required for reading.
     * Returns url.
     */
    @JsonProperty(value = "thumbnail_120_url")
    private String thumbnail120Url;

    /**
     * The URL of the video thumbnail (180px height).
     * No access_token required for reading.
     * Returns url.
     */
    @JsonProperty(value = "thumbnail_180_url")
    private String thumbnail180Url;

    /**
     * The URL of the video thumbnail (240px height).
     * No access_token required for reading.
     * Returns url.
     */
    @JsonProperty(value = "thumbnail_240_url")
    private String thumbnail240Url;

    /**
     * The URL of the video thumbnail (360px height).
     * No access_token required for reading.
     * Returns url.
     */
    @JsonProperty(value = "thumbnail_360_url")
    private String thumbnail360Url;

    /**
     * The URL of the video thumbnail (480px height).
     * No access_token required for reading.
     * Returns url.
     */
    @JsonProperty(value = "thumbnail_480_url")
    private String thumbnail480Url;

    /**
     * The URL of the video thumbnail (60px height).
     * No access_token required for reading.
     * Returns url.
     */
    @JsonProperty(value = "thumbnail_60_url")
    private String thumbnail60Url;

    /**
     * The URL of the video thumbnail (720px height).
     * No access_token required for reading.
     * Returns url.
     */
    @JsonProperty(value = "thumbnail_720_url")
    private String thumbnail720Url;

    /**
     * The URL of the video raw thumbnail (full size respecting ratio). Some users have the right to change this value by providing an URL to a custom thumbnail. To extract the preview from a live stream, use extract: live
     * No access_token required for reading. This field is writable.
     * Returns url.
     */
    @JsonProperty(value = "thumbnail_url")
    private String thumbnailUrl;

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
    @JsonProperty(value = "views_last_day")
    private int viewsLastDay;

    /**
     * The number of views in the last sliding hour.
     * No access_token required for reading.
     * Returns number, min value: 0.
     */
    @JsonProperty(value = "views_last_hour")
    private int viewsLastHour;

    /**
     * The number of views in the last 30 sliding days.
     * No access_token required for reading.
     * Returns number, min value: 0.
     */
    @JsonProperty(value = "views_last_month")
    private int viewsLastMonth;

    /**
     * The number of views in the last 7 sliding days.
     * No access_token required for reading.
     * Returns number, min value: 0.
     */
    @JsonProperty(value = "views_last_week")
    private int viewsLastWeek;

    /**
     * The number of views on the video since its privateation.
     * No access_token required for reading.
     * Returns number, min value: 0.
     */
    @JsonProperty(value = "views_total")
    private int viewsTotal;

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
    public String getAccessError() {
        return accessError;
    }

    /**
     * Set the Access_error
     *
     * @param accessError the Access_error to set
     */
    public void setAccessError(String accessError) {
        this.accessError = accessError;
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
     * Returns the allowComments
     *
     * @return the allowComments
     */
    public boolean isAllowComments() {
        return allowComments;
    }

    /**
     * Set the Allow_comments
     *
     * @param allowComments the Allow_comments to set
     */
    public void setAllowComments(boolean allowComments) {
        this.allowComments = allowComments;
    }

    /**
     * Returns the allowEmbed
     *
     * @return the allowEmbed
     */
    public boolean isAllowEmbed() {
        return allowEmbed;
    }

    /**
     * Set the Allow_embed
     *
     * @param allowEmbed the Allow_embed to set
     */
    public void setAllowEmbed(boolean allowEmbed) {
        this.allowEmbed = allowEmbed;
    }

    /**
     * Returns the allowedInGroups
     *
     * @return the allowedInGroups
     */
    public boolean isAllowedInGroups() {
        return allowedInGroups;
    }

    /**
     * Set the Allowed_in_groups
     *
     * @param allowedInGroups the Allowed_in_groups to set
     */
    public void setAllowedInGroups(boolean allowedInGroups) {
        this.allowedInGroups = allowedInGroups;
    }

    /**
     * Returns the allowedInPlaylists
     *
     * @return the allowedInPlaylists
     */
    public boolean isAllowedInPlaylists() {
        return allowedInPlaylists;
    }

    /**
     * Set the Allowed_in_playlists
     *
     * @param allowedInPlaylists the Allowed_in_playlists to set
     */
    public void setAllowedInPlaylists(boolean allowedInPlaylists) {
        this.allowedInPlaylists = allowedInPlaylists;
    }

    /**
     * Returns the Aspect_ratio
     *
     * @return the Aspect_ratio
     */
    public double getAspectRatio() {
        return aspectRatio;
    }

    /**
     * Set the Aspect_ratio
     *
     * @param aspectRatio the Aspect_ratio to set
     */
    public void setAspectRatio(double aspectRatio) {
        this.aspectRatio = aspectRatio;
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
    public List<Double> getAvailableFormats() {
        return availableFormats;
    }

    /**
     * Set the Available_formats
     *
     * @param availableFormats the Available_formats to set
     */
    public void setAvailableFormats(List<Double> availableFormats) {
        this.availableFormats = availableFormats;
    }

    /**
     * Returns the Bookmarks_total
     *
     * @return the Bookmarks_total
     */
    public int getBookmarksTotal() {
        return bookmarksTotal;
    }

    /**
     * Set the Bookmarks_total
     *
     * @param bookmarksTotal the Bookmarks_total to set
     */
    public void setBookmarksTotal(int bookmarksTotal) {
        this.bookmarksTotal = bookmarksTotal;
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
    public int getCommentsTotal() {
        return commentsTotal;
    }

    /**
     * Set the Comments_total
     *
     * @param commentsTotal the Comments_total to set
     */
    public void setCommentsTotal(int commentsTotal) {
        this.commentsTotal = commentsTotal;
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
    public Timestamp getCreatedAfter() {
        return createdAfter;
    }

    /**
     * Set the Created_after
     *
     * @param createdAfter the Created_after to set
     */
    public void setCreatedAfter(Timestamp createdAfter) {
        this.createdAfter = createdAfter;
    }

    /**
     * Returns the Created_before
     *
     * @return the Created_before
     */
    public Timestamp getCreatedBefore() {
        return createdBefore;
    }

    /**
     * Set the Created_before
     *
     * @param createdBefore the Created_before to set
     */
    public void setCreatedBefore(Timestamp createdBefore) {
        this.createdBefore = createdBefore;
    }

    /**
     * Returns the Created_time
     *
     * @return the Created_time
     */
    public Date getCreatedTime() {
        return this.createdTime != null ? new Date(this.createdTime.getTime()) : null;
    }

    /**
     * Set the Created_time
     *
     * @param createdTime the Created_time to set
     */
    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime != null ? new Date(createdTime.getTime()) : null;
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
    public String getEmbedHtml() {
        return embedHtml;
    }

    /**
     * Set the Embed_html
     *
     * @param embedHtml the Embed_html to set
     */
    public void setEmbedHtml(String embedHtml) {
        this.embedHtml = embedHtml;
    }

    /**
     * Returns the Embed_url
     *
     * @return the Embed_url
     */
    public String getEmbedUrl() {
        return embedUrl;
    }

    /**
     * Set the Embed_url
     *
     * @param embedUrl the Embed_url to set
     */
    public void setEmbedUrl(String embedUrl) {
        this.embedUrl = embedUrl;
    }

    /**
     * Returns the Encoding_progress
     *
     * @return the Encoding_progress
     */
    public int getEncodingProgress() {
        return encodingProgress;
    }

    /**
     * Set the Encoding_progress
     *
     * @param encodingProgress the Encoding_progress to set
     */
    public void setEncodingProgress(int encodingProgress) {
        this.encodingProgress = encodingProgress;
    }

    /**
     * Returns the End_time
     *
     * @return the End_time
     */
    public Date getEndTime() {
        return this.endTime != null ? new Date(this.endTime.getTime()) : null;
    }

    /**
     * Set the End_time
     *
     * @param endTime the End_time to set
     */
    public void setEndTime(Date endTime) {
        this.endTime = endTime != null ? new Date(endTime.getTime()) : null;
    }

    /**
     * Returns the Event_delete
     *
     * @return the Event_delete
     */
    public String getEventDelete() {
        return eventDelete;
    }

    /**
     * Set the Event_delete
     *
     * @param eventDelete the Event_delete to set
     */
    public void setEventDelete(String eventDelete) {
        this.eventDelete = eventDelete;
    }

    /**
     * Returns the Event_live_offair
     *
     * @return the Event_live_offair
     */
    public String getEventLiveOffair() {
        return eventLiveOffair;
    }

    /**
     * Set the Event_live_offair
     *
     * @param eventLiveOffair the Event_live_offair to set
     */
    public void setEventLiveOffair(String eventLiveOffair) {
        this.eventLiveOffair = eventLiveOffair;
    }

    /**
     * Returns the Event_live_onair
     *
     * @return the Event_live_onair
     */
    public String getEventLiveOnair() {
        return eventLiveOnair;
    }

    /**
     * Set the Event_live_onair
     *
     * @param eventLiveOnair the Event_live_onair to set
     */
    public void setEventLiveOnair(String eventLiveOnair) {
        this.eventLiveOnair = eventLiveOnair;
    }

    /**
     * Returns the Event_modify
     *
     * @return the Event_modify
     */
    public String getEventModify() {
        return eventModify;
    }

    /**
     * Set the Event_modify
     *
     * @param eventModify the Event_modify to set
     */
    public void setEventModify(String eventModify) {
        this.eventModify = eventModify;
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
    public String getFilmstripSmallUrl() {
        return filmstripSmallUrl;
    }

    /**
     * Set the Filmstrip_small_url
     *
     * @param filmstripSmallUrl the Filmstrip_small_url to set
     */
    public void setFilmstripSmallUrl(String filmstripSmallUrl) {
        this.filmstripSmallUrl = filmstripSmallUrl;
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
     * Returns the liveAdBreak
     *
     * @return the liveAdBreak
     */
    public boolean isLiveAdBreak() {
        return liveAdBreak;
    }

    /**
     * Set the Live_ad_break
     *
     * @param liveAdBreak the Live_ad_break to set
     */
    public void setLiveAdBreak(boolean liveAdBreak) {
        this.liveAdBreak = liveAdBreak;
    }

    /**
     * Returns the Live_frag_publish_url
     *
     * @return the Live_frag_publish_url
     */
    public String getLiveFragPublishUrl() {
        return liveFragPublishUrl;
    }

    /**
     * Set the Live_frag_publish_url
     *
     * @param liveFragPublishUrl the Live_frag_publish_url to set
     */
    public void setLiveFragPublishUrl(String liveFragPublishUrl) {
        this.liveFragPublishUrl = liveFragPublishUrl;
    }

    /**
     * Returns the Live_publish_url
     *
     * @return the Live_publish_url
     */
    public String getLivePublishUrl() {
        return livePublishUrl;
    }

    /**
     * Set the Live_publish_url
     *
     * @param livePublishUrl the Live_publish_url to set
     */
    public void setLivePublishUrl(String livePublishUrl) {
        this.livePublishUrl = livePublishUrl;
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
    public String getMetadataCreditActors() {
        return metadataCreditActors;
    }

    /**
     * Set the Metadata_credit_actors
     *
     * @param metadataCreditActors the Metadata_credit_actors to set
     */
    public void setMetadataCreditActors(String metadataCreditActors) {
        this.metadataCreditActors = metadataCreditActors;
    }

    /**
     * Returns the Metadata_credit_director
     *
     * @return the Metadata_credit_director
     */
    public String getMetadataCreditDirector() {
        return metadataCreditDirector;
    }

    /**
     * Set the Metadata_credit_director
     *
     * @param metadataCreditDirector the Metadata_credit_director to set
     */
    public void setMetadataCreditDirector(String metadataCreditDirector) {
        this.metadataCreditDirector = metadataCreditDirector;
    }

    /**
     * Returns the Metadata_genre
     *
     * @return the Metadata_genre
     */
    public String getMetadataGenre() {
        return metadataGenre;
    }

    /**
     * Set the Metadata_genre
     *
     * @param metadataGenre the Metadata_genre to set
     */
    public void setMetadataGenre(String metadataGenre) {
        this.metadataGenre = metadataGenre;
    }

    /**
     * Returns the Metadata_original_language
     *
     * @return the Metadata_original_language
     */
    public String getMetadataOriginalLanguage() {
        return metadataOriginalLanguage;
    }

    /**
     * Set the Metadata_original_language
     *
     * @param metadataOriginalLanguage the Metadata_original_language to set
     */
    public void setMetadataOriginalLanguage(String metadataOriginalLanguage) {
        this.metadataOriginalLanguage = metadataOriginalLanguage;
    }

    /**
     * Returns the Metadata_original_title
     *
     * @return the Metadata_original_title
     */
    public String getMetadataOriginalTitle() {
        return metadataOriginalTitle;
    }

    /**
     * Set the Metadata_original_title
     *
     * @param metadataOriginalTitle the Metadata_original_title to set
     */
    public void setMetadataOriginalTitle(String metadataOriginalTitle) {
        this.metadataOriginalTitle = metadataOriginalTitle;
    }

    /**
     * Returns the Metadata_released
     *
     * @return the Metadata_released
     */
    public String getMetadataReleased() {
        return metadataReleased;
    }

    /**
     * Set the Metadata_released
     *
     * @param metadataReleased the Metadata_released to set
     */
    public void setMetadataReleased(String metadataReleased) {
        this.metadataReleased = metadataReleased;
    }

    /**
     * Returns the Metadata_show_episod
     *
     * @return the Metadata_show_episod
     */
    public String getMetadataShowEpisod() {
        return metadataShowEpisod;
    }

    /**
     * Set the Metadata_show_episod
     *
     * @param metadataShowEpisod the Metadata_show_episod to set
     */
    public void setMetadataShowEpisod(String metadataShowEpisod) {
        this.metadataShowEpisod = metadataShowEpisod;
    }

    /**
     * Returns the Metadata_show_season
     *
     * @return the Metadata_show_season
     */
    public String getMetadataShowSeason() {
        return metadataShowSeason;
    }

    /**
     * Set the Metadata_show_season
     *
     * @param metadataShowSeason the Metadata_show_season to set
     */
    public void setMetadataShowSeason(String metadataShowSeason) {
        this.metadataShowSeason = metadataShowSeason;
    }

    /**
     * Returns the Metadata_visa
     *
     * @return the Metadata_visa
     */
    public String getMetadataVisa() {
        return metadataVisa;
    }

    /**
     * Set the Metadata_visa
     *
     * @param metadataVisa the Metadata_visa to set
     */
    public void setMetadataVisa(String metadataVisa) {
        this.metadataVisa = metadataVisa;
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
    public Timestamp getModifiedAfter() {
        return modifiedAfter;
    }

    /**
     * Set the Modified_after
     *
     * @param modifiedAfter the Modified_after to set
     */
    public void setModifiedAfter(Timestamp modifiedAfter) {
        this.modifiedAfter = modifiedAfter;
    }

    /**
     * Returns the Modified_before
     *
     * @return the Modified_before
     */
    public Timestamp getModifiedBefore() {
        return modifiedBefore;
    }

    /**
     * Set the Modified_before
     *
     * @param modifiedBefore the Modified_before to set
     */
    public void setModifiedBefore(Timestamp modifiedBefore) {
        this.modifiedBefore = modifiedBefore;
    }

    /**
     * Returns the Modified_time
     *
     * @return the Modified_time
     */
    public Timestamp getModifiedTime() {
        return modifiedTime;
    }

    /**
     * Set the Modified_time
     *
     * @param modifiedTime the Modified_time to set
     */
    public void setModifiedTime(Timestamp modifiedTime) {
        this.modifiedTime = modifiedTime;
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
    public String getPoster135x180Url() {
        return poster135x180Url;
    }

    /**
     * Set the Poster_135x180_url
     *
     * @param poster135x180Url the Poster_135x180_url to set
     */
    public void setPoster135x180Url(String poster135x180Url) {
        this.poster135x180Url = poster135x180Url;
    }

    /**
     * Returns the Poster_180x240_url
     *
     * @return the Poster_180x240_url
     */
    public String getPoster180x240Url() {
        return poster180x240Url;
    }

    /**
     * Set the Poster_180x240_url
     *
     * @param poster180x240Url the Poster_180x240_url to set
     */
    public void setPoster180x240Url(String poster180x240Url) {
        this.poster180x240Url = poster180x240Url;
    }

    /**
     * Returns the Poster_270x360_url
     *
     * @return the Poster_270x360_url
     */
    public String getPoster270x360Url() {
        return poster270x360Url;
    }

    /**
     * Set the Poster_270x360_url
     *
     * @param poster270x360Url the Poster_270x360_url to set
     */
    public void setPoster270x360Url(String poster270x360Url) {
        this.poster270x360Url = poster270x360Url;
    }

    /**
     * Returns the Poster_360x480_url
     *
     * @return the Poster_360x480_url
     */
    public String getPoster360x480Url() {
        return poster360x480Url;
    }

    /**
     * Set the Poster_360x480_url
     *
     * @param poster360x480Url the Poster_360x480_url to set
     */
    public void setPoster360x480Url(String poster360x480Url) {
        this.poster360x480Url = poster360x480Url;
    }

    /**
     * Returns the Poster_45x60_url
     *
     * @return the Poster_45x60_url
     */
    public String getPoster45x60Url() {
        return poster45x60Url;
    }

    /**
     * Set the Poster_45x60_url
     *
     * @param poster45x60Url the Poster_45x60_url to set
     */
    public void setPoster45x60Url(String poster45x60Url) {
        this.poster45x60Url = poster45x60Url;
    }

    /**
     * Returns the Poster_90x120_url
     *
     * @return the Poster_90x120_url
     */
    public String getPoster90x120Url() {
        return poster90x120Url;
    }

    /**
     * Set the Poster_90x120_url
     *
     * @param poster90x120Url the Poster_90x120_url to set
     */
    public void setPoster90x120Url(String poster90x120Url) {
        this.poster90x120Url = poster90x120Url;
    }

    /**
     * Returns the Poster_url
     *
     * @return the Poster_url
     */
    public String getPosterUrl() {
        return posterUrl;
    }

    /**
     * Set the Poster_url
     *
     * @param posterUrl the Poster_url to set
     */
    public void setPosterUrl(String posterUrl) {
        this.posterUrl = posterUrl;
    }

    /**
     * Returns the Price_details
     *
     * @return the Price_details
     */
    public String getPriceDetails() {
        return priceDetails;
    }

    /**
     * Set the Price_details
     *
     * @param priceDetails the Price_details to set
     */
    public void setPriceDetails(String priceDetails) {
        this.priceDetails = priceDetails;
    }

    public boolean ispRivate() {
        return pRivate;
    }

    /**
     * Set the Private_
     *
     * @param pRivate the Private_ to set
     */
    public void setpRivate(boolean pRivate) {
        this.pRivate = pRivate;
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
    public int getRatingsTotal() {
        return ratingsTotal;
    }

    /**
     * Set the Ratings_total
     *
     * @param ratingsTotal the Ratings_total to set
     */
    public void setRatingsTotal(int ratingsTotal) {
        this.ratingsTotal = ratingsTotal;
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
    public int getRentalDuration() {
        return rentalDuration;
    }

    /**
     * Set the Rental_duration
     *
     * @param rentalDuration the Rental_duration to set
     */
    public void setRentalDuration(int rentalDuration) {
        this.rentalDuration = rentalDuration;
    }

    /**
     * Returns the Rental_price
     *
     * @return the Rental_price
     */
    public float getRentalPrice() {
        return rentalPrice;
    }

    /**
     * Set the Rental_price
     *
     * @param rentalPrice the Rental_price to set
     */
    public void setRentalPrice(float rentalPrice) {
        this.rentalPrice = rentalPrice;
    }

    /**
     * Returns the Rental_price_formatted
     *
     * @return the Rental_price_formatted
     */
    public String getRentalPriceFormatted() {
        return rentalPriceFormatted;
    }

    /**
     * Set the Rental_price_formatted
     *
     * @param rentalPriceFormatted the Rental_price_formatted to set
     */
    public void setRentalPriceFormatted(String rentalPriceFormatted) {
        this.rentalPriceFormatted = rentalPriceFormatted;
    }

    /**
     * Returns the Rental_start_time
     *
     * @return the Rental_start_time
     */
    public int getRentalStartTime() {
        return rentalStartTime;
    }

    /**
     * Set the Rental_start_time
     *
     * @param rentalStartTime the Rental_start_time to set
     */
    public void setRentalStartTime(int rentalStartTime) {
        this.rentalStartTime = rentalStartTime;
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
    public String getSharingUrls() {
        return sharingUrls;
    }

    /**
     * Set the Sharing_urls
     *
     * @param sharingUrls the Sharing_urls to set
     */
    public void setSharingUrls(String sharingUrls) {
        this.sharingUrls = sharingUrls;
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
    public String getSoundtrackInfo() {
        return soundtrackInfo;
    }

    /**
     * Set the Soundtrack_info
     *
     * @param soundtrackInfo the Soundtrack_info to set
     */
    public void setSoundtrackInfo(String soundtrackInfo) {
        this.soundtrackInfo = soundtrackInfo;
    }

    /**
     * Returns the Start_time
     *
     * @return the Start_time
     */
    public Date getStartTime() {
        return this.startTime != null ? new Date(this.startTime.getTime()) : null;
    }

    /**
     * Set the Start_time
     *
     * @param startTime the Start_time to set
     */
    public void setStartTime(Date startTime) {
        this.startTime = startTime != null ? new Date(startTime.getTime()) : null;
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
    public String getStreamH264Hd1080Url() {
        return streamH264Hd1080Url;
    }

    /**
     * Set the Stream_h264_hd1080_url
     *
     * @param streamH264Hd1080Url the Stream_h264_hd1080_url to set
     */
    public void setStreamH264Hd1080Url(String streamH264Hd1080Url) {
        this.streamH264Hd1080Url = streamH264Hd1080Url;
    }

    /**
     * Returns the Stream_h264_hd_url
     *
     * @return the Stream_h264_hd_url
     */
    public String getStreamH264HdUrl() {
        return streamH264HdUrl;
    }

    /**
     * Set the Stream_h264_hd_url
     *
     * @param streamH264HdUrl the Stream_h264_hd_url to set
     */
    public void setStreamH264HdUrl(String streamH264HdUrl) {
        this.streamH264HdUrl = streamH264HdUrl;
    }

    /**
     * Returns the Stream_h264_hq_url
     *
     * @return the Stream_h264_hq_url
     */
    public String getStreamH264HqUrl() {
        return streamH264HqUrl;
    }

    /**
     * Set the Stream_h264_hq_url
     *
     * @param streamH264HqUrl the Stream_h264_hq_url to set
     */
    public void setStreamH264HqUrl(String streamH264HqUrl) {
        this.streamH264HqUrl = streamH264HqUrl;
    }

    /**
     * Returns the Stream_h264_l1_url
     *
     * @return the Stream_h264_l1_url
     */
    public String getStreamH264L1Url() {
        return streamH264L1Url;
    }

    /**
     * Set the Stream_h264_l1_url
     *
     * @param streamH264L1Url the Stream_h264_l1_url to set
     */
    public void setStreamH264L1Url(String streamH264L1Url) {
        this.streamH264L1Url = streamH264L1Url;
    }

    /**
     * Returns the Stream_h264_l2_url
     *
     * @return the Stream_h264_l2_url
     */
    public String getStreamH264L2Url() {
        return streamH264L2Url;
    }

    /**
     * Set the Stream_h264_l2_url
     *
     * @param streamH264L2Url the Stream_h264_l2_url to set
     */
    public void setStreamH264L2Url(String streamH264L2Url) {
        this.streamH264L2Url = streamH264L2Url;
    }

    /**
     * Returns the Stream_h264_ld_url
     *
     * @return the Stream_h264_ld_url
     */
    public String getStreamH264LdUrl() {
        return streamH264LdUrl;
    }

    /**
     * Set the Stream_h264_ld_url
     *
     * @param streamH264LdUrl the Stream_h264_ld_url to set
     */
    public void setStreamH264LdUrl(String streamH264LdUrl) {
        this.streamH264LdUrl = streamH264LdUrl;
    }

    /**
     * Returns the Stream_h264_url
     *
     * @return the Stream_h264_url
     */
    public String getStreamH264Url() {
        return streamH264Url;
    }

    /**
     * Set the Stream_h264_url
     *
     * @param streamH264Url the Stream_h264_url to set
     */
    public void setStreamH264Url(String streamH264Url) {
        this.streamH264Url = streamH264Url;
    }

    /**
     * Returns the Stream_hls_url
     *
     * @return the Stream_hls_url
     */
    public String getStreamHlsUrl() {
        return streamHlsUrl;
    }

    /**
     * Set the Stream_hls_url
     *
     * @param streamHlsUrl the Stream_hls_url to set
     */
    public void setStreamHlsUrl(String streamHlsUrl) {
        this.streamHlsUrl = streamHlsUrl;
    }

    /**
     * Returns the Stream_live_hds_url
     *
     * @return the Stream_live_hds_url
     */
    public String getStreamLiveHdsUrl() {
        return streamLiveHdsUrl;
    }

    /**
     * Set the Stream_live_hds_url
     *
     * @param streamLiveHdsUrl the Stream_live_hds_url to set
     */
    public void setStreamLiveHdsUrl(String streamLiveHdsUrl) {
        this.streamLiveHdsUrl = streamLiveHdsUrl;
    }

    /**
     * Returns the Stream_live_hls_url
     *
     * @return the Stream_live_hls_url
     */
    public String getStreamLiveHlsUrl() {
        return streamLiveHlsUrl;
    }

    /**
     * Set the Stream_live_hls_url
     *
     * @param streamLiveHlsUrl the Stream_live_hls_url to set
     */
    public void setStreamLiveHlsUrl(String streamLiveHlsUrl) {
        this.streamLiveHlsUrl = streamLiveHlsUrl;
    }

    /**
     * Returns the Stream_live_rtmp_url
     *
     * @return the Stream_live_rtmp_url
     */
    public String getStreamLiveRtmpUrl() {
        return streamLiveRtmpUrl;
    }

    /**
     * Set the Stream_live_rtmp_url
     *
     * @param streamLiveRtmpUrl the Stream_live_rtmp_url to set
     */
    public void setStreamLiveRtmpUrl(String streamLiveRtmpUrl) {
        this.streamLiveRtmpUrl = streamLiveRtmpUrl;
    }

    /**
     * Returns the Stream_premium_preview_hls_url
     *
     * @return the Stream_premium_preview_hls_url
     */
    public String getStreamPremiumPreviewHlsUrl() {
        return streamPremiumPreviewHlsUrl;
    }

    /**
     * Set the Stream_premium_preview_hls_url
     *
     * @param streamPremiumPreviewHlsUrl the Stream_premium_preview_hls_url to set
     */
    public void setStreamPremiumPreviewHlsUrl(String streamPremiumPreviewHlsUrl) {
        this.streamPremiumPreviewHlsUrl = streamPremiumPreviewHlsUrl;
    }

    /**
     * Returns the Stream_premium_preview_mp4_url
     *
     * @return the Stream_premium_preview_mp4_url
     */
    public String getStreamPremiumPreviewMp4Url() {
        return streamPremiumPreviewMp4Url;
    }

    /**
     * Set the Stream_premium_preview_mp4_url
     *
     * @param streamPremiumPreviewMp4Url the Stream_premium_preview_mp4_url to set
     */
    public void setStreamPremiumPreviewMp4Url(String streamPremiumPreviewMp4Url) {
        this.streamPremiumPreviewMp4Url = streamPremiumPreviewMp4Url;
    }

    /**
     * Returns the Stream_premium_preview_web_url
     *
     * @return the Stream_premium_preview_web_url
     */
    public String getStreamPremiumPreviewWebUrl() {
        return streamPremiumPreviewWebUrl;
    }

    /**
     * Set the Stream_premium_preview_web_url
     *
     * @param streamPremiumPreviewWebUrl the Stream_premium_preview_web_url to set
     */
    public void setStreamPremiumPreviewWebUrl(String streamPremiumPreviewWebUrl) {
        this.streamPremiumPreviewWebUrl = streamPremiumPreviewWebUrl;
    }

    /**
     * Returns the Stream_source_url
     *
     * @return the Stream_source_url
     */
    public String getStreamSourceUrl() {
        return streamSourceUrl;
    }

    /**
     * Set the Stream_source_url
     *
     * @param streamSourceUrl the Stream_source_url to set
     */
    public void setStreamSourceUrl(String streamSourceUrl) {
        this.streamSourceUrl = streamSourceUrl;
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
    public String getSwfUrl() {
        return swfUrl;
    }

    /**
     * Set the Swf_url
     *
     * @param swfUrl the Swf_url to set
     */
    public void setSwfUrl(String swfUrl) {
        this.swfUrl = swfUrl;
    }

    public boolean isSyncAllowed() {
        return syncAllowed;
    }

    /**
     * Set the Sync_allowed
     *
     * @param syncAllowed the Sync_allowed to set
     */
    public void setSyncAllowed(boolean syncAllowed) {
        this.syncAllowed = syncAllowed;
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
    public Date getTakenTime() {
        return this.takenTime != null ? new Date(this.takenTime.getTime()) : null;
    }

    /**
     * Set the Taken_time
     *
     * @param takenTime the Taken_time to set
     */
    public void setTakenTime(Date takenTime) {
        this.takenTime = takenTime != null ? new Date(takenTime.getTime()) : null;
    }

    /**
     * Returns the Thumbnail_120_url
     *
     * @return the Thumbnail_120_url
     */
    public String getThumbnail120Url() {
        return thumbnail120Url;
    }

    /**
     * Set the Thumbnail_120_url
     *
     * @param thumbnail120Url the Thumbnail_120_url to set
     */
    public void setThumbnail120Url(String thumbnail120Url) {
        this.thumbnail120Url = thumbnail120Url;
    }

    /**
     * Returns the Thumbnail_180_url
     *
     * @return the Thumbnail_180_url
     */
    public String getThumbnail180Url() {
        return thumbnail180Url;
    }

    /**
     * Set the Thumbnail_180_url
     *
     * @param thumbnail180Url the Thumbnail_180_url to set
     */
    public void setThumbnail180Url(String thumbnail180Url) {
        this.thumbnail180Url = thumbnail180Url;
    }

    /**
     * Returns the Thumbnail_240_url
     *
     * @return the Thumbnail_240_url
     */
    public String getThumbnail240Url() {
        return thumbnail240Url;
    }

    /**
     * Set the Thumbnail_240_url
     *
     * @param thumbnail240Url the Thumbnail_240_url to set
     */
    public void setThumbnail240Url(String thumbnail240Url) {
        this.thumbnail240Url = thumbnail240Url;
    }

    /**
     * Returns the Thumbnail_360_url
     *
     * @return the Thumbnail_360_url
     */
    public String getThumbnail360Url() {
        return thumbnail360Url;
    }

    /**
     * Set the Thumbnail_360_url
     *
     * @param thumbnail360Url the Thumbnail_360_url to set
     */
    public void setThumbnail360Url(String thumbnail360Url) {
        this.thumbnail360Url = thumbnail360Url;
    }

    /**
     * Returns the Thumbnail_480_url
     *
     * @return the Thumbnail_480_url
     */
    public String getThumbnail480Url() {
        return thumbnail480Url;
    }

    /**
     * Set the Thumbnail_480_url
     *
     * @param thumbnail480Url the Thumbnail_480_url to set
     */
    public void setThumbnail480Url(String thumbnail480Url) {
        this.thumbnail480Url = thumbnail480Url;
    }

    /**
     * Returns the Thumbnail_60_url
     *
     * @return the Thumbnail_60_url
     */
    public String getThumbnail60Url() {
        return thumbnail60Url;
    }

    /**
     * Set the Thumbnail_60_url
     *
     * @param thumbnail60Url the Thumbnail_60_url to set
     */
    public void setThumbnail60Url(String thumbnail60Url) {
        this.thumbnail60Url = thumbnail60Url;
    }

    /**
     * Returns the Thumbnail_720_url
     *
     * @return the Thumbnail_720_url
     */
    public String getThumbnail720Url() {
        return thumbnail720Url;
    }

    /**
     * Set the Thumbnail_720_url
     *
     * @param thumbnail720Url the Thumbnail_720_url to set
     */
    public void setThumbnail720Url(String thumbnail720Url) {
        this.thumbnail720Url = thumbnail720Url;
    }

    /**
     * Returns the Thumbnail_url
     *
     * @return the Thumbnail_url
     */
    public String getThumbnailUrl() {
        return thumbnailUrl;
    }

    /**
     * Set the Thumbnail_url
     *
     * @param thumbnailUrl the Thumbnail_url to set
     */
    public void setThumbnailUrl(String thumbnailUrl) {
        this.thumbnailUrl = thumbnailUrl;
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
    public int getViewsLastDay() {
        return viewsLastDay;
    }

    /**
     * Set the Views_last_day
     *
     * @param viewsLastDay the Views_last_day to set
     */
    public void setViewsLastDay(int viewsLastDay) {
        this.viewsLastDay = viewsLastDay;
    }

    /**
     * Returns the Views_last_hour
     *
     * @return the Views_last_hour
     */
    public int getViewsLastHour() {
        return viewsLastHour;
    }

    /**
     * Set the Views_last_hour
     *
     * @param viewsLastHour the Views_last_hour to set
     */
    public void setViewsLastHour(int viewsLastHour) {
        this.viewsLastHour = viewsLastHour;
    }

    /**
     * Returns the Views_last_month
     *
     * @return the Views_last_month
     */
    public int getViewsLastMonth() {
        return viewsLastMonth;
    }

    /**
     * Set the Views_last_month
     *
     * @param viewsLastMonth the Views_last_month to set
     */
    public void setViewsLastMonth(int viewsLastMonth) {
        this.viewsLastMonth = viewsLastMonth;
    }

    /**
     * Returns the Views_last_week
     *
     * @return the Views_last_week
     */
    public int getViewsLastWeek() {
        return viewsLastWeek;
    }

    /**
     * Set the Views_last_week
     *
     * @param viewsLastWeek the Views_last_week to set
     */
    public void setViewsLastWeek(int viewsLastWeek) {
        this.viewsLastWeek = viewsLastWeek;
    }

    /**
     * Returns the Views_total
     *
     * @return the Views_total
     */
    public int getViewsTotal() {
        return viewsTotal;
    }

    /**
     * Set the Views_total
     *
     * @param viewsTotal the Views_total to set
     */
    public void setViewsTotal(int viewsTotal) {
        this.viewsTotal = viewsTotal;
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
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Video video = (Video) o;

        if (id != null ? !id.equals(video.id) : video.id != null) {
            return false;
        }

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
