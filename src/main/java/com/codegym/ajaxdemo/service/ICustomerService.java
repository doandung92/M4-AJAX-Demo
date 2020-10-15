package com.codegym.ajaxdemo.service;

import com.codegym.ajaxdemo.model.Customer;

public interface ICustomerService {
    Iterable<Customer> findAll();
    Customer findById(Long id);
    Customer save(Customer customer);
    void remove(Customer customer);
}
