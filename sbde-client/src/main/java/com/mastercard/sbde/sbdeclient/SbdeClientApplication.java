package com.mastercard.sbde.sbdeclient;

import com.mastercard.api.core.ApiConfig;
import com.mastercard.api.core.model.RequestMap;
import com.mastercard.api.core.model.map.SmartMap;
import com.mastercard.api.core.security.oauth.OAuthAuthentication;

import com.mastercard.api.smallbusinessdecisionenhancer.MerchantPerformance;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import java.util.List;
import java.util.Map;

public class SbdeClientApplication {

	public static void main(String[] args) throws IOException, UnrecoverableKeyException, CertificateException, NoSuchAlgorithmException, KeyStoreException {

		String consumerKey = "your consumer key";   // You should copy this from "My Keys" on your project page e.g. UTfbhDCSeNYvJpLL5l028sWL9it739PYh6LU5lZja15xcRpY!fd209e6c579dc9d7be52da93d35ae6b6c167c174690b72fa
		String keyAlias = "keyalias";   // For production: change this to the key alias you chose when you created your production key
		String keyPassword = "keystorepassword";   // For production: change this to the key alias you chose when you created your production key
		InputStream is = new FileInputStream("path to your .p12 private key file"); // e.g. /Users/yourname/project/sandbox.p12 | C:\Users\yourname\project\sandbox.p12
		ApiConfig.setAuthentication(new OAuthAuthentication(consumerKey, is, keyAlias, keyPassword));   // You only need to set this once
		ApiConfig.setDebug(true);   // Enable http wire logging
		ApiConfig.setSandbox(true); // For production: use ApiConfig.setSandbox(false);

		try {
			RequestMap map = new RequestMap();
			map.set("MMHID", "123456789");

			MerchantPerformance response = MerchantPerformance.query(map);
			out((Map<String, Object>) response, "Merchant.MMHID"); //-->123456789
			out((Map<String, Object>) response, "Merchant.MerchantName"); //-->ACME CORP. #1234
			out((Map<String, Object>) response, "Merchant.CleansedMerchantName"); //-->ACME CORPORATION # 1234
			out((Map<String, Object>) response, "Merchant.StreetAddr"); //-->10 ROAD RUNNER AVE.
			out((Map<String, Object>) response, "Merchant.CleansedStreetAddr"); //-->10 ROAD RUNNER AVENUE
			out((Map<String, Object>) response, "Merchant.CityName"); //-->BIRDVILLE
			out((Map<String, Object>) response, "Merchant.CleansedCityName"); //-->BIRDVILLE
			out((Map<String, Object>) response, "Merchant.StateName"); //-->AZ
			out((Map<String, Object>) response, "Merchant.CleansedStateName"); //-->AZ
			out((Map<String, Object>) response, "Merchant.PostalCode"); //-->65543
			out((Map<String, Object>) response, "Merchant.CleansedPostalCode"); //-->65543
			out((Map<String, Object>) response, "Merchant.CountryCode"); //-->USA
			out((Map<String, Object>) response, "Merchant.CleansedCountryCode"); //-->USA
			out((Map<String, Object>) response, "Merchant.PhoneNumber"); //-->9995551234
			out((Map<String, Object>) response, "Merchant.CleansedPhoneNumber"); //-->9995551234
			out((Map<String, Object>) response, "Merchant.MccCode"); //-->5661
			out((Map<String, Object>) response, "Merchant.LegalCorporateName"); //-->
			out((Map<String, Object>) response, "Merchant.CleansedLegalCorporateName"); //-->ACME CORPORATION
			out((Map<String, Object>) response, "Merchant.Industry"); //-->SHS
			out((Map<String, Object>) response, "Merchant.SuperIndustry"); //-->APP
			out((Map<String, Object>) response, "Merchant.DunAndBradstreetNumber"); //-->123456789
			out((Map<String, Object>) response, "Merchant.DateEstablished"); //-->10-25-2014
			out((Map<String, Object>) response, "Merchant.TerminationDateWithMC"); //-->
			out((Map<String, Object>) response, "Merchant.NewBusinessFlag"); //-->false
			out((Map<String, Object>) response, "Merchant.AggregateMerchantId"); //-->5999
			out((Map<String, Object>) response, "Merchant.AggregateMerchantName"); //-->NON-AGGREGATED MISCELLANEOUS AND SPECIALTY RETAIL STORES 5999
			out((Map<String, Object>) response, "Merchant.KeyAggregateMerchantID"); //-->
			out((Map<String, Object>) response, "Merchant.ParentAggregateMerchantId"); //-->
			out((Map<String, Object>) response, "Merchant.ParentAggregateMerchantName"); //-->
			out((Map<String, Object>) response, "Merchant.NaicsCode"); //-->45399
			out((Map<String, Object>) response, "Merchant.LocalFavorite"); //-->false
			out((Map<String, Object>) response, "Merchant.HiddenGeme"); //-->false
			out((Map<String, Object>) response, "Perfomance.MMHID"); //-->123456789
			out((Map<String, Object>) response, "Perfomance.Daily[0].Period"); //-->2019-03-04
			out((Map<String, Object>) response, "Perfomance.Daily[0].TotalTrxsSpend"); //-->1010.12
			out((Map<String, Object>) response, "Perfomance.Daily[0].TotalNumOfTrxs"); //-->15
			out((Map<String, Object>) response, "Perfomance.Weekly[0].Period"); //-->2019-03-04
			out((Map<String, Object>) response, "Perfomance.Weekly[0].TotalTrxsSpend"); //-->25010.5
			out((Map<String, Object>) response, "Perfomance.Weekly[0].TotalNumOfTrxs"); //-->125.0
			out((Map<String, Object>) response, "Perfomance.Weekly[0].BrickPctSpend"); //-->0.0
			out((Map<String, Object>) response, "Perfomance.Weekly[0].BrickPctTrxs"); //-->0.0
			out((Map<String, Object>) response, "Perfomance.Weekly[0].OnlinePctSpend"); //-->0.0
			out((Map<String, Object>) response, "Perfomance.Weekly[0].OnlinePctTrxs"); //-->0.0
			out((Map<String, Object>) response, "Perfomance.Weekly[0].DebitPctSpend"); //-->-1.0
			out((Map<String, Object>) response, "Perfomance.Weekly[0].DebitPctTrxs"); //-->-1.0
			out((Map<String, Object>) response, "Perfomance.Weekly[0].CreditPctSpend"); //-->10.25
			out((Map<String, Object>) response, "Perfomance.Weekly[0].CreditPctTrxs"); //-->15.01
			out((Map<String, Object>) response, "Perfomance.Monthly[0].Period"); //-->2019-03-04
			out((Map<String, Object>) response, "Perfomance.Monthly[0].TotalTrxsSpend"); //-->100210.75
			out((Map<String, Object>) response, "Perfomance.Monthly[0].TotalNumOfTrxs"); //-->1025.0
			out((Map<String, Object>) response, "Perfomance.Monthly[0].AvgFrequency"); //-->0.0
			out((Map<String, Object>) response, "Perfomance.Monthly[0].PctRepeatCustomers30Days"); //-->0.0
			out((Map<String, Object>) response, "Perfomance.Monthly[0].PctRepeatCustomers60Days"); //-->0.0
			out((Map<String, Object>) response, "Perfomance.Monthly[0].PctRepeatCustomers90Days"); //-->0.0
			out((Map<String, Object>) response, "Perfomance.Monthly[0].CardProduct[0].Product"); //-->CONSUMER DEBIT
			out((Map<String, Object>) response, "Perfomance.Monthly[0].CardProduct[0].PctSpend"); //-->10.25
			out((Map<String, Object>) response, "Perfomance.Monthly[0].CardProduct[0].PctTrxs"); //-->5.25
			out((Map<String, Object>) response, "Perfomance.Monthly[0].CardProduct[1].Product"); //-->CONSUMER CREDIT
			out((Map<String, Object>) response, "Perfomance.Monthly[0].CardProduct[1].PctSpend"); //-->10.25
			out((Map<String, Object>) response, "Perfomance.Monthly[0].CardProduct[1].PctTrxs"); //-->5.25
			out((Map<String, Object>) response, "Perfomance.Monthly[0].CardProduct[2].Product"); //-->COMMERCIAL CREDIT
			out((Map<String, Object>) response, "Perfomance.Monthly[0].CardProduct[2].PctSpend"); //-->10.25
			out((Map<String, Object>) response, "Perfomance.Monthly[0].CardProduct[2].PctTrxs"); //-->5.25
			out((Map<String, Object>) response, "Perfomance.Monthly[0].CardProduct[3].Product"); //-->CONSUMER CREDIT WORLD
			out((Map<String, Object>) response, "Perfomance.Monthly[0].CardProduct[3].PctSpend"); //-->10.25
			out((Map<String, Object>) response, "Perfomance.Monthly[0].CardProduct[3].PctTrxs"); //-->5.25
			out((Map<String, Object>) response, "Perfomance.Monthly[0].CardProduct[4].Product"); //-->MAESTRO
			out((Map<String, Object>) response, "Perfomance.Monthly[0].CardProduct[4].PctSpend"); //-->10.25
			out((Map<String, Object>) response, "Perfomance.Monthly[0].CardProduct[4].PctTrxs"); //-->5.25
			out((Map<String, Object>) response, "Perfomance.Monthly[0].CardProduct[5].Product"); //-->CONSUMER CREDIT WORLD ELITE
			out((Map<String, Object>) response, "Perfomance.Monthly[0].CardProduct[5].PctSpend"); //-->10.25
			out((Map<String, Object>) response, "Perfomance.Monthly[0].CardProduct[5].PctTrxs"); //-->5.25
			out((Map<String, Object>) response, "Perfomance.Monthly[0].CardProduct[6].Product"); //-->COMMERCIAL DEBIT
			out((Map<String, Object>) response, "Perfomance.Monthly[0].CardProduct[6].PctSpend"); //-->10.25
			out((Map<String, Object>) response, "Perfomance.Monthly[0].CardProduct[6].PctTrxs"); //-->5.25
			out((Map<String, Object>) response, "Perfomance.Monthly[0].CardProduct[7].Product"); //-->CONSUMER PREPAID
			out((Map<String, Object>) response, "Perfomance.Monthly[0].CardProduct[7].PctSpend"); //-->10.25
			out((Map<String, Object>) response, "Perfomance.Monthly[0].CardProduct[7].PctTrxs"); //-->5.25
			out((Map<String, Object>) response, "Perfomance.Monthly[0].CardProduct[8].Product"); //-->COMMERCIAL WORLD
			out((Map<String, Object>) response, "Perfomance.Monthly[0].CardProduct[8].PctSpend"); //-->10.25
			out((Map<String, Object>) response, "Perfomance.Monthly[0].CardProduct[8].PctTrxs"); //-->5.25
			out((Map<String, Object>) response, "Perfomance.Monthly[0].CardProduct[9].Product"); //-->COMMERCIAL WORLD ELITE
			out((Map<String, Object>) response, "Perfomance.Monthly[0].CardProduct[9].PctSpend"); //-->10.25
			out((Map<String, Object>) response, "Perfomance.Monthly[0].CardProduct[9].PctTrxs"); //-->5.25
			out((Map<String, Object>) response, "Perfomance.CardProfileAnualSpendIndex"); //-->50.0
			out((Map<String, Object>) response, "Perfomance.CardProfileAvgTicketIndex"); //-->50.0
			out((Map<String, Object>) response, "Perfomance.CardProfileAnualPurchaseIndex"); //-->50.0
			// This sample shows looping through Perfomance.Daily
			System.out.println("This sample shows looping through Perfomance.Daily");
			for(Map<String,Object> item : (List<Map<String, Object>>) ((Map<String, Object>) response).get("Perfomance.Daily")) {
				out(item, "Period");
				out(item, "TotalTrxsSpend");
				out(item, "TotalNumOfTrxs");
			}

		} catch (Exception e) {
			err("HttpStatus: "+e.getCause());
			err("Message: "+e.getMessage());
			err("Source: "+e.getCause());
		}
	}

	public static void out(SmartMap response, String key) {
		System.out.println(key+"-->"+response.get(key));
	}

	public static void out(Map<String,Object> map, String key) {
		System.out.println(key+"--->"+map.get(key));
	}

	public static void err(String message) {
		System.err.println(message);
		
	}

}
