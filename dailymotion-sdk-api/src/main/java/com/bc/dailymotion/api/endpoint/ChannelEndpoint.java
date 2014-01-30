package com.bc.dailymotion.api.endpoint;

import com.bc.dailymotion.api.Endpoint;
import com.bc.dailymotion.api.dto.Channel;

/**
 * Created by Bastien on 13/01/2014.
 */
public enum ChannelEndpoint implements Endpoint {
    ALL("channels", Channel.class),
    ID("channel/{0}", Channel.class);

    private String value;
    private Class clazz;

    public String getValue(){
        return this.value;
    }

    public Class getClazz(){
        return this.clazz;
    }

    private ChannelEndpoint(String value, Class clazz) {
        this.value = value;
        this.clazz = clazz;
    }
}