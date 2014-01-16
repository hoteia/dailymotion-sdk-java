package com.bc.dailymotion.client.exceptions;

/**
 * Created by a528122 on 16/01/14.
 */
public enum GenericErrorMessages {
    NO_NULL_ALLOWED("At least one of the given parameter is null"),
    TYPE_ID_NOT_ALLOWED("The type ID isn't allowed for this method");

    private String message;

    GenericErrorMessages(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
