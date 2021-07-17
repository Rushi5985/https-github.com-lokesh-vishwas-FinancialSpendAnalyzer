package com.si.app.financialSpendAnalyzer.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.si.app.financialSpendAnalyzer.model.CustomerPaymentsRequestModel;
import com.si.app.financialSpendAnalyzer.service.CustomerPaymentService;
import com.si.app.financialSpendAnalyzer.utils.Utils;

@RestController
@RequestMapping(value = "customer/service")
public class CustomerPaymetsController {

	@Autowired
	CustomerPaymentService customerPaymentService;

	private final static Logger log = LoggerFactory.getLogger(CustomerPaymetsController.class);

	@RequestMapping(value = "/payments", method = RequestMethod.POST)
	public ResponseEntity<?> customerPayments(@RequestBody CustomerPaymentsRequestModel request) {
		Long txnId = null;

		try {
			txnId = customerPaymentService.initiatePayments(request);

		} catch (Exception ex) {
			log.error("Exception -", ex);
			return new ResponseEntity<>(new Utils.StringResponse("Exception -"), HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return new ResponseEntity<>(new Utils.StringResponse("Transaction Successful, TxnID-" + txnId), HttpStatus.OK);
	}
}
