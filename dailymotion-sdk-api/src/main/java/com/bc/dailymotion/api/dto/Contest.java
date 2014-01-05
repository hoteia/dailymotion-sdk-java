package com.bc.dailymotion.api.dto;

/**
 * Created by Bastien on 04/01/2014.
 */
public class Contest {
    String description;//	The contest’s description	No access_token required for reading.	Returns string, min size: 1, max size: 2000.
    String id;//	The contest object ID	No access_token required for reading.	Returns the object id.
    String name;//	The Contest’s Name	No access_token required for reading.	Returns string, min size: 1, max size: 35.
    User owner;//	The contest’s owner	No access_token required for reading.	Return a user. You can request sub-fields by using owner.<sub-field> notation.
    String url_name;//	The globally unique group name to be used in URL (only alphanum + “-” and “_” letters are allowed)	No access_token required for reading.	Returns string, min size: 1, max size: 35.
}
