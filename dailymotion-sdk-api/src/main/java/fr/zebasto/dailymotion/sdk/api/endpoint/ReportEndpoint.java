package fr.zebasto.dailymotion.sdk.api.endpoint;

import fr.zebasto.dailymotion.sdk.api.annotation.Endpoint;
import fr.zebasto.dailymotion.sdk.api.communication.ApiError;
import fr.zebasto.dailymotion.sdk.api.communication.ApiResponse;
import fr.zebasto.dailymotion.sdk.api.communication.HttpMethod;
import fr.zebasto.dailymotion.sdk.api.dto.Report;

import java.util.Map;

/**
 * Class description
 *
 * @author Bastien Cecchinato
 * @since 1.0.0
 */
public interface ReportEndpoint {

    /**
     *
     * @param parameters
     * @return
     * @throws ApiError
     */
    @Endpoint(value = "/video/{id}/report", target = Report.class, method = HttpMethod.POST)
    ApiResponse<Report> create(Map<String, Object> parameters) throws ApiError;

    /**
     *
     * @param id
     * @param parameters
     * @return
     * @throws ApiError
     */
    @Endpoint(value = "/report/{id}", target = Report.class, method = HttpMethod.POST)
    ApiResponse<Report> update(String id, Map<String, Object> parameters) throws ApiError;

    /**
     *
     * @param id
     * @return
     * @throws ApiError
     */
    @Endpoint(value = "/report/{id}", target = Report.class, method = HttpMethod.DELETE)
    void delete(String id) throws ApiError;
}
