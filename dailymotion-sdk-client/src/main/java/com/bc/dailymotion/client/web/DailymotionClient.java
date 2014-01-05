package com.bc.dailymotion.client.web;

import com.bc.dailymotion.api.Response;
import com.bc.dailymotion.api.connection.Connection;
import com.bc.dailymotion.api.endpoint.Endpoint;

import java.util.List;
import java.util.Map;

/**
 * Created by a528122 on 27/12/13.
 */
public interface DailymotionClient {

    <E> Response<E> doGet(Class<? extends Endpoint<E>> endPoint, Endpoint.EndpointType type);

    <E> Response<E> doGet(Class<? extends Endpoint<E>> endPoint, Endpoint.EndpointType type, Map<String, List<String>> params);

    <E> Response<E> doGet(Class<? extends Endpoint<E>> endPoint, Endpoint.EndpointType type, String id);

    <E> Response<E> doGet(Class<? extends Endpoint<E>> endPoint, Endpoint.EndpointType type, String id, Map<String, List<String>> params);

    <E, T> Response<T> doGet(Class<? extends Connection<E, T>> connection, Connection.ConnectionType type, String id);

    <E, T> Response<T> doGet(Class<? extends Connection<E, T>> connection, Connection.ConnectionType type, String id, Map<String, List<String>> params);

    <E, T> Response<T> doGet(Class<? extends Connection<E, T>> connection, Connection.ConnectionType type, String id, String subId);

    <E, T> Response<T> doGet(Class<? extends Connection<E, T>> connection, Connection.ConnectionType type, String id, String subId, Map<String, List<String>> params);

    <E> Response<E> doPost(Class<? extends Endpoint<E>> endPoint, Endpoint.EndpointType type);

    <E> Response<E> doPost(Class<? extends Endpoint<E>> endPoint, Endpoint.EndpointType type, Map<String, List<String>> params);

    <E> Response<E> doPost(Class<? extends Endpoint<E>> endPoint, Endpoint.EndpointType type, String id);

    <E> Response<E> doPost(Class<? extends Endpoint<E>> endPoint, Endpoint.EndpointType type, String id, Map<String, List<String>> params);

    <E, T> Response<T> doPost(Class<? extends Connection<E, T>> connection, Connection.ConnectionType type, String id);

    <E, T> Response<T> doPost(Class<? extends Connection<E, T>> connection, Connection.ConnectionType type, String id, Map<String, List<String>> params);

    <E, T> Response<T> doPost(Class<? extends Connection<E, T>> connection, Connection.ConnectionType type, String id, String subId);

    <E, T> Response<T> doPost(Class<? extends Connection<E, T>> connection, Connection.ConnectionType type, String id, String subId, Map<String, List<String>> params);

    <E> Response<E> doDelete(Class<? extends Endpoint<E>> endPoint, Endpoint.EndpointType type);

    <E> Response<E> doDelete(Class<? extends Endpoint<E>> endPoint, Endpoint.EndpointType type, Map<String, List<String>> params);

    <E> Response<E> doDelete(Class<? extends Endpoint<E>> endPoint, Endpoint.EndpointType type, String id);

    <E> Response<E> doDelete(Class<? extends Endpoint<E>> endPoint, Endpoint.EndpointType type, String id, Map<String, List<String>> params);

    <E, T> Response<T> doDelete(Class<? extends Connection<E, T>> connection, Connection.ConnectionType type, String id);

    <E, T> Response<T> doDelete(Class<? extends Connection<E, T>> connection, Connection.ConnectionType type, String id, Map<String, List<String>> params);

    <E, T> Response<T> doDelete(Class<? extends Connection<E, T>> connection, Connection.ConnectionType type, String id, String subId);

    <E, T> Response<T> doDelete(Class<? extends Connection<E, T>> connection, Connection.ConnectionType type, String id, String subId, Map<String, List<String>> params);
}
