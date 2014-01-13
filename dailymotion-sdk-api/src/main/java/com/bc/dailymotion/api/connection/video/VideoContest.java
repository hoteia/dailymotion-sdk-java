package com.bc.dailymotion.api.connection.video;

import com.bc.dailymotion.api.Connection;
import com.bc.dailymotion.api.dto.Contest;
import com.bc.dailymotion.api.dto.Video;

/**
 * Created by Bastien on 13/01/2014.
 */
public interface VideoContest extends Connection<Video, Contest> {
    static final String ALL = "contests";
    static final String ID = ALL + "/{0}";
}
