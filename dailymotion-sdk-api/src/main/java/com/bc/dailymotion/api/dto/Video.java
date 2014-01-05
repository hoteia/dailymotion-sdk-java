package com.bc.dailymotion.api.dto;

import java.security.Timestamp;
import java.util.Date;
import java.util.List;

/**
 * Created by Bastien on 04/01/2014.
 */
public class Video {

    boolean threeD; //	A boolean indicating that the video is in 3D format (true) or not (false).	No access_token required for reading.	Returns boolean.
    String access_error; //	An error message explaining why the access to the video can’t be granted.	No access_token required for reading.	Returns dict, min size: 1, max size: 150.
    boolean ads; //	Defines is video accepts associated ads	No access_token required for reading.	Returns boolean.
    boolean allow_comments;//	If true, allows comments to be posted on this video.	No access_token required for reading. This field is writable.	Returns boolean.
    boolean allow_embed;//	Tell if the video can be embeded outside of Dailymotion	No access_token required for reading.	Returns boolean.
    boolean allowed_in_groups;//	is it possible to add this video to groups	No access_token required for reading. This field is writable.	Returns boolean.
    boolean allowed_in_playlists;//	is it possible to add this video to playlists	No access_token required for reading. This field is writable.	Returns boolean.
    double aspect_ratio;//	The aspect ratio of the video frame (i.e.: 1.33333 for 4/3, 1.77777 for 16/9...).	No access_token required for reading.	Returns number, min value: 0.
    int audience;//	The current audience for a live event from the audience meter. Null if audience shouldn’t be accounted.	No access_token required for reading.	Returns number, min value: 0.
    List<Double> available_formats;//	The video available formats	No access_token required for reading.	Returns array, min size: 1, max size: 150.
    int bookmarks_total;//	The total number of times a video has been added to users’ favorites.	No access_token required for reading.	Returns number, min value: 0.
    boolean broadcasting;//	True if the live is publicly available.	No access_token required for reading. This field is writable.	Returns boolean.
    Channel channel;//	The short channel name of the video.	This field can be used as filter. No access_token required for reading. This field is writable.	Return a channel. You can request sub-fields by using channel.<sub-field> notation.
    int comments_total;//	The total number of comments on the video.	No access_token required for reading.	Returns number, min value: 0.
    String country;//	The country of the video (declarative, may be null).	This field can be used as filter. No access_token required for reading. This field is writable.	Returns string, min size: 1, max size: 150.
    Timestamp created_after;//	Limit the result set to videos created after a specific timestamp	This field can be used as filter but can’t be read nor written.	Returns date.
    Timestamp created_before;//	Limit the result set to videos created before a specific timestamp	This field can be used as filter but can’t be read nor written.	Returns date.
    Date created_time;//	The date the video was uploaded to the site.	No access_token required for reading.	Returns date.
    String description;//	The description of the video.	No access_token required for reading. This field is writable.	Returns string, min size: 1, max size: 2000.
    int duration;//	The duration of the video in seconds.	No access_token required for reading.	Returns number, min value: 0.
    String embed_html;//	The HTML embed code.	No access_token required for reading.	Returns string, min size: 1, max size: 150.
    String embed_url;//	The URL to embed the video.	No access_token required for reading.	Returns url.
    int encoding_progress;//	When the video status is processing, this parameter indicates a number between 0 and 100 corresponding to the percentage of encoding already completed. For other statuses this parameter is -1.	No access_token required for reading.	Returns number, min value: -1, max value: 100.
    Date end_time;//	the end date of the stream	No access_token required for reading. This field is writable.	Returns date.
    String event_delete;//	The name of pushd event sent on video deletion	No access_token required for reading.	Returns string, min size: 1, max size: 150.
    String event_live_offair;//	The name of pushd event sent on video deletion	No access_token required for reading.	Returns string, min size: 1, max size: 150.
    String event_live_onair;//	The name of pushd event sent on video modification	No access_token required for reading.	Returns string, min size: 1, max size: 150.
    String event_modify;//	The name of pushd event sent on video modification	No access_token required for reading.	Returns string, min size: 1, max size: 150.
    boolean explicit;//	True if the video is explicit.	No access_token required for reading. This field is writable.	Returns boolean.
    String filmstrip_small_url;//	returns sprite url of snapshot of the video if it exists	No access_token required for reading.	Returns url.
    String filters;//	A list of filters available to reduce the result set.	This field can be used as filter but can’t be read nor written.	Returns array, allowed values: featured, hd, official, creative, creative-official, ugc, buzz, buzz-premium, 3d, live, all-live, live-upcoming, no-live, premium, premium-paidvideos, premium-offers, no-premium, quicklist, history, with-poster, without-poster, what-to-watch.
    String genre;//	genre extended data	No access_token required for reading. This field is writable.	Returns string, min size: 1, max size: 150.
    List<String> geoblocking;//	A list of countries where the video is or isn’t accessible. The list of countries start with the “deny” or “allow” keyword to define if this is a black or a whitelist. Examples: [“fr”, “us”, “it”] or [“allow”, “fr”, “us”, “it”] will both allow the video to be accessed in France, US and Italy and deny all other countries. [“deny”, “us”] will deny the access to the video from the US and allow it everywhere else. An empty list or [“allow”] (the default) will allow it from everywhere.	No access_token required for reading.	Returns array, min size: 1, max size: 150.
    List<Double> geoloc;//	Geolocalization for the video. Result is an array with the longitude and latitude using point notation. Longitude range is from -180.0 (West) to 180.0 (East). Latitude range is from -90.0 (South) to 90.0 (North). Example: [-122.4006, 37.7821]	No access_token required for reading. This field is writable.	Returns array, min size: 1, max size: 150.
    String id;//	The video object ID	No access_token required for reading.	Returns the object id.
    String ids;//	Limit the result to a specified list of video ids.	This field can be used as filter but can’t be read nor written.	Returns array, min size: 1, max size: 150.
    String isrc;//	The detected ISRC (International Standard Recording Code) of the soundtrack	No access_token required for reading.	Returns string, min size: 1, max size: 150.
    String language;//	The language of the video (declarative).	This field can be used as filter. No access_token required for reading. This field is writable.	Returns string, min size: 1, max size: 150.
    boolean live_ad_break;//	True if the user can launch an ads break for this live stream	manage_videos scope required for reading. manage_videos scope required for writing.	Returns boolean.
    String live_frag_publish_url;//	The URL to publish fragmented live stream on (current logged user need to own the video in order to retrieve this field)	No access_token required for reading.	Returns url.
    String live_publish_url;//	The URL to publish live source stream on (current logged user need to own the video in order to retrieve this field)	No access_token required for reading.	Returns url.
    List<String> mediablocking;//	The list of blocking rules per country and device to be applied on the video. Each rule has the following format : country/[country code]/media/[media id] Available country codes are : ar, at, br, ca, ch, cn, de, dk, es, fr, gb, gr, ie, in, it, js, jp, kr, mx, nl, pl, pr, pt, ro, ru, se, tr, us, other. Available medias id are : iptv, mobile, tvhz, web, other.	No access_token required for reading.	Returns array, min size: 1, max size: 150.
    String metadata_credit_actors;//	actors playing in the movie	No access_token required for reading. This field is writable.	Returns string, min size: 1, max size: 150.
    String metadata_credit_director;//	director of the movie	No access_token required for reading. This field is writable.	Returns string, min size: 1, max size: 150.
    String metadata_genre;//	Genre of the video	No access_token required for reading. This field is writable.	Returns string, allowed values: drama, comedy, realitytelevision, animation, documentary, sitcom, gameshow, sciencefiction, talkshow, fantasy, action, anime, adventure, soapopera, miniseries, news, crimefiction, romance, sports, variety, thriller, music.
    String metadata_original_language;//	Original language (ISO 3166) of the video	No access_token required for reading. This field is writable.	Returns string, min size: 1, max size: 150.
    String metadata_original_title;//	Original title of the video	No access_token required for reading. This field is writable.	Returns string, min size: 1, max size: 150.
    String metadata_released;//	Date (RFC 822) of release or production	No access_token required for reading. This field is writable.	Returns string, min size: 1, max size: 150.
    String metadata_show_episod;//e	show episode number/name	No access_token required for reading. This field is writable.	Returns string, min size: 1, max size: 150.
    String metadata_show_season;//	show season number/name	No access_token required for reading. This field is writable.	Returns string, min size: 1, max size: 150.
    String metadata_visa;//	Visa number	No access_token required for reading. This field is writable.	Returns string, min size: 1, max size: 150.
    String mode;//	The stream mode, can be vod, simulcast or live.	No access_token required for reading. This field is writable.	Returns string, allowed values: vod, simulcast, live.
    boolean moderated;//	True if the live is moderated.	No access_token required for reading.	Returns boolean.
    Timestamp modified_after;//	Limit the result set to videos modified after a specific timestamp	This field can be used as filter but can’t be read nor written.	Returns date.
    Timestamp modified_before;//	Limit the result set to videos modified before a specific timestamp	This field can be used as filter but can’t be read nor written.	Returns date.
    Timestamp modified_time;//	The date the video was last modified.	No access_token required for reading.	Returns date.
    String muyap;//	The detected MUYAP (Turkish Phonographic Industry Society Identifier) of the soundtrack	No access_token required for reading.	Returns string, min size: 1, max size: 150.
    boolean onair;//	True if the video is in mode live and currently airing.	No access_token required for reading.	Returns boolean.
    User owner;//	The id of the owner of the video (use owner.screenname to show the user name).	This field can be used as filter. No access_token required for reading.	Return a user. You can request sub-fields by using owner.<sub-field> notation.
    boolean paywall;//	True is the access to the video is subject to conditions	No access_token required for reading.	Returns boolean.
    boolean poster;//	True if the video has a poster	No access_token required for reading.	Returns boolean.
    String poster_135x180_url;//	The URL of the video poster (135x180).	No access_token required for reading.	Returns url.
    String poster_180x240_url;//	The URL of the video poster (180x240).	No access_token required for reading.	Returns url.
    String poster_270x360_url;//	The URL of the video poster (270x360).	No access_token required for reading.	Returns url.
    String poster_360x480_url;//	The URL of the video poster (360x480).	No access_token required for reading.	Returns url.
    String poster_45x60_url;//	The URL of the video poster (45x60).	No access_token required for reading.	Returns url.
    String poster_90x120_url;//	The URL of the video poster (95x120).	No access_token required for reading.	Returns url.
    String poster_url;//	The URL of the video poster (540x720).	No access_token required for reading.	Returns url.
    String price_details;//	The price and duration for a tvod or svod video	No access_token required for reading.	Returns string, min size: 1, max size: 150.
    boolean private_;//	True if the video is private.	This field can be used as filter. No access_token required for reading. This field is writable.	Returns boolean.
    boolean published;//	True if the video is published (may still wait for encoding, see status field for more info).	No access_token required for reading. This field is writable.	Returns boolean.
    float rating;//	The average number of stars the video has (float between 0 and 5).	No access_token required for reading.	Returns number, min value: 0, max value: 5.
    int ratings_total;//	The number of users who voted for the video.	No access_token required for reading.	Returns number, min value: 0.
    String recurrence;//	The recurrence of the stream	No access_token required for reading.	Returns string, allowed values: once, daily, weekly.
    int rental_duration;//	The standard rental duration of the video in hours. Will be null if the video is not behind a paywall	No access_token required for reading. This field is writable.	Returns string, allowed values: 3, 24, 48.
    float rental_price;//	The price as float in the current currency. Will be null if the video is not behind a paywall. See currency field of the /locale endpoint to get the current currency.	No access_token required for reading. This field is writable.	Returns string, min size: 1, max size: 150.
    String rental_price_formatted;//	The price, formatted with currency according to the request localization. Will be null if the video is not behind a paywall	No access_token required for reading.	Returns string, min size: 1, max size: 150.
    int rental_start_time;//	Timelapse of video free preview, in seconds	No access_token required for reading. This field is writable.	Returns number, min value: 0.
    String search;//	Full text search for videos	This field can be used as filter but can’t be read nor written.	Returns string, min size: 1, max size: 150.
    String sharing_urls;//	urls to share content in social networks	No access_token required for reading.	Returns dict, min size: 1, max size: 150.
    String sort;//	Change result ordering	This field can be used as filter but can’t be read nor written.	Returns string, allowed values: recent, visited, visited-hour, visited-today, visited-week, visited-month, commented, commented-hour, commented-today, commented-week, commented-month, rated, rated-hour, rated-today, rated-week, rated-month, relevance, random, ranking.
    String soundtrack_info;//	Get available information about the soundtrack	No access_token required for reading.	Returns dict, min size: 1, max size: 150.
    Date start_time;//	The started time of the stream	No access_token required for reading. This field is writable.	Returns date.
    String status;//	The state of the video. A video requires the published status to be watchable.	No access_token required for reading.	Returns string, allowed values: waiting, processing, ready, published, rejected, deleted, encoding_error.
    String stream_h264_hd1080_url;//	The URL of the full HD format (1080p, 3Mbps).	No access_token required for reading.	Returns url.
    String stream_h264_hd_url;//	The URL of the high definition video (720p, 1.6Mbps).	No access_token required for reading.	Returns url.
    String stream_h264_hq_url;//	The URL of the high quality video (480p, 975kbps).	No access_token required for reading.	Returns url.
    String stream_h264_l1_url;//	The URL of the very low definition, low bandwidth video stream (144p, 60kbps).	No access_token required for reading.	Returns url.
    String stream_h264_l2_url;//	The URL of the very low definition, higher bandwidth video stream (144p, 105kbps).	No access_token required for reading.	Returns url.
    String stream_h264_ld_url;//	The URL of the low definition video stream (240p, 255kbps).	No access_token required for reading.	Returns url.
    String stream_h264_url;//	The URL of the medium quality video (380p, 520kbps).	No access_token required for reading.	Returns url.
    String stream_hls_url;//	The URL of the adaptative bitrate manifest using Apple HTTP Live Streaming protocol.	No access_token required for reading.	Returns url.
    String stream_live_hds_url;//	The URL of the live using HTTP Dynamic Streaming protocol.	No access_token required for reading.	Returns url.
    String stream_live_hls_url;//	The URL of the live using HTTP Live Streaming protocol.	No access_token required for reading.	Returns url.
    String stream_live_rtmp_url;//	The URL of the live using RTMP protocol.	No access_token required for reading.	Returns url.
    String stream_premium_preview_hls_url;//	The URL of the free preview of premium content	No access_token required for reading.	Returns url.
    String stream_premium_preview_mp4_url;//	The URL of the free preview of premium content	No access_token required for reading.	Returns url.
    String stream_premium_preview_web_url;//	The URL of the free preview of premium content	No access_token required for reading.	Returns url.
    String stream_source_url;//	The URL of the video source	No access_token required for reading.	Returns url.
    List<Strongtag> strongtags;//	The list of strong tags for the video.	This field can be used as filter. No access_token required for reading.	Returns array, min size: 1, max size: 150.
    boolean svod;//	True if the video is behind svod paywall	No access_token required for reading.	Returns boolean.
    String swf_url;//	The URL of the legacy SWF embed player (use this only to embed player into a flash movie, otherwise use ``embed_url)	No access_token required for reading.	Returns url.
    boolean sync_allowed;//	sync_allowed	No access_token required for reading.	Returns boolean.
    List<String> tags;//	The list of tags for the video.	This field can be used as filter. No access_token required for reading. This field is writable.	Returns array, min size: 1, max size: 150.
    Date taken_time;//	The date the video was taken (declarative).	No access_token required for reading. This field is writable.	Returns date.
    String thumbnail_120_url;//	The URL of the video thumbnail (120px height).	No access_token required for reading.	Returns url.
    String thumbnail_180_url;//	The URL of the video thumbnail (180px height).	No access_token required for reading.	Returns url.
    String thumbnail_240_url;//	The URL of the video thumbnail (240px height).	No access_token required for reading.	Returns url.
    String thumbnail_360_url;//	The URL of the video thumbnail (360px height).	No access_token required for reading.	Returns url.
    String thumbnail_480_url;//	The URL of the video thumbnail (480px height).	No access_token required for reading.	Returns url.
    String thumbnail_60_url;//	The URL of the video thumbnail (60px height).	No access_token required for reading.	Returns url.
    String thumbnail_720_url;//	The URL of the video thumbnail (720px height).	No access_token required for reading.	Returns url.
    String thumbnail_url;//	The URL of the video raw thumbnail (full size respecting ratio). Some users have the right to change this value by providing an URL to a custom thumbnail. To extract the preview from a live stream, use extract://live	No access_token required for reading. This field is writable.	Returns url.
    String title;//	The title of the video.	No access_token required for reading. This field is writable.	Returns string, min size: 1, max size: 255.
    boolean tvod;//	True if the video is begind tvod paywall	No access_token required for reading.	Returns boolean.
    String type;//	The content type of the video (can be official, creative or null).	No access_token required for reading. This field is writable.	Returns string, allowed values: ugc, creative, official.
    String upc;//	The detected UPC (Universal Product Code) of the soundtrack	No access_token required for reading.	Returns string, min size: 1, max size: 150.
    String url;//	The URL of the video on Dailymotion site. Writing this parameter defines where to download the video source. You may either use this parameter at video creation time or change this parameter later if you want to change the source video afterward. To change an existing video, the authenticated user may need some additional rights like motionmaker right. When replacing an existing source, the video will put offline for some minute during the re-encoding. You may use the GET /file/upload API ressource to upload a video file and create a URL to provide to this method or use an existing URL pointing to a video file. Writing to this parameter is subject to rate limiting.	No access_token required for reading. This field is writable.	Returns url.
    int views_last_day;//	The number of views in the last 24 sliding hours.	No access_token required for reading.	Returns number, min value: 0.
    int views_last_hour;//	The number of views in the last sliding hour.	No access_token required for reading.	Returns number, min value: 0.
    int views_last_month;//	The number of views in the last 30 sliding days.	No access_token required for reading.	Returns number, min value: 0.
    int views_last_week;//	The number of views in the last 7 sliding days.	No access_token required for reading.	Returns number, min value: 0.
    int views_total;//	The number of views on the video since its publication.	No access_token required for reading.	Returns number, min value: 0.

}
