package com.bc.dailymotion.api.endpoint;

import com.bc.dailymotion.api.Endpoint;
import com.bc.dailymotion.api.dto.Playlist;

/**
 * Created by Bastien on 13/01/2014.
 */
public enum PlaylistEndpoint implements Endpoint {
    ALL("playlists", Playlist.class),
    ID("playlist/{0}", Playlist.class),
    ME("me/" + ALL.value, Playlist.class);

    /**
     * Defines the URL of the Endpoint
     */
    private String value;

    /**
     * Defines the expected class returned in list
     */
    private Class clazz;

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
     * Default constructor for the Endpoint
     *
     * @param value The url of the endpoint
     * @param clazz The class that will be returned inside the list
     */
    private PlaylistEndpoint(String value, Class clazz) {
        this.value = value;
        this.clazz = clazz;
    }
}
