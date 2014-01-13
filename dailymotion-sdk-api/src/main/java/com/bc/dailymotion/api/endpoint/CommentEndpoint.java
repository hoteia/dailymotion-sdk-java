package com.bc.dailymotion.api.endpoint;

import com.bc.dailymotion.api.Endpoint;
import com.bc.dailymotion.api.dto.Comment;

/**
 * Created by Bastien on 13/01/2014.
 */
public interface CommentEndpoint extends Endpoint<Comment> {
    static final String ID = "video/{0}";
}
