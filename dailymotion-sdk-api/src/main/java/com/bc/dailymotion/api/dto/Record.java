package com.bc.dailymotion.api.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.util.Date;
import java.util.List;

/**
 * Created by Bastien on 04/01/2014.
 */
public class Record {
    /**
     * The duration of the record in seconds
     * No access_token required for reading. This field is writable.
     * Returns number, min value: 120, max value: 14400.
     */
    private int duration;

    /**
     * The record object ID
     * No access_token required for reading.
     * Returns the object id.
     */
    private String id;

    /**
     * The record’s owner
     * No access_token required for reading.
     * Return a user. You can request sub-fields by using owner.<sub-field> notation.
     */
    private User owner;

    /**
     * The delay between each new record in seconds.
     * No access_token required for reading. This field is writable.
     * Returns number, min value: 120.
     */
    private int periodicity;

    /**
     * The recordStatus corresponds to the current state of the recording process. Changing the status to started will result in the instant beginning of the recording process, while changing this status from started to stopped will stop a recording session. The paused and resumed values are working the same way and allow the user to pause and then to resume a recording session.
     * No access_token required for reading. This field is writable.
     * Returns string, allowed values: started, resumed, paused, stopped.
     */
    @JsonProperty(value = "record_status")
    private String recordStatus;

    /**
     * Returns a list of video ids corresponding to the recorded videos from the given record id.
     * No access_token required for reading.
     * Returns array, min size: 1, max size: 150.
     */
    private List<String> recorded;

    /**
     * The date when the record has to start
     * No access_token required for reading. This field is writable.
     * Returns date.
     */
    @JsonProperty(value = "start_date")
    private Date startDate;

    /**
     * The title given to the record.
     * No access_token required for reading. This field is writable.
     * Returns string, min size: 1, max size: 1000.
     */
    private String title;

    /**
     * Returns the Duration
     *
     * @return the Duration
     */
    public int getDuration() {
        return duration;
    }

    /**
     * Set the Duration
     *
     * @param duration the Duration to set
     */
    public void setDuration(int duration) {
        this.duration = duration;
    }

    /**
     * Returns the Id
     *
     * @return the Id
     */
    public String getId() {
        return id;
    }

    /**
     * Set the Id
     *
     * @param id the Id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Returns the Owner
     *
     * @return the Owner
     */
    public User getOwner() {
        return owner;
    }

    /**
     * Set the Owner
     *
     * @param owner the Owner to set
     */
    public void setOwner(User owner) {
        this.owner = owner;
    }

    /**
     * Returns the Periodicity
     *
     * @return the Periodicity
     */
    public int getPeriodicity() {
        return periodicity;
    }

    /**
     * Set the Periodicity
     *
     * @param periodicity the Periodicity to set
     */
    public void setPeriodicity(int periodicity) {
        this.periodicity = periodicity;
    }

    /**
     * Returns the Record_status
     *
     * @return the Record_status
     */
    public String getRecordStatus() {
        return recordStatus;
    }

    /**
     * Set the Record_status
     *
     * @param recordStatus the Record_status to set
     */
    public void setRecordStatus(String recordStatus) {
        this.recordStatus = recordStatus;
    }

    /**
     * Returns the Recorded
     *
     * @return the Recorded
     */
    public List<String> getRecorded() {
        return recorded;
    }

    /**
     * Set the Recorded
     *
     * @param recorded the Recorded to set
     */
    public void setRecorded(List<String> recorded) {
        this.recorded = recorded;
    }

    /**
     * Returns the Start_date
     *
     * @return the Start_date
     */
    public Date getStartDate() {
        return startDate;
    }

    /**
     * Set the Start_date
     *
     * @param startDate the Start_date to set
     */
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    /**
     * Returns the Title
     *
     * @return the Title
     */
    public String getTitle() {
        return title;
    }

    /**
     * Set the Title
     *
     * @param title the Title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * {@docRoot}
     */
    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.DEFAULT_STYLE);
    }

    /**
     * {@docRoot}
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Record record = (Record) o;

        if (id != null ? !id.equals(record.id) : record.id != null) return false;

        return true;
    }

    /**
     * {@docRoot}
     */
    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }
}
