/*
 * Small Business Decision Enhancer API
 * API for retrieving small business performance metrics such as daily, weekly, monthly and yearly metrics. These metrics detail information such as the number of transactions, amount spent and the breakdown of types of transactions at these locations.
 *
 * OpenAPI spec version: 1.0.0
 * Contact: apisupport@mastercard.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.LocalDate;

/**
 * Metrics for this location on this day such as the total number of transactions and the total amount spent
 */
@ApiModel(description = "Metrics for this location on this day such as the total number of transactions and the total amount spent")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-10-13T09:17:31.952+01:00[Europe/London]")
public class MerchantLocationDailyPerformanceMetric {
  public static final String SERIALIZED_NAME_PERIOD = "period";
  @SerializedName(SERIALIZED_NAME_PERIOD)
  private LocalDate period;

  public static final String SERIALIZED_NAME_TOTAL_NUMBER_OF_TRXS = "totalNumberOfTrxs";
  @SerializedName(SERIALIZED_NAME_TOTAL_NUMBER_OF_TRXS)
  private Long totalNumberOfTrxs;

  public static final String SERIALIZED_NAME_TOTAL_TRXS_SPEND = "totalTrxsSpend";
  @SerializedName(SERIALIZED_NAME_TOTAL_TRXS_SPEND)
  private Double totalTrxsSpend;

  public MerchantLocationDailyPerformanceMetric period(LocalDate period) {
    this.period = period;
    return this;
  }

   /**
   * The time period that a metric is associated with
   * @return period
  **/
  @ApiModelProperty(required = true, value = "The time period that a metric is associated with")
  public LocalDate getPeriod() {
    return period;
  }

  public void setPeriod(LocalDate period) {
    this.period = period;
  }

  public MerchantLocationDailyPerformanceMetric totalNumberOfTrxs(Long totalNumberOfTrxs) {
    this.totalNumberOfTrxs = totalNumberOfTrxs;
    return this;
  }

   /**
   * The number of transactions that occurred at this location on this day
   * @return totalNumberOfTrxs
  **/
  @ApiModelProperty(example = "19", required = true, value = "The number of transactions that occurred at this location on this day")
  public Long getTotalNumberOfTrxs() {
    return totalNumberOfTrxs;
  }

  public void setTotalNumberOfTrxs(Long totalNumberOfTrxs) {
    this.totalNumberOfTrxs = totalNumberOfTrxs;
  }

  public MerchantLocationDailyPerformanceMetric totalTrxsSpend(Double totalTrxsSpend) {
    this.totalTrxsSpend = totalTrxsSpend;
    return this;
  }

   /**
   * The total amount spent at this location on this day
   * @return totalTrxsSpend
  **/
  @ApiModelProperty(example = "344.04", required = true, value = "The total amount spent at this location on this day")
  public Double getTotalTrxsSpend() {
    return totalTrxsSpend;
  }

  public void setTotalTrxsSpend(Double totalTrxsSpend) {
    this.totalTrxsSpend = totalTrxsSpend;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MerchantLocationDailyPerformanceMetric merchantLocationDailyPerformanceMetric = (MerchantLocationDailyPerformanceMetric) o;
    return Objects.equals(this.period, merchantLocationDailyPerformanceMetric.period) &&
        Objects.equals(this.totalNumberOfTrxs, merchantLocationDailyPerformanceMetric.totalNumberOfTrxs) &&
        Objects.equals(this.totalTrxsSpend, merchantLocationDailyPerformanceMetric.totalTrxsSpend);
  }

  @Override
  public int hashCode() {
    return Objects.hash(period, totalNumberOfTrxs, totalTrxsSpend);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MerchantLocationDailyPerformanceMetric {\n");
    
    sb.append("    period: ").append(toIndentedString(period)).append("\n");
    sb.append("    totalNumberOfTrxs: ").append(toIndentedString(totalNumberOfTrxs)).append("\n");
    sb.append("    totalTrxsSpend: ").append(toIndentedString(totalTrxsSpend)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

