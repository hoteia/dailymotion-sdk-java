package fr.zebasto.dailymotion.sdk.api.dto;

import org.fest.assertions.api.Assertions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Field;
import java.text.ParseException;

public class DtoComparatorTest {
    private static final String ID = "id";

    @DataProvider(name = "classesWithFieldsSetted")
    public static Object[][] classesWithFieldsSettedProvider() throws ParseException {
        return new Object[][]{
                {Activity.class, 1, false}, {Activity.class, 2, true}, {Activity.class, 3, false}, {Activity.class, 4, false}, {Activity.class, 5, true}, {Activity.class, 6, false},
                {Channel.class, 1, false}, {Channel.class, 2, true}, {Channel.class, 3, false}, {Channel.class, 4, false}, {Channel.class, 5, true}, {Channel.class, 6, false},
                {Comment.class, 1, false}, {Comment.class, 2, true}, {Comment.class, 3, false}, {Comment.class, 4, false}, {Comment.class, 5, true}, {Comment.class, 6, false},
                {Contest.class, 1, false}, {Contest.class, 2, true}, {Contest.class, 3, false}, {Contest.class, 4, false}, {Contest.class, 5, true}, {Contest.class, 6, false},
                {Group.class, 1, false}, {Group.class, 2, true}, {Group.class, 3, false}, {Group.class, 4, false}, {Group.class, 5, true}, {Group.class, 6, false},
                {Playlist.class, 1, false}, {Playlist.class, 2, true}, {Playlist.class, 3, false}, {Playlist.class, 4, false}, {Playlist.class, 5, true}, {Playlist.class, 6, false},
                {Record.class, 1, false}, {Record.class, 2, true}, {Record.class, 3, false}, {Record.class, 4, false}, {Record.class, 5, true}, {Record.class, 6, false},
                {Strongtag.class, 1, false}, {Strongtag.class, 2, true}, {Strongtag.class, 3, false}, {Strongtag.class, 4, false}, {Strongtag.class, 5, true}, {Strongtag.class, 6, false},
                {Subtitle.class, 1, false}, {Subtitle.class, 2, true}, {Subtitle.class, 3, false}, {Subtitle.class, 4, false}, {Subtitle.class, 5, true}, {Subtitle.class, 6, false},
                {User.class, 1, false}, {User.class, 2, true}, {User.class, 3, false}, {User.class, 4, false}, {User.class, 5, true}, {User.class, 6, false},
                {Video.class, 1, false}, {Video.class, 2, true}, {Video.class, 3, false}, {Video.class, 4, false}, {Video.class, 5, true}, {Video.class, 6, false},
        };
    }

    @Test(dataProvider = "classesWithFieldsSetted")
    public void verifyEquals(Class<?> clazz, int useCase, boolean expectedResult) throws InstantiationException, IllegalAccessException, NoSuchFieldException, SecurityException {
        // Given
        Object firstObject = clazz.newInstance();
        Object secondObject = clazz.newInstance();

        Field field = clazz.getDeclaredField(ID);
        field.setAccessible(true);
        field.set(firstObject, useCase % 2 == 1 ? "abcd" : null);
        field.set(secondObject, useCase >= 3 ? (useCase >= 5 ? "abcd" : "efgh") : null);

        // When
        boolean equals = firstObject.equals(secondObject);

        // Then
        Assertions.assertThat(equals).isEqualTo(expectedResult);
    }

    @DataProvider(name = "classesWithObjects")
    public static Object[][] classesWithObjectsProvider() throws ParseException {
        return new Object[][]{
                {Activity.class, 1, true}, {Activity.class, 2, false}, {Activity.class, 3, false},
                {Channel.class, 1, true}, {Channel.class, 2, false}, {Channel.class, 3, false},
                {Comment.class, 1, true}, {Comment.class, 2, false}, {Comment.class, 3, false},
                {Contest.class, 1, true}, {Contest.class, 2, false}, {Contest.class, 3, false},
                {Group.class, 1, true}, {Group.class, 2, false}, {Group.class, 3, false},
                {Playlist.class, 1, true}, {Playlist.class, 2, false}, {Playlist.class, 3, false},
                {Record.class, 1, true}, {Record.class, 2, false}, {Record.class, 3, false},
                {Strongtag.class, 1, true}, {Strongtag.class, 2, false}, {Strongtag.class, 3, false},
                {Subtitle.class, 1, true}, {Subtitle.class, 2, false}, {Subtitle.class, 3, false},
                {User.class, 1, true}, {User.class, 2, false}, {User.class, 3, false},
                {Video.class, 1, true}, {Video.class, 2, false}, {Video.class, 3, false},
        };
    }

    @Test(dataProvider = "classesWithObjects")
    public void verifyEquals2(Class<?> clazz, int useCase, boolean expectedResult) throws InstantiationException, IllegalAccessException, NoSuchFieldException, SecurityException {
        // Given
        Object firstObject = clazz.newInstance();
        Object secondObject = null;
        String differentObject = "null";

        // When
        boolean equals = !expectedResult;

        switch (useCase) {
            case 1:
                equals = firstObject.equals(firstObject);
                break;
            case 2:
                equals = firstObject.equals(secondObject);
                break;
            case 3:
                equals = firstObject.equals(differentObject);
                break;
        }

        // Then
        Assertions.assertThat(equals).isEqualTo(expectedResult);
    }

    @DataProvider(name = "hashCode")
    public static Object[][] hashCodeProvider() throws ParseException {
        return new Object[][]{
                {Activity.class, "abcd", "abcd".hashCode()}, {Activity.class, null, 0},
                {Channel.class, "abcd", "abcd".hashCode()}, {Channel.class, null, 0},
                {Comment.class, "abcd", "abcd".hashCode()}, {Comment.class, null, 0},
                {Contest.class, "abcd", "abcd".hashCode()}, {Contest.class, null, 0},
                {Group.class, "abcd", "abcd".hashCode()}, {Group.class, null, 0},
                {Playlist.class, "abcd", "abcd".hashCode()}, {Playlist.class, null, 0},
                {Record.class, "abcd", "abcd".hashCode()}, {Record.class, null, 0},
                {Strongtag.class, "abcd", "abcd".hashCode()}, {Strongtag.class, null, 0},
                {Subtitle.class, "abcd", "abcd".hashCode()}, {Subtitle.class, null, 0},
                {User.class, "abcd", "abcd".hashCode()}, {User.class, null, 0},
                {Video.class, "abcd", "abcd".hashCode()}, {Video.class, null, 0},
        };
    }

    @Test(dataProvider = "hashCode")
    public void verifyHashCode(Class<?> clazz, String id, int expectedResult) throws InstantiationException, IllegalAccessException, NoSuchFieldException, SecurityException {
        // Given
        Object firstObject = clazz.newInstance();

        Field field = clazz.getDeclaredField(ID);
        field.setAccessible(true);
        field.set(firstObject, id);

        // When
        int hashCode = firstObject.hashCode();

        // Then
        Assertions.assertThat(hashCode).isEqualTo(expectedResult);
    }
}
