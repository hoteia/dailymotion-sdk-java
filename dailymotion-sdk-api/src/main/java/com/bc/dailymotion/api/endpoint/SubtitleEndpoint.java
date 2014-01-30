package com.bc.dailymotion.api.endpoint;

import com.bc.dailymotion.api.Endpoint;
import com.bc.dailymotion.api.dto.Subtitle;

/**
 * Created by Bastien on 13/01/2014.
 */
public enum SubtitleEndpoint implements Endpoint {
    ID("subtitle/{0}", Subtitle.class);

    private String value;
    private Class clazz;

    public String getValue(){
        return this.value;
    }

    public Class getClazz(){
        return this.clazz;
    }

    private SubtitleEndpoint(String value, Class clazz) {
        this.value = value;
        this.clazz = clazz;
    }
}
