package com.bc.dailymotion.api.connection.video;

import com.bc.dailymotion.api.Connection;
import com.bc.dailymotion.api.dto.Group;
import com.bc.dailymotion.api.dto.Video;

/**
 * Created by Bastien on 13/01/2014.
 */
public interface VideoGroup extends Connection<Video, Group> {
    static final String ALL = "groups";
    static final String ID = ALL + "/{0}";
}
