package com.bc.dailymotion.api;

/**
 * Created by Bastien on 05/01/2014.
 */
public interface Connection {
    /**
     * Accessor used to get the value of the Connection
     *
     * @return The url of the Connection
     */
    String getValue();

    /**
     * Accessor used to get the output class of the Connection
     *
     * @return The expected class that will define the list of elements
     */
    Class getClazz();

    /**
     * Accessor used to get the parent Endpoint
     *
     * @return The parent Endpoint
     */
    Endpoint getParent();
}
