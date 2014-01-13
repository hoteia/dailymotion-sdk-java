package com.bc.dailymotion.api.connection.group;

import com.bc.dailymotion.api.Connection;
import com.bc.dailymotion.api.dto.Group;
import com.bc.dailymotion.api.dto.User;

/**
 * Created by Bastien on 13/01/2014.
 */
public interface GroupMember extends Connection<Group, User> {
    static final String ALL = "members";
    static final String ID = ALL + "/{0}";
}
