package com.bc.dailymotion.client.web;

import java.util.List;
import java.util.Map;

/**
 * Created by a528122 on 27/12/13.
 */
public interface DailymotionClient {

    <E> E doGet(E endPoint, String id);

    <E> E doGet(E endPoint, String id, Map<String, List<String>> params);

    <E, F> E doGet(E endPoint, F subEndpoint, String id);

    <E, F> E doGet(E endPoint, F subEndpoint, String id, Map<String, List<String>> params);

    <E> E doPost(E endPoint, String id, String content);

    <E> E doPost(E endPoint, String id, Map<String, List<String>> params, String content);

    <E, F> E doPost(E endPoint, F subEndpoint, String id, String content);

    <E, F> E doPost(E endPoint, F subEndpoint, String id, Map<String, List<String>> params, String content);

    <E> E doPut(E endPoint, String id, String content);

    <E> E doPut(E endPoint, String id, Map<String, List<String>> params, String content);

    <E, F> E doPut(E endPoint, F subEndpoint, String id, String content);

    <E, F> E doPut(E endPoint, F subEndpoint, String id, Map<String, List<String>> params, String content);

    <E> E doDelete(E endPoint, String id);

    <E> E doDelete(E endPoint, String id, Map<String, List<String>> params);

    <E, F> E doDelete(E endPoint, F subEndpoint, String id);

    <E, F> E doDelete(E endPoint, F subEndpoint, String id, Map<String, List<String>> params);
}
