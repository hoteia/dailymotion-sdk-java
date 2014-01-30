package com.bc.dailymotion.api.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.util.Date;

/**
 * Created by Bastien on 04/01/2014.
 */
public class Group {
    /**
     * The URL to the user’s avatar (square of 160px side length).
     * No access_token required for reading.
     * Returns url.
     */
    @JsonProperty(value = "avatar_160_url")
    private String avatar160Url;

    /**
     * The URL to the user’s avatar (square of 40px side length).
     * No access_token required for reading.
     * Returns url.
     */
    @JsonProperty(value = "avatar_40_url")
    private String avatar40Url;

    /**
     * The URL to the user’s avatar (square of 80px side length).
     * No access_token required for reading.
     * Returns url.
     */
    @JsonProperty(value = "avatar_80_url")
    private String avatar80Url;

    /**
     * The date when the group has been created
     * No access_token required for reading.
     * Returns date.
     */
    @JsonProperty(value = "created_time")
    private Date createdTime;

    /**
     * The group’s description
     * No access_token required for reading. This field is writable.
     * Returns string, min size: 1, max size: 2000.
     */
    private String description;

    /**
     * A list of filters availbe to reduce the result set.
     * This field can be used as filter but can’t be read nor written.
     * Returns array, allowed values: featured.
     */
    private String filters;

    /**
     * The group object ID
     * No access_token required for reading.
     * Returns the object id.
     */
    private String id;

    /**
     * The Group’s name
     * No access_token required for reading. This field is writable.
     * Returns string, min size: 1, max size: 50.
     */
    private String name;

    /**
     * The group’s owner
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
     * Returns string, allowed values: recent, relevance, active.
     */
    private String sort;

    /**
     * The globally unique group name to be used in URL (only alphanum + “-” and “_” letters are allowed)
     * No access_token required for reading. This field is writable.
     * Returns string, min size: 1, max size: 35.
     */
    @JsonProperty(value = "url_name")
    private String urlName;

    /**
     * Returns the Avatar_160_url
     *
     * @return the Avatar_160_url
     */
    public String getAvatar160Url() {
        return avatar160Url;
    }

    /**
     * Set the Avatar_160_url
     *
     * @param avatar160Url the Avatar_160_url to set
     */
    public void setAvatar160Url(String avatar160Url) {
        this.avatar160Url = avatar160Url;
    }

    /**
     * Returns the Avatar_40_url
     *
     * @return the Avatar_40_url
     */
    public String getAvatar40Url() {
        return avatar40Url;
    }

    /**
     * Set the Avatar_40_url
     *
     * @param avatar40Url the Avatar_40_url to set
     */
    public void setAvatar40Url(String avatar40Url) {
        this.avatar40Url = avatar40Url;
    }

    /**
     * Returns the Avatar_80_url
     *
     * @return the Avatar_80_url
     */
    public String getAvatar80Url() {
        return avatar80Url;
    }

    /**
     * Set the Avatar_80_url
     *
     * @param avatar80Url the Avatar_80_url to set
     */
    public void setAvatar80Url(String avatar80Url) {
        this.avatar80Url = avatar80Url;
    }

    /**
     * Returns the Created_time
     *
     * @return the Created_time
     */
    public Date getCreatedTime() {
        return createdTime;
    }

    /**
     * Set the Created_time
     *
     * @param createdTime the Created_time to set
     */
    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
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
     * Returns the Filters
     *
     * @return the Filters
     */
    public String getFilters() {
        return filters;
    }

    /**
     * Set the Filters
     *
     * @param filters the Filters to set
     */
    public void setFilters(String filters) {
        this.filters = filters;
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
     * Returns the Url_name
     *
     * @return the Url_name
     */
    public String getUrlName() {
        return urlName;
    }

    /**
     * Set the Url_name
     *
     * @param urlName the Url_name to set
     */
    public void setUrlName(String urlName) {
        this.urlName = urlName;
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

        Group group = (Group) o;

        if (id != null ? !id.equals(group.id) : group.id != null) return false;

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
