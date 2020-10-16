package com.codegym.ajaxdemo.controller;

import com.codegym.ajaxdemo.model.Customer;
import com.codegym.ajaxdemo.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/customers")
public class CustomerController {
    @Autowired
    ICustomerService customerService;

    @GetMapping
    public String showList(Model model){
        Iterable<Customer> customers = customerService.findAll();
        model.addAttribute("customers",customers);
        return "customer/list";
    }

    @GetMapping("/api")
    @ResponseBody
    public Iterable<Customer> getAll(){
        return customerService.findAll();
    }
    @DeleteMapping("/delete/{id}")
    @ResponseBody
    public Customer deleteCustomer(@PathVariable("id") Long id){
        Customer customer = customerService.findById(id);
        if (customer != null){
            customerService.remove(customer);
            return customer;
        } else
            return null;
    }
    @GetMapping("/create")
    public String showCreateForm(Model model){
        model.addAttribute("customer", new Customer());
        return "/customer/create";
    }
    @PostMapping("/create")
    @ResponseBody
    public Customer saveCustomer(@RequestBody Customer customer){
        customerService.save(customer);
        return customer;
    }
}
