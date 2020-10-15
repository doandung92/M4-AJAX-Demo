package com.codegym.ajaxdemo.service;

import com.codegym.ajaxdemo.model.Customer;

public interface ICustomerService {
    Iterable<Customer> findAll();
    Customer findById(Integer id);
    Customer save(Customer customer);
    Customer remove(Integer id);
}
