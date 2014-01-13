package com.bc.dailymotion.api.endpoint;

import com.bc.dailymotion.api.Endpoint;
import com.bc.dailymotion.api.dto.Activity;

/**
 * Created by Bastien on 13/01/2014.
 */
public interface ActivityEndpoint extends Endpoint<Activity> {
    static final String ALL = "activities";
    static final String ID = "activity/{0}";
}
