package com.bc.dailymotion.api.connection.video;

import com.bc.dailymotion.api.Connection;
import com.bc.dailymotion.api.Endpoint;
import com.bc.dailymotion.api.dto.Group;
import com.bc.dailymotion.api.endpoint.VideoEndpoint;

/**
 * Created by Bastien on 13/01/2014.
 */
public enum VideoGroup implements Connection {
    ALL("groups", Group.class, VideoEndpoint.ID),
    ID(ALL.value + "/{0}", Group.class, VideoEndpoint.ID);

    /**
     * Defines the URL of the Connection
     */
    private String value;

    /**
     * Defines the expected class returned in list
     */
    private Class clazz;

    /**
     * Defines the parent Endpoint of this Connection
     */
    private Endpoint parent;

    /**
     * {@inheritDoc}
     */
    public String getValue() {
        return this.value;
    }

    /**
     * {@inheritDoc}
     */
    public Class getClazz() {
        return this.clazz;
    }

    /**
     * {@inheritDoc}
     */
    public Endpoint getParent() {
        return this.parent;
    }

    /**
     * Default constructor for the Connection
     *
     * @param value  The url of the connection
     * @param clazz  The class that will be returned inside the list
     * @param parent The parent endpoint to this connection
     */
    VideoGroup(String value, Class clazz, Endpoint parent) {
        this.value = value;
        this.clazz = clazz;
        this.parent = parent;
    }
}
