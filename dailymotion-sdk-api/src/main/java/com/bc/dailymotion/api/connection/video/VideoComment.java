package com.bc.dailymotion.api.connection.video;

import com.bc.dailymotion.api.Connection;
import com.bc.dailymotion.api.dto.Comment;
import com.bc.dailymotion.api.dto.Video;

/**
 * Created by Bastien on 13/01/2014.
 */
public interface VideoComment extends Connection<Video, Comment> {
    static final String ALL = "comments";
    static final String ID = ALL + "/{0}";
}
