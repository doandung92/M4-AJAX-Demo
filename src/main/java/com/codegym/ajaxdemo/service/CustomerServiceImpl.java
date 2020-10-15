package com.codegym.ajaxdemo.service;

import com.codegym.ajaxdemo.model.Customer;
import com.codegym.ajaxdemo.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements ICustomerService{
    @Autowired
    CustomerRepository customerRepository;

    @Override
    public Iterable<Customer> findAll() {
        return customerRepository.findAll();
    }

    @Override
    public Customer findById(Integer id) {
        return null;
    }

    @Override
    public Customer save(Customer customer) {
        return null;
    }

    @Override
    public Customer remove(Integer id) {
        return null;
    }
}
