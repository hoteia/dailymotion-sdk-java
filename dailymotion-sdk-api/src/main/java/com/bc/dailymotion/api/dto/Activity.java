package com.bc.dailymotion.api.dto;

import java.util.Date;
import java.util.List;

/**
 * Created by Bastien on 04/01/2014.
 */
public class Activity {
    Date created_time;//	The date the activity has happened	No access_token required for reading.	Returns date.
    String from_type;//	Type of the sender object for the activity event	This field can be used as filter. No access_token required for reading.	Returns string, min size: 1, max size: 150.
    String id;//	The activity_event object ID	No access_token required for reading.	Returns the object id.
    List<String> ignore_tile_ids;//	A list of tile ids to ignore	This field can be used as filter but can’t be read nor written.	Returns array, min size: 1, max size: 150.
    String object_type;//	Type of the object for the activity event	This field can be used as filter. No access_token required for reading.	Returns string, min size: 1, max size: 150.
    Video object_video;//	The activity object casted as video if it’s a video, null otherwise	No access_token required for reading.	Return a video. You can request sub-fields by using object_video.<sub-field> notation.
    List<String> tile_ids;//	A list of tile ids to get activity from	This field can be used as filter but can’t be read nor written.	Returns array, min size: 1, max size: 150.
    String type;//	Activity event type	No access_token required for reading.	Returns string, min size: 1, max size: 150.
}
