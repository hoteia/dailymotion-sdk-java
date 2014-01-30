package com.bc.dailymotion.api.dto;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.util.Date;

/**
 * Created by Bastien on 04/01/2014.
 */
public class User {
    /**
     * The address of the user
     * userinfo scope required for reading. userinfo scope required for writing.
     * Returns string, min size: 1, max size: 150.
     */
    private String address;

    /**
     * The URL to the user’s avatar (square of 120px side length).
     * No access_token required for reading.
     * Returns url.
     */
    private String avatar_120_url;

    /**
     * The URL to the user’s avatar (190px by 190px).
     * No access_token required for reading.
     * Returns url.
     */
    private String avatar_190_url;

    /**
     * The URL to the user’s avatar (240px by 240px).
     * No access_token required for reading.
     * Returns url.
     */
    private String avatar_240_url;

    /**
     * The URL to the user’s avatar (square of 25px side length).
     * No access_token required for reading.
     * Returns url.
     */
    private String avatar_25_url;

    /**
     * The URL to the user’s avatar (square of 360px side length).
     * No access_token required for reading.
     * Returns url.
     */
    private String avatar_360_url;

    /**
     * The URL to the user’s avatar (square of 480px side length).
     * No access_token required for reading.
     * Returns url.
     */
    private String avatar_480_url;

    /**
     * The URL to the user’s avatar (square of 60px side length).
     * No access_token required for reading.
     * Returns url.
     */
    private String avatar_60_url;

    /**
     * The URL to the user’s avatar (square of 720px side length).
     * No access_token required for reading.
     * Returns url.
     */
    private String avatar_720_url;

    /**
     * The URL to the user’s avatar
     * This field is writable.
     * Returns url.
     */
    private String avatar_url;

    /**
     * The URL to the user’s background (Max 1680px by 2000px).
     * No access_token required for reading. This field is writable.
     * Returns url.
     */
    private String background_url;

    /**
     * The URL to the user’s banner (Max 970px by 120px).
     * No access_token required for reading. This field is writable.
     * Returns url.
     */
    private String banner_url;

    /**
     * The user’s birthday
     * userinfo scope required for reading. userinfo scope required for writing.
     * Returns date.
     */
    private Date birthday;

    /**
     * The city of the user
     * userinfo scope required for reading. userinfo scope required for writing.
     * Returns string, min size: 1, max size: 150.
     */
    private String city;

    /**
     * The URL used to call cleeng popup
     * No access_token required for reading.
     * Returns url.
     */
    private String cleeng_popup_url;

    /**
     * The country of the user
     * userinfo scope required for reading. userinfo scope required for writing.
     * Returns string, min size: 1, max size: 150.
     */
    private String country;

    /**
     * The date when the user joined the site
     * No access_token required for reading.
     * Returns date.
     */
    private Date created_time;

    /**
     * The user’s description
     * No access_token required for reading. This field is writable.
     * Returns string, min size: 1, max size: 2000.
     */
    private String description;

    /**
     * The user’s email address
     * email scope required for reading.
     * Returns email.
     */
    private String email;

    /**
     * returns true if the user can receive email notifications, false otherwise
     * No access_token required for reading. This field is writable.
     * Returns boolean.
     */
    private boolean email_notification;

    /**
     * The name of pushd event sent on user deletion
     * No access_token required for reading.
     * Returns string, min size: 1, max size: 150.
     */
    private String event_delete;

    /**
     * The name of pushd event sent on user modification
     * No access_token required for reading.
     * Returns string, min size: 1, max size: 150.
     */
    private String event_modify;

    /**
     * The name of pushd event sent when user deletes a video
     * No access_token required for reading.
     * Returns string, min size: 1, max size: 150.
     */
    private String event_video_delete;

    /**
     * The name of pushd event sent when user puts a live video off air
     * No access_token required for reading.
     * Returns string, min size: 1, max size: 150.
     */
    private String event_video_live_offair;

    /**
     * The name of pushd event sent when user puts a live video on air
     * No access_token required for reading.
     * Returns string, min size: 1, max size: 150.
     */
    private String event_video_live_onair;

    /**
     * The name of pushd event sent when user deletes a video
     * No access_token required for reading.
     * Returns string, min size: 1, max size: 150.
     */
    private String event_video_modify;

    /**
     * A list of filters availabe to reduce the result set.
     * This field can be used as filter but can’t be read nor written.
     * Returns array, allowed values: featured, official, creative, premium, kids, kidsContentPremium, kidsContentFree, kidsContentPremiumAndFree, kidsMaleGender, kidsFemaleGender, kidsAge1, kidsAge2.
     */
    private String filters;

    /**
     * User’s first name
     * userinfo scope required for reading. userinfo scope required for writing.
     * Returns string, min size: 1, max size: 150.
     */
    private String first_name;

    /**
     * The user’s fullname
     * userinfo scope required for reading. userinfo scope required for writing.
     * Returns string, min size: 1, max size: 50.
     */
    private String fullname;

    /**
     * The user’s gender: female or male
     * No access_token required for reading. This field is writable.
     * Returns string, allowed values: male, female.
     */
    private String gender;

    /**
     * The user object ID
     * No access_token required for reading.
     * Returns the object id.
     */
    private String id;

    /**
     * The user’s language
     * This field can be used as filter. No access_token required for reading. This field is writable.
     * Returns string, min size: 1, max size: 150.
     */
    private String language;

    /**
     * User’s last name
     * userinfo scope required for reading. userinfo scope required for writing.
     * Returns string, min size: 1, max size: 150.
     */
    private String last_name;

    /**
     * Returns user’s limits like maximum allowed duration and size per uploaded video etc. This property can only be obtained for the currently logged user.
     * No access_token required for reading.
     * Returns dict, min size: 1, max size: 150.
     */
    private String limits;

    /**
     * The id of the parent of this user (use parent.screenname to show the parent user name).
     * This field can be used as filter. No access_token required for reading.
     * Return a user. You can request sub-fields by using parent.<sub-field> notation.
     */
    private User parent;

    /**
     * user’s password
     * This field is writable.
     * Returns string, min size: 1, max size: 150.
     */
    private String password;

    /**
     * True if the user has a SVOD offer defined
     * No access_token required for reading.
     * Returns boolean.
     */
    private boolean paywall;

    /**
     * The price of svod offer as float in the current currency or null. See currency field of the /locale endpoint to get the current currency.
     * No access_token required for reading.
     * Returns number, min value: 0.
     */
    private int paywall_price;

    /**
     * The price of svod offer formatted with currency according to the request localization or null.
     * No access_token required for reading.
     * Returns string, min size: 1, max size: 150.
     */
    private String paywall_price_formatted;

    /**
     * The subscription type of the svod offer.
     * No access_token required for reading.
     * Returns string, min size: 1, max size: 150.
     */
    private String paywall_subscription_type;

    /**
     * The phone number of the user
     * userinfo scope required for reading. userinfo scope required for writing.
     * Returns string, min size: 1, max size: 150.
     */
    private String phone;

    /**
     * The total number of user’s playlists
     * No access_token required for reading.
     * Returns number, min value: 0.
     */
    private int playlists_total;

    /**
     * The zip of the user
     * userinfo scope required for reading. userinfo scope required for writing.
     * Returns string, min size: 1, max size: 150.
     */
    private int post_code;

    /**
     * The user’s fullname of username depending on user’s preference
     * No access_token required for reading. userinfo scope required for writing.
     * Returns string, min size: 1, max size: 50.
     */
    private String screenname;

    /**
     * Full text search
     * This field can be used as filter but can’t be read nor written.
     * Returns string, min size: 1, max size: 150.
     */
    private String search;

    /**
     * Change result ordering
     * This field can be used as filter but can’t be read nor written.
     * Returns string, allowed values: recent, relevance, popular, commented, rated, alpha, alphaZA, alphaAZFullname, alphaZAFullname.
     */
    private String sort;

    /**
     * The user account status
     * No access_token required for reading.
     * Returns string, allowed values: pending-activation, disabled, active, unknown.
     */
    private String status;

    /**
     * The user type
     * No access_token required for reading.
     * Returns string, allowed values: ugc, motionmaker, official.
     */
    private String type;

    /**
     * The URL of the user on Dailymotion.
     * No access_token required for reading.
     * Returns url.
     */
    private String url;

    /**
     * The user’s username
     * No access_token required for reading. userinfo scope required for writing.
     * Returns string, min size: 1, max size: 150.
     */
    private String username;

    /**
     * The total number of user’s public videos
     * No access_token required for reading.
     * Returns number, min value: 0.
     */
    private int videos_total;

    /**
     * Change the user’s video star
     * No access_token required for reading. manage_videos scope required for writing.
     * Return a video. You can request sub-fields by using videostar.<sub-field> notation.
     */
    private Video videostar;

    /**
     * The total aggregated number of views on all user’s videos
     * No access_token required for reading.
     * Returns number, min value: 0.
     */
    private int views_total;

    /**
     * Returns the Address
     *
     * @return the Address
     */
    public String getAddress() {
        return address;
    }

    /**
     * Set the Address
     *
     * @param address the Address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Returns the Avatar_120_url
     *
     * @return the Avatar_120_url
     */
    public String getAvatar_120_url() {
        return avatar_120_url;
    }

    /**
     * Set the Avatar_120_url
     *
     * @param avatar_120_url the Avatar_120_url to set
     */
    public void setAvatar_120_url(String avatar_120_url) {
        this.avatar_120_url = avatar_120_url;
    }

    /**
     * Returns the Avatar_190_url
     *
     * @return the Avatar_190_url
     */
    public String getAvatar_190_url() {
        return avatar_190_url;
    }

    /**
     * Set the Avatar_190_url
     *
     * @param avatar_190_url the Avatar_190_url to set
     */
    public void setAvatar_190_url(String avatar_190_url) {
        this.avatar_190_url = avatar_190_url;
    }

    /**
     * Returns the Avatar_240_url
     *
     * @return the Avatar_240_url
     */
    public String getAvatar_240_url() {
        return avatar_240_url;
    }

    /**
     * Set the Avatar_240_url
     *
     * @param avatar_240_url the Avatar_240_url to set
     */
    public void setAvatar_240_url(String avatar_240_url) {
        this.avatar_240_url = avatar_240_url;
    }

    /**
     * Returns the Avatar_25_url
     *
     * @return the Avatar_25_url
     */
    public String getAvatar_25_url() {
        return avatar_25_url;
    }

    /**
     * Set the Avatar_25_url
     *
     * @param avatar_25_url the Avatar_25_url to set
     */
    public void setAvatar_25_url(String avatar_25_url) {
        this.avatar_25_url = avatar_25_url;
    }

    /**
     * Returns the Avatar_360_url
     *
     * @return the Avatar_360_url
     */
    public String getAvatar_360_url() {
        return avatar_360_url;
    }

    /**
     * Set the Avatar_360_url
     *
     * @param avatar_360_url the Avatar_360_url to set
     */
    public void setAvatar_360_url(String avatar_360_url) {
        this.avatar_360_url = avatar_360_url;
    }

    /**
     * Returns the Avatar_480_url
     *
     * @return the Avatar_480_url
     */
    public String getAvatar_480_url() {
        return avatar_480_url;
    }

    /**
     * Set the Avatar_480_url
     *
     * @param avatar_480_url the Avatar_480_url to set
     */
    public void setAvatar_480_url(String avatar_480_url) {
        this.avatar_480_url = avatar_480_url;
    }

    /**
     * Returns the Avatar_60_url
     *
     * @return the Avatar_60_url
     */
    public String getAvatar_60_url() {
        return avatar_60_url;
    }

    /**
     * Set the Avatar_60_url
     *
     * @param avatar_60_url the Avatar_60_url to set
     */
    public void setAvatar_60_url(String avatar_60_url) {
        this.avatar_60_url = avatar_60_url;
    }

    /**
     * Returns the Avatar_720_url
     *
     * @return the Avatar_720_url
     */
    public String getAvatar_720_url() {
        return avatar_720_url;
    }

    /**
     * Set the Avatar_720_url
     *
     * @param avatar_720_url the Avatar_720_url to set
     */
    public void setAvatar_720_url(String avatar_720_url) {
        this.avatar_720_url = avatar_720_url;
    }

    /**
     * Returns the Avatar_url
     *
     * @return the Avatar_url
     */
    public String getAvatar_url() {
        return avatar_url;
    }

    /**
     * Set the Avatar_url
     *
     * @param avatar_url the Avatar_url to set
     */
    public void setAvatar_url(String avatar_url) {
        this.avatar_url = avatar_url;
    }

    /**
     * Returns the Background_url
     *
     * @return the Background_url
     */
    public String getBackground_url() {
        return background_url;
    }

    /**
     * Set the Background_url
     *
     * @param background_url the Background_url to set
     */
    public void setBackground_url(String background_url) {
        this.background_url = background_url;
    }

    /**
     * Returns the Banner_url
     *
     * @return the Banner_url
     */
    public String getBanner_url() {
        return banner_url;
    }

    /**
     * Set the Banner_url
     *
     * @param banner_url the Banner_url to set
     */
    public void setBanner_url(String banner_url) {
        this.banner_url = banner_url;
    }

    /**
     * Returns the Birthday
     *
     * @return the Birthday
     */
    public Date getBirthday() {
        return birthday;
    }

    /**
     * Set the Birthday
     *
     * @param birthday the Birthday to set
     */
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    /**
     * Returns the City
     *
     * @return the City
     */
    public String getCity() {
        return city;
    }

    /**
     * Set the City
     *
     * @param city the City to set
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * Returns the Cleeng_popup_url
     *
     * @return the Cleeng_popup_url
     */
    public String getCleeng_popup_url() {
        return cleeng_popup_url;
    }

    /**
     * Set the Cleeng_popup_url
     *
     * @param cleeng_popup_url the Cleeng_popup_url to set
     */
    public void setCleeng_popup_url(String cleeng_popup_url) {
        this.cleeng_popup_url = cleeng_popup_url;
    }

    /**
     * Returns the Country
     *
     * @return the Country
     */
    public String getCountry() {
        return country;
    }

    /**
     * Set the Country
     *
     * @param country the Country to set
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * Returns the Created_time
     *
     * @return the Created_time
     */
    public Date getCreated_time() {
        return created_time;
    }

    /**
     * Set the Created_time
     *
     * @param created_time the Created_time to set
     */
    public void setCreated_time(Date created_time) {
        this.created_time = created_time;
    }

    /**
     * Returns the Description
     *
     * @return the Description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Set the Description
     *
     * @param description the Description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Returns the Email
     *
     * @return the Email
     */
    public String getEmail() {
        return email;
    }

    /**
     * Set the Email
     *
     * @param email the Email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Returns the email_notification
     *
     * @return the email_notification
     */
    public boolean isEmail_notification() {
        return email_notification;
    }

    /**
     * Set the Email_notification
     *
     * @param email_notification the Email_notification to set
     */
    public void setEmail_notification(boolean email_notification) {
        this.email_notification = email_notification;
    }

    /**
     * Returns the Event_delete
     *
     * @return the Event_delete
     */
    public String getEvent_delete() {
        return event_delete;
    }

    /**
     * Set the Event_delete
     *
     * @param event_delete the Event_delete to set
     */
    public void setEvent_delete(String event_delete) {
        this.event_delete = event_delete;
    }

    /**
     * Returns the Event_modify
     *
     * @return the Event_modify
     */
    public String getEvent_modify() {
        return event_modify;
    }

    /**
     * Set the Event_modify
     *
     * @param event_modify the Event_modify to set
     */
    public void setEvent_modify(String event_modify) {
        this.event_modify = event_modify;
    }

    /**
     * Returns the Event_video_delete
     *
     * @return the Event_video_delete
     */
    public String getEvent_video_delete() {
        return event_video_delete;
    }

    /**
     * Set the Event_video_delete
     *
     * @param event_video_delete the Event_video_delete to set
     */
    public void setEvent_video_delete(String event_video_delete) {
        this.event_video_delete = event_video_delete;
    }

    /**
     * Returns the Event_video_live_offair
     *
     * @return the Event_video_live_offair
     */
    public String getEvent_video_live_offair() {
        return event_video_live_offair;
    }

    /**
     * Set the Event_video_live_offair
     *
     * @param event_video_live_offair the Event_video_live_offair to set
     */
    public void setEvent_video_live_offair(String event_video_live_offair) {
        this.event_video_live_offair = event_video_live_offair;
    }

    /**
     * Returns the Event_video_live_onair
     *
     * @return the Event_video_live_onair
     */
    public String getEvent_video_live_onair() {
        return event_video_live_onair;
    }

    /**
     * Set the Event_video_live_onair
     *
     * @param event_video_live_onair the Event_video_live_onair to set
     */
    public void setEvent_video_live_onair(String event_video_live_onair) {
        this.event_video_live_onair = event_video_live_onair;
    }

    /**
     * Returns the Event_video_modify
     *
     * @return the Event_video_modify
     */
    public String getEvent_video_modify() {
        return event_video_modify;
    }

    /**
     * Set the Event_video_modify
     *
     * @param event_video_modify the Event_video_modify to set
     */
    public void setEvent_video_modify(String event_video_modify) {
        this.event_video_modify = event_video_modify;
    }

    /**
     * Returns the Filters
     *
     * @return the Filters
     */
    public String getFilters() {
        return filters;
    }

    /**
     * Set the Filters
     *
     * @param filters the Filters to set
     */
    public void setFilters(String filters) {
        this.filters = filters;
    }

    /**
     * Returns the First_name
     *
     * @return the First_name
     */
    public String getFirst_name() {
        return first_name;
    }

    /**
     * Set the First_name
     *
     * @param first_name the First_name to set
     */
    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    /**
     * Returns the Fullname
     *
     * @return the Fullname
     */
    public String getFullname() {
        return fullname;
    }

    /**
     * Set the Fullname
     *
     * @param fullname the Fullname to set
     */
    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    /**
     * Returns the Gender
     *
     * @return the Gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * Set the Gender
     *
     * @param gender the Gender to set
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * Returns the Id
     *
     * @return the Id
     */
    public String getId() {
        return id;
    }

    /**
     * Set the Id
     *
     * @param id the Id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Returns the Language
     *
     * @return the Language
     */
    public String getLanguage() {
        return language;
    }

    /**
     * Set the Language
     *
     * @param language the Language to set
     */
    public void setLanguage(String language) {
        this.language = language;
    }

    /**
     * Returns the Last_name
     *
     * @return the Last_name
     */
    public String getLast_name() {
        return last_name;
    }

    /**
     * Set the Last_name
     *
     * @param last_name the Last_name to set
     */
    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    /**
     * Returns the Limits
     *
     * @return the Limits
     */
    public String getLimits() {
        return limits;
    }

    /**
     * Set the Limits
     *
     * @param limits the Limits to set
     */
    public void setLimits(String limits) {
        this.limits = limits;
    }

    /**
     * Returns the Parent
     *
     * @return the Parent
     */
    public User getParent() {
        return parent;
    }

    /**
     * Set the Parent
     *
     * @param parent the Parent to set
     */
    public void setParent(User parent) {
        this.parent = parent;
    }

    /**
     * Returns the Password
     *
     * @return the Password
     */
    public String getPassword() {
        return password;
    }

    /**
     * Set the Password
     *
     * @param password the Password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Returns the paywall
     *
     * @return the paywall
     */
    public boolean isPaywall() {
        return paywall;
    }

    /**
     * Set the Paywall
     *
     * @param paywall the Paywall to set
     */
    public void setPaywall(boolean paywall) {
        this.paywall = paywall;
    }

    /**
     * Returns the Paywall_price
     *
     * @return the Paywall_price
     */
    public int getPaywall_price() {
        return paywall_price;
    }

    /**
     * Set the Paywall_price
     *
     * @param paywall_price the Paywall_price to set
     */
    public void setPaywall_price(int paywall_price) {
        this.paywall_price = paywall_price;
    }

    /**
     * Returns the Paywall_price_formatted
     *
     * @return the Paywall_price_formatted
     */
    public String getPaywall_price_formatted() {
        return paywall_price_formatted;
    }

    /**
     * Set the Paywall_price_formatted
     *
     * @param paywall_price_formatted the Paywall_price_formatted to set
     */
    public void setPaywall_price_formatted(String paywall_price_formatted) {
        this.paywall_price_formatted = paywall_price_formatted;
    }

    /**
     * Returns the Paywall_subscription_type
     *
     * @return the Paywall_subscription_type
     */
    public String getPaywall_subscription_type() {
        return paywall_subscription_type;
    }

    /**
     * Set the Paywall_subscription_type
     *
     * @param paywall_subscription_type the Paywall_subscription_type to set
     */
    public void setPaywall_subscription_type(String paywall_subscription_type) {
        this.paywall_subscription_type = paywall_subscription_type;
    }

    /**
     * Returns the Phone
     *
     * @return the Phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Set the Phone
     *
     * @param phone the Phone to set
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * Returns the Playlists_total
     *
     * @return the Playlists_total
     */
    public int getPlaylists_total() {
        return playlists_total;
    }

    /**
     * Set the Playlists_total
     *
     * @param playlists_total the Playlists_total to set
     */
    public void setPlaylists_total(int playlists_total) {
        this.playlists_total = playlists_total;
    }

    /**
     * Returns the Post_code
     *
     * @return the Post_code
     */
    public int getPost_code() {
        return post_code;
    }

    /**
     * Set the Post_code
     *
     * @param post_code the Post_code to set
     */
    public void setPost_code(int post_code) {
        this.post_code = post_code;
    }

    /**
     * Returns the Screenname
     *
     * @return the Screenname
     */
    public String getScreenname() {
        return screenname;
    }

    /**
     * Set the Screenname
     *
     * @param screenname the Screenname to set
     */
    public void setScreenname(String screenname) {
        this.screenname = screenname;
    }

    /**
     * Returns the Search
     *
     * @return the Search
     */
    public String getSearch() {
        return search;
    }

    /**
     * Set the Search
     *
     * @param search the Search to set
     */
    public void setSearch(String search) {
        this.search = search;
    }

    /**
     * Returns the Sort
     *
     * @return the Sort
     */
    public String getSort() {
        return sort;
    }

    /**
     * Set the Sort
     *
     * @param sort the Sort to set
     */
    public void setSort(String sort) {
        this.sort = sort;
    }

    /**
     * Returns the Status
     *
     * @return the Status
     */
    public String getStatus() {
        return status;
    }

    /**
     * Set the Status
     *
     * @param status the Status to set
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * Returns the Type
     *
     * @return the Type
     */
    public String getType() {
        return type;
    }

    /**
     * Set the Type
     *
     * @param type the Type to set
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Returns the Url
     *
     * @return the Url
     */
    public String getUrl() {
        return url;
    }

    /**
     * Set the Url
     *
     * @param url the Url to set
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * Returns the Username
     *
     * @return the Username
     */
    public String getUsername() {
        return username;
    }

    /**
     * Set the Username
     *
     * @param username the Username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * Returns the Videos_total
     *
     * @return the Videos_total
     */
    public int getVideos_total() {
        return videos_total;
    }

    /**
     * Set the Videos_total
     *
     * @param videos_total the Videos_total to set
     */
    public void setVideos_total(int videos_total) {
        this.videos_total = videos_total;
    }

    /**
     * Returns the Videostar
     *
     * @return the Videostar
     */
    public Video getVideostar() {
        return videostar;
    }

    /**
     * Set the Videostar
     *
     * @param videostar the Videostar to set
     */
    public void setVideostar(Video videostar) {
        this.videostar = videostar;
    }

    /**
     * Returns the Views_total
     *
     * @return the Views_total
     */
    public int getViews_total() {
        return views_total;
    }

    /**
     * Set the Views_total
     *
     * @param views_total the Views_total to set
     */
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

    /**
     * {@docRoot}
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (id != null ? !id.equals(user.id) : user.id != null) return false;

        return true;
    }

    /**
     * {@docRoot}
     */
    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }
}
