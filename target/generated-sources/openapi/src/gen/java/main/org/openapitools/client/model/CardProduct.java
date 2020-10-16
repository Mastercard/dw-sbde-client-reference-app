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

/**
 * Card Product
 */
@ApiModel(description = "Card Product")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-10-13T09:17:31.952+01:00[Europe/London]")
public class CardProduct {
  public static final String SERIALIZED_NAME_PRODUCT = "product";
  @SerializedName(SERIALIZED_NAME_PRODUCT)
  private String product;

  public static final String SERIALIZED_NAME_PCT_TRXS = "pctTrxs";
  @SerializedName(SERIALIZED_NAME_PCT_TRXS)
  private Double pctTrxs;

  public static final String SERIALIZED_NAME_PCT_SPEND = "pctSpend";
  @SerializedName(SERIALIZED_NAME_PCT_SPEND)
  private Double pctSpend;

  public CardProduct product(String product) {
    this.product = product;
    return this;
  }

   /**
   * The name of this card product
   * @return product
  **/
  @ApiModelProperty(example = "CONSUMER DEBIT", required = true, value = "The name of this card product")
  public String getProduct() {
    return product;
  }

  public void setProduct(String product) {
    this.product = product;
  }

  public CardProduct pctTrxs(Double pctTrxs) {
    this.pctTrxs = pctTrxs;
    return this;
  }

   /**
   * The percentage of tranactions using this card product
   * @return pctTrxs
  **/
  @ApiModelProperty(example = "72.46", required = true, value = "The percentage of tranactions using this card product")
  public Double getPctTrxs() {
    return pctTrxs;
  }

  public void setPctTrxs(Double pctTrxs) {
    this.pctTrxs = pctTrxs;
  }

  public CardProduct pctSpend(Double pctSpend) {
    this.pctSpend = pctSpend;
    return this;
  }

   /**
   * The percentage spent using this card product
   * @return pctSpend
  **/
  @ApiModelProperty(example = "71.57", required = true, value = "The percentage spent using this card product")
  public Double getPctSpend() {
    return pctSpend;
  }

  public void setPctSpend(Double pctSpend) {
    this.pctSpend = pctSpend;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CardProduct cardProduct = (CardProduct) o;
    return Objects.equals(this.product, cardProduct.product) &&
        Objects.equals(this.pctTrxs, cardProduct.pctTrxs) &&
        Objects.equals(this.pctSpend, cardProduct.pctSpend);
  }

  @Override
  public int hashCode() {
    return Objects.hash(product, pctTrxs, pctSpend);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CardProduct {\n");
    
    sb.append("    product: ").append(toIndentedString(product)).append("\n");
    sb.append("    pctTrxs: ").append(toIndentedString(pctTrxs)).append("\n");
    sb.append("    pctSpend: ").append(toIndentedString(pctSpend)).append("\n");
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

