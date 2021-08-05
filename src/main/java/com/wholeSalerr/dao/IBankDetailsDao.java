package com.wholeSalerr.dao;

import java.util.List;

import com.wholeSalerr.model.BankDetails;

public interface IBankDetailsDao {

	public List<BankDetails> addBankDetails(BankDetails bankDetails);
}
