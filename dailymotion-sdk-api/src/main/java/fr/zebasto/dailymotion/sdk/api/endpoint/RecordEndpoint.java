package fr.zebasto.dailymotion.sdk.api.endpoint;

import fr.zebasto.dailymotion.sdk.api.annotation.Endpoint;
import fr.zebasto.dailymotion.sdk.api.communication.ApiError;
import fr.zebasto.dailymotion.sdk.api.communication.ApiResponse;
import fr.zebasto.dailymotion.sdk.api.communication.HttpMethod;
import fr.zebasto.dailymotion.sdk.api.dto.Record;

import java.util.Map;

/**
 * Class description
 *
 * @author Bastien Cecchinato
 * @since 1.0.0
 */
public interface RecordEndpoint {
    /**
     *
     * @param parameters
     * @return
     * @throws ApiError
     */
    @Endpoint(value = "/video/{id}/record", target = Record.class, method = HttpMethod.GET)
    ApiResponse<Record> findAll(String id, Map<String, Object> parameters) throws ApiError;

    /**
     *
     * @param id
     * @param parameters
     * @return
     * @throws ApiError
     */
    @Endpoint(value = "/record/{id}", target = Record.class, method = HttpMethod.GET)
    ApiResponse<Record> findById(String id, Map<String, Object> parameters) throws ApiError;

    /**
     *
     * @param parameters
     * @return
     * @throws ApiError
     */
    @Endpoint(value = "/video/{id}/records", target = Record.class, method = HttpMethod.POST)
    ApiResponse<Record> create(String id, Map<String, Object> parameters) throws ApiError;

    /**
     *
     * @param id
     * @param parameters
     * @return
     * @throws ApiError
     */
    @Endpoint(value = "/record/{id}", target = Record.class, method = HttpMethod.POST)
    ApiResponse<Record> update(String id, Map<String, Object> parameters) throws ApiError;

    /**
     *
     * @param id
     * @return
     * @throws ApiError
     */
    @Endpoint(value = "/record/{id}", target = Record.class, method = HttpMethod.DELETE)
    void delete(String id) throws ApiError;
}
