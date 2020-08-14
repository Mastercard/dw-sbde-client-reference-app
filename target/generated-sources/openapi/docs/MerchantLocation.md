
# MerchantLocation

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**merchantLocationId** | **Long** | Merchant Market Hierarchy ID, used as a matching key | 
**merchantName** | **String** | Scrubbed merchant name from transaction clearing data |  [optional]
**cleansedMerchantName** | **String** | Cleansed name (after cleansing and third-party data validation process) |  [optional]
**streetAddr** | **String** | Scrubbed merchant address from transaction clearing data |  [optional]
**cleansedStreetAddr** | **String** | Cleansed address (after cleansing and third-party data validation process) |  [optional]
**cityName** | **String** | Scrubbed merchant city from transaction clearing data |  [optional]
**cleansedCityName** | **String** | Cleansed city name (after cleansing and third-party data validation process) |  [optional]
**stateName** | **String** | Scrubbed merchant state/county from transaction clearing data |  [optional]
**cleansedStateName** | **String** | Cleansed state/county (after cleansing and third-party data validation process) |  [optional]
**postalCode** | **String** | Scrubbed merchant postal/ZIP code from transaction clearing data |  [optional]
**cleansedPostalCode** | **String** | Cleansed postal/ZIP code (after cleansing and third-party data validation process) |  [optional]
**countryCode** | **String** | Scrubbed merchant country code from transaction clearing data | 
**cleansedCountryCode** | **String** | Cleansed country code (after cleansing and third-party data validation process) |  [optional]
**phoneNumber** | **String** | The Merchant phone number after it has been cleaned via matches to third party data |  [optional]
**cleansedPhoneNumber** | **String** | Cleansed telephone number (after cleansing and third-party data validation process) |  [optional]
**mccCode** | **String** | Merchant Category Code as reported in the transaction clearing record. |  [optional]
**legalCorporateName** | **String** | The merchant legal name as it appears in the clearing record |  [optional]
**cleansedLegalCorporateName** | **String** | The merchant legal name as it appears after it has been cleaned via matches to third party data |  [optional]
**industry** | **String** | MasterCard-defined grouping of Merchant Category Codes  - Approx. 100 categories |  [optional]
**superIndustry** | **String** | MasterCard-defined grouping of Merchant Category Codes  - Approx. 30 categories |  [optional]
**dunAndBradstreetNumber** | **String** | Dun and Bradstreet number for Merchant |  [optional]
**dateEstablished** | [**LocalDate**](LocalDate.md) | First date of transaction seen at merchant in ISO8601 format |  [optional]
**terminationDateWithMC** | [**LocalDate**](LocalDate.md) | Date of last transaction seen at merchant as of report date in ISO8601 format |  [optional]
**newBusinessFlag** | **Boolean** | Indicates whether the location is a &#39;new business&#39; based on the presence of a first transaction in the preceding 30 days. |  [optional]
**aggregateMerchantId** | **Long** | Merchant Aggregate ID groups merchant locations by chain.  First level of aggregation. |  [optional]
**aggregateMerchantName** | **String** | Name of the Merchant Aggregate chain |  [optional]
**keyAggregateMerchantID** | **Long** | Joins together different channels under the same chain. Second level of aggregation. |  [optional]
**parentAggregateMerchantId** | **String** | ID Code of the Parent Aggregate |  [optional]
**parentAggregateMerchantName** | **String** | Name of the Parent Aggregate |  [optional]
**naicsCode** | **String** | NAICS code |  [optional]
**localFavorite** | **Boolean** | Indicates whether the restaurant is frequented by, and popular with, the local population. |  [optional]
**hiddenGeme** | **Boolean** | Those local favorites that are in a condensed trade area. |  [optional]
**transactionVolumeRank** | **Integer** | Identifies the relative size of the merchant location based on transaction volume. Buckets of 0-99. (Compares merchants within the same industry category and country) |  [optional]
**avgTicketSizeRank** | **Integer** | Identifies the relative size of the merchant location based on average ticket size. Buckets of 0-99. (Compares merchants within the same industry category and country) |  [optional]



