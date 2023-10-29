package com.clone.zomato.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.clone.zomato.common.CustomException;
import com.clone.zomato.model.Customer;
import com.clone.zomato.service.CustomerService;

@RestController
public class CustomerController {
	
	@Autowired
	CustomerService customerService;
	
	@CrossOrigin
	@PostMapping(value="/add-customer")
	public ResponseEntity<Object> addCustomer(@RequestBody Customer customer) {
		
		try {
			customer = customerService.addCustomer(customer);
			return new ResponseEntity<>(customer, HttpStatus.CREATED);
		} catch (Exception e) {
			
			return new ResponseEntity<>(new CustomException(e.getMessage()), HttpStatus.BAD_REQUEST);
		}
		
		
	}

}
