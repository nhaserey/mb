package com.bank.loan.controller;

import com.bank.loan.dto.LoanDto;
import com.bank.loan.mapper.LoanMapper;
import com.bank.loan.model.Loan;
import com.bank.loan.services.LoanService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RequestMapping("api/loans")
@RestController
public class LoanController {
    @Autowired
    private LoanService loanService;
    @Autowired
    private LoanMapper loanMapper;


    @PostMapping
    public ResponseEntity<Loan> save(
            @RequestBody LoanDto dto
    ){
        Loan loan = loanService.save(loanMapper.toLoan(dto));
        return ResponseEntity.status(HttpStatus.CREATED).body(loan);
    }

    @GetMapping
    public ResponseEntity<List<Loan>> getList(){
        return ResponseEntity.ok(loanService.getAll());
    }

    @GetMapping("{customerId}")
    public ResponseEntity<List<Loan>> getByCustomerId(
            @RequestHeader("bank-correlation-id") String correlationId,
            @PathVariable Long customerId
    ){
        log.debug("fetchLoanDetail method start");
        List<Loan> loans = this.loanService.getByCustomerId(customerId);
        log.debug("fetchLoanDetail method end");
        return ResponseEntity.ok(loans);
    }
}
