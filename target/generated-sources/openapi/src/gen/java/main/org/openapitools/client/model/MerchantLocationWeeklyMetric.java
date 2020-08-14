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
import org.openapitools.client.model.MerchantLocationMetric;

/**
 * MerchantLocationWeeklyMetric
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-08-14T12:14:35.054+01:00[Europe/London]")
public class MerchantLocationWeeklyMetric extends MerchantLocationMetric {
  public static final String SERIALIZED_NAME_TOTAL_NUMBER_OF_TRXS = "totalNumberOfTrxs";
  @SerializedName(SERIALIZED_NAME_TOTAL_NUMBER_OF_TRXS)
  private Long totalNumberOfTrxs;

  public static final String SERIALIZED_NAME_TOTAL_TRXS_SPEND = "totalTrxsSpend";
  @SerializedName(SERIALIZED_NAME_TOTAL_TRXS_SPEND)
  private Double totalTrxsSpend;

  public static final String SERIALIZED_NAME_BRICK_PCT_SPEND = "brickPctSpend";
  @SerializedName(SERIALIZED_NAME_BRICK_PCT_SPEND)
  private Double brickPctSpend;

  public static final String SERIALIZED_NAME_BRICK_PCT_TRXS = "brickPctTrxs";
  @SerializedName(SERIALIZED_NAME_BRICK_PCT_TRXS)
  private Double brickPctTrxs;

  public static final String SERIALIZED_NAME_CREDIT_PCT_SPEND = "creditPctSpend";
  @SerializedName(SERIALIZED_NAME_CREDIT_PCT_SPEND)
  private Double creditPctSpend;

  public static final String SERIALIZED_NAME_CREDIT_PCT_TRXS = "creditPctTrxs";
  @SerializedName(SERIALIZED_NAME_CREDIT_PCT_TRXS)
  private Double creditPctTrxs;

  public static final String SERIALIZED_NAME_DEBIT_PCT_SPEND = "debitPctSpend";
  @SerializedName(SERIALIZED_NAME_DEBIT_PCT_SPEND)
  private Double debitPctSpend;

  public static final String SERIALIZED_NAME_DEBIT_PCT_TRXS = "debitPctTrxs";
  @SerializedName(SERIALIZED_NAME_DEBIT_PCT_TRXS)
  private Double debitPctTrxs;

  public static final String SERIALIZED_NAME_ONLINE_PCT_SPEND = "onlinePctSpend";
  @SerializedName(SERIALIZED_NAME_ONLINE_PCT_SPEND)
  private Double onlinePctSpend;

  public static final String SERIALIZED_NAME_ONLINE_PCT_TRXS = "onlinePctTrxs";
  @SerializedName(SERIALIZED_NAME_ONLINE_PCT_TRXS)
  private Double onlinePctTrxs;

  public MerchantLocationWeeklyMetric totalNumberOfTrxs(Long totalNumberOfTrxs) {
    this.totalNumberOfTrxs = totalNumberOfTrxs;
    return this;
  }

   /**
   * The number of transactions that occurred at this location during this week
   * @return totalNumberOfTrxs
  **/
  @ApiModelProperty(example = "19", required = true, value = "The number of transactions that occurred at this location during this week")
  public Long getTotalNumberOfTrxs() {
    return totalNumberOfTrxs;
  }

  public void setTotalNumberOfTrxs(Long totalNumberOfTrxs) {
    this.totalNumberOfTrxs = totalNumberOfTrxs;
  }

  public MerchantLocationWeeklyMetric totalTrxsSpend(Double totalTrxsSpend) {
    this.totalTrxsSpend = totalTrxsSpend;
    return this;
  }

   /**
   * The total amount spent at this location during this week
   * @return totalTrxsSpend
  **/
  @ApiModelProperty(example = "344.04", required = true, value = "The total amount spent at this location during this week")
  public Double getTotalTrxsSpend() {
    return totalTrxsSpend;
  }

  public void setTotalTrxsSpend(Double totalTrxsSpend) {
    this.totalTrxsSpend = totalTrxsSpend;
  }

  public MerchantLocationWeeklyMetric brickPctSpend(Double brickPctSpend) {
    this.brickPctSpend = brickPctSpend;
    return this;
  }

   /**
   * The percentage of spend at this location which was done in person during this week
   * @return brickPctSpend
  **/
  @ApiModelProperty(example = "100.0", required = true, value = "The percentage of spend at this location which was done in person during this week")
  public Double getBrickPctSpend() {
    return brickPctSpend;
  }

  public void setBrickPctSpend(Double brickPctSpend) {
    this.brickPctSpend = brickPctSpend;
  }

  public MerchantLocationWeeklyMetric brickPctTrxs(Double brickPctTrxs) {
    this.brickPctTrxs = brickPctTrxs;
    return this;
  }

   /**
   * The percentage of in person transactions at this location during this week
   * @return brickPctTrxs
  **/
  @ApiModelProperty(example = "100.0", required = true, value = "The percentage of in person transactions at this location during this week")
  public Double getBrickPctTrxs() {
    return brickPctTrxs;
  }

  public void setBrickPctTrxs(Double brickPctTrxs) {
    this.brickPctTrxs = brickPctTrxs;
  }

  public MerchantLocationWeeklyMetric creditPctSpend(Double creditPctSpend) {
    this.creditPctSpend = creditPctSpend;
    return this;
  }

   /**
   * The percentage of spend at this location of which was credit during this week
   * @return creditPctSpend
  **/
  @ApiModelProperty(example = "18.9", required = true, value = "The percentage of spend at this location of which was credit during this week")
  public Double getCreditPctSpend() {
    return creditPctSpend;
  }

  public void setCreditPctSpend(Double creditPctSpend) {
    this.creditPctSpend = creditPctSpend;
  }

  public MerchantLocationWeeklyMetric creditPctTrxs(Double creditPctTrxs) {
    this.creditPctTrxs = creditPctTrxs;
    return this;
  }

   /**
   * The percentage of transactions at this location of which was credit during this week
   * @return creditPctTrxs
  **/
  @ApiModelProperty(example = "16.34", required = true, value = "The percentage of transactions at this location of which was credit during this week")
  public Double getCreditPctTrxs() {
    return creditPctTrxs;
  }

  public void setCreditPctTrxs(Double creditPctTrxs) {
    this.creditPctTrxs = creditPctTrxs;
  }

  public MerchantLocationWeeklyMetric debitPctSpend(Double debitPctSpend) {
    this.debitPctSpend = debitPctSpend;
    return this;
  }

   /**
   * The percentage of spend at this location of which was debit during this week
   * @return debitPctSpend
  **/
  @ApiModelProperty(example = "81.1", required = true, value = "The percentage of spend at this location of which was debit during this week")
  public Double getDebitPctSpend() {
    return debitPctSpend;
  }

  public void setDebitPctSpend(Double debitPctSpend) {
    this.debitPctSpend = debitPctSpend;
  }

  public MerchantLocationWeeklyMetric debitPctTrxs(Double debitPctTrxs) {
    this.debitPctTrxs = debitPctTrxs;
    return this;
  }

   /**
   * The percentage of transactions at this location of which was debit during this week
   * @return debitPctTrxs
  **/
  @ApiModelProperty(example = "83.66", required = true, value = "The percentage of transactions at this location of which was debit during this week")
  public Double getDebitPctTrxs() {
    return debitPctTrxs;
  }

  public void setDebitPctTrxs(Double debitPctTrxs) {
    this.debitPctTrxs = debitPctTrxs;
  }

  public MerchantLocationWeeklyMetric onlinePctSpend(Double onlinePctSpend) {
    this.onlinePctSpend = onlinePctSpend;
    return this;
  }

   /**
   * The percentage of spend at this location of which was online during this week
   * @return onlinePctSpend
  **/
  @ApiModelProperty(example = "0.0", required = true, value = "The percentage of spend at this location of which was online during this week")
  public Double getOnlinePctSpend() {
    return onlinePctSpend;
  }

  public void setOnlinePctSpend(Double onlinePctSpend) {
    this.onlinePctSpend = onlinePctSpend;
  }

  public MerchantLocationWeeklyMetric onlinePctTrxs(Double onlinePctTrxs) {
    this.onlinePctTrxs = onlinePctTrxs;
    return this;
  }

   /**
   * The percentage of transactions at this location of which was online during this week
   * @return onlinePctTrxs
  **/
  @ApiModelProperty(example = "0.0", required = true, value = "The percentage of transactions at this location of which was online during this week")
  public Double getOnlinePctTrxs() {
    return onlinePctTrxs;
  }

  public void setOnlinePctTrxs(Double onlinePctTrxs) {
    this.onlinePctTrxs = onlinePctTrxs;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MerchantLocationWeeklyMetric merchantLocationWeeklyMetric = (MerchantLocationWeeklyMetric) o;
    return Objects.equals(this.totalNumberOfTrxs, merchantLocationWeeklyMetric.totalNumberOfTrxs) &&
        Objects.equals(this.totalTrxsSpend, merchantLocationWeeklyMetric.totalTrxsSpend) &&
        Objects.equals(this.brickPctSpend, merchantLocationWeeklyMetric.brickPctSpend) &&
        Objects.equals(this.brickPctTrxs, merchantLocationWeeklyMetric.brickPctTrxs) &&
        Objects.equals(this.creditPctSpend, merchantLocationWeeklyMetric.creditPctSpend) &&
        Objects.equals(this.creditPctTrxs, merchantLocationWeeklyMetric.creditPctTrxs) &&
        Objects.equals(this.debitPctSpend, merchantLocationWeeklyMetric.debitPctSpend) &&
        Objects.equals(this.debitPctTrxs, merchantLocationWeeklyMetric.debitPctTrxs) &&
        Objects.equals(this.onlinePctSpend, merchantLocationWeeklyMetric.onlinePctSpend) &&
        Objects.equals(this.onlinePctTrxs, merchantLocationWeeklyMetric.onlinePctTrxs) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalNumberOfTrxs, totalTrxsSpend, brickPctSpend, brickPctTrxs, creditPctSpend, creditPctTrxs, debitPctSpend, debitPctTrxs, onlinePctSpend, onlinePctTrxs, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MerchantLocationWeeklyMetric {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    totalNumberOfTrxs: ").append(toIndentedString(totalNumberOfTrxs)).append("\n");
    sb.append("    totalTrxsSpend: ").append(toIndentedString(totalTrxsSpend)).append("\n");
    sb.append("    brickPctSpend: ").append(toIndentedString(brickPctSpend)).append("\n");
    sb.append("    brickPctTrxs: ").append(toIndentedString(brickPctTrxs)).append("\n");
    sb.append("    creditPctSpend: ").append(toIndentedString(creditPctSpend)).append("\n");
    sb.append("    creditPctTrxs: ").append(toIndentedString(creditPctTrxs)).append("\n");
    sb.append("    debitPctSpend: ").append(toIndentedString(debitPctSpend)).append("\n");
    sb.append("    debitPctTrxs: ").append(toIndentedString(debitPctTrxs)).append("\n");
    sb.append("    onlinePctSpend: ").append(toIndentedString(onlinePctSpend)).append("\n");
    sb.append("    onlinePctTrxs: ").append(toIndentedString(onlinePctTrxs)).append("\n");
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
