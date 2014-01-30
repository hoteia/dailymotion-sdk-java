package com.bc.dailymotion.api.connection.user;

import com.bc.dailymotion.api.Connection;
import com.bc.dailymotion.api.Endpoint;
import com.bc.dailymotion.api.dto.Video;
import com.bc.dailymotion.api.endpoint.UserEndpoint;

/**
 * Created by a528122 on 14/01/14.
 */
public enum UserFeatures implements Connection {
    ALL("features", Video.class, UserEndpoint.ID),
    ID(ALL.value + "/{0}", Video.class, UserEndpoint.ID);

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

    UserFeatures(String value, Class clazz, Endpoint parent) {
        this.value = value;
        this.clazz = clazz;
        this.parent = parent;
    }
}
