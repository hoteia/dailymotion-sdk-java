package com.bc.dailymotion.api;

/**
 * Created by Bastien on 05/01/2014.
 */
public interface Connection {
    /**
     * Accessor used to get the value of the Connection
     */
    String getValue();

    /**
     * Accessor used to get the output class of the Connection
     */
    Class getClazz();

    /**
     * Accessor used to get the parent Endpoint
     */
    Endpoint getParent();
}
