package com.bank.account.services.impl;

import com.bank.account.exception.NotFoundException;
import com.bank.account.model.Account;
import com.bank.account.repository.AccountRepository;
import com.bank.account.services.AccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class AccountServiceImpl implements AccountService {

    private final AccountRepository accountRepository;

    @Override
    public Account save(Account account) {
        return accountRepository.save(account);
    }

    @Override
    public List<Account> getAccounts() {
        return accountRepository.findAll();
    }

    @Override
    public Account getById(Long id) {
        Optional<Account> found = accountRepository.findById(id);
        if (found.isPresent()){
            return found.get();
        }
        throw new NotFoundException("Account Not Fount Id ",id);
    }
}
