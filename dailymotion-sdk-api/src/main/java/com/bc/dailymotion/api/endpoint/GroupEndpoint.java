package com.bc.dailymotion.api.endpoint;

import com.bc.dailymotion.api.Endpoint;
import com.bc.dailymotion.api.dto.Group;

/**
 * Created by Bastien on 13/01/2014.
 */
public enum GroupEndpoint implements Endpoint {
    ALL("groups", Group.class),
    ID("group/{0}", Group.class),
    ME("me/" + ALL.value, ALL.clazz);

    private String value;
    private Class clazz;

    public String getValue(){
        return this.value;
    }

    public Class getClazz(){
        return this.clazz;
    }

    private GroupEndpoint(String value, Class clazz) {
        this.value = value;
        this.clazz = clazz;
    }
}
