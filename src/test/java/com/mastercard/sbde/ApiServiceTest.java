package com.mastercard.sbde;


import com.google.common.collect.Lists;
import org.junit.Before;
import org.junit.Test;
import org.openapitools.client.ApiException;
import org.openapitools.client.api.MerchantLocationApi;
import org.openapitools.client.api.MerchantLocationMetricsApi;
import org.openapitools.client.api.MerchantLocationPerformanceMetricsApi;
import org.openapitools.client.model.MerchantLocation;
import org.openapitools.client.model.MerchantLocationDailyMetric;
import org.openapitools.client.model.MerchantLocationDailyMetrics;
import org.openapitools.client.model.MerchantLocationMetric;
import org.openapitools.client.model.MerchantLocationPerformanceMetrics;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.anyLong;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.reset;
import static org.mockito.Mockito.when;

public class ApiServiceTest {

    private MerchantLocationApi merchantLocationApi = mock(MerchantLocationApi.class);
    private MerchantLocationMetricsApi merchantLocationMetricsApi = mock(MerchantLocationMetricsApi.class);
    private MerchantLocationPerformanceMetricsApi merchantLocationPerformanceMetricsApi = mock(MerchantLocationPerformanceMetricsApi.class);

    private ApiService apiService = new ApiService(
            merchantLocationApi,
            merchantLocationMetricsApi,
            merchantLocationPerformanceMetricsApi
    );

    @Before
    public void setUp() {
        reset(
                merchantLocationApi,
                merchantLocationMetricsApi,
                merchantLocationPerformanceMetricsApi
        );
    }

    @Test
    public void getMerchantLocationByMerchantLocationId() throws ApiException {
        // arrange
        Long merchantLocationId = 1L;
        MerchantLocation expected = new MerchantLocation()
                .merchantLocationId(merchantLocationId)
                .merchantName("My Merchant 1")
                .cleansedMerchantName("Merchant 1")
                .cityName("New York")
                .cleansedCityName("New York")
                .streetAddr("First Street")
                .countryCode("USA")
                .cleansedCountryCode("USA");

        when(merchantLocationApi.getMerchantLocationByMerchantLocationId(merchantLocationId))
                .thenReturn(expected);

        // act
        MerchantLocation result = apiService.getMerchantLocationByMerchantLocationId(merchantLocationId);

        // assert
        assertEquals(expected, result);
    }

    @Test
    public void getMerchantLocationDailyMetricsByMerchantLocationId() throws ApiException {
        // arrange
        Long merchantLocationId = 1L;
        MerchantLocationDailyMetric expected = (MerchantLocationDailyMetric) new MerchantLocationDailyMetric()
                .totalNumberOfTrxs(1L)
                .totalTrxsSpend(1.0)
                .merchantLocationId(merchantLocationId)
                .period(LocalDate.now());

        MerchantLocationDailyMetrics dailyMetrics = (MerchantLocationDailyMetrics) new MerchantLocationDailyMetrics()
                .items(Lists.newArrayList(expected))
                .total(1L)
                .offset(0)
                .limit(20);

        when(merchantLocationMetricsApi.getMerchantLocationDailyMetricsByMerchantLocationId(
                merchantLocationId,
                null,
                null,
                null,
                null,
                null
        )).thenReturn(dailyMetrics);

        // act
        MerchantLocationDailyMetrics result = apiService.getMerchantLocationDailyMetricsByMerchantLocationId(
                merchantLocationId,
                null,
                null,
                null,
                null,
                null
        );

        // assert
        assertEquals(1L, result.getTotal().longValue());
        assertEquals(expected, result.getItems().get(0));
    }

    @Test
    public void getPerformanceMetricsByMerchantLocationId() {

    }
}