package com.clone.zomato.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.clone.zomato.dao.CustomerDao;
import com.clone.zomato.model.Customer;

@Service
public class CustomerService {
	
	@Autowired
	CustomerDao customerDao;

	public Customer addCustomer(Customer customer) throws Exception {
		if(customer.getEmail() == null || customer.getEmail().trim().equals("")) {
			throw new Exception("Email should be required");
		}
		if(customer.getName() == null || customer.getName().trim().equals("")) {
			throw new Exception("Email should be required");
		}
		customerDao.save(customer);
		return customer;
	}

}
