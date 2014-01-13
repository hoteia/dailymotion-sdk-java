package com.bc.dailymotion.api.connection.video;

import com.bc.dailymotion.api.Connection;
import com.bc.dailymotion.api.dto.Video;

/**
 * Created by Bastien on 13/01/2014.
 */
public interface VideoRelated extends Connection<Video, Video> {
    static final String ALL = "related";
    static final String ID = ALL + "/{0}";
}
