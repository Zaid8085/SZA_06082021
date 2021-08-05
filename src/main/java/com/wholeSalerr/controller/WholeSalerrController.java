package com.wholeSalerr.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jmx.export.annotation.ManagedOperation;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wholeSalerr.model.BankDetails;
import com.wholeSalerr.services.IBankService;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class WholeSalerrController {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	private IBankService iBankDetailsService;

	public WholeSalerrController(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	@GetMapping(value="/checkApplication", produces="text/plain")
    public String index() {
		
        return "Welcome";
    }
	
	@RequestMapping(value="/addBankDetails", consumes = { "application/json" }, produces = { "application/json" })
	@ManagedOperation(description="This api is use to insert bank details and return the same.")
	@CrossOrigin
	public List<BankDetails> addBankDetails(@RequestBody(required = true) BankDetails bankDetails) {
		System.out.println("Enter");
		return iBankDetailsService.addBankDetails(bankDetails);
	}
}
