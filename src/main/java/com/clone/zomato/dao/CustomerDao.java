package com.clone.zomato.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.clone.zomato.model.Customer;

public interface CustomerDao extends JpaRepository<Customer, Long> {

}
