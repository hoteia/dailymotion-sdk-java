package com.bc.dailymotion.api.connection.video;

import com.bc.dailymotion.api.Connection;
import com.bc.dailymotion.api.dto.Subtitle;
import com.bc.dailymotion.api.dto.Video;

/**
 * Created by Bastien on 13/01/2014.
 */
public interface VideoSubtitle extends Connection<Video, Subtitle> {
    static final String ALL = "subtitles";
    static final String ID = ALL + "/{0}";
}
