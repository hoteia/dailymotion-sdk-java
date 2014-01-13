package com.bc.dailymotion.api.dto;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.util.Date;

/**
 * Created by Bastien on 04/01/2014.
 */
public class Playlist {
    Date created_time;//	The date when the playlist has been created	No access_token required for reading.	Returns date.
    String description;//	The playlist’s description	No access_token required for reading. This field is writable.	Returns string, min size: 1, max size: 2000.
    String id;//	The playlist object ID	No access_token required for reading.	Returns the object id.
    String name;//	The playlist’s name	No access_token required for reading. This field is writable.	Returns string, min size: 1, max size: 50.
    User owner;//	The user who created the playlist	No access_token required for reading.	Return a user. You can request sub-fields by using owner.<sub-field> notation.
    String search;//	Full text search	This field can be used as filter but can’t be read nor written.	Returns string, min size: 1, max size: 150.
    String sort;//	Change result ordering	This field can be used as filter but can’t be read nor written.	Returns string, allowed values: recent, relevance, alpha.
    String thumbnail_large_url;//	The URL of the first video thumbnail (320px by 240px).	No access_token required for reading.	Returns url.
    String thumbnail_medium_url;//	The URL of the first video thumbnail (160px by 120px).	No access_token required for reading.	Returns url.
    String thumbnail_small_url;//	The URL of the first video thumbnail (80px by 60px).	No access_token required for reading.	Returns url.
    String thumbnail_url;//	The URL of the first video raw thumbnail (full size respecting ratio).	No access_token required for reading.	Returns url.
    int videos_total;//	The total number of videos in the playlist.	No access_token required for reading.	Returns number, min value: 0.

    public Date getCreated_time() {
        return created_time;
    }

    public void setCreated_time(Date created_time) {
        this.created_time = created_time;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User getOwner() {
        return owner;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }

    public String getSearch() {
        return search;
    }

    public void setSearch(String search) {
        this.search = search;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    public String getThumbnail_large_url() {
        return thumbnail_large_url;
    }

    public void setThumbnail_large_url(String thumbnail_large_url) {
        this.thumbnail_large_url = thumbnail_large_url;
    }

    public String getThumbnail_medium_url() {
        return thumbnail_medium_url;
    }

    public void setThumbnail_medium_url(String thumbnail_medium_url) {
        this.thumbnail_medium_url = thumbnail_medium_url;
    }

    public String getThumbnail_small_url() {
        return thumbnail_small_url;
    }

    public void setThumbnail_small_url(String thumbnail_small_url) {
        this.thumbnail_small_url = thumbnail_small_url;
    }

    public String getThumbnail_url() {
        return thumbnail_url;
    }

    public void setThumbnail_url(String thumbnail_url) {
        this.thumbnail_url = thumbnail_url;
    }

    public int getVideos_total() {
        return videos_total;
    }

    public void setVideos_total(int videos_total) {
        this.videos_total = videos_total;
    }

    /**
     * {@docRoot}
     */
    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.DEFAULT_STYLE);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Playlist playlist = (Playlist) o;

        if (id != null ? !id.equals(playlist.id) : playlist.id != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }
}
