package com.bc.dailymotion.api.endpoint;

import com.bc.dailymotion.api.Endpoint;
import com.bc.dailymotion.api.dto.User;

/**
 * Created by Bastien on 13/01/2014.
 */
public enum UserEndpoint implements Endpoint {
   ALL("users", User.class),
   ID("user/{0}", User.class);

    private String value;
    private Class clazz;

    public String getValue(){
        return this.value;
    }

    public Class getClazz(){
        return this.clazz;
    }

    private UserEndpoint(String value, Class clazz) {
        this.value = value;
        this.clazz = clazz;
    }
}