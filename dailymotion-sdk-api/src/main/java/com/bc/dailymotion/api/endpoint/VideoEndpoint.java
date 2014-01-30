package com.bc.dailymotion.api.endpoint;

import com.bc.dailymotion.api.Endpoint;
import com.bc.dailymotion.api.dto.Video;

/**
 * Created by Bastien on 13/01/2014.
 */
public enum VideoEndpoint implements Endpoint {
    ALL("videos", Video.class),
    ID("video/{0}", Video.class),
    ME("me/" + ALL.value, ALL.clazz);

    private String value;
    private Class clazz;

    public String getValue() {
        return this.value;
    }

    public Class getClazz() {
        return this.clazz;
    }

    private VideoEndpoint(String value, Class clazz) {
        this.value = value;
        this.clazz = clazz;
    }
}
