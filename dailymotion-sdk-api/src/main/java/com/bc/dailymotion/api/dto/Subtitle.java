package com.bc.dailymotion.api.dto;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * Created by Bastien on 04/01/2014.
 */
public class Subtitle {
    /**
     * The videosubtitle object ID
     * No access_token required for reading.
     * Returns the object id.
     */
    private String id;

    /**
     * The language of the subtitle
     * This field can be used as filter. No access_token required for reading.
     * Returns string, min size: 1, max size: 150.
     */
    private String language;

    /**
     * The URL of the subtitle, to play with the video
     * No access_token required for reading.
     * Returns string, min size: 1, max size: 150.
     */
    private String url;

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
     * Returns the Url
     *
     * @return the Url
     */
    public String getUrl() {
        return url;
    }

    /**
     * Set the Url
     *
     * @param url the Url to set
     */
    public void setUrl(String url) {
        this.url = url;
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

        Subtitle subtitle = (Subtitle) o;

        if (id != null ? !id.equals(subtitle.id) : subtitle.id != null) {
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
