package com.bc.dailymotion.api.endpoint;

import com.bc.dailymotion.api.Endpoint;
import com.bc.dailymotion.api.dto.Contest;

/**
 * Created by Bastien on 13/01/2014.
 */
public interface ContestEndpoint extends Endpoint<Contest> {
    static final String ALL = "contests";
    static final String ID = "contest/{0}";
}
