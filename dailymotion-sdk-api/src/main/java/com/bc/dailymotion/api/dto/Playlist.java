package com.bc.dailymotion.api.dto;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.util.Date;

/**
 * Created by Bastien on 04/01/2014.
 */
public class Playlist {
    /**
     * The date when the playlist has been created
     * No access_token required for reading.
     * Returns date.
     */
    private Date created_time;

    /**
     * The playlist’s description
     * No access_token required for reading. This field is writable.
     * Returns string, min size: 1, max size: 2000.
     */
    private String description;

    /**
     * The playlist object ID
     * No access_token required for reading.
     * Returns the object id.
     */
    private String id;

    /**
     * The playlist’s name
     * No access_token required for reading. This field is writable.
     * Returns string, min size: 1, max size: 50.
     */
    private String name;

    /**
     * The user who created the playlist
     * No access_token required for reading.
     * Return a user. You can request sub-fields by using owner.<sub-field> notation.
     */
    private User owner;

    /**
     * Full text search
     * This field can be used as filter but can’t be read nor written.
     * Returns string, min size: 1, max size: 150.
     */
    private String search;

    /**
     * Change result ordering
     * This field can be used as filter but can’t be read nor written.
     * Returns string, allowed values: recent, relevance, alpha.
     */
    private String sort;

    /**
     * The URL of the first video thumbnail (320px by 240px).
     * No access_token required for reading.
     * Returns url.
     */
    private String thumbnail_large_url;

    /**
     * The URL of the first video thumbnail (160px by 120px).
     * No access_token required for reading.
     * Returns url.
     */
    private String thumbnail_medium_url;

    /**
     * The URL of the first video thumbnail (80px by 60px).
     * No access_token required for reading.
     * Returns url.
     */
    private String thumbnail_small_url;

    /**
     * The URL of the first video raw thumbnail (full size respecting ratio).
     * No access_token required for reading.
     * Returns url.
     */
    private String thumbnail_url;

    /**
     * The total number of videos in the playlist.
     * No access_token required for reading.
     * Returns number, min value: 0.
     */
    private int videos_total;

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
     * Returns the Description
     *
     * @return the Description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Set the Description
     *
     * @param description the Description to set
     */
    public void setDescription(String description) {
        this.description = description;
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
     * Returns the Name
     *
     * @return the Name
     */
    public String getName() {
        return name;
    }

    /**
     * Set the Name
     *
     * @param name the Name to set
     */
    public void setName(String name) {
        this.name = name;
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
     * Returns the Search
     *
     * @return the Search
     */
    public String getSearch() {
        return search;
    }

    /**
     * Set the Search
     *
     * @param search the Search to set
     */
    public void setSearch(String search) {
        this.search = search;
    }

    /**
     * Returns the Sort
     *
     * @return the Sort
     */
    public String getSort() {
        return sort;
    }

    /**
     * Set the Sort
     *
     * @param sort the Sort to set
     */
    public void setSort(String sort) {
        this.sort = sort;
    }

    /**
     * Returns the Thumbnail_large_url
     *
     * @return the Thumbnail_large_url
     */
    public String getThumbnail_large_url() {
        return thumbnail_large_url;
    }

    /**
     * Set the Thumbnail_large_url
     *
     * @param thumbnail_large_url the Thumbnail_large_url to set
     */
    public void setThumbnail_large_url(String thumbnail_large_url) {
        this.thumbnail_large_url = thumbnail_large_url;
    }

    /**
     * Returns the Thumbnail_medium_url
     *
     * @return the Thumbnail_medium_url
     */
    public String getThumbnail_medium_url() {
        return thumbnail_medium_url;
    }

    /**
     * Set the Thumbnail_medium_url
     *
     * @param thumbnail_medium_url the Thumbnail_medium_url to set
     */
    public void setThumbnail_medium_url(String thumbnail_medium_url) {
        this.thumbnail_medium_url = thumbnail_medium_url;
    }

    /**
     * Returns the Thumbnail_small_url
     *
     * @return the Thumbnail_small_url
     */
    public String getThumbnail_small_url() {
        return thumbnail_small_url;
    }

    /**
     * Set the Thumbnail_small_url
     *
     * @param thumbnail_small_url the Thumbnail_small_url to set
     */
    public void setThumbnail_small_url(String thumbnail_small_url) {
        this.thumbnail_small_url = thumbnail_small_url;
    }

    /**
     * Returns the Thumbnail_url
     *
     * @return the Thumbnail_url
     */
    public String getThumbnail_url() {
        return thumbnail_url;
    }

    /**
     * Set the Thumbnail_url
     *
     * @param thumbnail_url the Thumbnail_url to set
     */
    public void setThumbnail_url(String thumbnail_url) {
        this.thumbnail_url = thumbnail_url;
    }

    /**
     * Returns the Videos_total
     *
     * @return the Videos_total
     */
    public int getVideos_total() {
        return videos_total;
    }

    /**
     * Set the Videos_total
     *
     * @param videos_total the Videos_total to set
     */
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

    /**
     * {@docRoot}
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Playlist playlist = (Playlist) o;

        if (id != null ? !id.equals(playlist.id) : playlist.id != null) return false;

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
