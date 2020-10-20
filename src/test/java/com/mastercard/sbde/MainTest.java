package com.mastercard.sbde;

import com.squareup.okhttp.Interceptor;
import com.squareup.okhttp.Protocol;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;
import org.junit.Before;
import org.junit.Test;
import org.openapitools.client.ApiException;
import org.openapitools.client.model.MerchantLocation;
import org.openapitools.client.model.MerchantLocationDailyMetrics;
import org.openapitools.client.model.MerchantLocationPerformanceMetrics;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;
import static org.mockito.Matchers.any;
import static org.mockito.Matchers.anyLong;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.reset;

public class MainTest {

    private static ApiService apiService = mock(ApiService.class);

    @Before
    public void before() {
        reset(apiService);
        Main.setApiService(apiService);
    }

    @Test
    public void mainTest_HappyEndingTest() throws Exception {
        // arrange
        doReturn(new MerchantLocation())
                .when(apiService)
                .getMerchantLocationByMerchantLocationId(anyLong());

        doReturn(new MerchantLocationDailyMetrics())
                .when(apiService)
                .getMerchantLocationDailyMetricsByMerchantLocationId(any(), any(), any(), any(), any(), any());

        doReturn(new MerchantLocationPerformanceMetrics())
                .when(apiService)
                .getPerformanceMetricsByMerchantLocationId(any(), any(), any(), any());

        // act
        try {
            Main.main(new String[]{});
        } catch (Exception e) {
            fail("There should be no error");
        }
    }

    @Test(expected = ApiException.class)
    public void merchantLocation_Exception() throws Exception {

        doThrow(new ApiException("message"))
                .when(apiService)
                .getMerchantLocationByMerchantLocationId(anyLong());

        // act
        Main.main(new String[]{});
    }

    @Test(expected = ApiException.class)
    public void merchantLocationDailyMetrics_Exception_UnhappyEndpoints() throws Exception {
        // arrange
        doReturn(new MerchantLocation())
                .when(apiService)
                .getMerchantLocationByMerchantLocationId(anyLong());


        doThrow(new ApiException("message"))
                .when(apiService)
                .getMerchantLocationDailyMetricsByMerchantLocationId(any(),any(),any(),any(),any(),any());

        // act
        Main.main(new String[]{});
    }

    @Test(expected = ApiException.class)
    public void merchantLocationPerformanceMetrics_Exception_UnhappyEndpoints() throws Exception {
        // arrange
        doReturn(new MerchantLocation())
                .when(apiService)
                .getMerchantLocationByMerchantLocationId(anyLong());

        doReturn(new MerchantLocationDailyMetrics())
                .when(apiService)
                .getMerchantLocationDailyMetricsByMerchantLocationId(any(), any(), any(), any(), any(), any());

        doThrow(new ApiException("message"))
                .when(apiService)
                .getPerformanceMetricsByMerchantLocationId(any(),any(),any(),any());

        // act
        Main.main(new String[]{});
    }

    @Test
    public void forceJsonResponseInterceptor() throws Exception {
        // arrange
        Main.ForceJsonResponseInterceptor forceJsonResponseInterceptor = new Main.ForceJsonResponseInterceptor();
        Interceptor.Chain chain = mock(Interceptor.Chain.class);
        Request request = new Request.Builder().url("http://localhost/my-test").build();
        Response expected = new Response.Builder()
                .request(request)
                .protocol(Protocol.HTTP_1_1)
                .code(200)
                .build();

        doReturn(request)
                .when(chain)
                .request();

        doReturn(expected)
                .when(chain)
                .proceed(any());

        // act
        Response result = forceJsonResponseInterceptor.intercept(chain);

        // assert
        assertNotNull(result);
        assertEquals(expected, result);
    }

}
