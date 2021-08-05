package com.wholeSalerr.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

public class BankDetailsRowMapper implements RowMapper<BankDetails> {

	@Override
	public BankDetails mapRow(ResultSet rs, int rowNum) throws SQLException {
		 BankDetails bankDetails = new BankDetails();
		 bankDetails.setBankName(rs.getString("bankName"));
		 bankDetails.setCardNumber(rs.getString("cardNumber"));
		 bankDetails.setDate(rs.getString("date"));
		 
		 return bankDetails;
	}

}
