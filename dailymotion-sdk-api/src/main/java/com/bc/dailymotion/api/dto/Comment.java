package com.bc.dailymotion.api.dto;

import java.util.Date;

/**
 * Created by Bastien on 04/01/2014.
 */
public class Comment {
    Date created_time;//	The date when the comment has been posted	No access_token required for reading.	Returns date.
    String id;//	The comment object ID	No access_token required for reading.	Returns the object id.
    String language;//	The comment’s language	No access_token required for reading. This field is writable.	Returns string, min size: 2, max size: 2.
    boolean locked;//	Tell if the comment is still editable or not (a comment is locked some minutes after its creation)	No access_token required for reading.	Returns boolean.
    String message;//	The comment’s message	No access_token required for reading. This field is writable.	Returns string, min size: 1, max size: 1000.
    User owner;//	The comment’s owner	No access_token required for reading.	Return a user. You can request sub-fields by using owner.<sub-field> notation.
    Video video;//	The commented video	No access_token required for reading.	Return a video. You can request sub-fields by using video.<sub-field> notation.
}
