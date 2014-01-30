package com.bc.dailymotion.api.endpoint;

import com.bc.dailymotion.api.Endpoint;
import com.bc.dailymotion.api.dto.Comment;

/**
 * Created by Bastien on 13/01/2014.
 */
public enum CommentEndpoint implements Endpoint {
   ID("comment/{0}", Comment.class);

    private String value;
    private Class clazz;

    public String getValue(){
        return this.value;
    }

    public Class getClazz(){
        return this.clazz;
    }

    private CommentEndpoint(String value, Class clazz) {
        this.value = value;
        this.clazz = clazz;
    }
}
