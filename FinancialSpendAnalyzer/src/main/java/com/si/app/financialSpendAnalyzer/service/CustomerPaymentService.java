package com.si.app.financialSpendAnalyzer.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.si.app.financialSpendAnalyzer.data.bean.CustomerPayments;
import com.si.app.financialSpendAnalyzer.data.repository.CustomerPaymentsRepository;
import com.si.app.financialSpendAnalyzer.model.CustomerPaymentsRequestModel;

@Component
public class CustomerPaymentService {
	
	@Autowired
	CustomerPaymentsRepository 	customerPaymentsRepository;
	
	public Long initiatePayments(CustomerPaymentsRequestModel request) {
		Long txnId = null;
		if (request != null) {
			CustomerPayments customerPayments = new CustomerPayments();
			customerPayments.setCustomerid(request.getCustomerid());
			customerPayments.setAmount(request.getAmount());
			customerPayments.setPaymentCategory(request.getPaymentCategory());
			customerPayments.setPaymentType(request.getPaymentType());
			customerPayments.setTransactionDescription(request.getTransactionDescription());
			customerPayments.setPaymentDate(getDateFromLongValue(request.getPaymentDate()));
			txnId = customerPaymentsRepository.save(customerPayments).getId();

		}

		return txnId;
	}
	
	 public Date getDateFromLongValue(Long strDate)  {
	        Date date = null;
	        if (strDate == null)
	            return null;
	        try {
	            date = new Date(strDate);
	        } catch (Exception ex) {

	        }
	        return date;
	    }
	
}
