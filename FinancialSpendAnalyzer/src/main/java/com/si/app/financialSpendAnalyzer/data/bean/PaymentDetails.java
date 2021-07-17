package com.si.app.financialSpendAnalyzer.data.bean;

import java.math.BigInteger;
import java.util.Date;

/**
 * @author Dut Grg
 *
 */
public class PaymentDetails
{
	BigInteger customerNumber;
    Date month;
    Double totalIncome;
    Double totalOutgoing;
    Double closingBalance;
    
	public BigInteger getCustomerNumber() {
		return customerNumber;
	}
	public void setCustomerNumber(BigInteger customerNumber) {
		this.customerNumber = customerNumber;
	}
	public Date getMonth() {
		return month;
	}
	public void setMonth(Date month) {
		this.month = month;
	}
	public Double getTotalIncome() {
		return totalIncome;
	}
	public void setTotalIncome(Double totalIncome) {
		this.totalIncome = totalIncome;
	}
	public Double getTotalOutgoing() {
		return totalOutgoing;
	}
	public void setTotalOutgoing(Double totalOutgoing) {
		this.totalOutgoing = totalOutgoing;
	}
	public Double getClosingBalance() {
		return closingBalance;
	}
	public void setClosingBalance(Double closingBalance) {
		this.closingBalance = closingBalance;
	}
}