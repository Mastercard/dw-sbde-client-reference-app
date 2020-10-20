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
    private final MerchantLocationApi merchantLocationApi;
    private final MerchantLocationMetricsApi merchantLocationMetricsApi;
    private final MerchantLocationPerformanceMetricsApi merchantLocationPerformanceMetricsApi;

    public ApiService() throws CertificateException, UnrecoverableKeyException, NoSuchAlgorithmException, IOException, KeyStoreException, NoSuchProviderException {
        String consumerKey = "Your consumer key"; // You should copy this from "My Keys" on your project page e.g. UTfbhDCSeNYvJpLL5l028sWL9it739PYh6LU5lZja15xcRpY!fd209e6c579dc9d7be52da93d35ae6b6c167c174690b72fa
        String signingKeyAlias = "your key alias";
        String signingKeyFilePath = "path to your.p12 private key file"; // e.g. /Users/yourname/project/sandbox.p12
        String signingKeyPassword = "your password";
        PrivateKey signingKey = AuthenticationUtils.loadSigningKey(signingKeyFilePath, signingKeyAlias, signingKeyPassword);

        ApiClient client = new ApiClient();
        client.setBasePath("https://sandbox.api.mastercard.com/sbde/metrics-api"); //If you use any other sandbox url then please add sbde/metrics-api as an extension
        client.setDebugging(true);

        List<Interceptor> interceptors = client.getHttpClient().networkInterceptors();
        interceptors.add(new Main.ForceJsonResponseInterceptor());
        interceptors.add(new OkHttp2OAuth1Interceptor(consumerKey, signingKey));

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
