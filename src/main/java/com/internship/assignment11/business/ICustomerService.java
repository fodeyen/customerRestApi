package com.internship.assignment11.business;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.internship.assignment11.model.Customer;


public interface ICustomerService {
	
	Customer  getById(int id);
	List<Customer> getAll();
	Customer add(Customer customer);
	Customer delete(int id);

}
