package fr.zebasto.dailymotion.sdk.client.support;

import com.fasterxml.jackson.core.type.TypeReference;
import fr.zebasto.dailymotion.sdk.api.Entity;
import fr.zebasto.dailymotion.sdk.api.communication.ApiResponse;

/**
 * Class description
 *
 * @author Bastien Cecchinato
 * @since 1.0.0
 */
public class ApiTypeReference<E extends Entity> extends TypeReference<ApiResponse<E>> {
}
