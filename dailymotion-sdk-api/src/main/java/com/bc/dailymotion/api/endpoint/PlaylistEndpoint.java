package com.bc.dailymotion.api.endpoint;

import com.bc.dailymotion.api.Endpoint;
import com.bc.dailymotion.api.dto.Playlist;

/**
 * Created by Bastien on 13/01/2014.
 */
public interface PlaylistEndpoint extends Endpoint<Playlist> {
    static final String ALL = "playlists";
    static final String ID = "playlist/{0}";
    static final String ME = "me/" + ALL;
}
