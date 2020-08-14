# MerchantLocationMetricsApi

All URIs are relative to *http://sandbox.api.mastercard.com/sbde/metrics-api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getMerchantLocationDailyMetricsByMerchantLocationId**](MerchantLocationMetricsApi.md#getMerchantLocationDailyMetricsByMerchantLocationId) | **GET** /merchant-locations/{merchant_location_id}/metrics/daily-metrics | Get merchant daily metrics by merchant_location_id
[**getMerchantLocationMonthlyMetricsByMerchantLocationId**](MerchantLocationMetricsApi.md#getMerchantLocationMonthlyMetricsByMerchantLocationId) | **GET** /merchant-locations/{merchant_location_id}/metrics/monthly-metrics | Get monthly metrics for a location by merchant_location_id
[**getMerchantLocationWeeklyMetricsByMerchantLocationId**](MerchantLocationMetricsApi.md#getMerchantLocationWeeklyMetricsByMerchantLocationId) | **GET** /merchant-locations/{merchant_location_id}/metrics/weekly-metrics | Get weekly metrics for a location by merchant_location_id
[**getMerchantLocationYearlyMetricsByMerchantLocationId**](MerchantLocationMetricsApi.md#getMerchantLocationYearlyMetricsByMerchantLocationId) | **GET** /merchant-locations/{merchant_location_id}/metrics/yearly-metrics | Get yearly metrics for a location by merchant_location_id


<a name="getMerchantLocationDailyMetricsByMerchantLocationId"></a>
# **getMerchantLocationDailyMetricsByMerchantLocationId**
> MerchantLocationDailyMetrics getMerchantLocationDailyMetricsByMerchantLocationId(merchantLocationId, fromDate, toDate, limit, offset, sort)

Get merchant daily metrics by merchant_location_id

Returns the daily metrics for a location using the locations merchant_location_id. The results are configurable by page size (limit), offset and sorted by +period for ascending or -period for descending. The window size for retrieving results is also configurable by setting the initial date (from_date) as well as the last date (to_date).

### Example
```java
// Import classes:
//import org.openapitools.client.ApiException;
//import org.openapitools.client.api.MerchantLocationMetricsApi;


MerchantLocationMetricsApi apiInstance = new MerchantLocationMetricsApi();
Long merchantLocationId = 123456789; // Long | Merchant Market Hierarchy ID, used as a matching key
LocalDate fromDate = 2020-01-01; // LocalDate | Initial date for the window to retrieve the metrics for in ISO8601 format. When excluded the current date is used.
LocalDate toDate = 2017-01-01; // LocalDate | End date for the window to retrieve the metrics for in ISO8601 format. When excluded the end date will be 3 years from the `from_date`.
Integer limit = 20; // Integer | Maximum number of items to return.
Integer offset = 0; // Integer | Number of items to skip before returning the results.
String sort = -period; // String | Sort order for the metrics. Use -field for sort by field descending and +field for sorting by field ascending. Multiple field are separated by ','.
try {
    MerchantLocationDailyMetrics result = apiInstance.getMerchantLocationDailyMetricsByMerchantLocationId(merchantLocationId, fromDate, toDate, limit, offset, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MerchantLocationMetricsApi#getMerchantLocationDailyMetricsByMerchantLocationId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **merchantLocationId** | **Long**| Merchant Market Hierarchy ID, used as a matching key |
 **fromDate** | **LocalDate**| Initial date for the window to retrieve the metrics for in ISO8601 format. When excluded the current date is used. | [optional]
 **toDate** | **LocalDate**| End date for the window to retrieve the metrics for in ISO8601 format. When excluded the end date will be 3 years from the &#x60;from_date&#x60;. | [optional]
 **limit** | **Integer**| Maximum number of items to return. | [optional] [default to 20]
 **offset** | **Integer**| Number of items to skip before returning the results. | [optional] [default to 0]
 **sort** | **String**| Sort order for the metrics. Use -field for sort by field descending and +field for sorting by field ascending. Multiple field are separated by &#39;,&#39;. | [optional] [default to &quot;-period&quot;]

### Return type

[**MerchantLocationDailyMetrics**](MerchantLocationDailyMetrics.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getMerchantLocationMonthlyMetricsByMerchantLocationId"></a>
# **getMerchantLocationMonthlyMetricsByMerchantLocationId**
> MerchantLocationMonthlyMetrics getMerchantLocationMonthlyMetricsByMerchantLocationId(merchantLocationId, fromDate, toDate, limit, offset, sort)

Get monthly metrics for a location by merchant_location_id

Returns the monthly metrics for a location using the locations merchant_location_id. The results are configurable by page size (limit), offset and sorted by +period for ascending or -period for descending. The window size for retrieving results is also configurable by setting the initial date (from_date) as well as the last date (to_date).

### Example
```java
// Import classes:
//import org.openapitools.client.ApiException;
//import org.openapitools.client.api.MerchantLocationMetricsApi;


MerchantLocationMetricsApi apiInstance = new MerchantLocationMetricsApi();
Long merchantLocationId = 123456789; // Long | Merchant Market Hierarchy ID, used as a matching key
LocalDate fromDate = 2020-01-01; // LocalDate | Initial date for the window to retrieve the metrics for in ISO8601 format. When excluded the current date is used.
LocalDate toDate = 2017-01-01; // LocalDate | End date for the window to retrieve the metrics for in ISO8601 format. When excluded the end date will be 3 years from the `from_date`.
Integer limit = 20; // Integer | Maximum number of items to return.
Integer offset = 0; // Integer | Number of items to skip before returning the results.
String sort = -period; // String | Sort order for the metrics. Use -field for sort by field descending and +field for sorting by field ascending. Multiple field are separated by ','.
try {
    MerchantLocationMonthlyMetrics result = apiInstance.getMerchantLocationMonthlyMetricsByMerchantLocationId(merchantLocationId, fromDate, toDate, limit, offset, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MerchantLocationMetricsApi#getMerchantLocationMonthlyMetricsByMerchantLocationId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **merchantLocationId** | **Long**| Merchant Market Hierarchy ID, used as a matching key |
 **fromDate** | **LocalDate**| Initial date for the window to retrieve the metrics for in ISO8601 format. When excluded the current date is used. | [optional]
 **toDate** | **LocalDate**| End date for the window to retrieve the metrics for in ISO8601 format. When excluded the end date will be 3 years from the &#x60;from_date&#x60;. | [optional]
 **limit** | **Integer**| Maximum number of items to return. | [optional] [default to 20]
 **offset** | **Integer**| Number of items to skip before returning the results. | [optional] [default to 0]
 **sort** | **String**| Sort order for the metrics. Use -field for sort by field descending and +field for sorting by field ascending. Multiple field are separated by &#39;,&#39;. | [optional] [default to &quot;-period&quot;]

### Return type

[**MerchantLocationMonthlyMetrics**](MerchantLocationMonthlyMetrics.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getMerchantLocationWeeklyMetricsByMerchantLocationId"></a>
# **getMerchantLocationWeeklyMetricsByMerchantLocationId**
> MerchantLocationWeeklyMetrics getMerchantLocationWeeklyMetricsByMerchantLocationId(merchantLocationId, fromDate, toDate, limit, offset, sort)

Get weekly metrics for a location by merchant_location_id

Returns the weekly metrics for a location using the locations merchant_location_id. The results are configurable by page size (limit), offset and sorted by +period for ascending or -period for descending. The window size for retrieving results is also configurable by setting the initial date (from_date) as well as the last date (to_date).

### Example
```java
// Import classes:
//import org.openapitools.client.ApiException;
//import org.openapitools.client.api.MerchantLocationMetricsApi;


MerchantLocationMetricsApi apiInstance = new MerchantLocationMetricsApi();
Long merchantLocationId = 123456789; // Long | Merchant Market Hierarchy ID, used as a matching key
LocalDate fromDate = 2020-01-01; // LocalDate | Initial date for the window to retrieve the metrics for in ISO8601 format. When excluded the current date is used.
LocalDate toDate = 2017-01-01; // LocalDate | End date for the window to retrieve the metrics for in ISO8601 format. When excluded the end date will be 3 years from the `from_date`.
Integer limit = 20; // Integer | Maximum number of items to return.
Integer offset = 0; // Integer | Number of items to skip before returning the results.
String sort = -period; // String | Sort order for the metrics. Use -field for sort by field descending and +field for sorting by field ascending. Multiple field are separated by ','.
try {
    MerchantLocationWeeklyMetrics result = apiInstance.getMerchantLocationWeeklyMetricsByMerchantLocationId(merchantLocationId, fromDate, toDate, limit, offset, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MerchantLocationMetricsApi#getMerchantLocationWeeklyMetricsByMerchantLocationId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **merchantLocationId** | **Long**| Merchant Market Hierarchy ID, used as a matching key |
 **fromDate** | **LocalDate**| Initial date for the window to retrieve the metrics for in ISO8601 format. When excluded the current date is used. | [optional]
 **toDate** | **LocalDate**| End date for the window to retrieve the metrics for in ISO8601 format. When excluded the end date will be 3 years from the &#x60;from_date&#x60;. | [optional]
 **limit** | **Integer**| Maximum number of items to return. | [optional] [default to 20]
 **offset** | **Integer**| Number of items to skip before returning the results. | [optional] [default to 0]
 **sort** | **String**| Sort order for the metrics. Use -field for sort by field descending and +field for sorting by field ascending. Multiple field are separated by &#39;,&#39;. | [optional] [default to &quot;-period&quot;]

### Return type

[**MerchantLocationWeeklyMetrics**](MerchantLocationWeeklyMetrics.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getMerchantLocationYearlyMetricsByMerchantLocationId"></a>
# **getMerchantLocationYearlyMetricsByMerchantLocationId**
> MerchantLocationYearlyMetrics getMerchantLocationYearlyMetricsByMerchantLocationId(merchantLocationId, fromDate, toDate, limit, offset, sort)

Get yearly metrics for a location by merchant_location_id

Returns the yearly metrics for a location using the locations merchant_location_id. The results are configurable by page size (limit), offset and sorted by +period for ascending or -period for descending. The window size for retrieving results is also configurable by setting the initial date (from_date) as well as the last date (to_date).

### Example
```java
// Import classes:
//import org.openapitools.client.ApiException;
//import org.openapitools.client.api.MerchantLocationMetricsApi;


MerchantLocationMetricsApi apiInstance = new MerchantLocationMetricsApi();
Long merchantLocationId = 123456789; // Long | Merchant Market Hierarchy ID, used as a matching key
LocalDate fromDate = 2020-01-01; // LocalDate | Initial date for the window to retrieve the metrics for in ISO8601 format. When excluded the current date is used.
LocalDate toDate = 2017-01-01; // LocalDate | End date for the window to retrieve the metrics for in ISO8601 format. When excluded the end date will be 3 years from the `from_date`.
Integer limit = 20; // Integer | Maximum number of items to return.
Integer offset = 0; // Integer | Number of items to skip before returning the results.
String sort = -period; // String | Sort order for the metrics. Use -field for sort by field descending and +field for sorting by field ascending. Multiple field are separated by ','.
try {
    MerchantLocationYearlyMetrics result = apiInstance.getMerchantLocationYearlyMetricsByMerchantLocationId(merchantLocationId, fromDate, toDate, limit, offset, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MerchantLocationMetricsApi#getMerchantLocationYearlyMetricsByMerchantLocationId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **merchantLocationId** | **Long**| Merchant Market Hierarchy ID, used as a matching key |
 **fromDate** | **LocalDate**| Initial date for the window to retrieve the metrics for in ISO8601 format. When excluded the current date is used. | [optional]
 **toDate** | **LocalDate**| End date for the window to retrieve the metrics for in ISO8601 format. When excluded the end date will be 3 years from the &#x60;from_date&#x60;. | [optional]
 **limit** | **Integer**| Maximum number of items to return. | [optional] [default to 20]
 **offset** | **Integer**| Number of items to skip before returning the results. | [optional] [default to 0]
 **sort** | **String**| Sort order for the metrics. Use -field for sort by field descending and +field for sorting by field ascending. Multiple field are separated by &#39;,&#39;. | [optional] [default to &quot;-period&quot;]

### Return type

[**MerchantLocationYearlyMetrics**](MerchantLocationYearlyMetrics.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

