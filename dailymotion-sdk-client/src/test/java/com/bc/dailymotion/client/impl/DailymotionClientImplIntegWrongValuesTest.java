package com.bc.dailymotion.client.impl;

import com.bc.dailymotion.api.connection.video.VideoComment;
import com.bc.dailymotion.api.endpoint.VideoEndpoint;
import com.bc.dailymotion.api.type.ConnectionType;
import com.bc.dailymotion.api.type.EndpointType;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.HashMap;

/**
 * Created by Bastien on 05/01/2014.
 */
public class DailymotionClientImplIntegWrongValuesTest {
    @InjectMocks
    private DailymotionClientImpl dailymotionClient;

    @BeforeMethod
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testDoGet1() throws Exception {
        this.dailymotionClient.doGet(null, EndpointType.ALL);
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
