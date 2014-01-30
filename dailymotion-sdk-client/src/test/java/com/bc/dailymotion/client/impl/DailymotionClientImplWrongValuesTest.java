package com.bc.dailymotion.client.impl;

import com.bc.dailymotion.api.Endpoint;
import com.bc.dailymotion.api.endpoint.*;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.HashMap;

/**
 * Created by Bastien on 05/01/2014.
 */
public class DailymotionClientImplWrongValuesTest {
    @InjectMocks
    private DailymotionClientImpl dailymotionClient;

    @BeforeMethod
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
    }

    @DataProvider(name = "doRequestWrongEndpointType")
    public Object[][] doRequestWrongEndpointType() {
        Endpoint[] endpoints = {ActivityEndpoint.ID, ChannelEndpoint.ID, CommentEndpoint.ID, ContestEndpoint.ID, GroupEndpoint.ID,
                PlaylistEndpoint.ID, RecordEndpoint.ID, StrongtagEndpoint.ID, SubtitleEndpoint.ID, UserEndpoint.ID, VideoEndpoint.ID};
        int methodCount = 6;

        Object[][] params = new Object[endpoints.length * methodCount][2];
        int i = 0;
        for (Endpoint endpoint : endpoints) {
            for (int j = 1; j <= methodCount; j++) {
                params[i][0] = j;
                params[i][1] = endpoint;
                i++;
            }
        }
        return params;
    }

    @Test(dataProvider = "doRequestWrongEndpointType", expectedExceptions = IllegalArgumentException.class)
    public <T> void testDoRequestWrongEndpointType(int method, Endpoint endpoint) {
        switch (method) {
            case 1:
                this.dailymotionClient.doGet(endpoint);
                break;
            case 2:
                this.dailymotionClient.doGet(endpoint, new HashMap<>());
                break;
            case 3:
                this.dailymotionClient.doPost(endpoint);
                break;
            case 4:
                this.dailymotionClient.doPost(endpoint, new HashMap<>());
                break;
            case 5:
                this.dailymotionClient.doDelete(endpoint);
                break;
            case 6:
                this.dailymotionClient.doDelete(endpoint, new HashMap<>());
                break;
            default:
                throw new UnknownError();
        }
    }
}
