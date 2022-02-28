package com.internship.assignment11.repository;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.internship.assignment11.model.Customer;


@Repository
@Transactional
public class HibernateCustomerRepository implements ICustomerRepository{

	@Autowired
	private EntityManager entityManager;
	
	@Transactional
	@Override
	public Customer getById(int id) {
		Session session=entityManager.unwrap(Session.class);
		Customer customer=session.get(Customer.class, id);
		
		return customer;
	}

	@Transactional
	@Override
	public List<Customer> getAll() {
		Session session=entityManager.unwrap(Session.class);
		List<Customer> customer=session.createQuery("from Customer",Customer.class).getResultList();
		return customer;
	}

	@Transactional
	@Override
	public Customer add(Customer customer) {
		Session session=entityManager.unwrap(Session.class);
		session.save(customer);
		return  customer;
		
	}

	@Transactional
	@Override
	public Customer delete(int id) {
		Session session=entityManager.unwrap(Session.class);
		Customer customerToDelete=session.get(Customer.class, id);
		session.delete(customerToDelete);
		return customerToDelete;
		
	}

}
