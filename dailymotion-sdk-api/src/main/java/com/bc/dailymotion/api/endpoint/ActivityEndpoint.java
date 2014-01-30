package com.bc.dailymotion.api.endpoint;

import com.bc.dailymotion.api.Endpoint;
import com.bc.dailymotion.api.dto.Activity;

/**
 * Created by Bastien on 13/01/2014.
 */
public enum ActivityEndpoint implements Endpoint {
    ALL("activities", Activity.class),
    ID("activity/{0}", Activity.class);

    /**
     * Defines the URL of the Endpoint
     */
    private String value;

    /**
     * Defines the expected class returned in list
     */
    private Class clazz;

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
     * Default constructor for the Endpoint
     *
     * @param value The url of the endpoint
     * @param clazz The class that will be returned inside the list
     */
    private ActivityEndpoint(String value, Class clazz) {
        this.value = value;
        this.clazz = clazz;
    }
}
