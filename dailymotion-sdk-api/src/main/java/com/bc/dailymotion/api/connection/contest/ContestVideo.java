package com.bc.dailymotion.api.connection.contest;

import com.bc.dailymotion.api.Connection;
import com.bc.dailymotion.api.Endpoint;
import com.bc.dailymotion.api.dto.Contest;
import com.bc.dailymotion.api.dto.User;
import com.bc.dailymotion.api.dto.Video;
import com.bc.dailymotion.api.endpoint.ContestEndpoint;

/**
 * Created by Bastien on 13/01/2014.
 */
public enum ContestVideo implements Connection {
    ALL("videos", Video.class, ContestEndpoint.ID),
    ID(ALL.value + "/{0}", Video.class, ContestEndpoint.ID);

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

    ContestVideo(String value, Class clazz, Endpoint parent) {
        this.value = value;
        this.clazz = clazz;
        this.parent = parent;
    }
}
