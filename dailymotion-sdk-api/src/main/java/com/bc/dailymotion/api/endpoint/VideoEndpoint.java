package com.bc.dailymotion.api.endpoint;

import com.bc.dailymotion.api.Endpoint;
import com.bc.dailymotion.api.dto.Video;

/**
 * Created by Bastien on 13/01/2014.
 */
public interface VideoEndpoint extends Endpoint<Video> {
    static final String ALL = "videos";
    static final String ID = "video/{0}";
    static final String ME = "me/" + ALL;
}
