package com.bc.dailymotion.api.connection.contest;

import com.bc.dailymotion.api.Connection;
import com.bc.dailymotion.api.dto.Contest;
import com.bc.dailymotion.api.dto.Video;

/**
 * Created by Bastien on 13/01/2014.
 */
public interface ContestVideo extends Connection<Contest, Video> {
    static final String ALL = "videos";
    static final String ID = ALL + "/{0}";
}
