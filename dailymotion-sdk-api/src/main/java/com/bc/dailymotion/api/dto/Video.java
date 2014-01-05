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

    public boolean isThreeD() {
        return threeD;
    }

    public void setThreeD(boolean threeD) {
        this.threeD = threeD;
    }

    public String getAccess_error() {
        return access_error;
    }

    public void setAccess_error(String access_error) {
        this.access_error = access_error;
    }

    public boolean isAds() {
        return ads;
    }

    public void setAds(boolean ads) {
        this.ads = ads;
    }

    public boolean isAllow_comments() {
        return allow_comments;
    }

    public void setAllow_comments(boolean allow_comments) {
        this.allow_comments = allow_comments;
    }

    public boolean isAllow_embed() {
        return allow_embed;
    }

    public void setAllow_embed(boolean allow_embed) {
        this.allow_embed = allow_embed;
    }

    public boolean isAllowed_in_groups() {
        return allowed_in_groups;
    }

    public void setAllowed_in_groups(boolean allowed_in_groups) {
        this.allowed_in_groups = allowed_in_groups;
    }

    public boolean isAllowed_in_playlists() {
        return allowed_in_playlists;
    }

    public void setAllowed_in_playlists(boolean allowed_in_playlists) {
        this.allowed_in_playlists = allowed_in_playlists;
    }

    public double getAspect_ratio() {
        return aspect_ratio;
    }

    public void setAspect_ratio(double aspect_ratio) {
        this.aspect_ratio = aspect_ratio;
    }

    public int getAudience() {
        return audience;
    }

    public void setAudience(int audience) {
        this.audience = audience;
    }

    public List<Double> getAvailable_formats() {
        return available_formats;
    }

    public void setAvailable_formats(List<Double> available_formats) {
        this.available_formats = available_formats;
    }

    public int getBookmarks_total() {
        return bookmarks_total;
    }

    public void setBookmarks_total(int bookmarks_total) {
        this.bookmarks_total = bookmarks_total;
    }

    public boolean isBroadcasting() {
        return broadcasting;
    }

    public void setBroadcasting(boolean broadcasting) {
        this.broadcasting = broadcasting;
    }

    public Channel getChannel() {
        return channel;
    }

    public void setChannel(Channel channel) {
        this.channel = channel;
    }

    public int getComments_total() {
        return comments_total;
    }

    public void setComments_total(int comments_total) {
        this.comments_total = comments_total;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Timestamp getCreated_after() {
        return created_after;
    }

    public void setCreated_after(Timestamp created_after) {
        this.created_after = created_after;
    }

    public Timestamp getCreated_before() {
        return created_before;
    }

    public void setCreated_before(Timestamp created_before) {
        this.created_before = created_before;
    }

    public Date getCreated_time() {
        return created_time;
    }

    public void setCreated_time(Date created_time) {
        this.created_time = created_time;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getEmbed_html() {
        return embed_html;
    }

    public void setEmbed_html(String embed_html) {
        this.embed_html = embed_html;
    }

    public String getEmbed_url() {
        return embed_url;
    }

    public void setEmbed_url(String embed_url) {
        this.embed_url = embed_url;
    }

    public int getEncoding_progress() {
        return encoding_progress;
    }

    public void setEncoding_progress(int encoding_progress) {
        this.encoding_progress = encoding_progress;
    }

    public Date getEnd_time() {
        return end_time;
    }

    public void setEnd_time(Date end_time) {
        this.end_time = end_time;
    }

    public String getEvent_delete() {
        return event_delete;
    }

    public void setEvent_delete(String event_delete) {
        this.event_delete = event_delete;
    }

    public String getEvent_live_offair() {
        return event_live_offair;
    }

    public void setEvent_live_offair(String event_live_offair) {
        this.event_live_offair = event_live_offair;
    }

    public String getEvent_live_onair() {
        return event_live_onair;
    }

    public void setEvent_live_onair(String event_live_onair) {
        this.event_live_onair = event_live_onair;
    }

    public String getEvent_modify() {
        return event_modify;
    }

    public void setEvent_modify(String event_modify) {
        this.event_modify = event_modify;
    }

    public boolean isExplicit() {
        return explicit;
    }

    public void setExplicit(boolean explicit) {
        this.explicit = explicit;
    }

    public String getFilmstrip_small_url() {
        return filmstrip_small_url;
    }

    public void setFilmstrip_small_url(String filmstrip_small_url) {
        this.filmstrip_small_url = filmstrip_small_url;
    }

    public String getFilters() {
        return filters;
    }

    public void setFilters(String filters) {
        this.filters = filters;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public List<String> getGeoblocking() {
        return geoblocking;
    }

    public void setGeoblocking(List<String> geoblocking) {
        this.geoblocking = geoblocking;
    }

    public List<Double> getGeoloc() {
        return geoloc;
    }

    public void setGeoloc(List<Double> geoloc) {
        this.geoloc = geoloc;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIds() {
        return ids;
    }

    public void setIds(String ids) {
        this.ids = ids;
    }

    public String getIsrc() {
        return isrc;
    }

    public void setIsrc(String isrc) {
        this.isrc = isrc;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public boolean isLive_ad_break() {
        return live_ad_break;
    }

    public void setLive_ad_break(boolean live_ad_break) {
        this.live_ad_break = live_ad_break;
    }

    public String getLive_frag_publish_url() {
        return live_frag_publish_url;
    }

    public void setLive_frag_publish_url(String live_frag_publish_url) {
        this.live_frag_publish_url = live_frag_publish_url;
    }

    public String getLive_publish_url() {
        return live_publish_url;
    }

    public void setLive_publish_url(String live_publish_url) {
        this.live_publish_url = live_publish_url;
    }

    public List<String> getMediablocking() {
        return mediablocking;
    }

    public void setMediablocking(List<String> mediablocking) {
        this.mediablocking = mediablocking;
    }

    public String getMetadata_credit_actors() {
        return metadata_credit_actors;
    }

    public void setMetadata_credit_actors(String metadata_credit_actors) {
        this.metadata_credit_actors = metadata_credit_actors;
    }

    public String getMetadata_credit_director() {
        return metadata_credit_director;
    }

    public void setMetadata_credit_director(String metadata_credit_director) {
        this.metadata_credit_director = metadata_credit_director;
    }

    public String getMetadata_genre() {
        return metadata_genre;
    }

    public void setMetadata_genre(String metadata_genre) {
        this.metadata_genre = metadata_genre;
    }

    public String getMetadata_original_language() {
        return metadata_original_language;
    }

    public void setMetadata_original_language(String metadata_original_language) {
        this.metadata_original_language = metadata_original_language;
    }

    public String getMetadata_original_title() {
        return metadata_original_title;
    }

    public void setMetadata_original_title(String metadata_original_title) {
        this.metadata_original_title = metadata_original_title;
    }

    public String getMetadata_released() {
        return metadata_released;
    }

    public void setMetadata_released(String metadata_released) {
        this.metadata_released = metadata_released;
    }

    public String getMetadata_show_episod() {
        return metadata_show_episod;
    }

    public void setMetadata_show_episod(String metadata_show_episod) {
        this.metadata_show_episod = metadata_show_episod;
    }

    public String getMetadata_show_season() {
        return metadata_show_season;
    }

    public void setMetadata_show_season(String metadata_show_season) {
        this.metadata_show_season = metadata_show_season;
    }

    public String getMetadata_visa() {
        return metadata_visa;
    }

    public void setMetadata_visa(String metadata_visa) {
        this.metadata_visa = metadata_visa;
    }

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public boolean isModerated() {
        return moderated;
    }

    public void setModerated(boolean moderated) {
        this.moderated = moderated;
    }

    public Timestamp getModified_after() {
        return modified_after;
    }

    public void setModified_after(Timestamp modified_after) {
        this.modified_after = modified_after;
    }

    public Timestamp getModified_before() {
        return modified_before;
    }

    public void setModified_before(Timestamp modified_before) {
        this.modified_before = modified_before;
    }

    public Timestamp getModified_time() {
        return modified_time;
    }

    public void setModified_time(Timestamp modified_time) {
        this.modified_time = modified_time;
    }

    public String getMuyap() {
        return muyap;
    }

    public void setMuyap(String muyap) {
        this.muyap = muyap;
    }

    public boolean isOnair() {
        return onair;
    }

    public void setOnair(boolean onair) {
        this.onair = onair;
    }

    public User getOwner() {
        return owner;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }

    public boolean isPaywall() {
        return paywall;
    }

    public void setPaywall(boolean paywall) {
        this.paywall = paywall;
    }

    public boolean isPoster() {
        return poster;
    }

    public void setPoster(boolean poster) {
        this.poster = poster;
    }

    public String getPoster_135x180_url() {
        return poster_135x180_url;
    }

    public void setPoster_135x180_url(String poster_135x180_url) {
        this.poster_135x180_url = poster_135x180_url;
    }

    public String getPoster_180x240_url() {
        return poster_180x240_url;
    }

    public void setPoster_180x240_url(String poster_180x240_url) {
        this.poster_180x240_url = poster_180x240_url;
    }

    public String getPoster_270x360_url() {
        return poster_270x360_url;
    }

    public void setPoster_270x360_url(String poster_270x360_url) {
        this.poster_270x360_url = poster_270x360_url;
    }

    public String getPoster_360x480_url() {
        return poster_360x480_url;
    }

    public void setPoster_360x480_url(String poster_360x480_url) {
        this.poster_360x480_url = poster_360x480_url;
    }

    public String getPoster_45x60_url() {
        return poster_45x60_url;
    }

    public void setPoster_45x60_url(String poster_45x60_url) {
        this.poster_45x60_url = poster_45x60_url;
    }

    public String getPoster_90x120_url() {
        return poster_90x120_url;
    }

    public void setPoster_90x120_url(String poster_90x120_url) {
        this.poster_90x120_url = poster_90x120_url;
    }

    public String getPoster_url() {
        return poster_url;
    }

    public void setPoster_url(String poster_url) {
        this.poster_url = poster_url;
    }

    public String getPrice_details() {
        return price_details;
    }

    public void setPrice_details(String price_details) {
        this.price_details = price_details;
    }

    public boolean isPrivate_() {
        return private_;
    }

    public void setPrivate_(boolean private_) {
        this.private_ = private_;
    }

    public boolean isPublished() {
        return published;
    }

    public void setPublished(boolean published) {
        this.published = published;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public int getRatings_total() {
        return ratings_total;
    }

    public void setRatings_total(int ratings_total) {
        this.ratings_total = ratings_total;
    }

    public String getRecurrence() {
        return recurrence;
    }

    public void setRecurrence(String recurrence) {
        this.recurrence = recurrence;
    }

    public int getRental_duration() {
        return rental_duration;
    }

    public void setRental_duration(int rental_duration) {
        this.rental_duration = rental_duration;
    }

    public float getRental_price() {
        return rental_price;
    }

    public void setRental_price(float rental_price) {
        this.rental_price = rental_price;
    }

    public String getRental_price_formatted() {
        return rental_price_formatted;
    }

    public void setRental_price_formatted(String rental_price_formatted) {
        this.rental_price_formatted = rental_price_formatted;
    }

    public int getRental_start_time() {
        return rental_start_time;
    }

    public void setRental_start_time(int rental_start_time) {
        this.rental_start_time = rental_start_time;
    }

    public String getSearch() {
        return search;
    }

    public void setSearch(String search) {
        this.search = search;
    }

    public String getSharing_urls() {
        return sharing_urls;
    }

    public void setSharing_urls(String sharing_urls) {
        this.sharing_urls = sharing_urls;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    public String getSoundtrack_info() {
        return soundtrack_info;
    }

    public void setSoundtrack_info(String soundtrack_info) {
        this.soundtrack_info = soundtrack_info;
    }

    public Date getStart_time() {
        return start_time;
    }

    public void setStart_time(Date start_time) {
        this.start_time = start_time;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStream_h264_hd1080_url() {
        return stream_h264_hd1080_url;
    }

    public void setStream_h264_hd1080_url(String stream_h264_hd1080_url) {
        this.stream_h264_hd1080_url = stream_h264_hd1080_url;
    }

    public String getStream_h264_hd_url() {
        return stream_h264_hd_url;
    }

    public void setStream_h264_hd_url(String stream_h264_hd_url) {
        this.stream_h264_hd_url = stream_h264_hd_url;
    }

    public String getStream_h264_hq_url() {
        return stream_h264_hq_url;
    }

    public void setStream_h264_hq_url(String stream_h264_hq_url) {
        this.stream_h264_hq_url = stream_h264_hq_url;
    }

    public String getStream_h264_l1_url() {
        return stream_h264_l1_url;
    }

    public void setStream_h264_l1_url(String stream_h264_l1_url) {
        this.stream_h264_l1_url = stream_h264_l1_url;
    }

    public String getStream_h264_l2_url() {
        return stream_h264_l2_url;
    }

    public void setStream_h264_l2_url(String stream_h264_l2_url) {
        this.stream_h264_l2_url = stream_h264_l2_url;
    }

    public String getStream_h264_ld_url() {
        return stream_h264_ld_url;
    }

    public void setStream_h264_ld_url(String stream_h264_ld_url) {
        this.stream_h264_ld_url = stream_h264_ld_url;
    }

    public String getStream_h264_url() {
        return stream_h264_url;
    }

    public void setStream_h264_url(String stream_h264_url) {
        this.stream_h264_url = stream_h264_url;
    }

    public String getStream_hls_url() {
        return stream_hls_url;
    }

    public void setStream_hls_url(String stream_hls_url) {
        this.stream_hls_url = stream_hls_url;
    }

    public String getStream_live_hds_url() {
        return stream_live_hds_url;
    }

    public void setStream_live_hds_url(String stream_live_hds_url) {
        this.stream_live_hds_url = stream_live_hds_url;
    }

    public String getStream_live_hls_url() {
        return stream_live_hls_url;
    }

    public void setStream_live_hls_url(String stream_live_hls_url) {
        this.stream_live_hls_url = stream_live_hls_url;
    }

    public String getStream_live_rtmp_url() {
        return stream_live_rtmp_url;
    }

    public void setStream_live_rtmp_url(String stream_live_rtmp_url) {
        this.stream_live_rtmp_url = stream_live_rtmp_url;
    }

    public String getStream_premium_preview_hls_url() {
        return stream_premium_preview_hls_url;
    }

    public void setStream_premium_preview_hls_url(String stream_premium_preview_hls_url) {
        this.stream_premium_preview_hls_url = stream_premium_preview_hls_url;
    }

    public String getStream_premium_preview_mp4_url() {
        return stream_premium_preview_mp4_url;
    }

    public void setStream_premium_preview_mp4_url(String stream_premium_preview_mp4_url) {
        this.stream_premium_preview_mp4_url = stream_premium_preview_mp4_url;
    }

    public String getStream_premium_preview_web_url() {
        return stream_premium_preview_web_url;
    }

    public void setStream_premium_preview_web_url(String stream_premium_preview_web_url) {
        this.stream_premium_preview_web_url = stream_premium_preview_web_url;
    }

    public String getStream_source_url() {
        return stream_source_url;
    }

    public void setStream_source_url(String stream_source_url) {
        this.stream_source_url = stream_source_url;
    }

    public List<Strongtag> getStrongtags() {
        return strongtags;
    }

    public void setStrongtags(List<Strongtag> strongtags) {
        this.strongtags = strongtags;
    }

    public boolean isSvod() {
        return svod;
    }

    public void setSvod(boolean svod) {
        this.svod = svod;
    }

    public String getSwf_url() {
        return swf_url;
    }

    public void setSwf_url(String swf_url) {
        this.swf_url = swf_url;
    }

    public boolean isSync_allowed() {
        return sync_allowed;
    }

    public void setSync_allowed(boolean sync_allowed) {
        this.sync_allowed = sync_allowed;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public Date getTaken_time() {
        return taken_time;
    }

    public void setTaken_time(Date taken_time) {
        this.taken_time = taken_time;
    }

    public String getThumbnail_120_url() {
        return thumbnail_120_url;
    }

    public void setThumbnail_120_url(String thumbnail_120_url) {
        this.thumbnail_120_url = thumbnail_120_url;
    }

    public String getThumbnail_180_url() {
        return thumbnail_180_url;
    }

    public void setThumbnail_180_url(String thumbnail_180_url) {
        this.thumbnail_180_url = thumbnail_180_url;
    }

    public String getThumbnail_240_url() {
        return thumbnail_240_url;
    }

    public void setThumbnail_240_url(String thumbnail_240_url) {
        this.thumbnail_240_url = thumbnail_240_url;
    }

    public String getThumbnail_360_url() {
        return thumbnail_360_url;
    }

    public void setThumbnail_360_url(String thumbnail_360_url) {
        this.thumbnail_360_url = thumbnail_360_url;
    }

    public String getThumbnail_480_url() {
        return thumbnail_480_url;
    }

    public void setThumbnail_480_url(String thumbnail_480_url) {
        this.thumbnail_480_url = thumbnail_480_url;
    }

    public String getThumbnail_60_url() {
        return thumbnail_60_url;
    }

    public void setThumbnail_60_url(String thumbnail_60_url) {
        this.thumbnail_60_url = thumbnail_60_url;
    }

    public String getThumbnail_720_url() {
        return thumbnail_720_url;
    }

    public void setThumbnail_720_url(String thumbnail_720_url) {
        this.thumbnail_720_url = thumbnail_720_url;
    }

    public String getThumbnail_url() {
        return thumbnail_url;
    }

    public void setThumbnail_url(String thumbnail_url) {
        this.thumbnail_url = thumbnail_url;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isTvod() {
        return tvod;
    }

    public void setTvod(boolean tvod) {
        this.tvod = tvod;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUpc() {
        return upc;
    }

    public void setUpc(String upc) {
        this.upc = upc;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getViews_last_day() {
        return views_last_day;
    }

    public void setViews_last_day(int views_last_day) {
        this.views_last_day = views_last_day;
    }

    public int getViews_last_hour() {
        return views_last_hour;
    }

    public void setViews_last_hour(int views_last_hour) {
        this.views_last_hour = views_last_hour;
    }

    public int getViews_last_month() {
        return views_last_month;
    }

    public void setViews_last_month(int views_last_month) {
        this.views_last_month = views_last_month;
    }

    public int getViews_last_week() {
        return views_last_week;
    }

    public void setViews_last_week(int views_last_week) {
        this.views_last_week = views_last_week;
    }

    public int getViews_total() {
        return views_total;
    }

    public void setViews_total(int views_total) {
        this.views_total = views_total;
    }
}
