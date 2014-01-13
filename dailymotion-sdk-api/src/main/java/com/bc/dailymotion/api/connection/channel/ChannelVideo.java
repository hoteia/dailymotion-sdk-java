package com.bc.dailymotion.api.connection.channel;

import com.bc.dailymotion.api.Connection;
import com.bc.dailymotion.api.dto.Channel;
import com.bc.dailymotion.api.dto.Video;

/**
 * Created by Bastien on 13/01/2014.
 */
public interface ChannelVideo extends Connection<Channel, Video> {
    static final String ALL = "videos";
    static final String ID = ALL + "/{0}";
}
