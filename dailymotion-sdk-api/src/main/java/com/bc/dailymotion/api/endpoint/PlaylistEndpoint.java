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

    private String value;
    private Class clazz;

    public String getValue(){
        return this.value;
    }

    public Class getClazz(){
        return this.clazz;
    }

    private PlaylistEndpoint(String value, Class clazz) {
        this.value = value;
        this.clazz = clazz;
    }
}
