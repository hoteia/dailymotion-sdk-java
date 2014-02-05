package fr.zebasto.dailymotion.sdk.api.endpoint;

import fr.zebasto.dailymotion.sdk.api.Endpoint;
import fr.zebasto.dailymotion.sdk.api.dto.User;

/**
 * Created by Bastien on 13/01/2014.
 */
public enum UserEndpoint implements Endpoint {
    ALL("users", User.class),
    ID("user/{0}", User.class);

    /**
     * Defines the URL of the Endpoint
     */
    private String value;

    /**
     * Defines the expected class returned in list
     */
    private Class clazz;

    /**
     * {@inheritDoc}
     */
    public String getValue() {
        return this.value;
    }

    /**
     * {@inheritDoc}
     */
    public Class getClazz() {
        return this.clazz;
    }

    /**
     * Default constructor for the Endpoint
     *
     * @param value The url of the endpoint
     * @param clazz The class that will be returned inside the list
     */
    private UserEndpoint(String value, Class clazz) {
        this.value = value;
        this.clazz = clazz;
    }
}