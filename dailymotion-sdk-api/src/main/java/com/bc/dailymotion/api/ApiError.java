package com.bc.dailymotion.api;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

/**
 * Created by a528122 on 31/01/14.
 */
@JsonRootName(value = "error")
public class ApiError extends Exception {
    private int code;
    private String message;
    private String type;

    /**
     * Default constructor
     */
    @JsonCreator
    public ApiError(@JsonProperty(value = "code") int code, @JsonProperty(value = "message") String message, @JsonProperty(value = "type") String type){
        this.code = code;
        this.message = message;
        this.type = type;
    }

    /**
     * Returns the code
     *
     * @return the code
     */
    public int getCode() {
        return code;
    }

    /**
     * Set the code
     *
     * @param code the code to set
     */
    public void setCode(int code) {
        this.code = code;
    }

    /**
     * Returns the message
     *
     * @return the message
     */
    public String getMessage() {
        return message;
    }

    /**
     * Set the message
     *
     * @param message the message to set
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * Returns the type
     *
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * Set the type
     *
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }
}
