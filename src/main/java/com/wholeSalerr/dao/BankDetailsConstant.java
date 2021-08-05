package com.wholeSalerr.dao;

public class BankDetailsConstant {

	//Insert Query
	public static final String INSERT_BANK_DETAILS = "INSERT INTO Bank_Details (cardNumber, bankName, date) values ('%s', '%s', '%s') ;";
	
	public static final String GET_BANK_DETAILS = "Select * From Bank_Details;";
}
