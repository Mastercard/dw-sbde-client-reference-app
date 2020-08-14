# MerchantLocationApi

All URIs are relative to *http://sandbox.api.mastercard.com/sbde/metrics-api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getMerchantLocationByMerchantLocationId**](MerchantLocationApi.md#getMerchantLocationByMerchantLocationId) | **GET** /merchant-locations/{merchant_location_id} | Get merchant information by merchant_location_id


<a name="getMerchantLocationByMerchantLocationId"></a>
# **getMerchantLocationByMerchantLocationId**
> MerchantLocation getMerchantLocationByMerchantLocationId(merchantLocationId)

Get merchant information by merchant_location_id

Returns information about a merchant location based on the merchant_location_id.

### Example
```java
// Import classes:
//import org.openapitools.client.ApiException;
//import org.openapitools.client.api.MerchantLocationApi;


MerchantLocationApi apiInstance = new MerchantLocationApi();
Long merchantLocationId = 123456789; // Long | Merchant Market Hierarchy ID, used as a matching key
try {
    MerchantLocation result = apiInstance.getMerchantLocationByMerchantLocationId(merchantLocationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MerchantLocationApi#getMerchantLocationByMerchantLocationId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **merchantLocationId** | **Long**| Merchant Market Hierarchy ID, used as a matching key |

### Return type

[**MerchantLocation**](MerchantLocation.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

