package com.bc.dailymotion.api.connection.channel;

import com.bc.dailymotion.api.Connection;
import com.bc.dailymotion.api.Endpoint;
import com.bc.dailymotion.api.dto.Video;
import com.bc.dailymotion.api.endpoint.ChannelEndpoint;

/**
 * Created by Bastien on 13/01/2014.
 */
public enum ChannelVideo implements Connection {
    ALL("videos", Video.class, ChannelEndpoint.ID),
    ID(ALL.value + "/{0}", Video.class, ChannelEndpoint.ID);

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

    ChannelVideo(String value, Class clazz, Endpoint parent) {
        this.value = value;
        this.clazz = clazz;
        this.parent = parent;
    }
}
