package com.bc.dailymotion.api.connection.video;

import com.bc.dailymotion.api.Connection;
import com.bc.dailymotion.api.dto.Playlist;
import com.bc.dailymotion.api.dto.Video;

/**
 * Created by Bastien on 13/01/2014.
 */
public interface VideoPlayList extends Connection<Video, Playlist> {
    static final String ALL = "playlists";
    static final String ID = ALL + "/{0}";
}