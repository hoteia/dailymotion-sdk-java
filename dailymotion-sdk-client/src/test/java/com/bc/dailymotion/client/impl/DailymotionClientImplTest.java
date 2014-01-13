package com.bc.dailymotion.client.impl;

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
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

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

        //this.dailymotionClient.afterPropertiesSet();
    }

    @Test
    public void testDoGet1() throws Exception {
        // Given
        List<Video> videoList = new ArrayList<>();
        videoList.add(new Video());
        videoList.add(new Video());
        videoList.add(new Video());

        Response<Video> videoResponse = new Response<>();
        videoResponse.setExplicit(false);
        videoResponse.setHas_more(false);
        videoResponse.setLimit(10);
        videoResponse.setPage(1);
        videoResponse.setList(videoList);
        videoResponse.setTotal(videoList.size());

        OAuth2RequestFilter filter = mock(OAuth2RequestFilter.class, RETURNS_DEEP_STUBS);
        org.resthub.web.Response response = mock(org.resthub.web.Response.class, RETURNS_DEEP_STUBS);
        when(this.httpClient.url("https://api.dailymotion.com/videos").get()).thenReturn(response);
        when(response.getBody()).thenReturn(JsonHelper.serialize(videoResponse));
        when(response.getStatus()).thenReturn(Http.OK);
        when(filter.getAccessTokenEndPoint()).thenReturn("my-token");

        // When
        Response<Video> actualResponse = this.dailymotionClient.doGet(VideoEndpoint.class, EndpointType.ALL);

        // Then
        verify(this.httpClient, times(2)).url("https://api.dailymotion.com/videos");
        Assertions.assertThat(actualResponse).isNotNull();
        Assertions.assertThat(actualResponse.getList()).hasSize(3);
    }

    @Test
    public void testDoGet2() throws Exception {
        this.dailymotionClient.doGet(VideoEndpoint.class, EndpointType.ALL, new HashMap<>());
    }

    @Test
    public void testDoGet3() throws Exception {
        this.dailymotionClient.doGet(VideoEndpoint.class, EndpointType.ALL, "aaaaaa");
    }

    @Test
    public void testDoGet4() throws Exception {
        this.dailymotionClient.doGet(VideoEndpoint.class, EndpointType.ALL, "aaaaaa", new HashMap<>());
    }

    @Test
    public void testDoGet5() throws Exception {
        this.dailymotionClient.doGet(VideoComment.class, ConnectionType.ALL, "tot");
    }

    @Test
    public void testDoGet6() throws Exception {
        this.dailymotionClient.doGet(VideoComment.class, ConnectionType.ALL, "tot", new HashMap<>());
    }

    @Test
    public void testDoGet7() throws Exception {
        this.dailymotionClient.doGet(VideoComment.class, ConnectionType.ALL, "tot", "tot");
    }

    @Test
    public void testDoGet8() throws Exception {
        this.dailymotionClient.doGet(VideoComment.class, ConnectionType.ALL, "tot", "tot", new HashMap<>());
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
