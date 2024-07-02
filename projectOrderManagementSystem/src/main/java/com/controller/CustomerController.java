package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.model.Customer;
import com.service.CustomerService;

@RestController
public class CustomerController {
	
	@Autowired
	
	CustomerService customerService;
	
	@PostMapping("/add")
	public Customer saveCustomer(@RequestBody Customer customer)
	{
		return customerService.saveCustomer(customer);
	}

}
