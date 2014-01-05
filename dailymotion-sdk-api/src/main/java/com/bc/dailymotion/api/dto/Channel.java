package com.bc.dailymotion.api.dto;

/**
 * Created by Bastien on 04/01/2014.
 */
public class Channel {
    String description;//	The localized descriptioin of the channel.	No access_token required for reading.	Returns string, min size: 1, max size: 150.
    String id;//	The channel object ID	No access_token required for reading.	Returns the object id.
    String name;//	The localized long name of the channel.	No access_token required for reading.	Returns string, min size: 1, max size: 150.
    String slug;//	The slug name of the channel.	No access_token required for reading.	Returns string, min size: 1, max size: 150.
    String sort;//	Change result ordering	This field can be used as filter but can’t be read nor written.	Returns string, allowed values: popular, alpha.
}
