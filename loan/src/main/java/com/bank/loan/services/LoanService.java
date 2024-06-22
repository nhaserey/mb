package com.bank.loan.services;

import com.bank.loan.dto.LoanDto;
import com.bank.loan.model.Loan;

import java.util.List;

public interface LoanService {
    Loan save(Loan dto) ;
    List<Loan> getByCustomerId(Long customerId);
    List<Loan> getAll() ;
}
