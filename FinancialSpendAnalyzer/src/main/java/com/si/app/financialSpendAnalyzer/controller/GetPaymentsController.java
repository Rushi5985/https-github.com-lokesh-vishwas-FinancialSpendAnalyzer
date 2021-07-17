package com.si.app.financialSpendAnalyzer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.si.app.financialSpendAnalyzer.data.bean.PaymentDetails;
import com.si.app.financialSpendAnalyzer.service.GetPaymentService;

@RestController
public class GetPaymentsController {

	@Autowired
	private GetPaymentService service;
	
	@RequestMapping(value = "/payments/{customerId}", method = RequestMethod.GET)
	public ResponseEntity<List<PaymentDetails>> getPaymentHandler(@PathVariable Long customerId) 
	{
		List<PaymentDetails> payment = service.getPaymentDetails(customerId);
		
		return new ResponseEntity<>(payment,HttpStatus.OK);
	}
}
