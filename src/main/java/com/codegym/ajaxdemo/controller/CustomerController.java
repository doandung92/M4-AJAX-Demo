package com.codegym.ajaxdemo.controller;

import com.codegym.ajaxdemo.model.Customer;
import com.codegym.ajaxdemo.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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
}
