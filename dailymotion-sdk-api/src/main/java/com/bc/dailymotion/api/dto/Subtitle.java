package com.bc.dailymotion.api.dto;

/**
 * Created by Bastien on 04/01/2014.
 */
public class Subtitle {
    String id;//	The videosubtitle object ID	No access_token required for reading.	Returns the object id.
    String language;//	The language of the subtitle	This field can be used as filter. No access_token required for reading.	Returns string, min size: 1, max size: 150.
    String url;//	The URL of the subtitle, to play with the video	No access_token required for reading.	Returns string, min size: 1, max size: 150.

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

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
