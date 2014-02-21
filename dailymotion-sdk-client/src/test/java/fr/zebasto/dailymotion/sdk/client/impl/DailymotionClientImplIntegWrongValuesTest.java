package fr.zebasto.dailymotion.sdk.client.impl;

import fr.zebasto.dailymotion.sdk.api.communication.ApiError;
import fr.zebasto.dailymotion.sdk.api.communication.ApiResponse;
import fr.zebasto.dailymotion.sdk.api.dto.Video;
import fr.zebasto.dailymotion.sdk.api.endpoint.VideoEndpoint;
import org.springframework.test.util.ReflectionTestUtils;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;

/**
 * Created by Bastien on 05/01/2014.
 */
public class DailymotionClientImplIntegWrongValuesTest {
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

    @Test(expectedExceptions = ApiError.class)
    public void testDoGet1() throws Exception {
        // Given
        ApiResponse<Video> videoResponse = new ApiResponse<>();
        videoResponse.setExplicit(false);
        videoResponse.setHasMore(false);
        videoResponse.setLimit(10);
        videoResponse.setPage(1);
        videoResponse.setTotal(0);
        videoResponse.setList(new ArrayList<Video>());

        // When
        ApiResponse<?> actualResponse = this.dailymotionClient.doDelete(VideoEndpoint.ID, "aaaaaa");

        // Then
        //Assertions.assertThat(actualResponse).isEqualsToByComparingFields(videoResponse);
    }

}
