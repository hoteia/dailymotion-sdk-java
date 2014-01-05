package com.bc.dailymotion.client.impl;

import com.bc.dailymotion.api.Endpoint;
import com.bc.dailymotion.client.DailymotionClient;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * Created by Bastien on 05/01/2014.
 */
public class DailymotionClientImplTest {
    @Mock
    private DailymotionClient dailymotionClient;

    @BeforeMethod
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testDoGet() throws Exception {
        this.dailymotionClient.doGet(Endpoint.VideoEndpoint.class, Endpoint.EndpointType.ALL);

    }
}
