package fr.zebasto.dailymotion.sdk.api.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
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
    @JsonProperty(value = "created_time")
    private Date createdTime;

    /**
     * Type of the sender object for the activity event
     * This field can be used as filter. No access_token required for reading.
     * Returns string, min size: 1, max size: 150.
     */
    @JsonProperty(value = "from_type")
    private String fromType;

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
    @JsonProperty(value = "ignore_tile_ids")
    private List<String> ignoreTileIds;

    /**
     * Type of the object for the activity event
     * This field can be used as filter. No access_token required for reading.
     * Returns string, min size: 1, max size: 150.
     */
    @JsonProperty(value = "object_type")
    private String objectType;

    /**
     * The activity object casted as video if it’s a video, null otherwise
     * No access_token required for reading.
     * Return a video. You can request sub-fields by using objectVideo.<sub-field> notation.
     */
    @JsonProperty(value = "object_video")
    private Video objectVideo;

    /**
     * A list of tile ids to get activity from
     * This field can be used as filter but can’t be read nor written.
     * Returns array, min size: 1, max size: 150.
     */
    @JsonProperty(value = "tile_ids")
    private List<String> tileIds;

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
    public Date getCreatedTime() {
        return this.createdTime != null ? new Date(this.createdTime.getTime()) : null;
    }

    /**
     * Set the Created_time
     *
     * @param createdTime the Created_time to set
     */
    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime != null ? new Date(createdTime.getTime()) : null;
    }

    /**
     * Returns the From_type
     *
     * @return the From_type
     */
    public String getFromType() {
        return fromType;
    }

    /**
     * Set the From_type
     *
     * @param fromType the From_type to set
     */
    public void setFromType(String fromType) {
        this.fromType = fromType;
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
    public List<String> getIgnoreTileIds() {
        return ignoreTileIds;
    }

    /**
     * Set the Ignore_tile_ids
     *
     * @param ignoreTileIds the Ignore_tile_ids to set
     */
    public void setIgnoreTileIds(List<String> ignoreTileIds) {
        this.ignoreTileIds = ignoreTileIds;
    }

    /**
     * Returns the Object_type
     *
     * @return the Object_type
     */
    public String getObjectType() {
        return objectType;
    }

    /**
     * Set the Object_type
     *
     * @param objectType the Object_type to set
     */
    public void setObjectType(String objectType) {
        this.objectType = objectType;
    }

    /**
     * Returns the Object_video
     *
     * @return the Object_video
     */
    public Video getObjectVideo() {
        return objectVideo;
    }

    /**
     * Set the Object_video
     *
     * @param objectVideo the Object_video to set
     */
    public void setObjectVideo(Video objectVideo) {
        this.objectVideo = objectVideo;
    }

    /**
     * Returns the Tile_ids
     *
     * @return the Tile_ids
     */
    public List<String> getTileIds() {
        return tileIds;
    }

    /**
     * Set the Tile_ids
     *
     * @param tileIds the Tile_ids to set
     */
    public void setTileIds(List<String> tileIds) {
        this.tileIds = tileIds;
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
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Activity activity = (Activity) o;

        if (id != null ? !id.equals(activity.id) : activity.id != null) {
            return false;
        }

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
