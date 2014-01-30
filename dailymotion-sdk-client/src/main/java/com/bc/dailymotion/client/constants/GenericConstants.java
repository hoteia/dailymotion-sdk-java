package com.bc.dailymotion.client.constants;

/**
 * Created by a528122 on 16/01/14.
 */
public enum GenericConstants {
    TWO_PARAMETERS("{0}/{1}"),
    THREE_PARAMETERS("{0}/{1}/{2}");

    private String message;

    GenericConstants(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    /**
     * {@docRoot}
     */
    @Override
    public String toString() {
        return this.getMessage();
    }
}
