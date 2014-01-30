package com.bc.dailymotion.api.connection.group;

import com.bc.dailymotion.api.Connection;
import com.bc.dailymotion.api.Endpoint;
import com.bc.dailymotion.api.dto.Video;
import com.bc.dailymotion.api.endpoint.GroupEndpoint;

/**
 * Created by Bastien on 13/01/2014.
 */
public enum GroupVideo implements Connection {
    ALL("videos", Video.class, GroupEndpoint.ID),
    ID(ALL.value + "/{0}", Video.class, GroupEndpoint.ID);

    private String value;
    private Class clazz;
    private Endpoint parent;

    public String getValue() {
        return this.value;
    }

    public Class getClazz() {
        return this.clazz;
    }

    public Endpoint getParent() {
        return this.parent;
    }

    GroupVideo(String value, Class clazz, Endpoint parent) {
        this.value = value;
        this.clazz = clazz;
        this.parent = parent;
    }
}
