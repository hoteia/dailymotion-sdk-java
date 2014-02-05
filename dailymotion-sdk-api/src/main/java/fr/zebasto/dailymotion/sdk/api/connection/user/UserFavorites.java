package fr.zebasto.dailymotion.sdk.api.connection.user;

import fr.zebasto.dailymotion.sdk.api.Connection;
import fr.zebasto.dailymotion.sdk.api.Endpoint;
import fr.zebasto.dailymotion.sdk.api.dto.Video;
import fr.zebasto.dailymotion.sdk.api.endpoint.UserEndpoint;

/**
 * Created by a528122 on 14/01/14.
 */
public enum UserFavorites implements Connection {
    ALL("favorites", Video.class, UserEndpoint.ID),
    ID(ALL.value + "/{0}", Video.class, UserEndpoint.ID);

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
    UserFavorites(String value, Class clazz, Endpoint parent) {
        this.value = value;
        this.clazz = clazz;
        this.parent = parent;
    }
}
