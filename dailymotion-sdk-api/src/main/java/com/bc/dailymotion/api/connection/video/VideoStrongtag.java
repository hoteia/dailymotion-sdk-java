package com.bc.dailymotion.api.connection.video;

import com.bc.dailymotion.api.Connection;
import com.bc.dailymotion.api.dto.Strongtag;
import com.bc.dailymotion.api.dto.Video;

/**
 * Created by Bastien on 13/01/2014.
 */
public interface VideoStrongtag extends Connection<Video, Strongtag> {
    static final String ALL = "strongtags";
    static final String ID = ALL + "/{0}";
}
