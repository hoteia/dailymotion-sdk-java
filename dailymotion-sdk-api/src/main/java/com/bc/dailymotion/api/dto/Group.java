package com.bc.dailymotion.api.dto;

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
    private String avatar_160_url;

    /**
     * The URL to the user’s avatar (square of 40px side length).
     * No access_token required for reading.
     * Returns url.
     */
    private String avatar_40_url;

    /**
     * The URL to the user’s avatar (square of 80px side length).
     * No access_token required for reading.
     * Returns url.
     */
    private String avatar_80_url;

    /**
     * The date when the group has been created
     * No access_token required for reading.
     * Returns date.
     */
    private Date created_time;

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
    private String url_name;

    /**
     * Returns the Avatar_160_url
     *
     * @return the Avatar_160_url
     */
    public String getAvatar_160_url() {
        return avatar_160_url;
    }

    /**
     * Set the Avatar_160_url
     *
     * @param avatar_160_url the Avatar_160_url to set
     */
    public void setAvatar_160_url(String avatar_160_url) {
        this.avatar_160_url = avatar_160_url;
    }

    /**
     * Returns the Avatar_40_url
     *
     * @return the Avatar_40_url
     */
    public String getAvatar_40_url() {
        return avatar_40_url;
    }

    /**
     * Set the Avatar_40_url
     *
     * @param avatar_40_url the Avatar_40_url to set
     */
    public void setAvatar_40_url(String avatar_40_url) {
        this.avatar_40_url = avatar_40_url;
    }

    /**
     * Returns the Avatar_80_url
     *
     * @return the Avatar_80_url
     */
    public String getAvatar_80_url() {
        return avatar_80_url;
    }

    /**
     * Set the Avatar_80_url
     *
     * @param avatar_80_url the Avatar_80_url to set
     */
    public void setAvatar_80_url(String avatar_80_url) {
        this.avatar_80_url = avatar_80_url;
    }

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
    public String getUrl_name() {
        return url_name;
    }

    /**
     * Set the Url_name
     *
     * @param url_name the Url_name to set
     */
    public void setUrl_name(String url_name) {
        this.url_name = url_name;
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
