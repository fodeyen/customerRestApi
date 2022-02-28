package com.internship.assignment11.controller;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

import org.json.JSONException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.skyscreamer.jsonassert.JSONAssert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.internship.assignment11.business.ICustomerService;
import com.internship.assignment11.model.Customer;
import com.internship.assignment11.repository.ICustomerRepository;

//@RunWith(SpringRunner.class)
//@WebMvcTest(value = CustomerController.class)
//@WithMockUser
class CustomerControllerTest {
//	
//	@MockBean
//	ICustomerService service;
//	@Autowired
//	private MockMvc mockMvc;
//	Customer mock_customer = new Customer(1, "Furkan21", "çanakkale", "a@a.com");
//	
//	@Test
//	public void GetAllCustomerTest()  throws Exception {
//		List<Customer> ls_customer = new ArrayList<Customer>();
//		ls_customer.add(mock_customer);
//		when(service.getAll()).thenReturn(ls_customer);
//		
//		RequestBuilder requestBuilder = MockMvcRequestBuilders.get(
//				"/api/customers").accept(
//				MediaType.APPLICATION_JSON);
//		MvcResult result = mockMvc.perform(requestBuilder).andReturn();
//
//		System.out.println(result.getResponse());
//		String expected = "{id:1,name:Furkan21,city:çanakkale, email: a@a.com}";
//
//		// {"id":"Course1","name":"Spring","description":"10 Steps, 25 Examples and 10K Students","steps":["Learn Maven","Import Project","First Example","Second Example"]}
//
//		JSONAssert.assertEquals(expected, result.getResponse()
//				.getContentAsString(), false);
//	}
//	
//	@Test
//	public void AddCustomerTest() {
//	}
//
//	@Test
//	public void GetCustomerById() {
//	}
//
//	@Test
//	public void DeletCustomerTest() {
//	}

}
