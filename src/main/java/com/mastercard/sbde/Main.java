package com.mastercard.sbde;

import com.mastercard.developer.interceptors.OkHttp2OAuth1Interceptor;
import com.mastercard.developer.utils.AuthenticationUtils;
import com.squareup.okhttp.Interceptor;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.api.MerchantLocationApi;
import org.openapitools.client.api.MerchantLocationMetricsApi;
import org.openapitools.client.api.MerchantLocationPerformanceMetricsApi;
import org.openapitools.client.model.MerchantLocation;
import org.openapitools.client.model.MerchantLocationDailyMetrics;
import org.openapitools.client.model.MerchantLocationPerformanceMetrics;

import java.io.IOException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PrivateKey;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import java.time.LocalDate;
import java.util.List;

public class Main {
    private static ApiService apiService;

    protected static void setApiService(ApiService apiService) {
        Main.apiService = apiService;
    }

    public static void main(String[] args) throws Exception {

        if (apiService == null) {
            apiService = new ApiService();
        }

        // Get the Merchant Location Info
        MerchantLocation merchantLocation = apiService.getMerchantLocationByMerchantLocationId(123456789L);

        System.out.println(merchantLocation.toString());

        // Metrics API's

        // Get the Merchant Location Daily Metrics
        MerchantLocationDailyMetrics dailyMetrics = apiService.getMerchantLocationDailyMetricsByMerchantLocationId(
                123456789L,
                LocalDate.of(2020, 1, 31),
                LocalDate.of(2016, 1, 31),
                25,
                0,
                "-period"
        );

        System.out.println(dailyMetrics.toString());

        // Performance Metrics API's
        MerchantLocationPerformanceMetrics performanceMetrics = apiService.getPerformanceMetricsByMerchantLocationId(
                123456789L,
                LocalDate.of(2020, 1, 31),
                LocalDate.of(2016, 1, 31),
                "-period"
        );

        System.out.println(performanceMetrics.toString());
    }

    protected static class ForceJsonResponseInterceptor implements Interceptor {
        @Override
        public Response intercept(Chain chain) throws IOException {
            Request originalRequest = chain.request();
            System.out.println("===========" + originalRequest + "\n");

            String withJsonFormatUrl = withJsonFormat(originalRequest.uri().toString());
            Request newRequest = originalRequest.newBuilder().url(withJsonFormatUrl).build();
            return chain.proceed(newRequest);
        }

        private String withJsonFormat(String uri) {
            StringBuilder newUri = new StringBuilder(uri);
            newUri.append(uri.contains("?") ? "&" : "?");
            newUri.append("Format=JSON");
            return newUri.toString();
        }
    }
}
