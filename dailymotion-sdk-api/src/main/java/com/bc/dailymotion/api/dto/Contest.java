package com.bc.dailymotion.api.dto;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * Created by Bastien on 04/01/2014.
 */
public class Contest {
    String description;//	The contest’s description	No access_token required for reading.	Returns string, min size: 1, max size: 2000.
    String id;//	The contest object ID	No access_token required for reading.	Returns the object id.
    String name;//	The Contest’s Name	No access_token required for reading.	Returns string, min size: 1, max size: 35.
    User owner;//	The contest’s owner	No access_token required for reading.	Return a user. You can request sub-fields by using owner.<sub-field> notation.
    String url_name;//	The globally unique group name to be used in URL (only alphanum + “-” and “_” letters are allowed)	No access_token required for reading.	Returns string, min size: 1, max size: 35.

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

    public String getUrl_name() {
        return url_name;
    }

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Contest contest = (Contest) o;

        if (id != null ? !id.equals(contest.id) : contest.id != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }
}
