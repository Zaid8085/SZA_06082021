package com.wholeSalerr.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wholeSalerr.dao.IBankDetailsDao;
import com.wholeSalerr.model.BankDetails;

@Service
public class BankService implements IBankService {

	@Autowired(required=true)
	private IBankDetailsDao iBankDetailsDao;
	
	@Override
	public List<BankDetails> addBankDetails(BankDetails bankDetails) {
		// TODO Auto-generated method stub
		return iBankDetailsDao.addBankDetails(bankDetails);
	}

}
