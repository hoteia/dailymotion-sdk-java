package fr.zebasto.dailymotion.sdk.api.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * Created by Bastien on 04/01/2014.
 */
public class Contest {
    /**
     * The contest’s description
     * No access_token required for reading.
     * Returns string, min size: 1, max size: 2000.
     */
    private String description;

    /**
     * The contest object ID
     * No access_token required for reading.
     * Returns the object id.
     */
    private String id;

    /**
     * The Contest’s Name
     * No access_token required for reading.
     * Returns string, min size: 1, max size: 35.
     */
    private String name;

    /**
     * The contest’s owner
     * No access_token required for reading.
     * Return a user. You can request sub-fields by using owner.<sub-field> notation.
     */
    private User owner;

    /**
     * The globally unique group name to be used in URL (only alphanum + “-” and “_” letters are allowed)
     * No access_token required for reading.
     * Returns string, min size: 1, max size: 35.
     */
    @JsonProperty(value = "url_name")
    private String urlName;

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
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Contest contest = (Contest) o;

        if (id != null ? !id.equals(contest.id) : contest.id != null) {
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
