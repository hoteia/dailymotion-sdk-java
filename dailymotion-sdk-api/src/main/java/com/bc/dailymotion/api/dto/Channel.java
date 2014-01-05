package com.bc.dailymotion.api.dto;

/**
 * Created by Bastien on 04/01/2014.
 */
public class Channel {
    String description;//	The localized descriptioin of the channel.	No access_token required for reading.	Returns string, min size: 1, max size: 150.
    String id;//	The channel object ID	No access_token required for reading.	Returns the object id.
    String name;//	The localized long name of the channel.	No access_token required for reading.	Returns string, min size: 1, max size: 150.
    String slug;//	The slug name of the channel.	No access_token required for reading.	Returns string, min size: 1, max size: 150.
    String sort;//	Change result ordering	This field can be used as filter but can’t be read nor written.	Returns string, allowed values: popular, alpha.

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

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }
}
