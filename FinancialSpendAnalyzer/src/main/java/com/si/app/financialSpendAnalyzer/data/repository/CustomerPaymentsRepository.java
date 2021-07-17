package com.si.app.financialSpendAnalyzer.data.repository;



import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import com.si.app.financialSpendAnalyzer.data.bean.CustomerPayments;

@Repository
@Transactional
public interface CustomerPaymentsRepository extends CrudRepository<CustomerPayments, Long> {

	@Transactional(isolation = Isolation.READ_COMMITTED)
	@Modifying
	void deleteById(Long id);

}