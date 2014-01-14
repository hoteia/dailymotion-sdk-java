package com.bc.dailymotion.api.connection.user;

import com.bc.dailymotion.api.Connection;
import com.bc.dailymotion.api.dto.User;

/**
 * Created by a528122 on 14/01/14.
 */
public interface UserFollowing extends Connection<User, User> {
    static final String ALL = "comments";
    static final String ID = ALL + "/{0}";
}
