package com.bc.dailymotion.api;

/**
 * Created by Bastien on 05/01/2014.
 */
public interface Endpoint {
    /**
     * Accessor used to get the value of the Endpoint
     *
     * @return The url of the Connection
     */
    String getValue();

    /**
     * Accessor used to get the output class of the Endpoint
     *
     * @return The expected class that will define the list of elements
     */
    Class getClazz();
}