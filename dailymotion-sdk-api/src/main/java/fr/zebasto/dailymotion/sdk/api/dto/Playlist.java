package fr.zebasto.dailymotion.sdk.api.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import fr.zebasto.dailymotion.sdk.api.Entity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.util.Date;

/**
 * Created by Bastien on 04/01/2014.
 */
public class Playlist implements Entity {
    /**
     * The date when the playlist has been created
     * No access_token required for reading.
     * Returns date.
     */
    @JsonProperty(value = "created_time")
    private Date createdTime;

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
    @JsonProperty(value = "thumbnail_large_url")
    private String thumbnailLargeUrl;

    /**
     * The URL of the first video thumbnail (160px by 120px).
     * No access_token required for reading.
     * Returns url.
     */
    @JsonProperty(value = "thumbnail_medium_url")
    private String thumbnailMediumUrl;

    /**
     * The URL of the first video thumbnail (80px by 60px).
     * No access_token required for reading.
     * Returns url.
     */
    @JsonProperty(value = "thumbnail_small_url")
    private String thumbnailSmallUrl;

    /**
     * The URL of the first video raw thumbnail (full size respecting ratio).
     * No access_token required for reading.
     * Returns url.
     */
    @JsonProperty(value = "thumbnail_url")
    private String thumbnailUrl;

    /**
     * The total number of videos in the playlist.
     * No access_token required for reading.
     * Returns number, min value: 0.
     */
    @JsonProperty(value = "videos_total")
    private int videosTotal;

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
    public String getThumbnailLargeUrl() {
        return thumbnailLargeUrl;
    }

    /**
     * Set the Thumbnail_large_url
     *
     * @param thumbnailLargeUrl the Thumbnail_large_url to set
     */
    public void setThumbnailLargeUrl(String thumbnailLargeUrl) {
        this.thumbnailLargeUrl = thumbnailLargeUrl;
    }

    /**
     * Returns the Thumbnail_medium_url
     *
     * @return the Thumbnail_medium_url
     */
    public String getThumbnailMediumUrl() {
        return thumbnailMediumUrl;
    }

    /**
     * Set the Thumbnail_medium_url
     *
     * @param thumbnailMediumUrl the Thumbnail_medium_url to set
     */
    public void setThumbnailMediumUrl(String thumbnailMediumUrl) {
        this.thumbnailMediumUrl = thumbnailMediumUrl;
    }

    /**
     * Returns the Thumbnail_small_url
     *
     * @return the Thumbnail_small_url
     */
    public String getThumbnailSmallUrl() {
        return thumbnailSmallUrl;
    }

    /**
     * Set the Thumbnail_small_url
     *
     * @param thumbnailSmallUrl the Thumbnail_small_url to set
     */
    public void setThumbnailSmallUrl(String thumbnailSmallUrl) {
        this.thumbnailSmallUrl = thumbnailSmallUrl;
    }

    /**
     * Returns the Thumbnail_url
     *
     * @return the Thumbnail_url
     */
    public String getThumbnailUrl() {
        return thumbnailUrl;
    }

    /**
     * Set the Thumbnail_url
     *
     * @param thumbnailUrl the Thumbnail_url to set
     */
    public void setThumbnailUrl(String thumbnailUrl) {
        this.thumbnailUrl = thumbnailUrl;
    }

    /**
     * Returns the Videos_total
     *
     * @return the Videos_total
     */
    public int getVideosTotal() {
        return videosTotal;
    }

    /**
     * Set the Videos_total
     *
     * @param videosTotal the Videos_total to set
     */
    public void setVideosTotal(int videosTotal) {
        this.videosTotal = videosTotal;
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

        Playlist playlist = (Playlist) o;

        if (id != null ? !id.equals(playlist.id) : playlist.id != null) {
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
