package com.bc.dailymotion.api.endpoint;

import com.bc.dailymotion.api.Endpoint;
import com.bc.dailymotion.api.dto.Record;

/**
 * Created by Bastien on 13/01/2014.
 */
public interface RecordEndpoint extends Endpoint<Record> {
    static final String ID = "record/{0}";
}
