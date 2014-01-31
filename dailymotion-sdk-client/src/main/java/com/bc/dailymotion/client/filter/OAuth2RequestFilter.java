package com.bc.dailymotion.client.filter;

import com.ning.http.client.AsyncHttpClient;
import com.ning.http.client.ProxyServer;
import com.ning.http.client.Response;
import com.ning.http.client.filter.FilterContext;
import com.ning.http.client.filter.FilterException;
import com.ning.http.client.filter.RequestFilter;
import org.resthub.web.Http;
import org.resthub.web.JsonHelper;
import org.resthub.web.exception.SerializationException;
import org.resthub.web.oauth2.OAuth2Token;

import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/**
 * HTTP client filter that deals with OAuth2.0 Token authentication
 *
 * @see org.resthub.web.oauth2.OAuth2Config
 */
public class OAuth2RequestFilter implements RequestFilter {

    /**
     *
     */
    public static final String GRANT_TYPE_PARAMETER_NAME = "grant_type";

    /**
     *
     */
    public static final String CLIENT_ID_PARAMETER_NAME = "client_id";

    /**
     *
     */
    public static final String CLIENT_SECRET_PARAMETER_NAME = "client_secret";

    /**
     *
     */
    public static final String USERNAME_PARAMETER_NAME = "username";

    /**
     *
     */
    public static final String PASSWORD_PARAMETER_NAME = "password";

    /**
     *
     */
    public static final String SCOPE_PARAMETER_NAME = "scope";

    /**
     *
     */
    public static final String PASSWORD_PARAMETER_VALUE = "password";

    /**
     * Root URL for Dailymotion SDK
     */
    private String accessTokenEndPoint;

    /**
     * The scheme name used to put the token in headers
     */
    private String schemeName;

    /**
     * Username used for the OAuth protocol
     */
    private String username;

    /**
     * Password used for the OAuth protocol
     */
    private String password;

    /**
     * ClientId defined on your Dailymotion App
     */
    private String clientId;

    /**
     * ClientSecret defined on your Dailymotion App
     */
    private String clientSecret;

    /**
     * The time to acquire the token
     */
    private long acquireTime;

    /**
     * Indicate if we use a proxy to reach the Media Controller/CAS Service
     */
    private boolean useProxy;

    /**
     * Host of the Proxy
     */
    private String proxyHost;

    /**
     * Port of the Proxy
     */
    private int proxyPort;

    /**
     * The OAuth token that will be fetched
     */
    private OAuth2Token token;

    /**
     * The minimal remaining time for a valid token
     */
    private static final int MINIMAL_DELAY = 5;

    /**
     * Request filter that acquires an OAuth token if:
     * <ul>
     * <li>no token has been acquired</li>
     * <li>the current token is expired, given its "ExpiresIn" information</li>
     * </ul>
     *
     * @param accessTokenEndPoint URL where the OAuth2.0 client should request access tokens
     * @param clientId            id of the OAuth2.0 client
     * @param clientSecret        secret of the OAuth2.0 client
     */
    public OAuth2RequestFilter(String accessTokenEndPoint, String clientId, String clientSecret) {
        super();
        this.accessTokenEndPoint = accessTokenEndPoint;
        this.clientId = clientId;
        this.clientSecret = clientSecret;
        token = null;
    }

    /**
     * Sets the credentials of OAuth
     *
     * @param username The username to use with OAuth
     * @param password The password to use with OAuth
     */
    public void setCredentials(String username, String password) {
        this.username = username;
        this.password = password;
    }

    /**
     * Sets the proxy to use. If useProxy is false, proxyHost and proxyPort will not be used
     *
     * @param useProxy  boolean used to set a proxy
     * @param proxyHost The host of the proxy to use
     * @param proxyPort The port of the proxy to use
     */
    public void setProxy(boolean useProxy, String proxyHost, int proxyPort) {
        this.useProxy = useProxy;
        this.proxyHost = proxyHost;
        this.proxyPort = proxyPort;
    }

    /**
     * Sets the scheme name used for the token authentication
     *
     * @param schemeName The scheme name to set
     */
    public void setSchemeName(String schemeName) {
        this.schemeName = schemeName;
    }

    /**
     * Retrieve the OAuth2.0 access token from the remote token endpoint
     * using pre-configured clientId/clientSecret.
     *
     * @param username The username to use with OAuth
     * @param password The password to use with OAuth
     * @return The OAuth2Token that has been retrieved
     */
    private OAuth2Token retrieveAccessToken(String username, String password) {
        AsyncHttpClient client = new AsyncHttpClient();
        AsyncHttpClient.BoundRequestBuilder request = client.preparePost(this.accessTokenEndPoint);

        if (this.useProxy) {
            request.setProxyServer(new ProxyServer(this.proxyHost, this.proxyPort));
        }

        request.setHeader(Http.CONTENT_TYPE, Http.FORM);
        request.setHeader(Http.ACCEPT, Http.JSON);
        request.addParameter(GRANT_TYPE_PARAMETER_NAME, PASSWORD_PARAMETER_VALUE);
        request.addParameter(CLIENT_ID_PARAMETER_NAME, clientId);
        request.addParameter(CLIENT_SECRET_PARAMETER_NAME, clientSecret);
        request.addParameter(USERNAME_PARAMETER_NAME, username);
        request.addParameter(PASSWORD_PARAMETER_NAME, password);

        Response response;
        OAuth2Token oAuth2Token;
        try {
            response = request.execute().get();
            oAuth2Token = JsonHelper.deserialize(response.getResponseBody("UTF-8"), OAuth2Token.class);
            acquireTime = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
        } catch (InterruptedException | ExecutionException | IOException e) {
            throw new SerializationException(e);
        }

        return oAuth2Token;
    }

    /**
     * Checks if the current token is expired, given the "Expires in" duration
     * information given in the token. It takes a 5 second security margin to
     * avoid token expiration.
     *
     * @return The boolean that shows of the token has expired
     */
    private boolean isTokenExpired() {
        return (TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis()) - acquireTime) > (token.getExpiresIn() - MINIMAL_DELAY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    @SuppressWarnings("rawtypes")
    public FilterContext filter(FilterContext ctx) throws FilterException {

        if (token == null || isTokenExpired()) {
            token = retrieveAccessToken(this.username, this.password);
        }

        if (token != null) {
            ctx.getRequest().getHeaders().add(Http.AUTHORIZATION, schemeName + " " + token.getAccessToken());
        }
        return ctx;
    }
}

