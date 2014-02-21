package fr.zebasto.dailymotion.sdk.client.impl;

import fr.zebasto.dailymotion.sdk.api.communication.ApiError;
import fr.zebasto.dailymotion.sdk.api.Endpoint;
import fr.zebasto.dailymotion.sdk.api.endpoint.*;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.List;

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
        return new Object[][]{
                {ActivityEndpoint.ID, 1}, {ActivityEndpoint.ID, 2}, {ActivityEndpoint.ID, 3}, {ActivityEndpoint.ID, 4}, {ActivityEndpoint.ALL, 5},
                {ChannelEndpoint.ID, 1}, {ChannelEndpoint.ID, 2}, {ChannelEndpoint.ID, 3}, {ChannelEndpoint.ID, 4}, {ChannelEndpoint.ALL, 5},
                {CommentEndpoint.ID, 1}, {CommentEndpoint.ID, 2}, {CommentEndpoint.ID, 3}, {CommentEndpoint.ID, 4},
                {ContestEndpoint.ID, 1}, {ContestEndpoint.ID, 2}, {ContestEndpoint.ID, 3}, {ContestEndpoint.ID, 4}, {ContestEndpoint.ALL, 5},
                {GroupEndpoint.ID, 1}, {GroupEndpoint.ID, 2}, {GroupEndpoint.ID, 3}, {GroupEndpoint.ID, 4}, {GroupEndpoint.ALL, 5}, {GroupEndpoint.ME, 5},
                {PlaylistEndpoint.ID, 1}, {PlaylistEndpoint.ID, 2}, {PlaylistEndpoint.ID, 3}, {PlaylistEndpoint.ID, 4}, {PlaylistEndpoint.ALL, 5}, {PlaylistEndpoint.ME, 5},
                {RecordEndpoint.ID, 1}, {RecordEndpoint.ID, 2}, {RecordEndpoint.ID, 3}, {RecordEndpoint.ID, 4},
                {StrongtagEndpoint.ID, 1}, {StrongtagEndpoint.ID, 2}, {StrongtagEndpoint.ID, 3}, {StrongtagEndpoint.ID, 4},
                {SubtitleEndpoint.ID, 1}, {SubtitleEndpoint.ID, 2}, {SubtitleEndpoint.ID, 3}, {SubtitleEndpoint.ID, 4},
                {UserEndpoint.ID, 1}, {UserEndpoint.ID, 2}, {UserEndpoint.ID, 3}, {UserEndpoint.ID, 4}, {UserEndpoint.ALL, 5},
                {VideoEndpoint.ID, 1}, {VideoEndpoint.ID, 2}, {VideoEndpoint.ID, 3}, {VideoEndpoint.ID, 4}, {VideoEndpoint.ALL, 5}, {VideoEndpoint.ME, 5},
        };
    }

    @Test(dataProvider = "doRequestWrongEndpointType", expectedExceptions = IllegalArgumentException.class)
    public void testDoRequestWrongEndpointType(Endpoint endpoint, int method) throws ApiError {
        switch (method) {
            case 1:
                this.dailymotionClient.doGet(endpoint);
                break;
            case 2:
                this.dailymotionClient.doGet(endpoint, new HashMap<String, List<String>>());
                break;
            case 3:
                this.dailymotionClient.doPost(endpoint);
                break;
            case 4:
                this.dailymotionClient.doPost(endpoint, new HashMap<String, List<String>>());
                break;
            case 5:
                this.dailymotionClient.doDelete(endpoint, "abcd");
                break;
            default:
                throw new UnknownError();
        }
    }
}
