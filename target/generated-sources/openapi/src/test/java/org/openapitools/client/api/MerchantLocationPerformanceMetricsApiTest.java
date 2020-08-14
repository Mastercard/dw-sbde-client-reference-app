/*
 * Small Business Decision Enhancer API
 * API for retrieving small business performance metrics such as daily, weekly, monthly and yearly metrics. These metrics detail information such as the number of transactions, amount spent and the breakdown of types of transactions at these locations.
 *
 * OpenAPI spec version: 1.0.0
 * Contact: apisupport@mastercard.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import org.openapitools.client.model.ErrorResponse;
import java.time.LocalDate;
import org.openapitools.client.model.MerchantLocationPerformanceMetrics;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for MerchantLocationPerformanceMetricsApi
 */
@Ignore
public class MerchantLocationPerformanceMetricsApiTest {

    private final MerchantLocationPerformanceMetricsApi api = new MerchantLocationPerformanceMetricsApi();

    
    /**
     * Get merchant performance metrics by merchant_location_id
     *
     * Returns all available merchant performance metrics for a location using the locations merchant_location_id. The results are sorted by +period for ascending or -period for descending. The window size for retrieving results is also configurable by setting the initial date (from_date) as well as the last date (to_date).
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPerformanceMetricsByMerchantLocationIdTest() throws ApiException {
        Long merchantLocationId = null;
        LocalDate fromDate = null;
        LocalDate toDate = null;
        String sort = null;
        MerchantLocationPerformanceMetrics response = api.getPerformanceMetricsByMerchantLocationId(merchantLocationId, fromDate, toDate, sort);

        // TODO: test validations
    }
    
}
