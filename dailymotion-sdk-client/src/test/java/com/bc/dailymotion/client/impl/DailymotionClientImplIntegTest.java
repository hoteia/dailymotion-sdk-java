package com.bc.dailymotion.client.impl;

import com.bc.dailymotion.api.Response;
import com.bc.dailymotion.api.connection.video.VideoComment;
import com.bc.dailymotion.api.dto.Video;
import com.bc.dailymotion.api.endpoint.VideoEndpoint;
import com.bc.dailymotion.api.type.ConnectionType;
import com.bc.dailymotion.api.type.EndpointType;
import org.fest.assertions.api.Assertions;
import org.springframework.test.util.ReflectionTestUtils;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by Bastien on 05/01/2014.
 */
public class DailymotionClientImplIntegTest {

    private DailymotionClientImpl dailymotionClient;

    @BeforeMethod
    public void setUp() throws Exception {
        this.dailymotionClient = new DailymotionClientImpl();

        ReflectionTestUtils.setField(this.dailymotionClient, "dailymotionRootUrl", "https://api.dailymotion.com");
        ReflectionTestUtils.setField(this.dailymotionClient, "useProxy", false);
        ReflectionTestUtils.setField(this.dailymotionClient, "proxyHost", "proxy.priv.atos.fr");
        ReflectionTestUtils.setField(this.dailymotionClient, "proxyPort", 3128);
        ReflectionTestUtils.setField(this.dailymotionClient, "timeout", 5000);

        ReflectionTestUtils.setField(this.dailymotionClient, "username", "zebasto");
        ReflectionTestUtils.setField(this.dailymotionClient, "password", "zebasto");
        ReflectionTestUtils.setField(this.dailymotionClient, "clientId", "ce939ab3a375e06644ef");
        ReflectionTestUtils.setField(this.dailymotionClient, "clientSecret", "cbe45d5d34a3e4e0ef35663dc43c2a71a79949cb");
        ReflectionTestUtils.setField(this.dailymotionClient, "scheme", "OAuth");

        this.dailymotionClient.afterPropertiesSet();
    }

    @Test
    public void testDoGet1() throws Exception {
        // Given
        Response<Video> videoResponse = new Response<>();
        videoResponse.setExplicit(false);
        videoResponse.setHas_more(false);
        videoResponse.setLimit(10);
        videoResponse.setPage(1);
        videoResponse.setTotal(0);
        videoResponse.setList(new ArrayList<>());

        // When
        Response<Video> actualResponse = this.dailymotionClient.doGet(VideoEndpoint.class, EndpointType.ME);

        // Then
        Assertions.assertThat(actualResponse).isEqualsToByComparingFields(videoResponse);
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
