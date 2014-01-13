package com.bc.dailymotion.api.endpoint;

import com.bc.dailymotion.api.Endpoint;
import com.bc.dailymotion.api.dto.Group;

/**
 * Created by Bastien on 13/01/2014.
 */
public interface GroupEndpoint extends Endpoint<Group> {
    static final String ALL = "groups";
    static final String ID = "group/{0}";
    static final String ME = "me/" + ALL;
}
