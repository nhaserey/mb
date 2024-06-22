package com.bank.account.services;

import com.bank.account.model.Account;

import java.util.List;

public interface AccountService {
    Account save(Account account);

    List<Account> getAccounts();

    Account getById(Long id);
}
