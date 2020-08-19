import com.mastercard.developer.interceptors.OkHttp2OAuth1Interceptor;
import com.mastercard.developer.utils.AuthenticationUtils;
import com.squareup.okhttp.Interceptor;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;
import org.openapitools.client.ApiClient;
import org.openapitools.client.api.MerchantLocationApi;
import org.openapitools.client.api.MerchantLocationMetricsApi;
import org.openapitools.client.api.MerchantLocationPerformanceMetricsApi;
import org.openapitools.client.model.MerchantLocation;
import org.openapitools.client.model.MerchantLocationDailyMetrics;
import org.openapitools.client.model.MerchantLocationPerformanceMetrics;

import java.io.IOException;
import java.security.PrivateKey;
import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {

        String consumerKey = "Your consumer key"; // You should copy this from "My Keys" on your project page e.g. UTfbhDCSeNYvJpLL5l028sWL9it739PYh6LU5lZja15xcRpY!fd209e6c579dc9d7be52da93d35ae6b6c167c174690b72fa
        String signingKeyAlias = "your key alias";
        String signingKeyFilePath = "path to your.p12 private key file"; // e.g. /Users/yourname/project/sandbox.p12
        String signingKeyPassword = "your password";
        PrivateKey signingKey = AuthenticationUtils.loadSigningKey(signingKeyFilePath, signingKeyAlias, signingKeyPassword);

        ApiClient client = new ApiClient();
        client.setBasePath("https://sandbox.api.mastercard.com");
        client.setDebugging(true);

        List<Interceptor> interceptors = client.getHttpClient().networkInterceptors();
        interceptors.add(new ForceJsonResponseInterceptor());
        interceptors.add(new OkHttp2OAuth1Interceptor(consumerKey, signingKey));

        // Get the Merchant Location Info
        MerchantLocationApi merchantLocationApi = new MerchantLocationApi(client);
        MerchantLocation merchantLocation = merchantLocationApi.getMerchantLocationByMerchantLocationId(1234567L);

        System.out.println(merchantLocation.toString());

        // Metrics API's
        MerchantLocationMetricsApi merchantLocationMetricsApi = new MerchantLocationMetricsApi(client);

        // Get the Merchant Location Daily Metrics
        MerchantLocationDailyMetrics dailyMetrics = merchantLocationMetricsApi.getMerchantLocationDailyMetricsByMerchantLocationId(
                1234567L,
                LocalDate.of(2020, 1, 31),
                LocalDate.of(2016, 1, 31),
                25,
                0,
                "-period"
        );

        System.out.println(dailyMetrics.toString());

        // Performance Metrics API's
        MerchantLocationPerformanceMetricsApi merchantLocationPerformanceMetricsApi = new MerchantLocationPerformanceMetricsApi(client);

        MerchantLocationPerformanceMetrics performanceMetrics = merchantLocationPerformanceMetricsApi.getPerformanceMetricsByMerchantLocationId(
                1234567L,
                LocalDate.of(2020, 1, 31),
                LocalDate.of(2016, 1, 31),
                "-period"
        );

        System.out.println(performanceMetrics.toString());
    }

    private static class ForceJsonResponseInterceptor implements Interceptor {
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
