package com.bc.dailymotion.api.dto;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.util.Date;

/**
 * Created by Bastien on 04/01/2014.
 */
public class Comment {
    /**
     * The date when the comment has been posted
     * No access_token required for reading.
     * Returns date.
     */
    private Date created_time;

    /**
     * The comment object ID
     * No access_token required for reading.
     * Returns the object id.
     */
    private String id;

    /**
     * The comment’s language
     * No access_token required for reading. This field is writable.
     * Returns string, min size: 2, max size: 2.
     */
    private String language;

    /**
     * Tell if the comment is still editable or not (a comment is locked some minutes after its creation)
     * No access_token required for reading.
     * Returns boolean.
     */
    private boolean locked;

    /**
     * The comment’s message
     * No access_token required for reading. This field is writable.
     * Returns string, min size: 1, max size: 1000.
     */
    private String message;

    /**
     * The comment’s owner
     * No access_token required for reading.
     * Return a user. You can request sub-fields by using owner.<sub-field> notation.
     */
    private User owner;

    /**
     * The commented video
     * No access_token required for reading.
     * Return a video. You can request sub-fields by using video.<sub-field> notation.
     */
    private Video video;

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
     * Returns the Language
     *
     * @return the Language
     */
    public String getLanguage() {
        return language;
    }

    /**
     * Set the Language
     *
     * @param language the Language to set
     */
    public void setLanguage(String language) {
        this.language = language;
    }

    /**
     * Returns the locked
     *
     * @return the locked
     */
    public boolean isLocked() {
        return locked;
    }

    /**
     * Set the Locked
     *
     * @param locked the Locked to set
     */
    public void setLocked(boolean locked) {
        this.locked = locked;
    }

    /**
     * Returns the Message
     *
     * @return the Message
     */
    public String getMessage() {
        return message;
    }

    /**
     * Set the Message
     *
     * @param message the Message to set
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * Returns the Owner
     *
     * @return the Owner
     */
    public User getOwner() {
        return owner;
    }

    /**
     * Set the Owner
     *
     * @param owner the Owner to set
     */
    public void setOwner(User owner) {
        this.owner = owner;
    }

    /**
     * Returns the Video
     *
     * @return the Video
     */
    public Video getVideo() {
        return video;
    }

    /**
     * Set the Video
     *
     * @param video the Video to set
     */
    public void setVideo(Video video) {
        this.video = video;
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

        Comment comment = (Comment) o;

        if (id != null ? !id.equals(comment.id) : comment.id != null) return false;

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
