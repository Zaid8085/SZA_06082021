package com.wholeSalerr.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.wholeSalerr.model.BankDetails;
import com.wholeSalerr.model.BankDetailsRowMapper;

@Repository
public class BankDetailsDao implements IBankDetailsDao{
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public List<BankDetails> addBankDetails(BankDetails bankDetails) {
		
		String query = BankDetailsConstant.INSERT_BANK_DETAILS;
		query = String.format(query, bankDetails.getCardNumber(), bankDetails.getBankName(), bankDetails.getDate());
		int result  = jdbcTemplate.update(query);
		return this.getBankDetails();
	}
	
	public List<BankDetails> getBankDetails() {
		List<BankDetails> result = new ArrayList<BankDetails>();
		String query = BankDetailsConstant.GET_BANK_DETAILS;
		
		result = jdbcTemplate.query(query, new BankDetailsRowMapper());
		return result;
	}

}
