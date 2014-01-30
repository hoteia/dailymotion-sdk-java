package com.bc.dailymotion.api.endpoint;

import com.bc.dailymotion.api.Endpoint;
import com.bc.dailymotion.api.dto.Activity;

/**
 * Created by Bastien on 13/01/2014.
 */
public enum ActivityEndpoint implements Endpoint {
    ALL("activities", Activity.class),
    ID("activity/{0}", Activity.class);

    private String value;
    private Class clazz;

    public String getValue() {
        return this.value;
    }

    public Class getClazz() {
        return this.clazz;
    }

    private ActivityEndpoint(String value, Class clazz) {
        this.value = value;
        this.clazz = clazz;
    }
}
