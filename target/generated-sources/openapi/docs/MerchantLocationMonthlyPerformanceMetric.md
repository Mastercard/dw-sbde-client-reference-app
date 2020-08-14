
# MerchantLocationMonthlyPerformanceMetric

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**period** | [**LocalDate**](LocalDate.md) | The time period that a metric is associated with | 
**totalNumberOfTrxs** | **Long** | The number of transactions that occurred at this location during this month | 
**totalTrxsSpend** | **Double** | The total amount spent at this location during this month | 
**avgFrequency** | **Double** | The average frequency of transactions at this location during this month | 
**pctRepeatCustomers30Days** | **Double** | Percentage of repeat customer spend over the previous 30 day period during this month | 
**pctRepeatCustomers60Days** | **Double** | Percentage of repeat customer spend over the previous 60 day period during this month | 
**pctRepeatCustomers90Days** | **Double** | Percentage of repeat customer spend over the previous 90 day period during this month | 
**cardProducts** | [**List&lt;PerformanceMetricsCardProduct&gt;**](PerformanceMetricsCardProduct.md) | List of card products for all transactions during this month |  [optional]



