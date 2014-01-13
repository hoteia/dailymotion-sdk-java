package com.bc.dailymotion.client.impl;

import com.bc.dailymotion.api.Connection;
import com.bc.dailymotion.api.Endpoint;
import com.bc.dailymotion.api.Response;
import com.bc.dailymotion.api.dto.Video;
import org.fest.assertions.api.Assertions;
import org.springframework.test.util.ReflectionTestUtils;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Bastien on 05/01/2014.
 */
public class DailymotionClientImplIntegTest {

    private DailymotionClientImpl dailymotionClient;

    @BeforeMethod
    public void setUp() throws Exception {
        this.dailymotionClient = new DailymotionClientImpl();

        ReflectionTestUtils.setField(this.dailymotionClient, "dailymotionRootUrl", "https://api.dailymotion.com");
        ReflectionTestUtils.setField(this.dailymotionClient, "useProxy", true);
        ReflectionTestUtils.setField(this.dailymotionClient, "proxyHost", "proxy.priv.atos.fr");
        ReflectionTestUtils.setField(this.dailymotionClient, "proxyPort", 3128);
        ReflectionTestUtils.setField(this.dailymotionClient, "timeout", 5000);

        ReflectionTestUtils.setField(this.dailymotionClient, "username", "calaagree");
        ReflectionTestUtils.setField(this.dailymotionClient, "password", "warez01");
        ReflectionTestUtils.setField(this.dailymotionClient, "clientId", "d93e1e3b4e4066de0c2d");
        ReflectionTestUtils.setField(this.dailymotionClient, "clientSecret", "1fcd53738f30187af1ffc8a911d045f123739cd1");

        this.dailymotionClient.afterPropertiesSet();
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

        // When
        Response<Video> actualResponse = this.dailymotionClient.doGet(Endpoint.VideoEndpoint.class, Endpoint.EndpointType.ME);

        // Then
        Assertions.assertThat(actualResponse).isNotNull();
        //Assertions.assertThat(actualResponse.getList()).hasSize(3);
    }

    @Test
    public void testDoGet2() throws Exception {
        this.dailymotionClient.doGet(Endpoint.VideoEndpoint.class, Endpoint.EndpointType.ALL, new HashMap<>());
    }

    @Test
    public void testDoGet3() throws Exception {
        this.dailymotionClient.doGet(Endpoint.VideoEndpoint.class, Endpoint.EndpointType.ALL, "aaaaaa");
    }

    @Test
    public void testDoGet4() throws Exception {
        this.dailymotionClient.doGet(Endpoint.VideoEndpoint.class, Endpoint.EndpointType.ALL, "aaaaaa", new HashMap<>());
    }

    @Test
    public void testDoGet5() throws Exception {
        this.dailymotionClient.doGet(Connection.VideoCommentConnection.class, Connection.ConnectionType.ALL, "tot");
    }

    @Test
    public void testDoGet6() throws Exception {
        this.dailymotionClient.doGet(Connection.VideoCommentConnection.class, Connection.ConnectionType.ALL, "tot", new HashMap<>());
    }

    @Test
    public void testDoGet7() throws Exception {
        this.dailymotionClient.doGet(Connection.VideoCommentConnection.class, Connection.ConnectionType.ALL, "tot", "tot");
    }

    @Test
    public void testDoGet8() throws Exception {
        this.dailymotionClient.doGet(Connection.VideoCommentConnection.class, Connection.ConnectionType.ALL, "tot", "tot", new HashMap<>());
    }

    @Test
    public void testDoPost1() throws Exception {
        this.dailymotionClient.doPost(Endpoint.VideoEndpoint.class, Endpoint.EndpointType.ALL);
    }

    @Test
    public void testDoPost2() throws Exception {
        this.dailymotionClient.doPost(Endpoint.VideoEndpoint.class, Endpoint.EndpointType.ALL, new HashMap<>());
    }

    @Test
    public void testDoPost3() throws Exception {
        this.dailymotionClient.doPost(Endpoint.VideoEndpoint.class, Endpoint.EndpointType.ALL, "aaaaaa");
    }

    @Test
    public void testDoPost4() throws Exception {
        this.dailymotionClient.doPost(Endpoint.VideoEndpoint.class, Endpoint.EndpointType.ALL, "aaaaaa", new HashMap<>());
    }

    @Test
    public void testDoPost5() throws Exception {
        this.dailymotionClient.doPost(Connection.VideoCommentConnection.class, Connection.ConnectionType.ALL, "tot");
    }

    @Test
    public void testDoPost6() throws Exception {
        this.dailymotionClient.doPost(Connection.VideoCommentConnection.class, Connection.ConnectionType.ALL, "tot", new HashMap<>());
    }

    @Test
    public void testDoPost7() throws Exception {
        this.dailymotionClient.doPost(Connection.VideoCommentConnection.class, Connection.ConnectionType.ALL, "tot", "tot");
    }

    @Test
    public void testDoPost8() throws Exception {
        this.dailymotionClient.doPost(Connection.VideoCommentConnection.class, Connection.ConnectionType.ALL, "tot", "tot", new HashMap<>());
    }

    @Test
    public void testDoDelete1() throws Exception {
        this.dailymotionClient.doDelete(Endpoint.VideoEndpoint.class, Endpoint.EndpointType.ALL);
    }

    @Test
    public void testDoDelete2() throws Exception {
        this.dailymotionClient.doDelete(Endpoint.VideoEndpoint.class, Endpoint.EndpointType.ALL, new HashMap<>());
    }

    @Test
    public void testDoDelete3() throws Exception {
        this.dailymotionClient.doDelete(Endpoint.VideoEndpoint.class, Endpoint.EndpointType.ALL, "aaaaaa");
    }

    @Test
    public void testDoDelete4() throws Exception {
        this.dailymotionClient.doDelete(Endpoint.VideoEndpoint.class, Endpoint.EndpointType.ALL, "aaaaaa", new HashMap<>());
    }

    @Test
    public void testDoDelete5() throws Exception {
        this.dailymotionClient.doDelete(Connection.VideoCommentConnection.class, Connection.ConnectionType.ALL, "tot");
    }

    @Test
    public void testDoDelete6() throws Exception {
        this.dailymotionClient.doDelete(Connection.VideoCommentConnection.class, Connection.ConnectionType.ALL, "tot", new HashMap<>());
    }

    @Test
    public void testDoDelete7() throws Exception {
        this.dailymotionClient.doDelete(Connection.VideoCommentConnection.class, Connection.ConnectionType.ALL, "tot", "tot");
    }

    @Test
    public void testDoDelete8() throws Exception {
        this.dailymotionClient.doDelete(Connection.VideoCommentConnection.class, Connection.ConnectionType.ALL, "tot", "tot", new HashMap<>());
    }
}
