package com.bc.dailymotion.api.dto;

/**
 * Created by Bastien on 04/01/2014.
 */
public class Channel {
    Description	Permissions	Format
    description	The localized descriptioin of the channel.	No access_token required for reading.	Returns string, min size: 1, max size: 150.
    id	The channel object ID	No access_token required for reading.	Returns the object id.
    name	The localized long name of the channel.	No access_token required for reading.	Returns string, min size: 1, max size: 150.
    slug	The slug name of the channel.	No access_token required for reading.	Returns string, min size: 1, max size: 150.
    sort	Change result ordering	This field can be used as filter but can’t be read nor written.	Returns string, allowed values: popular, alpha.
            Connections

    Name	Description	Permissions	Returns
    videos	Videos of the channel	No access_token required for reading.	A list of Video.

}
