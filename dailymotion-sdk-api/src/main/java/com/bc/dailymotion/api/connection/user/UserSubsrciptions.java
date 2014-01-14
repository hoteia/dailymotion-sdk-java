package com.bc.dailymotion.api.connection.user;

import com.bc.dailymotion.api.Connection;
import com.bc.dailymotion.api.dto.User;
import com.bc.dailymotion.api.dto.Video;

/**
 * Created by a528122 on 14/01/14.
 */
public interface UserSubsrciptions extends Connection<User, Video> {
    static final String ALL = "comments";
    static final String ID = ALL + "/{0}";
}