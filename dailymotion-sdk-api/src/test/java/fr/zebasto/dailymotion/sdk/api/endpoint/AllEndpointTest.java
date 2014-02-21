package fr.zebasto.dailymotion.sdk.api.endpoint;

import fr.zebasto.dailymotion.sdk.api.Endpoint;
import fr.zebasto.dailymotion.sdk.api.dto.*;
import org.fest.assertions.api.Assertions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class AllEndpointTest {

    private Class expectedClass = Activity.class;

    @DataProvider(name = "verifyValue")
    private Object[][] verifyValue() {
        return new Object[][]{
                {ActivityEndpoint.ALL, Activity.class}, {ActivityEndpoint.ID, Activity.class},
                {ChannelEndpoint.ALL, Channel.class}, {ChannelEndpoint.ID, Channel.class},
                {CommentEndpoint.ID, Comment.class},
                {ContestEndpoint.ALL, Contest.class}, {ContestEndpoint.ID, Contest.class},
                {GroupEndpoint.ALL, Group.class}, {GroupEndpoint.ID, Group.class},{GroupEndpoint.ME, Group.class},
                {PlaylistEndpoint.ALL, Playlist.class}, {PlaylistEndpoint.ID, Playlist.class}, {PlaylistEndpoint.ME, Playlist.class},
                {RecordEndpoint.ID, Record.class},
                {StrongtagEndpoint.ID, Strongtag.class},
                {SubtitleEndpoint.ID, Subtitle.class},
                {UserEndpoint.ALL, User.class}, {UserEndpoint.ID, User.class},
                {VideoEndpoint.ALL, Video.class}, {VideoEndpoint.ID, Video.class}, {VideoEndpoint.ME, Video.class},
        };
    }

    @Test(dataProvider = "verifyValue")
    public void verifyValueAll(Endpoint endpoint, Class expectedClass) {
        // Given
        Assertions.assertThat(endpoint.getClazz()).isEqualTo(expectedClass);
        Assertions.assertThat(endpoint.getValue()).isNotNull().isNotEmpty();
    }
}
