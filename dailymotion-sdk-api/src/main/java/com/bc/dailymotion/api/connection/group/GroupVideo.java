package com.bc.dailymotion.api.connection.group;

import com.bc.dailymotion.api.Connection;
import com.bc.dailymotion.api.dto.Group;
import com.bc.dailymotion.api.dto.Video;

/**
 * Created by Bastien on 13/01/2014.
 */
public interface GroupVideo extends Connection<Group, Video> {
    static final String ALL = "videos";
    static final String ID = ALL + "/{0}";
}
