package com.bc.dailymotion.api.connection.user;

import com.bc.dailymotion.api.Connection;
import com.bc.dailymotion.api.dto.Activity;
import com.bc.dailymotion.api.dto.User;

/**
 * Created by a528122 on 14/01/14.
 */
public interface UserFeed extends Connection<User, Activity> {
    static final String ALL = "comments";
    static final String ID = ALL + "/{0}";
}
