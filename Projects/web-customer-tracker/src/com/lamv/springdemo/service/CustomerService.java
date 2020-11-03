package com.lamv.springdemo.service;

import java.util.List;

import com.lamv.springdemo.entity.Customer;

public interface CustomerService {

	public List<Customer> getCustomers();

	public void saveCustomer(Customer theCustomer);
	
}
