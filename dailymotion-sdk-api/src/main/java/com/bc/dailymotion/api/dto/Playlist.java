package com.bc.dailymotion.api.dto;

/**
 * Created by Bastien on 04/01/2014.
 */
public class Playlist {
    Name	Description	Permissions	Format
    created_time	The date when the playlist has been created	No access_token required for reading.	Returns date.
    description	The playlist’s description	No access_token required for reading. This field is writable.	Returns string, min size: 1, max size: 2000.
    id	The playlist object ID	No access_token required for reading.	Returns the object id.
    name	The playlist’s name	No access_token required for reading. This field is writable.	Returns string, min size: 1, max size: 50.
    owner	The user who created the playlist	No access_token required for reading.	Return a user. You can request sub-fields by using owner.<sub-field> notation.
    search	Full text search	This field can be used as filter but can’t be read nor written.	Returns string, min size: 1, max size: 150.
    sort	Change result ordering	This field can be used as filter but can’t be read nor written.	Returns string, allowed values: recent, relevance, alpha.
    thumbnail_large_url	The URL of the first video thumbnail (320px by 240px).	No access_token required for reading.	Returns url.
    thumbnail_medium_url	The URL of the first video thumbnail (160px by 120px).	No access_token required for reading.	Returns url.
    thumbnail_small_url	The URL of the first video thumbnail (80px by 60px).	No access_token required for reading.	Returns url.
    thumbnail_url	The URL of the first video raw thumbnail (full size respecting ratio).	No access_token required for reading.	Returns url.
    videos_total	The total number of videos in the playlist.	No access_token required for reading.	Returns number, min value: 0.
    Connections

    Name	Description	Permissions	Returns
    videos	Playlist’s videos in the order defined by its owner.	No access_token required for reading. This connection is writable.	A list of Video.
    The videos connection


}
