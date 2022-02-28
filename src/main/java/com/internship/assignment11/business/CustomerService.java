package com.internship.assignment11.business;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.internship.assignment11.model.Customer;
import com.internship.assignment11.repository.ICustomerRepository;

@Service
@Transactional
public class CustomerService implements ICustomerService{
	
	@Autowired
	private ICustomerRepository customerRepository;

	@Override
	public Customer  getById(int id) {
		return customerRepository.getById(id);	
	}

	@Override
	public List<Customer> getAll(){
		return this.customerRepository.getAll();
	
	}

	@Override
	public Customer add(Customer customer) {
		return this.customerRepository.add(customer);
	}

	@Override
	public Customer delete(int id) {
		
		return this.customerRepository.delete(id);
		
	}
	
	
}
