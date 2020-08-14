# MerchantLocationPerformanceMetricsApi

All URIs are relative to *http://sandbox.api.mastercard.com/sbde/metrics-api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getPerformanceMetricsByMerchantLocationId**](MerchantLocationPerformanceMetricsApi.md#getPerformanceMetricsByMerchantLocationId) | **GET** /merchant-locations/{merchant_location_id}/metrics/merchant-performance-metrics | Get merchant performance metrics by merchant_location_id


<a name="getPerformanceMetricsByMerchantLocationId"></a>
# **getPerformanceMetricsByMerchantLocationId**
> MerchantLocationPerformanceMetrics getPerformanceMetricsByMerchantLocationId(merchantLocationId, fromDate, toDate, sort)

Get merchant performance metrics by merchant_location_id

Returns all available merchant performance metrics for a location using the locations merchant_location_id. The results are sorted by +period for ascending or -period for descending. The window size for retrieving results is also configurable by setting the initial date (from_date) as well as the last date (to_date).

### Example
```java
// Import classes:
//import org.openapitools.client.ApiException;
//import org.openapitools.client.api.MerchantLocationPerformanceMetricsApi;


MerchantLocationPerformanceMetricsApi apiInstance = new MerchantLocationPerformanceMetricsApi();
Long merchantLocationId = 123456789; // Long | Merchant Market Hierarchy ID, used as a matching key
LocalDate fromDate = 2020-01-01; // LocalDate | Initial date for the window to retrieve the metrics for in ISO8601 format. When excluded the current date is used.
LocalDate toDate = 2017-01-01; // LocalDate | End date for the window to retrieve the metrics for in ISO8601 format. When excluded the end date will be 3 years from the `from_date`.
String sort = -period; // String | Sort order for the metrics. Use -field for sort by field descending and +field for sorting by field ascending. Multiple field are separated by ','.
try {
    MerchantLocationPerformanceMetrics result = apiInstance.getPerformanceMetricsByMerchantLocationId(merchantLocationId, fromDate, toDate, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MerchantLocationPerformanceMetricsApi#getPerformanceMetricsByMerchantLocationId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **merchantLocationId** | **Long**| Merchant Market Hierarchy ID, used as a matching key |
 **fromDate** | **LocalDate**| Initial date for the window to retrieve the metrics for in ISO8601 format. When excluded the current date is used. | [optional]
 **toDate** | **LocalDate**| End date for the window to retrieve the metrics for in ISO8601 format. When excluded the end date will be 3 years from the &#x60;from_date&#x60;. | [optional]
 **sort** | **String**| Sort order for the metrics. Use -field for sort by field descending and +field for sorting by field ascending. Multiple field are separated by &#39;,&#39;. | [optional] [default to &quot;-period&quot;]

### Return type

[**MerchantLocationPerformanceMetrics**](MerchantLocationPerformanceMetrics.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

