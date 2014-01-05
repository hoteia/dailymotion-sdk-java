package com.bc.dailymotion.api.dto;

import java.util.Date;

/**
 * Created by Bastien on 04/01/2014.
 */
public class User {
    String address;//	The address of the user	userinfo scope required for reading. userinfo scope required for writing.	Returns string, min size: 1, max size: 150.
    String avatar_120_url;//	The URL to the user’s avatar (square of 120px side length).	No access_token required for reading.	Returns url.
    String avatar_190_url;//	The URL to the user’s avatar (190px by 190px).	No access_token required for reading.	Returns url.
    String avatar_240_url;//	The URL to the user’s avatar (240px by 240px).	No access_token required for reading.	Returns url.
    String avatar_25_url;//	The URL to the user’s avatar (square of 25px side length).	No access_token required for reading.	Returns url.
    String avatar_360_url;//	The URL to the user’s avatar (square of 360px side length).	No access_token required for reading.	Returns url.
    String avatar_480_url;//	The URL to the user’s avatar (square of 480px side length).	No access_token required for reading.	Returns url.
    String avatar_60_url;//	The URL to the user’s avatar (square of 60px side length).	No access_token required for reading.	Returns url.
    String avatar_720_url;//	The URL to the user’s avatar (square of 720px side length).	No access_token required for reading.	Returns url.
    String avatar_url;//	The URL to the user’s avatar	This field is writable.	Returns url.
    String background_url;//	The URL to the user’s background (Max 1680px by 2000px).	No access_token required for reading. This field is writable.	Returns url.
    String banner_url;//	The URL to the user’s banner (Max 970px by 120px).	No access_token required for reading. This field is writable.	Returns url.
    Date birthday;//	The user’s birthday	userinfo scope required for reading. userinfo scope required for writing.	Returns date.
    String city;//	The city of the user	userinfo scope required for reading. userinfo scope required for writing.	Returns string, min size: 1, max size: 150.
    String cleeng_popup_url;//	The URL used to call cleeng popup	No access_token required for reading.	Returns url.
    String country;//	The country of the user	userinfo scope required for reading. userinfo scope required for writing.	Returns string, min size: 1, max size: 150.
    Date created_time;//	The date when the user joined the site	No access_token required for reading.	Returns date.
    String description;//	The user’s description	No access_token required for reading. This field is writable.	Returns string, min size: 1, max size: 2000.
    String email;//	The user’s email address	email scope required for reading.	Returns email.
    boolean email_notification;//	returns true if the user can receive email notifications, false otherwise	No access_token required for reading. This field is writable.	Returns boolean.
    String event_delete;//	The name of pushd event sent on user deletion	No access_token required for reading.	Returns string, min size: 1, max size: 150.
    String event_modify;//	The name of pushd event sent on user modification	No access_token required for reading.	Returns string, min size: 1, max size: 150.
    String event_video_delete;//	The name of pushd event sent when user deletes a video	No access_token required for reading.	Returns string, min size: 1, max size: 150.
    String event_video_live_offair;//	The name of pushd event sent when user puts a live video off air	No access_token required for reading.	Returns string, min size: 1, max size: 150.
    String event_video_live_onair;//	The name of pushd event sent when user puts a live video on air	No access_token required for reading.	Returns string, min size: 1, max size: 150.
    String event_video_modify;//	The name of pushd event sent when user deletes a video	No access_token required for reading.	Returns string, min size: 1, max size: 150.
    String filters;//	A list of filters availabe to reduce the result set.	This field can be used as filter but can’t be read nor written.	Returns array, allowed values: featured, official, creative, premium, kids, kidsContentPremium, kidsContentFree, kidsContentPremiumAndFree, kidsMaleGender, kidsFemaleGender, kidsAge1, kidsAge2.
    String first_name;//	User’s first name	userinfo scope required for reading. userinfo scope required for writing.	Returns string, min size: 1, max size: 150.
    String fullname;//	The user’s fullname	userinfo scope required for reading. userinfo scope required for writing.	Returns string, min size: 1, max size: 50.
    String gender;//	The user’s gender: female or male	No access_token required for reading. This field is writable.	Returns string, allowed values: male, female.
    String id;//	The user object ID	No access_token required for reading.	Returns the object id.
    String language;//	The user’s language	This field can be used as filter. No access_token required for reading. This field is writable.	Returns string, min size: 1, max size: 150.
    String last_name;//	User’s last name	userinfo scope required for reading. userinfo scope required for writing.	Returns string, min size: 1, max size: 150.
    String limits;//	Returns user’s limits like maximum allowed duration and size per uploaded video etc. This property can only be obtained for the currently logged user.	No access_token required for reading.	Returns dict, min size: 1, max size: 150.
    User parent;//	The id of the parent of this user (use parent.screenname to show the parent user name).	This field can be used as filter. No access_token required for reading.	Return a user. You can request sub-fields by using parent.<sub-field> notation.
    String password;//	user’s password	This field is writable.	Returns string, min size: 1, max size: 150.
    boolean paywall;//	True if the user has a SVOD offer defined	No access_token required for reading.	Returns boolean.
    int paywall_price;//	The price of svod offer as float in the current currency or null. See currency field of the /locale endpoint to get the current currency.	No access_token required for reading.	Returns number, min value: 0.
    String paywall_price_formatted;//	The price of svod offer formatted with currency according to the request localization or null.	No access_token required for reading.	Returns string, min size: 1, max size: 150.
    String paywall_subscription_type;//	The subscription type of the svod offer.	No access_token required for reading.	Returns string, min size: 1, max size: 150.
    String phone;//	The phone number of the user	userinfo scope required for reading. userinfo scope required for writing.	Returns string, min size: 1, max size: 150.
    int playlists_total;//	The total number of user’s playlists	No access_token required for reading.	Returns number, min value: 0.
    int post_code;//	The zip of the user	userinfo scope required for reading. userinfo scope required for writing.	Returns string, min size: 1, max size: 150.
    String screenname;//	The user’s fullname of username depending on user’s preference	No access_token required for reading. userinfo scope required for writing.	Returns string, min size: 1, max size: 50.
    String search;//	Full text search	This field can be used as filter but can’t be read nor written.	Returns string, min size: 1, max size: 150.
    String sort;//	Change result ordering	This field can be used as filter but can’t be read nor written.	Returns string, allowed values: recent, relevance, popular, commented, rated, alpha, alphaZA, alphaAZFullname, alphaZAFullname.
    String status;//	The user account status	No access_token required for reading.	Returns string, allowed values: pending-activation, disabled, active, unknown.
    String type;//	The user type	No access_token required for reading.	Returns string, allowed values: ugc, motionmaker, official.
    String url;//	The URL of the user on Dailymotion.	No access_token required for reading.	Returns url.
    String username;//	The user’s username	No access_token required for reading. userinfo scope required for writing.	Returns string, min size: 1, max size: 150.
    int videos_total;//	The total number of user’s public videos	No access_token required for reading.	Returns number, min value: 0.
    Video videostar;//	Change the user’s video star	No access_token required for reading. manage_videos scope required for writing.	Return a video. You can request sub-fields by using videostar.<sub-field> notation.
    int views_total;//	The total aggregated number of views on all user’s videos	No access_token required for reading.	Returns number, min value: 0.
}
