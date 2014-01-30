package com.bc.dailymotion.client.impl;

import com.bc.dailymotion.api.ApiResponse;
import com.bc.dailymotion.api.Connection;
import com.bc.dailymotion.api.Endpoint;
import com.bc.dailymotion.api.connection.channel.ChannelVideo;
import com.bc.dailymotion.api.connection.contest.ContestMember;
import com.bc.dailymotion.api.connection.contest.ContestVideo;
import com.bc.dailymotion.api.connection.group.GroupMember;
import com.bc.dailymotion.api.connection.group.GroupVideo;
import com.bc.dailymotion.api.connection.playlist.PlaylistVideo;
import com.bc.dailymotion.api.connection.user.*;
import com.bc.dailymotion.api.dto.*;
import com.bc.dailymotion.api.endpoint.*;
import org.fest.assertions.api.Assertions;
import org.mockito.Answers;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.resthub.web.Client;
import org.resthub.web.Http;
import org.resthub.web.JsonHelper;
import org.resthub.web.Response;
import org.resthub.web.oauth2.OAuth2RequestFilter;
import org.springframework.test.util.ReflectionTestUtils;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.List;

import static java.util.Arrays.asList;
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
    }

    private <T> ApiResponse<T> getResponseForType(Class<T> type) throws IllegalAccessException, InstantiationException {
        List<T> list = asList(type.newInstance(), type.newInstance(), type.newInstance());

        ApiResponse<T> response = new ApiResponse<>();
        response.setExplicit(false);
        response.setHas_more(false);
        response.setLimit(10);
        response.setPage(1);
        response.setTotal(list.size());
        response.setList(list);

        return response;
    }

    @DataProvider(name = "doGetEndpoint")
    private Object[][] doGetEndpoint() throws InstantiationException, IllegalAccessException {
        return new Object[][]{
                {1, Activity.class, null, "https://api.dailymotion.com/activities", ActivityEndpoint.ALL, this.getResponseForType(Activity.class)},
                {2, Activity.class, new Object[]{new HashMap<>()}, "https://api.dailymotion.com/activities", ActivityEndpoint.ALL, this.getResponseForType(Activity.class)},
                {3, Activity.class, new Object[]{"xabcdef"}, "https://api.dailymotion.com/activity/xabcdef", ActivityEndpoint.ID, this.getResponseForType(Activity.class)},
                {4, Activity.class, new Object[]{"xabcdef", new HashMap<>()}, "https://api.dailymotion.com/activity/xabcdef", ActivityEndpoint.ID, this.getResponseForType(Activity.class)},
                {1, Channel.class, null, "https://api.dailymotion.com/channels", ChannelEndpoint.ALL, this.getResponseForType(Channel.class)},
                {2, Channel.class, new Object[]{new HashMap<>()}, "https://api.dailymotion.com/channels", ChannelEndpoint.ALL, this.getResponseForType(Channel.class)},
                {3, Channel.class, new Object[]{"xabcdef"}, "https://api.dailymotion.com/channel/xabcdef", ChannelEndpoint.ID, this.getResponseForType(Channel.class)},
                {4, Channel.class, new Object[]{"xabcdef", new HashMap<>()}, "https://api.dailymotion.com/channel/xabcdef", ChannelEndpoint.ID, this.getResponseForType(Channel.class)},
                {3, Comment.class, new Object[]{"xabcdef"}, "https://api.dailymotion.com/comment/xabcdef", CommentEndpoint.ID, this.getResponseForType(Comment.class)},
                {4, Comment.class, new Object[]{"xabcdef", new HashMap<>()}, "https://api.dailymotion.com/comment/xabcdef", CommentEndpoint.ID, this.getResponseForType(Comment.class)},
                {1, Contest.class, null, "https://api.dailymotion.com/contests", ContestEndpoint.ALL, this.getResponseForType(Contest.class)},
                {2, Contest.class, new Object[]{new HashMap<>()}, "https://api.dailymotion.com/contests", ContestEndpoint.ALL, this.getResponseForType(Contest.class)},
                {3, Contest.class, new Object[]{"xabcdef"}, "https://api.dailymotion.com/contest/xabcdef", ContestEndpoint.ID, this.getResponseForType(Contest.class)},
                {4, Contest.class, new Object[]{"xabcdef", new HashMap<>()}, "https://api.dailymotion.com/contest/xabcdef", ContestEndpoint.ID, this.getResponseForType(Contest.class)},
                {1, Group.class, null, "https://api.dailymotion.com/groups", GroupEndpoint.ALL, this.getResponseForType(Group.class)},
                {1, Group.class, null, "https://api.dailymotion.com/me/groups", GroupEndpoint.ME, this.getResponseForType(Group.class)},
                {2, Group.class, new Object[]{new HashMap<>()}, "https://api.dailymotion.com/groups", GroupEndpoint.ALL, this.getResponseForType(Group.class)},
                {2, Group.class, new Object[]{new HashMap<>()}, "https://api.dailymotion.com/me/groups", GroupEndpoint.ME, this.getResponseForType(Group.class)},
                {3, Group.class, new Object[]{"xabcdef"}, "https://api.dailymotion.com/group/xabcdef", GroupEndpoint.ID, this.getResponseForType(Group.class)},
                {4, Group.class, new Object[]{"xabcdef", new HashMap<>()}, "https://api.dailymotion.com/group/xabcdef", GroupEndpoint.ID, this.getResponseForType(Group.class)},
                {1, Playlist.class, null, "https://api.dailymotion.com/playlists", PlaylistEndpoint.ALL, this.getResponseForType(Playlist.class)},
                {1, Playlist.class, null, "https://api.dailymotion.com/me/playlists", PlaylistEndpoint.ME, this.getResponseForType(Playlist.class)},
                {2, Playlist.class, new Object[]{new HashMap<>()}, "https://api.dailymotion.com/playlists", PlaylistEndpoint.ALL, this.getResponseForType(Playlist.class)},
                {2, Playlist.class, new Object[]{new HashMap<>()}, "https://api.dailymotion.com/me/playlists", PlaylistEndpoint.ME, this.getResponseForType(Playlist.class)},
                {3, Playlist.class, new Object[]{"xabcdef"}, "https://api.dailymotion.com/playlist/xabcdef", PlaylistEndpoint.ID, this.getResponseForType(Playlist.class)},
                {4, Playlist.class, new Object[]{"xabcdef", new HashMap<>()}, "https://api.dailymotion.com/playlist/xabcdef", PlaylistEndpoint.ID, this.getResponseForType(Playlist.class)},
                {3, Record.class, new Object[]{"xabcdef"}, "https://api.dailymotion.com/record/xabcdef", RecordEndpoint.ID, this.getResponseForType(Record.class)},
                {4, Record.class, new Object[]{"xabcdef", new HashMap<>()}, "https://api.dailymotion.com/record/xabcdef", RecordEndpoint.ID, this.getResponseForType(Record.class)},
                {3, Strongtag.class, new Object[]{"xabcdef"}, "https://api.dailymotion.com/strongtag/xabcdef", StrongtagEndpoint.ID, this.getResponseForType(Strongtag.class)},
                {4, Strongtag.class, new Object[]{"xabcdef", new HashMap<>()}, "https://api.dailymotion.com/strongtag/xabcdef", StrongtagEndpoint.ID, this.getResponseForType(Strongtag.class)},
                {3, Subtitle.class, new Object[]{"xabcdef"}, "https://api.dailymotion.com/subtitle/xabcdef", SubtitleEndpoint.ID, this.getResponseForType(Subtitle.class)},
                {4, Subtitle.class, new Object[]{"xabcdef", new HashMap<>()}, "https://api.dailymotion.com/subtitle/xabcdef", SubtitleEndpoint.ID, this.getResponseForType(Subtitle.class)},
                {1, User.class, null, "https://api.dailymotion.com/users", UserEndpoint.ALL, this.getResponseForType(User.class)},
                {2, User.class, new Object[]{new HashMap<>()}, "https://api.dailymotion.com/users", UserEndpoint.ALL, this.getResponseForType(User.class)},
                {3, User.class, new Object[]{"xabcdef"}, "https://api.dailymotion.com/user/xabcdef", UserEndpoint.ID, this.getResponseForType(User.class)},
                {4, User.class, new Object[]{"xabcdef", new HashMap<>()}, "https://api.dailymotion.com/user/xabcdef", UserEndpoint.ID, this.getResponseForType(User.class)},
                {1, Video.class, null, "https://api.dailymotion.com/videos", VideoEndpoint.ALL, this.getResponseForType(Video.class)},
                {1, Video.class, null, "https://api.dailymotion.com/me/videos", VideoEndpoint.ME, this.getResponseForType(Video.class)},
                {2, Video.class, new Object[]{new HashMap<>()}, "https://api.dailymotion.com/videos", VideoEndpoint.ALL, this.getResponseForType(Video.class)},
                {2, Video.class, new Object[]{new HashMap<>()}, "https://api.dailymotion.com/me/videos", VideoEndpoint.ME, this.getResponseForType(Video.class)},
                {3, Video.class, new Object[]{"xabcdef"}, "https://api.dailymotion.com/video/xabcdef", VideoEndpoint.ID, this.getResponseForType(Video.class)},
                {4, Video.class, new Object[]{"xabcdef", new HashMap<>()}, "https://api.dailymotion.com/video/xabcdef", VideoEndpoint.ID, this.getResponseForType(Video.class)},
        };
    }

    @Test(dataProvider = "doGetEndpoint")
    public <T> void testDoGetEndpoint(int method, Class<T> tClass, Object[] params, String expectedUrl, Endpoint endpoint, ApiResponse expectedResponse) throws Exception {
        // Given
        List<T> list = asList(tClass.newInstance(), tClass.newInstance(), tClass.newInstance());

        ApiResponse<T> tResponse = new ApiResponse<>();
        tResponse.setExplicit(false);
        tResponse.setHas_more(false);
        tResponse.setLimit(10);
        tResponse.setPage(1);
        tResponse.setList(list);
        tResponse.setTotal(list.size());

        JsonHelper helper = new JsonHelper();

        OAuth2RequestFilter filter = mock(OAuth2RequestFilter.class, RETURNS_DEEP_STUBS);
        Response response = mock(Response.class, RETURNS_DEEP_STUBS);
        when(this.httpClient.url(anyString()).get()).thenReturn(response);
        when(response.getBody()).thenReturn(helper.getObjectMapper().writeValueAsString(tResponse));
        when(response.getStatus()).thenReturn(Http.OK);
        when(filter.getAccessTokenEndPoint()).thenReturn("my-token");

        // When
        ApiResponse<?> actualResponse;
        switch (method) {
            case 1:
                actualResponse = this.dailymotionClient.doGet(endpoint);
                break;
            case 2:
                actualResponse = this.dailymotionClient.doGet(endpoint, (HashMap<String, List<String>>) params[0]);
                break;
            case 3:
                actualResponse = this.dailymotionClient.doGet(endpoint, (String) params[0]);
                break;
            case 4:
                actualResponse = this.dailymotionClient.doGet(endpoint, (String) params[0], (HashMap<String, List<String>>) params[1]);
                break;
            default:
                throw new IllegalArgumentException();
        }

        // Then
        verify(this.httpClient).url(expectedUrl);
        Assertions.assertThat(actualResponse).isNotNull().isEqualsToByComparingFields(expectedResponse);
        Assertions.assertThat(actualResponse.getList()).containsAll(expectedResponse.getList());
    }


    @DataProvider(name = "doGetConnection")
    private Object[][] doGetConnection() throws InstantiationException, IllegalAccessException {
        return new Object[][]{
                // Channel connections
                {1, Video.class, new Object[]{"xabcdef"}, "https://api.dailymotion.com/channel/xabcdef/videos", ChannelVideo.ALL, this.getResponseForType(Video.class)},
                {2, Video.class, new Object[]{"xabcdef", new HashMap<>()}, "https://api.dailymotion.com/activities", ChannelVideo.ALL, this.getResponseForType(Video.class)},
                {3, Video.class, new Object[]{"xabcdef", "xabcdef"}, "https://api.dailymotion.com/activity/xabcdef", ChannelVideo.ID, this.getResponseForType(Video.class)},
                {4, Video.class, new Object[]{"xabcdef", new HashMap<>(), "xabcdef"}, "https://api.dailymotion.com/activity/xabcdef", ChannelVideo.ID, this.getResponseForType(Video.class)},

                // Contest connections
                {1, User.class, new Object[]{"xabcdef"}, "https://api.dailymotion.com/channel/xabcdef/videos", ContestMember.ALL, this.getResponseForType(User.class)},
                {2, User.class, new Object[]{"xabcdef", new HashMap<>()}, "https://api.dailymotion.com/activities", ContestMember.ALL, this.getResponseForType(User.class)},
                {3, User.class, new Object[]{"xabcdef", "xabcdef"}, "https://api.dailymotion.com/activity/xabcdef", ContestMember.ID, this.getResponseForType(User.class)},
                {4, User.class, new Object[]{"xabcdef", new HashMap<>(), "xabcdef"}, "https://api.dailymotion.com/activity/xabcdef", ContestMember.ID, this.getResponseForType(User.class)},

                {1, Video.class, new Object[]{"xabcdef"}, "https://api.dailymotion.com/channel/xabcdef/videos", ContestVideo.ALL, this.getResponseForType(Video.class)},
                {2, Video.class, new Object[]{"xabcdef", new HashMap<>()}, "https://api.dailymotion.com/activities", ContestVideo.ALL, this.getResponseForType(Video.class)},
                {3, Video.class, new Object[]{"xabcdef", "xabcdef"}, "https://api.dailymotion.com/activity/xabcdef", ContestVideo.ID, this.getResponseForType(Video.class)},
                {4, Video.class, new Object[]{"xabcdef", new HashMap<>(), "xabcdef"}, "https://api.dailymotion.com/activity/xabcdef", ContestVideo.ID, this.getResponseForType(Video.class)},

                // Group connections
                {1, User.class, new Object[]{"xabcdef"}, "https://api.dailymotion.com/channel/xabcdef/videos", GroupMember.ALL, this.getResponseForType(User.class)},
                {2, User.class, new Object[]{"xabcdef", new HashMap<>()}, "https://api.dailymotion.com/activities", GroupMember.ALL, this.getResponseForType(User.class)},
                {3, User.class, new Object[]{"xabcdef", "xabcdef"}, "https://api.dailymotion.com/activity/xabcdef", GroupMember.ID, this.getResponseForType(User.class)},
                {4, User.class, new Object[]{"xabcdef", new HashMap<>(), "xabcdef"}, "https://api.dailymotion.com/activity/xabcdef", GroupMember.ID, this.getResponseForType(User.class)},

                {1, Video.class, new Object[]{"xabcdef"}, "https://api.dailymotion.com/channel/xabcdef/videos", GroupVideo.ALL, this.getResponseForType(Video.class)},
                {2, Video.class, new Object[]{"xabcdef", new HashMap<>()}, "https://api.dailymotion.com/activities", GroupVideo.ALL, this.getResponseForType(Video.class)},
                {3, Video.class, new Object[]{"xabcdef", "xabcdef"}, "https://api.dailymotion.com/activity/xabcdef", GroupVideo.ID, this.getResponseForType(Video.class)},
                {4, Video.class, new Object[]{"xabcdef", new HashMap<>(), "xabcdef"}, "https://api.dailymotion.com/activity/xabcdef", GroupVideo.ID, this.getResponseForType(Video.class)},

                // Playlist connections
                {1, Playlist.class, new Object[]{"xabcdef"}, "https://api.dailymotion.com/channel/xabcdef/videos", PlaylistVideo.ALL, this.getResponseForType(Playlist.class)},
                {2, Playlist.class, new Object[]{"xabcdef", new HashMap<>()}, "https://api.dailymotion.com/activities", PlaylistVideo.ALL, this.getResponseForType(Playlist.class)},
                {3, Playlist.class, new Object[]{"xabcdef", "xabcdef"}, "https://api.dailymotion.com/activity/xabcdef", PlaylistVideo.ID, this.getResponseForType(Playlist.class)},
                {4, Playlist.class, new Object[]{"xabcdef", new HashMap<>(), "xabcdef"}, "https://api.dailymotion.com/activity/xabcdef", PlaylistVideo.ID, this.getResponseForType(Playlist.class)},

                // User Connections
                {1, Activity.class, new Object[]{"xabcdef"}, "https://api.dailymotion.com/channel/xabcdef/videos", UserActivities.ALL, this.getResponseForType(Activity.class)},
                {2, Activity.class, new Object[]{"xabcdef", new HashMap<>()}, "https://api.dailymotion.com/activities", UserActivities.ALL, this.getResponseForType(Activity.class)},
                {3, Activity.class, new Object[]{"xabcdef", "xabcdef"}, "https://api.dailymotion.com/activity/xabcdef", UserActivities.ID, this.getResponseForType(Activity.class)},
                {4, Activity.class, new Object[]{"xabcdef", new HashMap<>(), "xabcdef"}, "https://api.dailymotion.com/activity/xabcdef", UserActivities.ID, this.getResponseForType(Activity.class)},

                {1, User.class, new Object[]{"xabcdef"}, "https://api.dailymotion.com/channel/xabcdef/videos", UserChildren.ALL, this.getResponseForType(User.class)},
                {2, User.class, new Object[]{"xabcdef", new HashMap<>()}, "https://api.dailymotion.com/activities", UserChildren.ALL, this.getResponseForType(User.class)},
                {3, User.class, new Object[]{"xabcdef", "xabcdef"}, "https://api.dailymotion.com/activity/xabcdef", UserChildren.ID, this.getResponseForType(User.class)},
                {4, User.class, new Object[]{"xabcdef", new HashMap<>(), "xabcdef"}, "https://api.dailymotion.com/activity/xabcdef", UserChildren.ID, this.getResponseForType(User.class)},

                {1, Contest.class, new Object[]{"xabcdef"}, "https://api.dailymotion.com/channel/xabcdef/videos", UserContests.ALL, this.getResponseForType(Contest.class)},
                {2, Contest.class, new Object[]{"xabcdef", new HashMap<>()}, "https://api.dailymotion.com/activities", UserContests.ALL, this.getResponseForType(Contest.class)},
                {3, Contest.class, new Object[]{"xabcdef", "xabcdef"}, "https://api.dailymotion.com/activity/xabcdef", UserContests.ID, this.getResponseForType(Contest.class)},
                {4, Contest.class, new Object[]{"xabcdef", new HashMap<>(), "xabcdef"}, "https://api.dailymotion.com/activity/xabcdef", UserContests.ID, this.getResponseForType(Contest.class)},

                {1, User.class, new Object[]{"xabcdef"}, "https://api.dailymotion.com/channel/xabcdef/videos", UserFans.ALL, this.getResponseForType(User.class)},
                {2, User.class, new Object[]{"xabcdef", new HashMap<>()}, "https://api.dailymotion.com/activities", UserFans.ALL, this.getResponseForType(User.class)},
                {3, User.class, new Object[]{"xabcdef", "xabcdef"}, "https://api.dailymotion.com/activity/xabcdef", UserFans.ID, this.getResponseForType(User.class)},
                {4, User.class, new Object[]{"xabcdef", new HashMap<>(), "xabcdef"}, "https://api.dailymotion.com/activity/xabcdef", UserFans.ID, this.getResponseForType(User.class)},

                {1, Video.class, new Object[]{"xabcdef"}, "https://api.dailymotion.com/channel/xabcdef/videos", UserFavorites.ALL, this.getResponseForType(Video.class)},
                {2, Video.class, new Object[]{"xabcdef", new HashMap<>()}, "https://api.dailymotion.com/activities", UserFavorites.ALL, this.getResponseForType(Video.class)},
                {3, Video.class, new Object[]{"xabcdef", "xabcdef"}, "https://api.dailymotion.com/activity/xabcdef", UserFavorites.ID, this.getResponseForType(Video.class)},
                {4, Video.class, new Object[]{"xabcdef", new HashMap<>(), "xabcdef"}, "https://api.dailymotion.com/activity/xabcdef", UserFavorites.ID, this.getResponseForType(Video.class)},

                {1, Video.class, new Object[]{"xabcdef"}, "https://api.dailymotion.com/channel/xabcdef/videos", UserFeatures.ALL, this.getResponseForType(Video.class)},
                {2, Video.class, new Object[]{"xabcdef", new HashMap<>()}, "https://api.dailymotion.com/activities", UserFeatures.ALL, this.getResponseForType(Video.class)},
                {3, Video.class, new Object[]{"xabcdef", "xabcdef"}, "https://api.dailymotion.com/activity/xabcdef", UserFeatures.ID, this.getResponseForType(Video.class)},
                {4, Video.class, new Object[]{"xabcdef", new HashMap<>(), "xabcdef"}, "https://api.dailymotion.com/activity/xabcdef", UserFeatures.ID, this.getResponseForType(Video.class)},

                {1, Activity.class, new Object[]{"xabcdef"}, "https://api.dailymotion.com/channel/xabcdef/videos", UserFeed.ALL, this.getResponseForType(Activity.class)},
                {2, Activity.class, new Object[]{"xabcdef", new HashMap<>()}, "https://api.dailymotion.com/activities", UserFeed.ALL, this.getResponseForType(Activity.class)},
                {3, Activity.class, new Object[]{"xabcdef", "xabcdef"}, "https://api.dailymotion.com/activity/xabcdef", UserFeed.ID, this.getResponseForType(Activity.class)},
                {4, Activity.class, new Object[]{"xabcdef", new HashMap<>(), "xabcdef"}, "https://api.dailymotion.com/activity/xabcdef", UserFeed.ID, this.getResponseForType(Activity.class)},

                {1, User.class, new Object[]{"xabcdef"}, "https://api.dailymotion.com/channel/xabcdef/videos", UserFollowing.ALL, this.getResponseForType(User.class)},
                {2, User.class, new Object[]{"xabcdef", new HashMap<>()}, "https://api.dailymotion.com/activities", UserFollowing.ALL, this.getResponseForType(User.class)},
                {3, User.class, new Object[]{"xabcdef", "xabcdef"}, "https://api.dailymotion.com/activity/xabcdef", UserFollowing.ID, this.getResponseForType(User.class)},
                {4, User.class, new Object[]{"xabcdef", new HashMap<>(), "xabcdef"}, "https://api.dailymotion.com/activity/xabcdef", UserFollowing.ID, this.getResponseForType(User.class)},

                {1, User.class, new Object[]{"xabcdef"}, "https://api.dailymotion.com/channel/xabcdef/videos", UserFriends.ALL, this.getResponseForType(User.class)},
                {2, User.class, new Object[]{"xabcdef", new HashMap<>()}, "https://api.dailymotion.com/activities", UserFriends.ALL, this.getResponseForType(User.class)},
                {3, User.class, new Object[]{"xabcdef", "xabcdef"}, "https://api.dailymotion.com/activity/xabcdef", UserFriends.ID, this.getResponseForType(User.class)},
                {4, User.class, new Object[]{"xabcdef", new HashMap<>(), "xabcdef"}, "https://api.dailymotion.com/activity/xabcdef", UserFriends.ID, this.getResponseForType(User.class)},

                {1, Group.class, new Object[]{"xabcdef"}, "https://api.dailymotion.com/channel/xabcdef/videos", UserGroups.ALL, this.getResponseForType(Group.class)},
                {2, Group.class, new Object[]{"xabcdef", new HashMap<>()}, "https://api.dailymotion.com/activities", UserGroups.ALL, this.getResponseForType(Group.class)},
                {3, Group.class, new Object[]{"xabcdef", "xabcdef"}, "https://api.dailymotion.com/activity/xabcdef", UserGroups.ID, this.getResponseForType(Group.class)},
                {4, Group.class, new Object[]{"xabcdef", new HashMap<>(), "xabcdef"}, "https://api.dailymotion.com/activity/xabcdef", UserGroups.ID, this.getResponseForType(Group.class)},

                {1, User.class, new Object[]{"xabcdef"}, "https://api.dailymotion.com/channel/xabcdef/videos", UserOffers.ALL, this.getResponseForType(User.class)},
                {2, User.class, new Object[]{"xabcdef", new HashMap<>()}, "https://api.dailymotion.com/activities", UserOffers.ALL, this.getResponseForType(User.class)},
                {3, User.class, new Object[]{"xabcdef", "xabcdef"}, "https://api.dailymotion.com/activity/xabcdef", UserOffers.ID, this.getResponseForType(User.class)},
                {4, User.class, new Object[]{"xabcdef", new HashMap<>(), "xabcdef"}, "https://api.dailymotion.com/activity/xabcdef", UserOffers.ID, this.getResponseForType(User.class)},

                {1, Playlist.class, new Object[]{"xabcdef"}, "https://api.dailymotion.com/channel/xabcdef/videos", UserPlaylists.ALL, this.getResponseForType(Playlist.class)},
                {2, Playlist.class, new Object[]{"xabcdef", new HashMap<>()}, "https://api.dailymotion.com/activities", UserPlaylists.ALL, this.getResponseForType(Playlist.class)},
                {3, Playlist.class, new Object[]{"xabcdef", "xabcdef"}, "https://api.dailymotion.com/activity/xabcdef", UserPlaylists.ID, this.getResponseForType(Playlist.class)},
                {4, Playlist.class, new Object[]{"xabcdef", new HashMap<>(), "xabcdef"}, "https://api.dailymotion.com/activity/xabcdef", UserPlaylists.ID, this.getResponseForType(Playlist.class)},

                {1, Video.class, new Object[]{"xabcdef"}, "https://api.dailymotion.com/channel/xabcdef/videos", UserSubscriptions.ALL, this.getResponseForType(Video.class)},
                {2, Video.class, new Object[]{"xabcdef", new HashMap<>()}, "https://api.dailymotion.com/activities", UserSubscriptions.ALL, this.getResponseForType(Video.class)},
                {3, Video.class, new Object[]{"xabcdef", "xabcdef"}, "https://api.dailymotion.com/activity/xabcdef", UserSubscriptions.ID, this.getResponseForType(Video.class)},
                {4, Video.class, new Object[]{"xabcdef", new HashMap<>(), "xabcdef"}, "https://api.dailymotion.com/activity/xabcdef", UserSubscriptions.ID, this.getResponseForType(Video.class)},

                {1, Video.class, new Object[]{"xabcdef"}, "https://api.dailymotion.com/channel/xabcdef/videos", UserVideos.ALL, this.getResponseForType(Video.class)},
                {2, Video.class, new Object[]{"xabcdef", new HashMap<>()}, "https://api.dailymotion.com/activities", UserVideos.ALL, this.getResponseForType(Video.class)},
                {3, Video.class, new Object[]{"xabcdef", "xabcdef"}, "https://api.dailymotion.com/activity/xabcdef", UserVideos.ID, this.getResponseForType(Video.class)},
                {4, Video.class, new Object[]{"xabcdef", new HashMap<>(), "xabcdef"}, "https://api.dailymotion.com/activity/xabcdef", UserVideos.ID, this.getResponseForType(Video.class)},

                // Video Connections

        };
    }

    @Test(dataProvider = "doGetConnection")
    public <T> void testDoGetConnection(int method, Class<T> tClass, Object[] params, String expectedUrl, Connection connection, ApiResponse expectedResponse) throws Exception {
        // Given
        List<T> list = asList(tClass.newInstance(), tClass.newInstance(), tClass.newInstance());

        ApiResponse<T> tResponse = new ApiResponse<>();
        tResponse.setExplicit(false);
        tResponse.setHas_more(false);
        tResponse.setLimit(10);
        tResponse.setPage(1);
        tResponse.setList(list);
        tResponse.setTotal(list.size());

        JsonHelper helper = new JsonHelper();

        OAuth2RequestFilter filter = mock(OAuth2RequestFilter.class, RETURNS_DEEP_STUBS);
        Response response = mock(Response.class, RETURNS_DEEP_STUBS);
        when(this.httpClient.url(anyString()).get()).thenReturn(response);
        when(response.getBody()).thenReturn(helper.getObjectMapper().writeValueAsString(tResponse));
        when(response.getStatus()).thenReturn(Http.OK);
        when(filter.getAccessTokenEndPoint()).thenReturn("my-token");

        // When
        ApiResponse<?> actualResponse;
        switch (method) {
            case 1:
                actualResponse = this.dailymotionClient.doGet(connection, (String) params[0]);
                break;
            case 2:
                actualResponse = this.dailymotionClient.doGet(connection, (String) params[0], (HashMap<String, List<String>>) params[1]);
                break;
            case 3:
                actualResponse = this.dailymotionClient.doGet(connection, (String) params[0], (String) params[1]);
                break;
            case 4:
                actualResponse = this.dailymotionClient.doGet(connection, (String) params[0], (String) params[2], (HashMap<String, List<String>>) params[1]);
                break;
            default:
                throw new IllegalArgumentException();
        }

        // Then
        //verify(this.httpClient).url(expectedUrl);
        Assertions.assertThat(actualResponse).isNotNull().isEqualsToByComparingFields(expectedResponse);
    }
}
