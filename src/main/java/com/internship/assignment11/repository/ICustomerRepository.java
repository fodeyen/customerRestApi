package com.internship.assignment11.repository;

import java.util.List;

import com.internship.assignment11.model.Customer;



public interface ICustomerRepository {
	
	Customer getById(int id);
	List<Customer> getAll();
	Customer add(Customer customer);
	Customer delete(int id);
}
