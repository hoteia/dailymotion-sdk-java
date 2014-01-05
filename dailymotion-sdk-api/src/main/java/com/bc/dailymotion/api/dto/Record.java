package com.bc.dailymotion.api.dto;

import java.util.Date;
import java.util.List;

/**
 * Created by Bastien on 04/01/2014.
 */
public class Record {
    int duration; //	The duration of the record in seconds	No access_token required for reading. This field is writable.	Returns number, min value: 120, max value: 14400.
    String id;//	The record object ID	No access_token required for reading.	Returns the object id.
    User owner;//	The record’s owner	No access_token required for reading.	Return a user. You can request sub-fields by using owner.<sub-field> notation.
    int periodicity;//	The delay between each new record in seconds.	No access_token required for reading. This field is writable.	Returns number, min value: 120.
    String record_status;//	The record_status corresponds to the current state of the recording process. Changing the status to started will result in the instant beginning of the recording process, while changing this status from started to stopped will stop a recording session. The paused and resumed values are working the same way and allow the user to pause and then to resume a recording session.	No access_token required for reading. This field is writable.	Returns string, allowed values: started, resumed, paused, stopped.
    List<String> recorded;//	Returns a list of video ids corresponding to the recorded videos from the given record id.	No access_token required for reading.	Returns array, min size: 1, max size: 150.
    Date start_date;//	The date when the record has to start	No access_token required for reading. This field is writable.	Returns date.
    String title;//	The title given to the record.	No access_token required for reading. This field is writable.	Returns string, min size: 1, max size: 1000.
}
