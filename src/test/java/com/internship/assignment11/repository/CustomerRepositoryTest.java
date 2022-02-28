package com.internship.assignment11.repository;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.internship.assignment11.model.Customer;

@SpringBootTest
public class CustomerRepositoryTest {
	
	@Autowired
	private ICustomerRepository repo;

	
	@Test
	public void AddCustomerTest() {
	Customer customer = new Customer("furkan", "çanakkale", "f@gmail.com");
	Customer addCustomer = repo.add(customer);

	assertNotNull(addCustomer);
	}

	@Test
	public void GetAllCustomerTest() {
	List<Customer> customers = (List<Customer>)repo.getAll();
	assertNotNull(customers);
	}

	@Test
	public void GetCustomerById() {
	Customer customer = repo.getById(5);
	assertThat(customer.getName()).isEqualTo("furkan");
	}

	@Test
	public void DeletCustomerTest() {
	repo.delete(13);
	assertNull(repo.getById(13));
	}

}
