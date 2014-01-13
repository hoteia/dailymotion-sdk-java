package com.bc.dailymotion.api.connection.playlist;

import com.bc.dailymotion.api.Connection;
import com.bc.dailymotion.api.dto.Playlist;
import com.bc.dailymotion.api.dto.Video;

/**
 * Created by Bastien on 13/01/2014.
 */
public interface PlaylistVideo extends Connection<Playlist, Video> {
    static final String ALL = "videos";
    static final String ID = ALL + "/{0}";
}
