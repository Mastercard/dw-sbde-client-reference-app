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
import java.util.ArrayList;
import java.util.List;
import org.openapitools.client.model.MerchantLocationDailyPerformanceMetric;
import org.openapitools.client.model.MerchantLocationMonthlyPerformanceMetric;
import org.openapitools.client.model.MerchantLocationWeeklyPerformanceMetric;

/**
 * List of available merchant location performance metrics for this location
 */
@ApiModel(description = "List of available merchant location performance metrics for this location")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-10-13T09:17:31.952+01:00[Europe/London]")
public class LegacyPerformanceMetrics {
  public static final String SERIALIZED_NAME_MMHID = "mmhid";
  @SerializedName(SERIALIZED_NAME_MMHID)
  private Long mmhid;

  public static final String SERIALIZED_NAME_DAILY_METRICS = "dailyMetrics";
  @SerializedName(SERIALIZED_NAME_DAILY_METRICS)
  private List<MerchantLocationDailyPerformanceMetric> dailyMetrics = null;

  public static final String SERIALIZED_NAME_WEEKLY_METRICS = "weeklyMetrics";
  @SerializedName(SERIALIZED_NAME_WEEKLY_METRICS)
  private List<MerchantLocationWeeklyPerformanceMetric> weeklyMetrics = null;

  public static final String SERIALIZED_NAME_MONTHLY_METRICS = "monthlyMetrics";
  @SerializedName(SERIALIZED_NAME_MONTHLY_METRICS)
  private List<MerchantLocationMonthlyPerformanceMetric> monthlyMetrics = null;

  public static final String SERIALIZED_NAME_CARD_PROFILE_ANUAL_SPEND_INDEX = "cardProfileAnualSpendIndex";
  @SerializedName(SERIALIZED_NAME_CARD_PROFILE_ANUAL_SPEND_INDEX)
  private Double cardProfileAnualSpendIndex;

  public static final String SERIALIZED_NAME_CARD_PROFILE_AVG_TICKET_INDEX = "cardProfileAvgTicketIndex";
  @SerializedName(SERIALIZED_NAME_CARD_PROFILE_AVG_TICKET_INDEX)
  private Double cardProfileAvgTicketIndex;

  public static final String SERIALIZED_NAME_CARD_PROFILE_ANUAL_PURCHASE_INDEX = "cardProfileAnualPurchaseIndex";
  @SerializedName(SERIALIZED_NAME_CARD_PROFILE_ANUAL_PURCHASE_INDEX)
  private Double cardProfileAnualPurchaseIndex;

  public LegacyPerformanceMetrics mmhid(Long mmhid) {
    this.mmhid = mmhid;
    return this;
  }

   /**
   * Merchant Market Hierarchy ID, used as a matching key
   * minimum: 0
   * @return mmhid
  **/
  @ApiModelProperty(example = "123456789", value = "Merchant Market Hierarchy ID, used as a matching key")
  public Long getMmhid() {
    return mmhid;
  }

  public void setMmhid(Long mmhid) {
    this.mmhid = mmhid;
  }

  public LegacyPerformanceMetrics dailyMetrics(List<MerchantLocationDailyPerformanceMetric> dailyMetrics) {
    this.dailyMetrics = dailyMetrics;
    return this;
  }

  public LegacyPerformanceMetrics addDailyMetricsItem(MerchantLocationDailyPerformanceMetric dailyMetricsItem) {
    if (this.dailyMetrics == null) {
      this.dailyMetrics = new ArrayList<>();
    }
    this.dailyMetrics.add(dailyMetricsItem);
    return this;
  }

   /**
   * Get dailyMetrics
   * @return dailyMetrics
  **/
  @ApiModelProperty(value = "")
  public List<MerchantLocationDailyPerformanceMetric> getDailyMetrics() {
    return dailyMetrics;
  }

  public void setDailyMetrics(List<MerchantLocationDailyPerformanceMetric> dailyMetrics) {
    this.dailyMetrics = dailyMetrics;
  }

  public LegacyPerformanceMetrics weeklyMetrics(List<MerchantLocationWeeklyPerformanceMetric> weeklyMetrics) {
    this.weeklyMetrics = weeklyMetrics;
    return this;
  }

  public LegacyPerformanceMetrics addWeeklyMetricsItem(MerchantLocationWeeklyPerformanceMetric weeklyMetricsItem) {
    if (this.weeklyMetrics == null) {
      this.weeklyMetrics = new ArrayList<>();
    }
    this.weeklyMetrics.add(weeklyMetricsItem);
    return this;
  }

   /**
   * Get weeklyMetrics
   * @return weeklyMetrics
  **/
  @ApiModelProperty(value = "")
  public List<MerchantLocationWeeklyPerformanceMetric> getWeeklyMetrics() {
    return weeklyMetrics;
  }

  public void setWeeklyMetrics(List<MerchantLocationWeeklyPerformanceMetric> weeklyMetrics) {
    this.weeklyMetrics = weeklyMetrics;
  }

  public LegacyPerformanceMetrics monthlyMetrics(List<MerchantLocationMonthlyPerformanceMetric> monthlyMetrics) {
    this.monthlyMetrics = monthlyMetrics;
    return this;
  }

  public LegacyPerformanceMetrics addMonthlyMetricsItem(MerchantLocationMonthlyPerformanceMetric monthlyMetricsItem) {
    if (this.monthlyMetrics == null) {
      this.monthlyMetrics = new ArrayList<>();
    }
    this.monthlyMetrics.add(monthlyMetricsItem);
    return this;
  }

   /**
   * Get monthlyMetrics
   * @return monthlyMetrics
  **/
  @ApiModelProperty(value = "")
  public List<MerchantLocationMonthlyPerformanceMetric> getMonthlyMetrics() {
    return monthlyMetrics;
  }

  public void setMonthlyMetrics(List<MerchantLocationMonthlyPerformanceMetric> monthlyMetrics) {
    this.monthlyMetrics = monthlyMetrics;
  }

  public LegacyPerformanceMetrics cardProfileAnualSpendIndex(Double cardProfileAnualSpendIndex) {
    this.cardProfileAnualSpendIndex = cardProfileAnualSpendIndex;
    return this;
  }

   /**
   * The anual spend index at this location during this year
   * @return cardProfileAnualSpendIndex
  **/
  @ApiModelProperty(example = "1.0", value = "The anual spend index at this location during this year")
  public Double getCardProfileAnualSpendIndex() {
    return cardProfileAnualSpendIndex;
  }

  public void setCardProfileAnualSpendIndex(Double cardProfileAnualSpendIndex) {
    this.cardProfileAnualSpendIndex = cardProfileAnualSpendIndex;
  }

  public LegacyPerformanceMetrics cardProfileAvgTicketIndex(Double cardProfileAvgTicketIndex) {
    this.cardProfileAvgTicketIndex = cardProfileAvgTicketIndex;
    return this;
  }

   /**
   * The average ticket index at this location during this year
   * @return cardProfileAvgTicketIndex
  **/
  @ApiModelProperty(example = "2.0", value = "The average ticket index at this location during this year")
  public Double getCardProfileAvgTicketIndex() {
    return cardProfileAvgTicketIndex;
  }

  public void setCardProfileAvgTicketIndex(Double cardProfileAvgTicketIndex) {
    this.cardProfileAvgTicketIndex = cardProfileAvgTicketIndex;
  }

  public LegacyPerformanceMetrics cardProfileAnualPurchaseIndex(Double cardProfileAnualPurchaseIndex) {
    this.cardProfileAnualPurchaseIndex = cardProfileAnualPurchaseIndex;
    return this;
  }

   /**
   * The anual purchase index at this location during this year
   * @return cardProfileAnualPurchaseIndex
  **/
  @ApiModelProperty(example = "3.0", value = "The anual purchase index at this location during this year")
  public Double getCardProfileAnualPurchaseIndex() {
    return cardProfileAnualPurchaseIndex;
  }

  public void setCardProfileAnualPurchaseIndex(Double cardProfileAnualPurchaseIndex) {
    this.cardProfileAnualPurchaseIndex = cardProfileAnualPurchaseIndex;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LegacyPerformanceMetrics legacyPerformanceMetrics = (LegacyPerformanceMetrics) o;
    return Objects.equals(this.mmhid, legacyPerformanceMetrics.mmhid) &&
        Objects.equals(this.dailyMetrics, legacyPerformanceMetrics.dailyMetrics) &&
        Objects.equals(this.weeklyMetrics, legacyPerformanceMetrics.weeklyMetrics) &&
        Objects.equals(this.monthlyMetrics, legacyPerformanceMetrics.monthlyMetrics) &&
        Objects.equals(this.cardProfileAnualSpendIndex, legacyPerformanceMetrics.cardProfileAnualSpendIndex) &&
        Objects.equals(this.cardProfileAvgTicketIndex, legacyPerformanceMetrics.cardProfileAvgTicketIndex) &&
        Objects.equals(this.cardProfileAnualPurchaseIndex, legacyPerformanceMetrics.cardProfileAnualPurchaseIndex);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mmhid, dailyMetrics, weeklyMetrics, monthlyMetrics, cardProfileAnualSpendIndex, cardProfileAvgTicketIndex, cardProfileAnualPurchaseIndex);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LegacyPerformanceMetrics {\n");
    
    sb.append("    mmhid: ").append(toIndentedString(mmhid)).append("\n");
    sb.append("    dailyMetrics: ").append(toIndentedString(dailyMetrics)).append("\n");
    sb.append("    weeklyMetrics: ").append(toIndentedString(weeklyMetrics)).append("\n");
    sb.append("    monthlyMetrics: ").append(toIndentedString(monthlyMetrics)).append("\n");
    sb.append("    cardProfileAnualSpendIndex: ").append(toIndentedString(cardProfileAnualSpendIndex)).append("\n");
    sb.append("    cardProfileAvgTicketIndex: ").append(toIndentedString(cardProfileAvgTicketIndex)).append("\n");
    sb.append("    cardProfileAnualPurchaseIndex: ").append(toIndentedString(cardProfileAnualPurchaseIndex)).append("\n");
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

