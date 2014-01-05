package com.bc.dailymotion.api.endpoint;

import com.bc.dailymotion.api.dto.*;

/**
 * Created by Bastien on 05/01/2014.
 */
public interface Endpoint<T> {
    public enum EndpointType{
        ALL, ID, ME
    }

    public interface VideoEndpoint extends Endpoint<Video> {
        static final String ALL = "videos";
        static final String ID = "video/{0}";
        static final String ME = "me/" + ALL;
    }

    public interface CommentEndpoint extends Endpoint<Comment> {
        static final String ID = "video/{0}";
    }

    public interface ActivityEndpoint extends Endpoint<Activity> {
        static final String ALL = "activities";
        static final String ID = "activity/{0}";
    }

    public interface StrongtagEndpoint extends Endpoint<Strongtag> {
        static final String ID = "strongtag/{0}";
    }

    public interface ChannelEndpoint extends Endpoint<Channel> {
        static final String ALL = "channels";
        static final String ID = "channel/{0}";
    }

    public interface PlaylistEndpoint extends Endpoint<Playlist> {
        static final String ALL = "playlists";
        static final String ID = "playlist/{0}";
        static final String ME = "me/" + ALL;
    }

    public interface UserEndpoint extends Endpoint<User> {
        static final String ALL = "users";
        static final String ID = "user/{0}";
    }

    public interface RecordEndpoint extends Endpoint<Record> {
        static final String ID = "record/{0}";
    }

    public interface SubtitleEndpoint extends Endpoint<Subtitle> {
        static final String ID = "subtitle/{0}";
    }

    public interface ContestEndpoint extends Endpoint<Contest> {
        static final String ALL = "contests";
        static final String ID = "contest/{0}";
    }

    public interface GroupEndpoint extends Endpoint<Group> {
        static final String ALL = "groups";
        static final String ID = "group/{0}";
        static final String ME = "me/" + ALL;
    }
}
