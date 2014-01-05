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

    public Date getCreated_time() {
        return created_time;
    }

    public void setCreated_time(Date created_time) {
        this.created_time = created_time;
    }

    public String getFrom_type() {
        return from_type;
    }

    public void setFrom_type(String from_type) {
        this.from_type = from_type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<String> getIgnore_tile_ids() {
        return ignore_tile_ids;
    }

    public void setIgnore_tile_ids(List<String> ignore_tile_ids) {
        this.ignore_tile_ids = ignore_tile_ids;
    }

    public String getObject_type() {
        return object_type;
    }

    public void setObject_type(String object_type) {
        this.object_type = object_type;
    }

    public Video getObject_video() {
        return object_video;
    }

    public void setObject_video(Video object_video) {
        this.object_video = object_video;
    }

    public List<String> getTile_ids() {
        return tile_ids;
    }

    public void setTile_ids(List<String> tile_ids) {
        this.tile_ids = tile_ids;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
