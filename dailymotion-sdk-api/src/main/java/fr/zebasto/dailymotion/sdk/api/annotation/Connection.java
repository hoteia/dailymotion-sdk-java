package fr.zebasto.dailymotion.sdk.api.annotation;

import fr.zebasto.dailymotion.sdk.api.Entity;
import fr.zebasto.dailymotion.sdk.api.communication.HttpMethod;

import java.lang.annotation.*;

/**
 * Class description
 *
 * @author Bastien Cecchinato
 * @since 1.0.0
 */
@Documented
@Target({ElementType.FIELD, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface Connection {
    String value();

    Class<? extends Entity> target();

    HttpMethod method() default HttpMethod.GET;

    int params() default 1;
}
