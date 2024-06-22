package com.bank.account.services;

import com.bank.account.model.Customer;

import java.util.List;

public interface CustomerService {
    Customer save(Customer customer);

    List<Customer> getCustomers();

    Customer getById(Long id);
}
