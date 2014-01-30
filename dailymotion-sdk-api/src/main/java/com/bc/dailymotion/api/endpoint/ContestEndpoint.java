package com.bc.dailymotion.api.endpoint;

import com.bc.dailymotion.api.Endpoint;
import com.bc.dailymotion.api.dto.Contest;

/**
 * Created by Bastien on 13/01/2014.
 */
public enum ContestEndpoint implements Endpoint {
   ALL("contests", Contest.class),
   ID("contest/{0}", Contest.class);

    private String value;
    private Class clazz;

    public String getValue(){
        return this.value;
    }

    public Class getClazz(){
        return this.clazz;
    }

    private ContestEndpoint(String value, Class clazz) {
        this.value = value;
        this.clazz = clazz;
    }
}
