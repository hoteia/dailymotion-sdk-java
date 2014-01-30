package com.bc.dailymotion.api.dto;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * Created by Bastien on 04/01/2014.
 */
public class Strongtag {
    /**
     * The strongtags_freebase object ID
     * No access_token required for reading.
     * Returns the object id.
     */
    private String id;

    /**
     * The mid of the strong tag.
     * No access_token required for reading.
     * Returns string, min size: 1, max size: 150.
     */
    private String mid;

    /**
     * The name of the strong tag.
     * No access_token required for reading.
     * Returns string, min size: 1, max size: 255.
     */
    private String name;

    /**
     * The normalize name of the strong tag.
     * No access_token required for reading.
     * Returns string, min size: 1, max size: 255.
     */
    private String normalizename;

    /**
     * The type of the strong tag.
     * No access_token required for reading.
     * Returns dict, min size: 1, max size: 150.
     */
    private String type;

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
     * Returns the Mid
     *
     * @return the Mid
     */
    public String getMid() {
        return mid;
    }

    /**
     * Set the Mid
     *
     * @param mid the Mid to set
     */
    public void setMid(String mid) {
        this.mid = mid;
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
     * Returns the Normalizename
     *
     * @return the Normalizename
     */
    public String getNormalizename() {
        return normalizename;
    }

    /**
     * Set the Normalizename
     *
     * @param normalizename the Normalizename to set
     */
    public void setNormalizename(String normalizename) {
        this.normalizename = normalizename;
    }

    /**
     * Returns the Type
     *
     * @return the Type
     */
    public String getType() {
        return type;
    }

    /**
     * Set the Type
     *
     * @param type the Type to set
     */
    public void setType(String type) {
        this.type = type;
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

        Strongtag strongtag = (Strongtag) o;

        if (id != null ? !id.equals(strongtag.id) : strongtag.id != null) {
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
