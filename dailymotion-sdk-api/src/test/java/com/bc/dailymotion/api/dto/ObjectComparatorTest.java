package com.bc.dailymotion.api.dto;

import org.apache.commons.lang3.StringUtils;
import org.fest.assertions.api.Assertions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Field;
import java.text.ParseException;
import java.util.UUID;

public class ObjectComparatorTest {
    @DataProvider(name = "classesWithFields")
    public static Object[][] classesWithFieldsProvider() throws ParseException {
        return new Object[][]{
                {Activity.class, "id"},
                {Channel.class, "id"},
                {Comment.class, "id"},
                {Contest.class, "id"},
                {Group.class, "id"},
                {Playlist.class, "id"},
                {Record.class, "id"},
                {Strongtag.class, "id"},
                {Subtitle.class, "id"},
                {User.class, "id"},
                {Video.class, "id"}
        };
    }

    @Test(dataProvider = "classesWithFields")
    public void verifyEquals(Class<?> clazz, String idField) throws InstantiationException, IllegalAccessException,
            NoSuchFieldException, SecurityException {

        for (int i = 0; i < 4; i++) {
            Object firstObject = clazz.newInstance();
            Object secondObject = clazz.newInstance();

            String sbinary = Integer.toBinaryString(i);
            if (sbinary.length() < 4) {
                sbinary = StringUtils.repeat("0", 4 - sbinary.length()) + sbinary;
            }

            Field field = clazz.getDeclaredField(idField);
            field.setAccessible(true);
            field.set(firstObject, sbinary.charAt(0) == '1' ? "abcd" : null);
            field.set(secondObject, sbinary.charAt(1) == '1' ? "efgh" : null);

            Assertions.assertThat(firstObject.equals(secondObject)).isEqualTo(i == 0);
        }
    }

    @Test(dataProvider = "classesWithFields")
    public void verifyEquals2(Class<?> clazz, String idField) throws InstantiationException, IllegalAccessException,
            NoSuchFieldException, SecurityException {

        Object firstObject = clazz.newInstance();
        Object secondObject = clazz.newInstance();

        Field field = clazz.getDeclaredField(idField);
        field.setAccessible(true);
        field.set(firstObject, UUID.randomUUID().toString());
        field.set(secondObject, field.get(firstObject));

        Assertions.assertThat(firstObject.equals(secondObject)).isEqualTo(true);
    }

    @Test(dataProvider = "classesWithFields")
    public void verifyHashCode(Class<?> clazz, String idField) throws InstantiationException, IllegalAccessException,
            NoSuchFieldException, SecurityException {
        Object firstObject = clazz.newInstance();

        Field field = clazz.getDeclaredField(idField);
        field.setAccessible(true);
        field.set(firstObject, null);
        Assertions.assertThat(firstObject.hashCode()).isEqualTo(0);
    }
}
