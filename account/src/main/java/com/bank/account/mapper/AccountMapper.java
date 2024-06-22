package com.bank.account.mapper;

import com.bank.account.dto.AccountDto;
import com.bank.account.model.Account;
import org.springframework.stereotype.Component;

@Component
public class AccountMapper {
    public Account toAccount(AccountDto dto){
        Account account = new Account();
        account.setAccountNumber(dto.getAccountNumber());
        account.setAccountType(dto.getAccountType());
        account.setBranchAddress(dto.getBranchAddress());
        account.setCreateDate(dto.getCreateDate());
        account.setCustomerId(dto.getCustomerId());
        return account;
    }
}
