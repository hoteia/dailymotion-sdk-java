package com.bc.dailymotion.client.impl;

import com.bc.dailymotion.api.Connection;
import com.bc.dailymotion.api.Endpoint;
import com.bc.dailymotion.api.Response;
import com.bc.dailymotion.api.connection.video.VideoComment;
import com.bc.dailymotion.api.dto.Video;
import com.bc.dailymotion.api.endpoint.VideoEndpoint;
import com.bc.dailymotion.api.type.ConnectionType;
import com.bc.dailymotion.api.type.EndpointType;
import org.fest.assertions.api.Assertions;
import org.mockito.Answers;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.resthub.web.Client;
import org.resthub.web.Http;
import org.resthub.web.JsonHelper;
import org.resthub.web.oauth2.OAuth2RequestFilter;
import org.springframework.test.util.ReflectionTestUtils;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.List;

import static java.util.Arrays.asList;
import static org.mockito.Mockito.*;

/**
 * Created by Bastien on 05/01/2014.
 */
public class DailymotionClientImplTest {
    @InjectMocks
    private DailymotionClientImpl dailymotionClient;

    @Mock(answer = Answers.RETURNS_DEEP_STUBS)
    private Client httpClient;

    @BeforeMethod
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        ReflectionTestUtils.setField(this.dailymotionClient, "dailymotionRootUrl", "https://api.dailymotion.com");
        ReflectionTestUtils.setField(this.dailymotionClient, "useProxy", false);
        ReflectionTestUtils.setField(this.dailymotionClient, "proxyHost", "");
        ReflectionTestUtils.setField(this.dailymotionClient, "proxyPort", 0);
        ReflectionTestUtils.setField(this.dailymotionClient, "timeout", 5000);

        ReflectionTestUtils.setField(this.dailymotionClient, "username", "toto");
        ReflectionTestUtils.setField(this.dailymotionClient, "password", "toto");
        ReflectionTestUtils.setField(this.dailymotionClient, "clientId", "0000000000000000000");
        ReflectionTestUtils.setField(this.dailymotionClient, "clientSecret", "000000000000000000000000000000000000");
        ReflectionTestUtils.setField(this.dailymotionClient, "scheme", "OAuth");
    }

    private <T> Response<T> getResponseForType(Class<T> type) throws IllegalAccessException, InstantiationException {
        List<T> list = asList(type.newInstance(), type.newInstance(), type.newInstance());

        Response<T> response = new Response<>();
        response.setExplicit(false);
        response.setHas_more(false);
        response.setLimit(10);
        response.setPage(1);
        response.setTotal(list.size());
        response.setList(list);

        return response;
    }

    @DataProvider(name = "doGetEndpoint")
    private Object[][] doGetEndpoint() throws InstantiationException, IllegalAccessException {
        return new Object[][]{
                {1, Video.class, null, "https://api.dailymotion.com/videos", VideoEndpoint.class, EndpointType.ALL, getResponseForType(Video.class)},
                {1, Video.class, null, "https://api.dailymotion.com/me/videos", VideoEndpoint.class, EndpointType.ME, getResponseForType(Video.class)},
                {2, Video.class, new Object[]{new HashMap<>()}, "https://api.dailymotion.com/videos", VideoEndpoint.class, EndpointType.ALL, getResponseForType(Video.class)},
                {2, Video.class, new Object[]{new HashMap<>()}, "https://api.dailymotion.com/me/videos", VideoEndpoint.class, EndpointType.ME, getResponseForType(Video.class)},
                {3, Video.class, new Object[]{"xabcdef"}, "https://api.dailymotion.com/video/xabcdef", VideoEndpoint.class, EndpointType.ID, getResponseForType(Video.class)},
                {4, Video.class, new Object[]{"xabcdef", new HashMap<>()}, "https://api.dailymotion.com/video/xabcdef", VideoEndpoint.class, EndpointType.ID, getResponseForType(Video.class)}
        };
    }

    @DataProvider(name = "doGetConnection")
    private Object[][] doGetConnection() throws InstantiationException, IllegalAccessException {
        return new Object[][]{};
    }

    @Test(dataProvider = "doGetEndpoint")
    public <T> void testDoGetEndpoint(int method, Class<T> tClass, Object[] params, String expectedUrl, Class<? extends Endpoint<T>> endpoint, EndpointType type, Response<T> expectedResponse) throws Exception {
        // Given
        List<T> list = asList(tClass.newInstance(), tClass.newInstance(), tClass.newInstance());

        Response<T> tResponse = new Response<>();
        tResponse.setExplicit(false);
        tResponse.setHas_more(false);
        tResponse.setLimit(10);
        tResponse.setPage(1);
        tResponse.setList(list);
        tResponse.setTotal(list.size());

        OAuth2RequestFilter filter = mock(OAuth2RequestFilter.class, RETURNS_DEEP_STUBS);
        org.resthub.web.Response response = mock(org.resthub.web.Response.class, RETURNS_DEEP_STUBS);
        when(this.httpClient.url(expectedUrl).get()).thenReturn(response);
        when(response.getBody()).thenReturn(JsonHelper.serialize(tResponse));
        when(response.getStatus()).thenReturn(Http.OK);
        when(filter.getAccessTokenEndPoint()).thenReturn("my-token");

        // When
        Response<T> actualResponse;
        switch (method) {
            case 1:
                actualResponse = this.dailymotionClient.doGet(endpoint, type);
                break;
            case 2:
                actualResponse = this.dailymotionClient.doGet(endpoint, type, (HashMap<String, List<String>>) params[0]);
                break;
            case 3:
                actualResponse = this.dailymotionClient.doGet(endpoint, type, (String) params[0]);
                break;
            case 4:
                actualResponse = this.dailymotionClient.doGet(endpoint, type, (String) params[0], (HashMap<String, List<String>>) params[1]);
                break;
            default:
                throw new IllegalArgumentException();
        }

        // Then
        verify(this.httpClient, times(2)).url(expectedUrl);
        Assertions.assertThat(actualResponse).isNotNull().isEqualsToByComparingFields(expectedResponse);
    }

    @Test
    public <E, T> void testDoGetConnection(int method, Class<T> tClass, Object[] params, String expectedUrl, Class<? extends Connection<E, T>> connection, ConnectionType type, Response<T> expectedResponse) throws Exception {
        // Given
        List<T> list = asList(tClass.newInstance(), tClass.newInstance(), tClass.newInstance());

        Response<T> tResponse = new Response<>();
        tResponse.setExplicit(false);
        tResponse.setHas_more(false);
        tResponse.setLimit(10);
        tResponse.setPage(1);
        tResponse.setList(list);
        tResponse.setTotal(list.size());

        OAuth2RequestFilter filter = mock(OAuth2RequestFilter.class, RETURNS_DEEP_STUBS);
        org.resthub.web.Response response = mock(org.resthub.web.Response.class, RETURNS_DEEP_STUBS);
        when(this.httpClient.url(expectedUrl).get()).thenReturn(response);
        when(response.getBody()).thenReturn(JsonHelper.serialize(tResponse));
        when(response.getStatus()).thenReturn(Http.OK);
        when(filter.getAccessTokenEndPoint()).thenReturn("my-token");

        // When
        Response<T> actualResponse;
        switch (method) {
            case 1:
                actualResponse = this.dailymotionClient.doGet(connection, type, (String) params[0]);
                break;
            case 2:
                actualResponse = this.dailymotionClient.doGet(connection, type, (String) params[0], (HashMap<String, List<String>>) params[1]);
                break;
            case 3:
                actualResponse = this.dailymotionClient.doGet(connection, type, (String) params[0], (String) params[1]);
                break;
            case 4:
                actualResponse = this.dailymotionClient.doGet(connection, type, (String) params[0], (String) params[1], (HashMap<String, List<String>>) params[2]);
                break;
            default:
                throw new IllegalArgumentException();
        }

        // Then
        verify(this.httpClient, times(2)).url(expectedUrl).get();
        Assertions.assertThat(actualResponse).isNotNull().isEqualsToByComparingFields(expectedResponse);
    }

    @Test
    public void testDoPost1() throws Exception {
        this.dailymotionClient.doPost(VideoEndpoint.class, EndpointType.ALL);
    }

    @Test
    public void testDoPost2() throws Exception {
        this.dailymotionClient.doPost(VideoEndpoint.class, EndpointType.ALL, new HashMap<>());
    }

    @Test
    public void testDoPost3() throws Exception {
        this.dailymotionClient.doPost(VideoEndpoint.class, EndpointType.ALL, "aaaaaa");
    }

    @Test
    public void testDoPost4() throws Exception {
        this.dailymotionClient.doPost(VideoEndpoint.class, EndpointType.ALL, "aaaaaa", new HashMap<>());
    }

    @Test
    public void testDoPost5() throws Exception {
        this.dailymotionClient.doPost(VideoComment.class, ConnectionType.ALL, "tot");
    }

    @Test
    public void testDoPost6() throws Exception {
        this.dailymotionClient.doPost(VideoComment.class, ConnectionType.ALL, "tot", new HashMap<>());
    }

    @Test
    public void testDoPost7() throws Exception {
        this.dailymotionClient.doPost(VideoComment.class, ConnectionType.ALL, "tot", "tot");
    }

    @Test
    public void testDoPost8() throws Exception {
        this.dailymotionClient.doPost(VideoComment.class, ConnectionType.ALL, "tot", "tot", new HashMap<>());
    }

    @Test
    public void testDoDelete1() throws Exception {
        this.dailymotionClient.doDelete(VideoEndpoint.class, EndpointType.ALL);
    }

    @Test
    public void testDoDelete2() throws Exception {
        this.dailymotionClient.doDelete(VideoEndpoint.class, EndpointType.ALL, new HashMap<>());
    }

    @Test
    public void testDoDelete3() throws Exception {
        this.dailymotionClient.doDelete(VideoEndpoint.class, EndpointType.ALL, "aaaaaa");
    }

    @Test
    public void testDoDelete4() throws Exception {
        this.dailymotionClient.doDelete(VideoEndpoint.class, EndpointType.ALL, "aaaaaa", new HashMap<>());
    }

    @Test
    public void testDoDelete5() throws Exception {
        this.dailymotionClient.doDelete(VideoComment.class, ConnectionType.ALL, "tot");
    }

    @Test
    public void testDoDelete6() throws Exception {
        this.dailymotionClient.doDelete(VideoComment.class, ConnectionType.ALL, "tot", new HashMap<>());
    }

    @Test
    public void testDoDelete7() throws Exception {
        this.dailymotionClient.doDelete(VideoComment.class, ConnectionType.ALL, "tot", "tot");
    }

    @Test
    public void testDoDelete8() throws Exception {
        this.dailymotionClient.doDelete(VideoComment.class, ConnectionType.ALL, "tot", "tot", new HashMap<>());
    }
}
