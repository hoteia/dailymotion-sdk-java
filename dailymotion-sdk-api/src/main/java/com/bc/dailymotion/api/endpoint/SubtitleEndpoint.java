package com.bc.dailymotion.api.endpoint;

import com.bc.dailymotion.api.Endpoint;
import com.bc.dailymotion.api.dto.Subtitle;

/**
 * Created by Bastien on 13/01/2014.
 */
public interface SubtitleEndpoint extends Endpoint<Subtitle> {
    static final String ID = "subtitle/{0}";
}
