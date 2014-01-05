package com.bc.dailymotion.api.dto;

/**
 * Created by Bastien on 04/01/2014.
 */
public class Group {
    Name	Description	Permissions	Format
    avatar_160_url	The URL to the user’s avatar (square of 160px side length).	No access_token required for reading.	Returns url.
    avatar_40_url	The URL to the user’s avatar (square of 40px side length).	No access_token required for reading.	Returns url.
    avatar_80_url	The URL to the user’s avatar (square of 80px side length).	No access_token required for reading.	Returns url.
    created_time	The date when the group has been created	No access_token required for reading.	Returns date.
    description	The group’s description	No access_token required for reading. This field is writable.	Returns string, min size: 1, max size: 2000.
    filters	A list of filters availbe to reduce the result set.	This field can be used as filter but can’t be read nor written.	Returns array, allowed values: featured.
    id	The group object ID	No access_token required for reading.	Returns the object id.
    name	The Group’s name	No access_token required for reading. This field is writable.	Returns string, min size: 1, max size: 50.
    owner	The group’s owner	No access_token required for reading.	Return a user. You can request sub-fields by using owner.<sub-field> notation.
    search	Full text search	This field can be used as filter but can’t be read nor written.	Returns string, min size: 1, max size: 150.
    sort	Change result ordering	This field can be used as filter but can’t be read nor written.	Returns string, allowed values: recent, relevance, active.
    url_name	The globally unique group name to be used in URL (only alphanum + “-” and “_” letters are allowed)	No access_token required for reading. This field is writable.	Returns string, min size: 1, max size: 35.
    Connections

    Name	Description	Permissions	Returns
    members	 	No access_token required for reading. manage_groups scope required for writing.	A list of User.
    videos	The videos associated to this group	No access_token required for reading. manage_groups scope required for writing.	A list of Video.
    The members connection


}
