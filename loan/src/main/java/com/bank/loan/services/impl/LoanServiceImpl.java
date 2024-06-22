package com.bank.loan.services.impl;

import com.bank.loan.dto.LoanDto;
import com.bank.loan.mapper.LoanMapper;
import com.bank.loan.model.Loan;
import com.bank.loan.repository.LoanRepository;
import com.bank.loan.services.LoanService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class LoanServiceImpl implements LoanService {

    private final LoanRepository loanRepository;

    @Override
    public Loan save(Loan dto) {
        return loanRepository.save(dto) ;
    }

    @Override
    public List<Loan> getByCustomerId( Long customerId) {
        return loanRepository.findByCustomerId(customerId);
    }

    @Override
    public List<Loan> getAll()  {
        return loanRepository.findAll();
    }
}
