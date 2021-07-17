package com.si.app.financialSpendAnalyzer.data.bean;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "fsa_customer_payments")
public class CustomerPayments implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "customer_id")
	private Long customerid;

	@Column(name = "transaction_description")
	private String TransactionDescription;

	@Column(name = "amount")
	private double amount;

	@Column(name = "payment_category")
	private String paymentCategory;

	@Column(name = "payment_Type")
	private String paymentType;

	@Column(name = "payment_Date")
	private Date paymentDate = new Date();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

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

	public Date getPaymentDate() {
		return paymentDate;
	}

	public void setPaymentDate(Date paymentDate) {
		this.paymentDate = paymentDate;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		return Objects.hash(TransactionDescription, amount, customerid, id, paymentCategory, paymentDate, paymentType);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CustomerPayments other = (CustomerPayments) obj;
		return Objects.equals(TransactionDescription, other.TransactionDescription)
				&& Double.doubleToLongBits(amount) == Double.doubleToLongBits(other.amount)
				&& Objects.equals(customerid, other.customerid) && Objects.equals(id, other.id)
				&& Objects.equals(paymentCategory, other.paymentCategory)
				&& Objects.equals(paymentDate, other.paymentDate) && Objects.equals(paymentType, other.paymentType);
	}

	@Override
	public String toString() {
		return "CustomerPayments [id=" + id + ", customerid=" + customerid + ", TransactionDescription="
				+ TransactionDescription + ", amount=" + amount + ", paymentCategory=" + paymentCategory
				+ ", paymentType=" + paymentType + ", paymentDate=" + paymentDate + "]";
	}

}