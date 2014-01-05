package com.bc.dailymotion.api.dto;

/**
 * Created by Bastien on 04/01/2014.
 */
public class Strongtag {
    String id;//	The strongtags_freebase object ID	No access_token required for reading.	Returns the object id.
    String mid;//	The mid of the strong tag.	No access_token required for reading.	Returns string, min size: 1, max size: 150.
    String name;//	The name of the strong tag.	No access_token required for reading.	Returns string, min size: 1, max size: 255.
    String normalizename;//	The normalize name of the strong tag.	No access_token required for reading.	Returns string, min size: 1, max size: 255.
    String type;//	The type of the strong tag.	No access_token required for reading.	Returns dict, min size: 1, max size: 150.

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMid() {
        return mid;
    }

    public void setMid(String mid) {
        this.mid = mid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNormalizename() {
        return normalizename;
    }

    public void setNormalizename(String normalizename) {
        this.normalizename = normalizename;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
