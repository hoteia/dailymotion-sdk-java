package com.bc.dailymotion.api.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
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
    @JsonProperty(value = "avatar_120_url")
    private String avatar120Url;

    /**
     * The URL to the user’s avatar (190px by 190px).
     * No access_token required for reading.
     * Returns url.
     */
    @JsonProperty(value = "avatar_190_url")
    private String avatar190Url;

    /**
     * The URL to the user’s avatar (240px by 240px).
     * No access_token required for reading.
     * Returns url.
     */
    @JsonProperty(value = "avatar_240_url")
    private String avatar240Url;

    /**
     * The URL to the user’s avatar (square of 25px side length).
     * No access_token required for reading.
     * Returns url.
     */
    @JsonProperty(value = "avatar_25_url")
    private String avatar25Url;

    /**
     * The URL to the user’s avatar (square of 360px side length).
     * No access_token required for reading.
     * Returns url.
     */
    @JsonProperty(value = "avatar_360_url")
    private String avatar360Url;

    /**
     * The URL to the user’s avatar (square of 480px side length).
     * No access_token required for reading.
     * Returns url.
     */
    @JsonProperty(value = "avatar_480_url")
    private String avatar480Url;

    /**
     * The URL to the user’s avatar (square of 60px side length).
     * No access_token required for reading.
     * Returns url.
     */
    @JsonProperty(value = "avatar_60_url")
    private String avatar60Url;

    /**
     * The URL to the user’s avatar (square of 720px side length).
     * No access_token required for reading.
     * Returns url.
     */
    @JsonProperty(value = "avatar_720_url")
    private String avatar720Url;

    /**
     * The URL to the user’s avatar
     * This field is writable.
     * Returns url.
     */
    @JsonProperty(value = "avatar_url")
    private String avatarUrl;

    /**
     * The URL to the user’s background (Max 1680px by 2000px).
     * No access_token required for reading. This field is writable.
     * Returns url.
     */
    @JsonProperty(value = "background_url")
    private String backgroundUrl;

    /**
     * The URL to the user’s banner (Max 970px by 120px).
     * No access_token required for reading. This field is writable.
     * Returns url.
     */
    @JsonProperty(value = "banner_url")
    private String bannerUrl;

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
    @JsonProperty(value = "cleeng_popup_url")
    private String cleengPopupUrl;

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
    @JsonProperty(value = "created_time")
    private Date createdTime;

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
    @JsonProperty(value = "email_notification")
    private boolean emailNotification;

    /**
     * The name of pushd event sent on user deletion
     * No access_token required for reading.
     * Returns string, min size: 1, max size: 150.
     */
    @JsonProperty(value = "event_delete")
    private String eventDelete;

    /**
     * The name of pushd event sent on user modification
     * No access_token required for reading.
     * Returns string, min size: 1, max size: 150.
     */
    @JsonProperty(value = "event_modify")
    private String eventModify;

    /**
     * The name of pushd event sent when user deletes a video
     * No access_token required for reading.
     * Returns string, min size: 1, max size: 150.
     */
    @JsonProperty(value = "event_video_delete")
    private String eventVideoDelete;

    /**
     * The name of pushd event sent when user puts a live video off air
     * No access_token required for reading.
     * Returns string, min size: 1, max size: 150.
     */
    @JsonProperty(value = "event_video_live_offair")
    private String eventVideoLiveOffair;

    /**
     * The name of pushd event sent when user puts a live video on air
     * No access_token required for reading.
     * Returns string, min size: 1, max size: 150.
     */
    @JsonProperty(value = "event_video_live_onair")
    private String eventVideoLiveOnair;

    /**
     * The name of pushd event sent when user deletes a video
     * No access_token required for reading.
     * Returns string, min size: 1, max size: 150.
     */
    @JsonProperty(value = "event_video_modify")
    private String eventVideoModify;

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
    @JsonProperty(value = "first_name")
    private String firstName;

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
    @JsonProperty(value = "last_name")
    private String lastName;

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
    @JsonProperty(value = "paywall_price")
    private int paywallPrice;

    /**
     * The price of svod offer formatted with currency according to the request localization or null.
     * No access_token required for reading.
     * Returns string, min size: 1, max size: 150.
     */
    @JsonProperty(value = "paywall_price_formatted")
    private String paywallPriceFormatted;

    /**
     * The subscription type of the svod offer.
     * No access_token required for reading.
     * Returns string, min size: 1, max size: 150.
     */
    @JsonProperty(value = "paywall_subscription_type")
    private String paywallSubscriptionType;

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
    @JsonProperty(value = "playlists_total")
    private int playlistsTotal;

    /**
     * The zip of the user
     * userinfo scope required for reading. userinfo scope required for writing.
     * Returns string, min size: 1, max size: 150.
     */
    @JsonProperty(value = "post_code")
    private int postCode;

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
    @JsonProperty(value = "videos_total")
    private int videosTotal;

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
    @JsonProperty(value = "views_total")
    private int viewsTotal;

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
    public String getAvatar120Url() {
        return avatar120Url;
    }

    /**
     * Set the Avatar_120_url
     *
     * @param avatar120Url the Avatar_120_url to set
     */
    public void setAvatar120Url(String avatar120Url) {
        this.avatar120Url = avatar120Url;
    }

    /**
     * Returns the Avatar_190_url
     *
     * @return the Avatar_190_url
     */
    public String getAvatar190Url() {
        return avatar190Url;
    }

    /**
     * Set the Avatar_190_url
     *
     * @param avatar190Url the Avatar_190_url to set
     */
    public void setAvatar190Url(String avatar190Url) {
        this.avatar190Url = avatar190Url;
    }

    /**
     * Returns the Avatar_240_url
     *
     * @return the Avatar_240_url
     */
    public String getAvatar240Url() {
        return avatar240Url;
    }

    /**
     * Set the Avatar_240_url
     *
     * @param avatar240Url the Avatar_240_url to set
     */
    public void setAvatar240Url(String avatar240Url) {
        this.avatar240Url = avatar240Url;
    }

    /**
     * Returns the Avatar_25_url
     *
     * @return the Avatar_25_url
     */
    public String getAvatar25Url() {
        return avatar25Url;
    }

    /**
     * Set the Avatar_25_url
     *
     * @param avatar25Url the Avatar_25_url to set
     */
    public void setAvatar25Url(String avatar25Url) {
        this.avatar25Url = avatar25Url;
    }

    /**
     * Returns the Avatar_360_url
     *
     * @return the Avatar_360_url
     */
    public String getAvatar360Url() {
        return avatar360Url;
    }

    /**
     * Set the Avatar_360_url
     *
     * @param avatar360Url the Avatar_360_url to set
     */
    public void setAvatar360Url(String avatar360Url) {
        this.avatar360Url = avatar360Url;
    }

    /**
     * Returns the Avatar_480_url
     *
     * @return the Avatar_480_url
     */
    public String getAvatar480Url() {
        return avatar480Url;
    }

    /**
     * Set the Avatar_480_url
     *
     * @param avatar480Url the Avatar_480_url to set
     */
    public void setAvatar480Url(String avatar480Url) {
        this.avatar480Url = avatar480Url;
    }

    /**
     * Returns the Avatar_60_url
     *
     * @return the Avatar_60_url
     */
    public String getAvatar60Url() {
        return avatar60Url;
    }

    /**
     * Set the Avatar_60_url
     *
     * @param avatar60Url the Avatar_60_url to set
     */
    public void setAvatar60Url(String avatar60Url) {
        this.avatar60Url = avatar60Url;
    }

    /**
     * Returns the Avatar_720_url
     *
     * @return the Avatar_720_url
     */
    public String getAvatar720Url() {
        return avatar720Url;
    }

    /**
     * Set the Avatar_720_url
     *
     * @param avatar720Url the Avatar_720_url to set
     */
    public void setAvatar720Url(String avatar720Url) {
        this.avatar720Url = avatar720Url;
    }

    /**
     * Returns the Avatar_url
     *
     * @return the Avatar_url
     */
    public String getAvatarUrl() {
        return avatarUrl;
    }

    /**
     * Set the Avatar_url
     *
     * @param avatarUrl the Avatar_url to set
     */
    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    /**
     * Returns the Background_url
     *
     * @return the Background_url
     */
    public String getBackgroundUrl() {
        return backgroundUrl;
    }

    /**
     * Set the Background_url
     *
     * @param backgroundUrl the Background_url to set
     */
    public void setBackgroundUrl(String backgroundUrl) {
        this.backgroundUrl = backgroundUrl;
    }

    /**
     * Returns the Banner_url
     *
     * @return the Banner_url
     */
    public String getBannerUrl() {
        return bannerUrl;
    }

    /**
     * Set the Banner_url
     *
     * @param bannerUrl the Banner_url to set
     */
    public void setBannerUrl(String bannerUrl) {
        this.bannerUrl = bannerUrl;
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
    public String getCleengPopupUrl() {
        return cleengPopupUrl;
    }

    /**
     * Set the Cleeng_popup_url
     *
     * @param cleengPopupUrl the Cleeng_popup_url to set
     */
    public void setCleengPopupUrl(String cleengPopupUrl) {
        this.cleengPopupUrl = cleengPopupUrl;
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
    public Date getCreatedTime() {
        return createdTime;
    }

    /**
     * Set the Created_time
     *
     * @param createdTime the Created_time to set
     */
    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
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
     * Returns the emailNotification
     *
     * @return the emailNotification
     */
    public boolean isEmailNotification() {
        return emailNotification;
    }

    /**
     * Set the Email_notification
     *
     * @param emailNotification the Email_notification to set
     */
    public void setEmailNotification(boolean emailNotification) {
        this.emailNotification = emailNotification;
    }

    /**
     * Returns the Event_delete
     *
     * @return the Event_delete
     */
    public String getEventDelete() {
        return eventDelete;
    }

    /**
     * Set the Event_delete
     *
     * @param eventDelete the Event_delete to set
     */
    public void setEventDelete(String eventDelete) {
        this.eventDelete = eventDelete;
    }

    /**
     * Returns the Event_modify
     *
     * @return the Event_modify
     */
    public String getEventModify() {
        return eventModify;
    }

    /**
     * Set the Event_modify
     *
     * @param eventModify the Event_modify to set
     */
    public void setEventModify(String eventModify) {
        this.eventModify = eventModify;
    }

    /**
     * Returns the Event_video_delete
     *
     * @return the Event_video_delete
     */
    public String getEventVideoDelete() {
        return eventVideoDelete;
    }

    /**
     * Set the Event_video_delete
     *
     * @param eventVideoDelete the Event_video_delete to set
     */
    public void setEventVideoDelete(String eventVideoDelete) {
        this.eventVideoDelete = eventVideoDelete;
    }

    /**
     * Returns the Event_video_live_offair
     *
     * @return the Event_video_live_offair
     */
    public String getEventVideoLiveOffair() {
        return eventVideoLiveOffair;
    }

    /**
     * Set the Event_video_live_offair
     *
     * @param eventVideoLiveOffair the Event_video_live_offair to set
     */
    public void setEventVideoLiveOffair(String eventVideoLiveOffair) {
        this.eventVideoLiveOffair = eventVideoLiveOffair;
    }

    /**
     * Returns the Event_video_live_onair
     *
     * @return the Event_video_live_onair
     */
    public String getEventVideoLiveOnair() {
        return eventVideoLiveOnair;
    }

    /**
     * Set the Event_video_live_onair
     *
     * @param eventVideoLiveOnair the Event_video_live_onair to set
     */
    public void setEventVideoLiveOnair(String eventVideoLiveOnair) {
        this.eventVideoLiveOnair = eventVideoLiveOnair;
    }

    /**
     * Returns the Event_video_modify
     *
     * @return the Event_video_modify
     */
    public String getEventVideoModify() {
        return eventVideoModify;
    }

    /**
     * Set the Event_video_modify
     *
     * @param eventVideoModify the Event_video_modify to set
     */
    public void setEventVideoModify(String eventVideoModify) {
        this.eventVideoModify = eventVideoModify;
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
    public String getFirstName() {
        return firstName;
    }

    /**
     * Set the First_name
     *
     * @param firstName the First_name to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
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
    public String getLastName() {
        return lastName;
    }

    /**
     * Set the Last_name
     *
     * @param lastName the Last_name to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
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
    public int getPaywallPrice() {
        return paywallPrice;
    }

    /**
     * Set the Paywall_price
     *
     * @param paywallPrice the Paywall_price to set
     */
    public void setPaywallPrice(int paywallPrice) {
        this.paywallPrice = paywallPrice;
    }

    /**
     * Returns the Paywall_price_formatted
     *
     * @return the Paywall_price_formatted
     */
    public String getPaywallPriceFormatted() {
        return paywallPriceFormatted;
    }

    /**
     * Set the Paywall_price_formatted
     *
     * @param paywallPriceFormatted the Paywall_price_formatted to set
     */
    public void setPaywallPriceFormatted(String paywallPriceFormatted) {
        this.paywallPriceFormatted = paywallPriceFormatted;
    }

    /**
     * Returns the Paywall_subscription_type
     *
     * @return the Paywall_subscription_type
     */
    public String getPaywallSubscriptionType() {
        return paywallSubscriptionType;
    }

    /**
     * Set the Paywall_subscription_type
     *
     * @param paywallSubscriptionType the Paywall_subscription_type to set
     */
    public void setPaywallSubscriptionType(String paywallSubscriptionType) {
        this.paywallSubscriptionType = paywallSubscriptionType;
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
    public int getPlaylistsTotal() {
        return playlistsTotal;
    }

    /**
     * Set the Playlists_total
     *
     * @param playlistsTotal the Playlists_total to set
     */
    public void setPlaylistsTotal(int playlistsTotal) {
        this.playlistsTotal = playlistsTotal;
    }

    /**
     * Returns the Post_code
     *
     * @return the Post_code
     */
    public int getPostCode() {
        return postCode;
    }

    /**
     * Set the Post_code
     *
     * @param postCode the Post_code to set
     */
    public void setPostCode(int postCode) {
        this.postCode = postCode;
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
    public int getVideosTotal() {
        return videosTotal;
    }

    /**
     * Set the Videos_total
     *
     * @param videosTotal the Videos_total to set
     */
    public void setVideosTotal(int videosTotal) {
        this.videosTotal = videosTotal;
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
    public int getViewsTotal() {
        return viewsTotal;
    }

    /**
     * Set the Views_total
     *
     * @param viewsTotal the Views_total to set
     */
    public void setViewsTotal(int viewsTotal) {
        this.viewsTotal = viewsTotal;
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
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        User user = (User) o;

        if (id != null ? !id.equals(user.id) : user.id != null) {
            return false;
        }

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
