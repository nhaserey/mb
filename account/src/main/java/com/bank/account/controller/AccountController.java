package com.bank.account.controller;

import com.bank.account.dto.AccountDto;
import com.bank.account.mapper.AccountMapper;
import com.bank.account.model.Account;
import com.bank.account.services.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/accounts")
public class AccountController {
    @Autowired
    private AccountService accountService;
    @Autowired
    private AccountMapper accountMapper;

    @PostMapping
    public ResponseEntity<?> save(
            @RequestBody AccountDto dto
    ){
        Account account = accountMapper.toAccount(dto);
        account = accountService.save(account);
        return ResponseEntity.ok(account);
    }

    @GetMapping
    public ResponseEntity<?> getAll(){
        return ResponseEntity.ok(accountService.getAccounts());
    }

    @GetMapping("/id")
    public ResponseEntity<?> getById(
        @PathVariable Long id
    ){
        return ResponseEntity.ok(accountService.getById(id));
    }
}
