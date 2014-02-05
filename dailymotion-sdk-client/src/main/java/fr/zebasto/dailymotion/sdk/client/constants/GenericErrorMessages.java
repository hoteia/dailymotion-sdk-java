package fr.zebasto.dailymotion.sdk.client.constants;

/**
 * Created by a528122 on 16/01/14.
 */
public enum GenericErrorMessages {
    NO_NULL_ALLOWED("At least one of the given parameter is null"),
    NO_EMPTY_ALLOWED("The given list is empty"),
    RESPONSE_BODY_IS_NULL("The response body is null"),
    RESPONSE_IS_NULL("The response is null"),
    ENDPOINT_NOT_FOUND("Endpoint url is null or empty"),
    ERROR_ON_DO_REQUEST("An error occurred in doRequest, exception thrown is "),
    CONNECTION_NOT_FOUND("Connection url is null or empty"),
    TYPE_ID_NOT_ALLOWED("The type ID isn't allowed for this method"),
    TYPE_ME_NOT_ALLOWED("The type ME isn't allowed for this method"),
    TYPE_ALL_NOT_ALLOWED("The type ALL isn't allowed for this method");

    private String message;

    GenericErrorMessages(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    /**
     * {@docRoot}
     */
    @Override
    public String toString() {
        return this.getMessage();
    }
}
