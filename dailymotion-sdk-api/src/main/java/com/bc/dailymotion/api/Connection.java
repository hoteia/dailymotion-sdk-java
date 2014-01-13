package com.bc.dailymotion.api;

/**
 * Created by Bastien on 05/01/2014.
 */
public interface Connection<E, T> extends Endpoint<E> {


    /*

activities	The user’s activities	No access_token required for reading.	A list of Activity.
children	The user’s children	No access_token required for reading.	A list of User.
contests	Contests this user is member of	No access_token required for reading.	A list of Contest.
fans	The user’s fans.	No access_token required for reading.	A list of User.
favorites	The user’s favorited videos.	No access_token required for reading. manage_favorites scope required for writing.	A list of Video.
features	The videos featured by the user	No access_token required for reading. manage_features scope required for writing.	A list of Video.
feed	The user’s feed	feed scope required for reading.	A list of Activity.
following	The users this user is subscribed to	No access_token required for reading. manage_subscriptions scope required for writing.	A list of User.
friends	The user’s friends	No access_token required for reading. manage_friends scope required for writing.	A list of User.
groups	The user’s created groups	No access_token required for reading. manage_groups scope required for writing.	A list of Group.
offers	The users a user has paid to have access to.	No access_token required for reading. internal role required for writing.	A list of User.
playlists	The user’s playlists	No access_token required for reading. This connection is writable.	A list of Playlist.
subscriptions	The videos comming from user’s subscriptions.	No access_token required for reading.	A list of Video.
videos	The user’s uploaded video	No access_token required for reading. manage_videos scope required for writing.	A list of Video.
The activities connection
     */
}
