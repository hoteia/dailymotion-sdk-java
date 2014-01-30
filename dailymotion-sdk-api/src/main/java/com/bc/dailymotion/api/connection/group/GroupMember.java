package com.bc.dailymotion.api.connection.group;

import com.bc.dailymotion.api.Connection;
import com.bc.dailymotion.api.Endpoint;
import com.bc.dailymotion.api.dto.Group;
import com.bc.dailymotion.api.dto.User;
import com.bc.dailymotion.api.dto.Video;
import com.bc.dailymotion.api.endpoint.ContestEndpoint;
import com.bc.dailymotion.api.endpoint.GroupEndpoint;

/**
 * Created by Bastien on 13/01/2014.
 */
public enum GroupMember implements Connection {
    ALL("members", User.class, GroupEndpoint.ID),
    ID(ALL.value + "/{0}", User.class, GroupEndpoint.ID);

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

    GroupMember(String value, Class clazz, Endpoint parent) {
        this.value = value;
        this.clazz = clazz;
        this.parent = parent;
    }
}
