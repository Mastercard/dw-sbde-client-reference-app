package com.mastercard.sbde;

import com.mastercard.developer.interceptors.OkHttp2OAuth1Interceptor;
import com.mastercard.developer.utils.AuthenticationUtils;
import com.squareup.okhttp.Interceptor;
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

public class ApiService {
    private static final String API_BASE_PATH = "https://sandbox.api.mastercard.com/sbde/metrics-api";

    //Below properties will be required for authentication of API calls.
    private static final String CONSUMER_KEY = "Your consumer key"; // This refers to your consumer key. Copy it from "Keys" section on your project page in [Mastercard Developers](https://developer.mastercard.com/dashboard)
    private static final String SIGNING_KEY_ALIAS = "your key alias"; // This is the default value of key alias. If it is modified, use the updated one from keys section in [Mastercard Developers](https://developer.mastercard.com/dashboard).
    private static final String SIGNING_KEY_FILE_PATH = "path to your.p12 private key file"; // This refers to .p12 file found in the signing key. Please place .p12 file at src\main\resources in the project folder and add classpath for .p12 file.
    private static final String SIGNING_KEY_PASSWORD = "your password"; // This is the default value of key alias. If it is modified, use the updated one from keys section in [Mastercard Developers](https://developer.mastercard.com/dashboard).

    private final MerchantLocationApi merchantLocationApi;
    private final MerchantLocationMetricsApi merchantLocationMetricsApi;
    private final MerchantLocationPerformanceMetricsApi merchantLocationPerformanceMetricsApi;

    public ApiService() throws CertificateException, UnrecoverableKeyException, NoSuchAlgorithmException, IOException, KeyStoreException, NoSuchProviderException {
        PrivateKey signingKey = AuthenticationUtils.loadSigningKey(SIGNING_KEY_FILE_PATH, SIGNING_KEY_ALIAS, SIGNING_KEY_PASSWORD);

        ApiClient client = new ApiClient();
        client.setBasePath(API_BASE_PATH); //If you use any other sandbox url then please add sbde/metrics-api as an extension
        client.setDebugging(true);

        List<Interceptor> interceptors = client.getHttpClient().networkInterceptors();
        interceptors.add(new Main.ForceJsonResponseInterceptor());
        interceptors.add(new OkHttp2OAuth1Interceptor(CONSUMER_KEY, signingKey));

        merchantLocationApi = new MerchantLocationApi(client);
        merchantLocationMetricsApi = new MerchantLocationMetricsApi(client);
        merchantLocationPerformanceMetricsApi = new MerchantLocationPerformanceMetricsApi(client);
    }

    public ApiService(
            MerchantLocationApi merchantLocationApi,
            MerchantLocationMetricsApi merchantLocationMetricsApi,
            MerchantLocationPerformanceMetricsApi merchantLocationPerformanceMetricsApi
    ){
        this.merchantLocationApi = merchantLocationApi;
        this.merchantLocationMetricsApi = merchantLocationMetricsApi;
        this.merchantLocationPerformanceMetricsApi = merchantLocationPerformanceMetricsApi;
    }

    public MerchantLocation getMerchantLocationByMerchantLocationId(Long merchantLocationId) throws ApiException {
        return merchantLocationApi.getMerchantLocationByMerchantLocationId(merchantLocationId);
    }

    public MerchantLocationDailyMetrics getMerchantLocationDailyMetricsByMerchantLocationId (
            Long merchantLocationId,
            LocalDate fromDate,
            LocalDate toDate,
            Integer limit,
            Integer offset,
            String sort
    ) throws ApiException {
        return merchantLocationMetricsApi.getMerchantLocationDailyMetricsByMerchantLocationId(
                merchantLocationId,
                fromDate,
                toDate,
                limit,
                offset,
                sort
        );
    }

    public MerchantLocationPerformanceMetrics getPerformanceMetricsByMerchantLocationId (
            Long merchantLocationId,
            LocalDate fromDate,
            LocalDate toDate,
            String sort
    ) throws ApiException {
        return merchantLocationPerformanceMetricsApi.getPerformanceMetricsByMerchantLocationId(
                merchantLocationId,
                fromDate,
                toDate,
                sort
        );
    }
}
