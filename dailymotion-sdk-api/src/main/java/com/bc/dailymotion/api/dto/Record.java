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

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public User getOwner() {
        return owner;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }

    public int getPeriodicity() {
        return periodicity;
    }

    public void setPeriodicity(int periodicity) {
        this.periodicity = periodicity;
    }

    public String getRecord_status() {
        return record_status;
    }

    public void setRecord_status(String record_status) {
        this.record_status = record_status;
    }

    public List<String> getRecorded() {
        return recorded;
    }

    public void setRecorded(List<String> recorded) {
        this.recorded = recorded;
    }

    public Date getStart_date() {
        return start_date;
    }

    public void setStart_date(Date start_date) {
        this.start_date = start_date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
