package com.bc.dailymotion.api.connection.video;

import com.bc.dailymotion.api.Connection;
import com.bc.dailymotion.api.dto.Record;
import com.bc.dailymotion.api.dto.Video;

/**
 * Created by Bastien on 13/01/2014.
 */
public interface VideoRecord extends Connection<Video, Record> {
    static final String ALL = "records";
    static final String ID = ALL + "/{0}";
}
