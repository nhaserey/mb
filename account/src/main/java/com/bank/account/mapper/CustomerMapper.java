package com.bank.account.mapper;

import com.bank.account.dto.CustomerDto;
import com.bank.account.model.Customer;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class CustomerMapper {
    public Customer toCustomer(CustomerDto dto) {
        Customer customer = new Customer();
        customer.setName(dto.getName());
        customer.setEmail(dto.getEmail());
        customer.setMobileNumber(dto.getMobileNumber());
        customer.setCreateDate(LocalDate.now());
        return customer;
    }
}
