package com.bank.account.controller;

import com.bank.account.dto.CustomerDto;
import com.bank.account.mapper.CustomerMapper;
import com.bank.account.model.Customer;
import com.bank.account.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/customers")
public class CustomerController {
    @Autowired
    private CustomerService customerService;
    @Autowired
    private CustomerMapper customerMapper;

    @PostMapping
    public ResponseEntity<?> saveCustomer(
            @RequestBody CustomerDto dto
    ){
        Customer customer = customerMapper.toCustomer(dto);
        customer = customerService.save(customer);
        return  ResponseEntity.ok(customer);
    }

    @GetMapping
    public  ResponseEntity<?> getAll(){
        return ResponseEntity.ok(customerService.getCustomers());
    }

    @GetMapping("/id")
    public ResponseEntity<?> getById(
            @PathVariable Long id
    ){
        return ResponseEntity.ok(customerService.getById(id));
    }
}
