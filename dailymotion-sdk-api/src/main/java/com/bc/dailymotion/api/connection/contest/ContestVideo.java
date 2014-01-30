package com.bc.dailymotion.api.connection.contest;

import com.bc.dailymotion.api.Connection;
import com.bc.dailymotion.api.Endpoint;
import com.bc.dailymotion.api.dto.Video;
import com.bc.dailymotion.api.endpoint.ContestEndpoint;

/**
 * Created by Bastien on 13/01/2014.
 */
public enum ContestVideo implements Connection {
    ALL("videos", Video.class, ContestEndpoint.ID),
    ID(ALL.value + "/{0}", Video.class, ContestEndpoint.ID);

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
    ContestVideo(String value, Class clazz, Endpoint parent) {
        this.value = value;
        this.clazz = clazz;
        this.parent = parent;
    }
}
