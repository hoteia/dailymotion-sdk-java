package com.bc.dailymotion.api.dto;

import java.util.Date;

/**
 * Created by Bastien on 04/01/2014.
 */
public class Group {
    String avatar_160_url;//	The URL to the user’s avatar (square of 160px side length).	No access_token required for reading.	Returns url.
    String avatar_40_url;//	The URL to the user’s avatar (square of 40px side length).	No access_token required for reading.	Returns url.
    String avatar_80_url;//	The URL to the user’s avatar (square of 80px side length).	No access_token required for reading.	Returns url.
    Date created_time;//	The date when the group has been created	No access_token required for reading.	Returns date.
    String description;//	The group’s description	No access_token required for reading. This field is writable.	Returns string, min size: 1, max size: 2000.
    String filters;//	A list of filters availbe to reduce the result set.	This field can be used as filter but can’t be read nor written.	Returns array, allowed values: featured.
    String id;//	The group object ID	No access_token required for reading.	Returns the object id.
    String name;//	The Group’s name	No access_token required for reading. This field is writable.	Returns string, min size: 1, max size: 50.
    User owner;//	The group’s owner	No access_token required for reading.	Return a user. You can request sub-fields by using owner.<sub-field> notation.
    String search;//	Full text search	This field can be used as filter but can’t be read nor written.	Returns string, min size: 1, max size: 150.
    String sort;//	Change result ordering	This field can be used as filter but can’t be read nor written.	Returns string, allowed values: recent, relevance, active.
    String url_name;//	The globally unique group name to be used in URL (only alphanum + “-” and “_” letters are allowed)	No access_token required for reading. This field is writable.	Returns string, min size: 1, max size: 35.
}
