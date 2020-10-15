package com.codegym.ajaxdemo.repository;

import com.codegym.ajaxdemo.model.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer,Long> {
}
