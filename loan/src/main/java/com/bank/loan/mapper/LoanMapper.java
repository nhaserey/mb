package com.bank.loan.mapper;

import com.bank.loan.dto.LoanDto;
import com.bank.loan.model.Loan;
import org.springframework.stereotype.Component;

@Component
public class LoanMapper {
        public Loan toLoan(LoanDto dto){
            Loan loan = new Loan();

            loan.setLoanNumber(dto.getLoanNumber());
            loan.setCustomerId(dto.getCustomerId());
            loan.setStartDate(dto.getStartDate());
            loan.setLoanType(dto.getLoanType());
            loan.setTotalLoan(dto.getTotalLoan());
            loan.setAmountPaid(dto.getAmountPaid());
            loan.setOutstandingAmount(dto.getOutstandingAmount());
            loan.setCreateDate(dto.getCreateDate());

            return  loan;
        }

}
