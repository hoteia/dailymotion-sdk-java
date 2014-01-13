package com.bc.dailymotion.api.endpoint;

import com.bc.dailymotion.api.Endpoint;
import com.bc.dailymotion.api.dto.Strongtag;

/**
 * Created by Bastien on 13/01/2014.
 */
public interface StrongtagEndpoint extends Endpoint<Strongtag> {
    static final String ID = "strongtag/{0}";
}
