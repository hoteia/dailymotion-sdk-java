package com.bc.dailymotion.api.connection.video;

import com.bc.dailymotion.api.Connection;
import com.bc.dailymotion.api.Endpoint;
import com.bc.dailymotion.api.dto.Comment;
import com.bc.dailymotion.api.dto.Subtitle;
import com.bc.dailymotion.api.dto.Video;
import com.bc.dailymotion.api.endpoint.VideoEndpoint;

/**
 * Created by Bastien on 13/01/2014.
 */
public enum VideoSubtitle implements Connection {
    ALL("subtitles", Subtitle.class, VideoEndpoint.ID),
    ID(ALL.value + "/{0}", Subtitle.class, VideoEndpoint.ID);

    private String value;
    private Class clazz;
    private Endpoint parent;

    public String getValue() {
        return this.value;
    }

    public Class getClazz() {
        return this.clazz;
    }

    public Endpoint getParent() {
        return this.parent;
    }

    VideoSubtitle(String value, Class clazz, Endpoint parent) {
        this.value = value;
        this.clazz = clazz;
        this.parent = parent;
    }
}
