package com.bc.dailymotion.api.dto;

import java.util.Date;

/**
 * Created by Bastien on 04/01/2014.
 */
public class Playlist {
    Date created_time;//	The date when the playlist has been created	No access_token required for reading.	Returns date.
    String description;//	The playlist’s description	No access_token required for reading. This field is writable.	Returns string, min size: 1, max size: 2000.
    String id;//	The playlist object ID	No access_token required for reading.	Returns the object id.
    String name;//	The playlist’s name	No access_token required for reading. This field is writable.	Returns string, min size: 1, max size: 50.
    User owner;//	The user who created the playlist	No access_token required for reading.	Return a user. You can request sub-fields by using owner.<sub-field> notation.
    String search;//	Full text search	This field can be used as filter but can’t be read nor written.	Returns string, min size: 1, max size: 150.
    String sort;//	Change result ordering	This field can be used as filter but can’t be read nor written.	Returns string, allowed values: recent, relevance, alpha.
    String thumbnail_large_url;//	The URL of the first video thumbnail (320px by 240px).	No access_token required for reading.	Returns url.
    String thumbnail_medium_url;//	The URL of the first video thumbnail (160px by 120px).	No access_token required for reading.	Returns url.
    String thumbnail_small_url;//	The URL of the first video thumbnail (80px by 60px).	No access_token required for reading.	Returns url.
    String thumbnail_url;//	The URL of the first video raw thumbnail (full size respecting ratio).	No access_token required for reading.	Returns url.
    int videos_total;//	The total number of videos in the playlist.	No access_token required for reading.	Returns number, min value: 0.
}
