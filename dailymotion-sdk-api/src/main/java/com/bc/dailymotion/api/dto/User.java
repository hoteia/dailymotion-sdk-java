package com.bc.dailymotion.api.dto;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAvatar_120_url() {
        return avatar_120_url;
    }

    public void setAvatar_120_url(String avatar_120_url) {
        this.avatar_120_url = avatar_120_url;
    }

    public String getAvatar_190_url() {
        return avatar_190_url;
    }

    public void setAvatar_190_url(String avatar_190_url) {
        this.avatar_190_url = avatar_190_url;
    }

    public String getAvatar_240_url() {
        return avatar_240_url;
    }

    public void setAvatar_240_url(String avatar_240_url) {
        this.avatar_240_url = avatar_240_url;
    }

    public String getAvatar_25_url() {
        return avatar_25_url;
    }

    public void setAvatar_25_url(String avatar_25_url) {
        this.avatar_25_url = avatar_25_url;
    }

    public String getAvatar_360_url() {
        return avatar_360_url;
    }

    public void setAvatar_360_url(String avatar_360_url) {
        this.avatar_360_url = avatar_360_url;
    }

    public String getAvatar_480_url() {
        return avatar_480_url;
    }

    public void setAvatar_480_url(String avatar_480_url) {
        this.avatar_480_url = avatar_480_url;
    }

    public String getAvatar_60_url() {
        return avatar_60_url;
    }

    public void setAvatar_60_url(String avatar_60_url) {
        this.avatar_60_url = avatar_60_url;
    }

    public String getAvatar_720_url() {
        return avatar_720_url;
    }

    public void setAvatar_720_url(String avatar_720_url) {
        this.avatar_720_url = avatar_720_url;
    }

    public String getAvatar_url() {
        return avatar_url;
    }

    public void setAvatar_url(String avatar_url) {
        this.avatar_url = avatar_url;
    }

    public String getBackground_url() {
        return background_url;
    }

    public void setBackground_url(String background_url) {
        this.background_url = background_url;
    }

    public String getBanner_url() {
        return banner_url;
    }

    public void setBanner_url(String banner_url) {
        this.banner_url = banner_url;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCleeng_popup_url() {
        return cleeng_popup_url;
    }

    public void setCleeng_popup_url(String cleeng_popup_url) {
        this.cleeng_popup_url = cleeng_popup_url;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Date getCreated_time() {
        return created_time;
    }

    public void setCreated_time(Date created_time) {
        this.created_time = created_time;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isEmail_notification() {
        return email_notification;
    }

    public void setEmail_notification(boolean email_notification) {
        this.email_notification = email_notification;
    }

    public String getEvent_delete() {
        return event_delete;
    }

    public void setEvent_delete(String event_delete) {
        this.event_delete = event_delete;
    }

    public String getEvent_modify() {
        return event_modify;
    }

    public void setEvent_modify(String event_modify) {
        this.event_modify = event_modify;
    }

    public String getEvent_video_delete() {
        return event_video_delete;
    }

    public void setEvent_video_delete(String event_video_delete) {
        this.event_video_delete = event_video_delete;
    }

    public String getEvent_video_live_offair() {
        return event_video_live_offair;
    }

    public void setEvent_video_live_offair(String event_video_live_offair) {
        this.event_video_live_offair = event_video_live_offair;
    }

    public String getEvent_video_live_onair() {
        return event_video_live_onair;
    }

    public void setEvent_video_live_onair(String event_video_live_onair) {
        this.event_video_live_onair = event_video_live_onair;
    }

    public String getEvent_video_modify() {
        return event_video_modify;
    }

    public void setEvent_video_modify(String event_video_modify) {
        this.event_video_modify = event_video_modify;
    }

    public String getFilters() {
        return filters;
    }

    public void setFilters(String filters) {
        this.filters = filters;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getLimits() {
        return limits;
    }

    public void setLimits(String limits) {
        this.limits = limits;
    }

    public User getParent() {
        return parent;
    }

    public void setParent(User parent) {
        this.parent = parent;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isPaywall() {
        return paywall;
    }

    public void setPaywall(boolean paywall) {
        this.paywall = paywall;
    }

    public int getPaywall_price() {
        return paywall_price;
    }

    public void setPaywall_price(int paywall_price) {
        this.paywall_price = paywall_price;
    }

    public String getPaywall_price_formatted() {
        return paywall_price_formatted;
    }

    public void setPaywall_price_formatted(String paywall_price_formatted) {
        this.paywall_price_formatted = paywall_price_formatted;
    }

    public String getPaywall_subscription_type() {
        return paywall_subscription_type;
    }

    public void setPaywall_subscription_type(String paywall_subscription_type) {
        this.paywall_subscription_type = paywall_subscription_type;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getPlaylists_total() {
        return playlists_total;
    }

    public void setPlaylists_total(int playlists_total) {
        this.playlists_total = playlists_total;
    }

    public int getPost_code() {
        return post_code;
    }

    public void setPost_code(int post_code) {
        this.post_code = post_code;
    }

    public String getScreenname() {
        return screenname;
    }

    public void setScreenname(String screenname) {
        this.screenname = screenname;
    }

    public String getSearch() {
        return search;
    }

    public void setSearch(String search) {
        this.search = search;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getVideos_total() {
        return videos_total;
    }

    public void setVideos_total(int videos_total) {
        this.videos_total = videos_total;
    }

    public Video getVideostar() {
        return videostar;
    }

    public void setVideostar(Video videostar) {
        this.videostar = videostar;
    }

    public int getViews_total() {
        return views_total;
    }

    public void setViews_total(int views_total) {
        this.views_total = views_total;
    }

    /**
     * {@docRoot}
     */
    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.DEFAULT_STYLE);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (id != null ? !id.equals(user.id) : user.id != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }
}
