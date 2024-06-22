package com.bank.account.services.impl;

import com.bank.account.exception.NotFoundException;
import com.bank.account.model.Customer;
import com.bank.account.repository.CustomerRepository;
import com.bank.account.services.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService {
    private final CustomerRepository customerRepository;
    @Override
    public Customer save(Customer customer) {
        return customerRepository.save(customer);
    }

    @Override
    public List<Customer> getCustomers() {
        return customerRepository.findAll();
    }

    @Override
    public Customer getById(Long id) {
        Optional<Customer> found = customerRepository.findById(id);
        if(found.isPresent()){
            return found.get();
        }
        throw new NotFoundException("Customer Not Fount Id ",id);
    }
}
