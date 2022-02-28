package com.internship.assignment11.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonIgnore;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Entity
@Table(name="customer")
@ApiModel(value="Customer Api model documentation",description = "Model")
public class Customer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@ApiModelProperty(value = "Unique id field of customer object")
	@Column(name="id")
	private int id;
	
	@ApiModelProperty(value = "Name field of customer object")
	@Column(name="name")
	private String name;
	
	@ApiModelProperty(value = "City field of customer object")
	@Column(name="city")
	private String city;
	
	@ApiModelProperty(value = "E-mail field of customer object")
	@Column(name="email")
	private String email;	
	
	
	
	public Customer(String name, String city, String email) {
		this.name = name;
		this.city = city;
		this.email = email;
	}
	
	public Customer(int id, String name, String city, String email) {
		this.id = id;
		this.name = name;
		this.city = city;
		this.email = email;
	}
	
	public Customer() {
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	

}
