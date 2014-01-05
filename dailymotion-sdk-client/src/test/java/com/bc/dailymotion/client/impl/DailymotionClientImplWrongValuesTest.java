package com.bc.dailymotion.client.impl;

import com.bc.dailymotion.api.Endpoint;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * Created by Bastien on 05/01/2014.
 */
public class DailymotionClientImplWrongValuesTest {
    @Mock
    private DailymotionClientImpl dailymotionClient;

    @BeforeMethod
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void doGetWithSingleEndpointAndOneOfNullParameters1() {
        this.dailymotionClient.doGet(null, null);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void doGetWithSingleEndpointAndOneOfNullParameters2() {
        this.dailymotionClient.doGet(Endpoint.VideoEndpoint.class, null);
    }
}
