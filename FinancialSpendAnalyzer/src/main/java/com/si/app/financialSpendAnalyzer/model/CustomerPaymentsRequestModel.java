package com.si.app.financialSpendAnalyzer.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CustomerPaymentsRequestModel {

	@JsonProperty(value = "customer_id")
	private Long customerid;

	@JsonProperty(value = "transaction_description")
	private String TransactionDescription;

	@JsonProperty(value = "amount")
	private double amount;

	@JsonProperty(value = "payment_category")
	private String paymentCategory;

	@JsonProperty(value = "payment_Type")
	private String paymentType;

	@JsonProperty(value = "payment_Date")
	private Long paymentDate;

	public Long getCustomerid() {
		return customerid;
	}

	public void setCustomerid(Long customerid) {
		this.customerid = customerid;
	}

	public String getTransactionDescription() {
		return TransactionDescription;
	}

	public void setTransactionDescription(String transactionDescription) {
		TransactionDescription = transactionDescription;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getPaymentCategory() {
		return paymentCategory;
	}

	public void setPaymentCategory(String paymentCategory) {
		this.paymentCategory = paymentCategory;
	}

	public String getPaymentType() {
		return paymentType;
	}

	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}

	public Long getPaymentDate() {
		return paymentDate;
	}

	public void setPaymentDate(Long paymentDate) {
		this.paymentDate = paymentDate;
	}

	@Override
	public String toString() {
		return "Transactions [customerid=" + customerid + ", TransactionDescription=" + TransactionDescription
				+ ", amount=" + amount + ", paymentCategory=" + paymentCategory + ", paymentType=" + paymentType
				+ ", paymentDate=" + paymentDate + "]";
	}
	
}
