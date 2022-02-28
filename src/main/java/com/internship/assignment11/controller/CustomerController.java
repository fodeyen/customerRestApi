package com.internship.assignment11.controller;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.internship.assignment11.business.CustomerService;
import com.internship.assignment11.business.ICustomerService;
import com.internship.assignment11.handler.ResponseHandler;
import com.internship.assignment11.model.Customer;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/api")
@Api(value = "Customer Api documentation")

public class CustomerController {
	@Autowired
	private ICustomerService customerService;
	
    private static final Logger logger = LogManager.getLogger(CustomerController.class);

	
	@ApiOperation(value="customer get method by id")
	@GetMapping("/getCustomerById/{id}")
	public ResponseEntity<Object> getCustomerById(@PathVariable int id) {
		if(customerService.getById(id) !=null) {
		
			logger.info(id+" Id'sine sahip customer nesnesi veritabanından çağırıldı");
			
			return ResponseHandler.generateResponse(HttpStatus.OK, true, "Başarılı", customerService.getById(id));
		}else {
			logger.error(id+" Id'sine sahip customer nesnesi veritabanından çağırma işlemi gerçekleşmedi"+HttpStatus.BAD_REQUEST);
			return ResponseHandler.generateResponse(HttpStatus.BAD_REQUEST, false, "Başarısız",null);
		}
		
		
		
	}
	
	@ApiOperation(value = "Customer list method")
	@GetMapping("/customers")
	public ResponseEntity<Object> getCustomers(){
		if(customerService.getAll().size()!=0) {
			logger.info("Tüm customer nesneleri veritabanından çağırıldı");
			return ResponseHandler.generateResponse(HttpStatus.OK, true, "Başarılı", customerService.getAll());
		}else {
			logger.error("Customer nesnelerinin veritabanından  çağırılma isteği gerçekleşmedi"+HttpStatus.BAD_REQUEST);
			return ResponseHandler.generateResponse(HttpStatus.BAD_REQUEST, false, "Başarısız", null);
		}
		
	}
	
	@ApiOperation(value="New Customer adding method")
	@PostMapping("/add")
	public ResponseEntity<Object> add(@RequestBody Customer customer) {
		try {
			logger.info(customer+" Id'sine sahip customer nesnesi veritabanına eklendi");
			return ResponseHandler.generateResponse(HttpStatus.OK, true, "Başarılı", customerService.add(customer));
		}catch (Exception e) {
			logger.error(customer.getId()+" Id'sine sahip customer nesnesi veritabanına eklenemedi"+e.getMessage());
			return ResponseHandler.generateResponse(HttpStatus.BAD_REQUEST, false, "Başarısız. ", null);
		}
		    
	}
	
	@ApiOperation(value ="customer deletion method")
	
	@PostMapping("/delete/{id}")
	public ResponseEntity<Object>delete(@PathVariable int id) {

		try {
			logger.info(id+" Id'sine sahip customer nesnesi veritabanından silindi");
			 return ResponseHandler.generateResponse(HttpStatus.OK, true, "Başarılı", customerService.delete(id));
		}catch (Exception e) {
			logger.error(id+" Id'sine sahip customer nesnesi veritabanından silme işlemi gerçekleşmedi"+e.getMessage());
			return ResponseHandler.generateResponse(HttpStatus.BAD_REQUEST, false, "Başarısız. ", null);
		}
		    
		
	}
	
	

}
