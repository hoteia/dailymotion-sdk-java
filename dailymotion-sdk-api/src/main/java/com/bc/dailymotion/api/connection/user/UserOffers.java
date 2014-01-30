package com.bc.dailymotion.api.connection.user;

import com.bc.dailymotion.api.Connection;
import com.bc.dailymotion.api.Endpoint;
import com.bc.dailymotion.api.dto.User;
import com.bc.dailymotion.api.endpoint.UserEndpoint;

/**
 * Created by a528122 on 14/01/14.
 */
public enum UserOffers implements Connection {
    ALL("offers", User.class, UserEndpoint.ID),
    ID(ALL.value + "/{0}", User.class, UserEndpoint.ID);

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
    UserOffers(String value, Class clazz, Endpoint parent) {
        this.value = value;
        this.clazz = clazz;
        this.parent = parent;
    }
}