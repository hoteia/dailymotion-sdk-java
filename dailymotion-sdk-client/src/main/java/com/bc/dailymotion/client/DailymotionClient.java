package com.bc.dailymotion.client;

import checkers.nullness.quals.NonNull;
import com.bc.dailymotion.api.Response;
import com.bc.dailymotion.api.Connection;
import com.bc.dailymotion.api.Connection.ConnectionType;
import com.bc.dailymotion.api.Endpoint;
import com.bc.dailymotion.api.Endpoint.EndpointType;

import java.util.List;
import java.util.Map;

/**
 * Created by a528122 on 27/12/13.
 */
public interface DailymotionClient {

    /**
     *
     * @param endPoint
     * @param type
     * @param <E>
     * @return
     */
    <E> Response<E> doGet(@NonNull Class<? extends Endpoint<E>> endPoint, @NonNull EndpointType type);

    /**
     *
     * @param endPoint
     * @param type
     * @param params
     * @param <E>
     * @return
     */
    <E> Response<E> doGet(@NonNull Class<? extends Endpoint<E>> endPoint, @NonNull EndpointType type, @NonNull Map<String, List<String>> params);

    /**
     *
     * @param endPoint
     * @param type
     * @param id
     * @param <E>
     * @return
     */
    <E> Response<E> doGet(@NonNull Class<? extends Endpoint<E>> endPoint, @NonNull EndpointType type, @NonNull String id);

    /**
     *
     * @param endPoint
     * @param type
     * @param id
     * @param params
     * @param <E>
     * @return
     */
    <E> Response<E> doGet(@NonNull Class<? extends Endpoint<E>> endPoint, @NonNull EndpointType type, @NonNull String id, @NonNull Map<String, List<String>> params);

    /**
     *
     * @param connection
     * @param type
     * @param id
     * @param <E>
     * @param <T>
     * @return
     */
    <E, T> Response<T> doGet(@NonNull Class<? extends Connection<E, T>> connection, @NonNull ConnectionType type, @NonNull String id);

    /**
     *
     * @param connection
     * @param type
     * @param id
     * @param params
     * @param <E>
     * @param <T>
     * @return
     */
    <E, T> Response<T> doGet(@NonNull Class<? extends Connection<E, T>> connection, @NonNull ConnectionType type, @NonNull String id, @NonNull Map<String, List<String>> params);

    /**
     *
     * @param connection
     * @param type
     * @param id
     * @param subId
     * @param <E>
     * @param <T>
     * @return
     */
    <E, T> Response<T> doGet(@NonNull Class<? extends Connection<E, T>> connection, @NonNull ConnectionType type, @NonNull String id, @NonNull String subId);

    /**
     *
     * @param connection
     * @param type
     * @param id
     * @param subId
     * @param params
     * @param <E>
     * @param <T>
     * @return
     */
    <E, T> Response<T> doGet(@NonNull Class<? extends Connection<E, T>> connection, @NonNull ConnectionType type, @NonNull String id, @NonNull String subId, @NonNull Map<String, List<String>> params);

    /**
     *
     * @param endPoint
     * @param type
     * @param <E>
     * @return
     */
    <E> Response<E> doPost(@NonNull Class<? extends Endpoint<E>> endPoint, @NonNull EndpointType type);

    /**
     *
     * @param endPoint
     * @param type
     * @param params
     * @param <E>
     * @return
     */
    <E> Response<E> doPost(@NonNull Class<? extends Endpoint<E>> endPoint, @NonNull EndpointType type, @NonNull Map<String, List<String>> params);

    /**
     *
     * @param endPoint
     * @param type
     * @param id
     * @param <E>
     * @return
     */
    <E> Response<E> doPost(@NonNull Class<? extends Endpoint<E>> endPoint, @NonNull EndpointType type, @NonNull String id);

    /**
     *
     * @param endPoint
     * @param type
     * @param id
     * @param params
     * @param <E>
     * @return
     */
    <E> Response<E> doPost(@NonNull Class<? extends Endpoint<E>> endPoint, @NonNull EndpointType type, @NonNull String id, @NonNull Map<String, List<String>> params);

    /**
     *
     * @param connection
     * @param type
     * @param id
     * @param <E>
     * @param <T>
     * @return
     */
    <E, T> Response<T> doPost(@NonNull Class<? extends Connection<E, T>> connection, @NonNull ConnectionType type, @NonNull String id);

    /**
     *
     * @param connection
     * @param type
     * @param id
     * @param params
     * @param <E>
     * @param <T>
     * @return
     */
    <E, T> Response<T> doPost(@NonNull Class<? extends Connection<E, T>> connection, @NonNull ConnectionType type, @NonNull String id, @NonNull Map<String, List<String>> params);

    /**
     *
     * @param connection
     * @param type
     * @param id
     * @param subId
     * @param <E>
     * @param <T>
     * @return
     */
    <E, T> Response<T> doPost(@NonNull Class<? extends Connection<E, T>> connection, @NonNull ConnectionType type, @NonNull String id, @NonNull String subId);

    /**
     *
     * @param connection
     * @param type
     * @param id
     * @param subId
     * @param params
     * @param <E>
     * @param <T>
     * @return
     */
    <E, T> Response<T> doPost(@NonNull Class<? extends Connection<E, T>> connection, @NonNull ConnectionType type, @NonNull String id, @NonNull String subId, @NonNull Map<String, List<String>> params);

    /**
     *
     * @param endPoint
     * @param type
     * @param <E>
     * @return
     */
    <E> Response<E> doDelete(@NonNull Class<? extends Endpoint<E>> endPoint, @NonNull EndpointType type);

    /**
     *
     * @param endPoint
     * @param type
     * @param params
     * @param <E>
     * @return
     */
    <E> Response<E> doDelete(@NonNull Class<? extends Endpoint<E>> endPoint, @NonNull EndpointType type, @NonNull Map<String, List<String>> params);

    /**
     *
     * @param endPoint
     * @param type
     * @param id
     * @param <E>
     * @return
     */
    <E> Response<E> doDelete(@NonNull Class<? extends Endpoint<E>> endPoint, @NonNull EndpointType type, @NonNull String id);

    /**
     *
     * @param endPoint
     * @param type
     * @param id
     * @param params
     * @param <E>
     * @return
     */
    <E> Response<E> doDelete(@NonNull Class<? extends Endpoint<E>> endPoint, @NonNull EndpointType type, @NonNull String id, @NonNull Map<String, List<String>> params);

    /**
     *
     * @param connection
     * @param type
     * @param id
     * @param <E>
     * @param <T>
     * @return
     */
    <E, T> Response<T> doDelete(@NonNull Class<? extends Connection<E, T>> connection, @NonNull ConnectionType type, @NonNull String id);

    /**
     *
     * @param connection
     * @param type
     * @param id
     * @param params
     * @param <E>
     * @param <T>
     * @return
     */
    <E, T> Response<T> doDelete(@NonNull Class<? extends Connection<E, T>> connection, @NonNull ConnectionType type, @NonNull String id, @NonNull Map<String, List<String>> params);

    /**
     *
     * @param connection
     * @param type
     * @param id
     * @param subId
     * @param <E>
     * @param <T>
     * @return
     */
    <E, T> Response<T> doDelete(@NonNull Class<? extends Connection<E, T>> connection, @NonNull ConnectionType type, @NonNull String id, @NonNull String subId);

    /**
     *
     * @param connection
     * @param type
     * @param id
     * @param subId
     * @param params
     * @param <E>
     * @param <T>
     * @return
     */
    <E, T> Response<T> doDelete(@NonNull Class<? extends Connection<E, T>> connection, @NonNull ConnectionType type, @NonNull String id, @NonNull String subId, @NonNull Map<String, List<String>> params);
}
