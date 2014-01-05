package com.bc.dailymotion.api.dto;

/**
 * Created by Bastien on 04/01/2014.
 */
public class Subtitle {
    Name	Description	Permissions	Format
    id	The videosubtitle object ID	No access_token required for reading.	Returns the object id.
    language	The language of the subtitle	This field can be used as filter. No access_token required for reading.	Returns string, min size: 1, max size: 150.
    url	The URL of the subtitle, to play with the video	No access_token required for reading.	Returns string, min size: 1, max size: 150.
}
