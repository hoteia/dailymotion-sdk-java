package fr.zebasto.dailymotion.sdk.api.connection.video;

import fr.zebasto.dailymotion.sdk.api.Connection;
import fr.zebasto.dailymotion.sdk.api.Endpoint;
import fr.zebasto.dailymotion.sdk.api.dto.Contest;
import fr.zebasto.dailymotion.sdk.api.endpoint.VideoEndpoint;

/**
 * Created by Bastien on 13/01/2014.
 */
public enum VideoContest implements Connection {
    ALL("contests", Contest.class, VideoEndpoint.ID),
    ID(ALL.value + "/{0}", Contest.class, VideoEndpoint.ID);

    /**
     * Defines the URL of the Connection
     */
    private String value;

    /**
     * Defines the expected class returned in list
     */
    private Class clazz;

    /**
     * Defines the parent Endpoint of this Connection
     */
    private Endpoint parent;

    /**
     * {@inheritDoc}
     */
    public String getValue() {
        return this.value;
    }

    /**
     * {@inheritDoc}
     */
    public Class getClazz() {
        return this.clazz;
    }

    /**
     * {@inheritDoc}
     */
    public Endpoint getParent() {
        return this.parent;
    }

    /**
     * Default constructor for the Connection
     *
     * @param value  The url of the connection
     * @param clazz  The class that will be returned inside the list
     * @param parent The parent endpoint to this connection
     */
    VideoContest(String value, Class clazz, Endpoint parent) {
        this.value = value;
        this.clazz = clazz;
        this.parent = parent;
    }
}
