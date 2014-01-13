package com.bc.dailymotion.api.endpoint;

import com.bc.dailymotion.api.Endpoint;
import com.bc.dailymotion.api.dto.Channel;

/**
 * Created by Bastien on 13/01/2014.
 */
public interface ChannelEndpoint extends Endpoint<Channel> {
    static final String ALL = "channels";
    static final String ID = "channel/{0}";
}