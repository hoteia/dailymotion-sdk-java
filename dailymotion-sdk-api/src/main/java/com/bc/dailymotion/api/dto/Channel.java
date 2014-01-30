package com.bc.dailymotion.api.dto;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * Created by Bastien on 04/01/2014.
 */
public class Channel {
    /**
     * The localized description of the channel.
     * No access_token required for reading.
     * Returns string, min size: 1, max size: 150.
     */
    private String description;

    /**
     * The channel object ID
     * No access_token required for reading.
     * Returns the object id.
     */
    private String id;

    /**
     * The localized long name of the channel.
     * No access_token required for reading.
     * Returns string, min size: 1, max size: 150.
     */
    private String name;

    /**
     * The slug name of the channel.
     * No access_token required for reading.
     * Returns string, min size: 1, max size: 150.
     */
    private String slug;

    /**
     * Change result ordering
     * This field can be used as filter but can’t be read nor written.
     * Returns string, allowed values: popular, alpha.
     */
    private String sort;

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
     * Returns the Slug
     *
     * @return the Slug
     */
    public String getSlug() {
        return slug;
    }

    /**
     * Set the Slug
     *
     * @param slug the Slug to set
     */
    public void setSlug(String slug) {
        this.slug = slug;
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

        Channel channel = (Channel) o;

        if (id != null ? !id.equals(channel.id) : channel.id != null) {
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
