package com.bc.dailymotion.api.endpoint;

import com.bc.dailymotion.api.Endpoint;
import com.bc.dailymotion.api.dto.User;

/**
 * Created by Bastien on 13/01/2014.
 */
public interface UserEndpoint extends Endpoint<User> {
    static final String ALL = "users";
    static final String ID = "user/{0}";
}