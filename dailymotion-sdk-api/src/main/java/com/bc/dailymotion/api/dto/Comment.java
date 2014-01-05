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

    public Date getCreated_time() {
        return created_time;
    }

    public void setCreated_time(Date created_time) {
        this.created_time = created_time;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public boolean isLocked() {
        return locked;
    }

    public void setLocked(boolean locked) {
        this.locked = locked;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public User getOwner() {
        return owner;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }

    public Video getVideo() {
        return video;
    }

    public void setVideo(Video video) {
        this.video = video;
    }
}
