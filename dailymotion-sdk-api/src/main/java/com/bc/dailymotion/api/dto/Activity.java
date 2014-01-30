package com.bc.dailymotion.api.dto;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.util.Date;
import java.util.List;

/**
 * Created by Bastien on 04/01/2014.
 */
public class Activity {
    /**
     * The date the activity has happened
     * No access_token required for reading.
     * Returns date.
     */
    private Date created_time;

    /**
     * Type of the sender object for the activity event
     * This field can be used as filter. No access_token required for reading.
     * Returns string, min size: 1, max size: 150.
     */
    private String from_type;

    /**
     * The activity_event object ID
     * No access_token required for reading.
     * Returns the object id.
     */
    private String id;

    /**
     * A list of tile ids to ignore
     * This field can be used as filter but can’t be read nor written.
     * Returns array, min size: 1, max size: 150.
     */
    private List<String> ignore_tile_ids;

    /**
     * Type of the object for the activity event
     * This field can be used as filter. No access_token required for reading.
     * Returns string, min size: 1, max size: 150.
     */
    private String object_type;

    /**
     * The activity object casted as video if it’s a video, null otherwise
     * No access_token required for reading.
     * Return a video. You can request sub-fields by using object_video.<sub-field> notation.
     */
    private Video object_video;

    /**
     * A list of tile ids to get activity from
     * This field can be used as filter but can’t be read nor written.
     * Returns array, min size: 1, max size: 150.
     */
    private List<String> tile_ids;

    /**
     * Activity event type
     * No access_token required for reading.
     * Returns string, min size: 1, max size: 150.
     */
    private String type;

    /**
     * Returns the Created_time
     *
     * @return the Created_time
     */
    public Date getCreated_time() {
        return created_time;
    }

    /**
     * Set the Created_time
     *
     * @param created_time the Created_time to set
     */
    public void setCreated_time(Date created_time) {
        this.created_time = created_time;
    }

    /**
     * Returns the From_type
     *
     * @return the From_type
     */
    public String getFrom_type() {
        return from_type;
    }

    /**
     * Set the From_type
     *
     * @param from_type the From_type to set
     */
    public void setFrom_type(String from_type) {
        this.from_type = from_type;
    }

    /**
     * Returns the Id
     *
     * @return the Id
     */
    public String getId() {
        return id;
    }

    /**
     * Set the Id
     *
     * @param id the Id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Returns the Ignore_tile_ids
     *
     * @return the Ignore_tile_ids
     */
    public List<String> getIgnore_tile_ids() {
        return ignore_tile_ids;
    }

    /**
     * Set the Ignore_tile_ids
     *
     * @param ignore_tile_ids the Ignore_tile_ids to set
     */
    public void setIgnore_tile_ids(List<String> ignore_tile_ids) {
        this.ignore_tile_ids = ignore_tile_ids;
    }

    /**
     * Returns the Object_type
     *
     * @return the Object_type
     */
    public String getObject_type() {
        return object_type;
    }

    /**
     * Set the Object_type
     *
     * @param object_type the Object_type to set
     */
    public void setObject_type(String object_type) {
        this.object_type = object_type;
    }

    /**
     * Returns the Object_video
     *
     * @return the Object_video
     */
    public Video getObject_video() {
        return object_video;
    }

    /**
     * Set the Object_video
     *
     * @param object_video the Object_video to set
     */
    public void setObject_video(Video object_video) {
        this.object_video = object_video;
    }

    /**
     * Returns the Tile_ids
     *
     * @return the Tile_ids
     */
    public List<String> getTile_ids() {
        return tile_ids;
    }

    /**
     * Set the Tile_ids
     *
     * @param tile_ids the Tile_ids to set
     */
    public void setTile_ids(List<String> tile_ids) {
        this.tile_ids = tile_ids;
    }

    /**
     * Returns the Type
     *
     * @return the Type
     */
    public String getType() {
        return type;
    }

    /**
     * Set the Type
     *
     * @param type the Type to set
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * {@docRoot}
     */
    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.DEFAULT_STYLE);
    }

    /**
     * {@docRoot}
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Activity activity = (Activity) o;

        if (id != null ? !id.equals(activity.id) : activity.id != null) return false;

        return true;
    }

    /**
     * {@docRoot}
     */
    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }
}
