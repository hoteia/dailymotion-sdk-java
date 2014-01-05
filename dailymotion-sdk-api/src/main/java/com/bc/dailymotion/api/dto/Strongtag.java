package com.bc.dailymotion.api.dto;

/**
 * Created by Bastien on 04/01/2014.
 */
public class Strongtag {
    Name	Description	Permissions	Format
    id	The strongtags_freebase object ID	No access_token required for reading.	Returns the object id.
    mid	The mid of the strong tag.	No access_token required for reading.	Returns string, min size: 1, max size: 150.
    name	The name of the strong tag.	No access_token required for reading.	Returns string, min size: 1, max size: 255.
    normalizename	The normalize name of the strong tag.	No access_token required for reading.	Returns string, min size: 1, max size: 255.
    type	The type of the strong tag.	No access_token required for reading.	Returns dict, min size: 1, max size: 150.
}
