package com.si.app.financialSpendAnalyzer.data.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.si.app.financialSpendAnalyzer.data.bean.CustomerPayments;


@Repository
public interface GetPaymentRepository extends JpaRepository<CustomerPayments, Long>  {

	@Query(value="SELECT " + 
			"debit.payment_Date, " + 
			"debit.customer_id, " + 
			"SUM(debit.amount) AS outgoing, " + 
			"SUM(credit.amount) AS incoming, " +
			"(SUM(credit.amount) - SUM(debit.amount)) AS balance " + 
			"FROM ( " + 
			"SELECT payment_Date " + 
			",customer_id " + 
			",amount " + 
			",payment_Type " + 
			"FROM financialspendanalyzer.fsa_customer_payments " + 
			"WHERE payment_Type = 'DEBIT' "
			+ "AND customer_id = :customerId "
			+ "" + 
			") debit " + 
			"inner join " + 
			"( " + 
			"SELECT payment_Date " + 
			",customer_id " + 
			",amount " + 
			",payment_Type " + 
			"FROM financialspendanalyzer.fsa_customer_payments " + 
			"WHERE payment_Type = 'CREDIT' "
			+ " AND customer_id = :customerId " + 
			") credit on credit.payment_Date = debit.payment_Date and credit.customer_id = debit.customer_id " + 
			"GROUP BY debit.payment_Date, debit.customer_id; ",nativeQuery=true)
	
	List<Object[]>getPayment(@Param("customerId") Long customerId);
	
	
}
