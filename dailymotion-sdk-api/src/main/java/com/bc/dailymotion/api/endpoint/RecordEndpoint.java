package com.bc.dailymotion.api.endpoint;

import com.bc.dailymotion.api.Endpoint;
import com.bc.dailymotion.api.dto.Record;

/**
 * Created by Bastien on 13/01/2014.
 */
public enum RecordEndpoint implements Endpoint {
    ID("record/{0}", Record.class);

    private String value;
    private Class clazz;

    public String getValue(){
        return this.value;
    }

    public Class getClazz(){
        return this.clazz;
    }

    private RecordEndpoint(String value, Class clazz) {
        this.value = value;
        this.clazz = clazz;
    }
}
