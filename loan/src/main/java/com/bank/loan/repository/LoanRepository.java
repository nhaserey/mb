package com.bank.loan.repository;

import com.bank.loan.model.Loan;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface LoanRepository extends MongoRepository<Loan,Long> {
    List<Loan> findByCustomerId(Long customerId);
}
