package com.bc.dailymotion.api.dto;

/**
 * Created by Bastien on 04/01/2014.
 */
public class Contest {
    Name	Description	Permissions	Format
    description	The contest’s description	No access_token required for reading.	Returns string, min size: 1, max size: 2000.
    id	The contest object ID	No access_token required for reading.	Returns the object id.
    name	The Contest’s Name	No access_token required for reading.	Returns string, min size: 1, max size: 35.
    owner	The contest’s owner	No access_token required for reading.	Return a user. You can request sub-fields by using owner.<sub-field> notation.
    url_name	The globally unique group name to be used in URL (only alphanum + “-” and “_” letters are allowed)	No access_token required for reading.	Returns string, min size: 1, max size: 35.
    Connections

    Name	Description	Permissions	Returns
    members	The users associated to this contest	No access_token required for reading.	A list of User.
    videos	The videos associated to this contest	No access_token required for reading.	A list of Video.

}
