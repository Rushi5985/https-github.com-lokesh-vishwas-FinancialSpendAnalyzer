package com.si.app.financialSpendAnalyzer.service;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.si.app.financialSpendAnalyzer.data.bean.PaymentDetails;
import com.si.app.financialSpendAnalyzer.data.repository.GetPaymentRepository;

@Service
public class GetPaymentService 
{
	@Autowired
	private GetPaymentRepository getPaymentRepository;
	
	public List<PaymentDetails> getPaymentDetails(long customerId)
	{
		List<Object[]> payments = getPaymentRepository.getPaymentM(customerId);
		
		 
		 List<PaymentDetails>  paymentList  =  new ArrayList<>();
		 
		 for (Object[] param : payments) 
	        {
			 	PaymentDetails payment= new PaymentDetails();
			 	 payment.setMonth((Date)param[0]);
	            payment.setCustomerNumber((BigInteger)param[1]);
	            payment.setTotalIncome((Double)param[2]);
	            payment.setTotalOutgoing((Double)param[3]);
	            
	            paymentList.add(payment);
	        }
		
		return paymentList;
	}
}
