package com.bc.dailymotion.api.connection.contest;

import com.bc.dailymotion.api.Connection;
import com.bc.dailymotion.api.dto.Contest;
import com.bc.dailymotion.api.dto.User;

/**
 * Created by Bastien on 13/01/2014.
 */
public interface ContestMember extends Connection<Contest, User> {
    static final String ALL = "members";
    static final String ID = ALL + "/{0}";
}
