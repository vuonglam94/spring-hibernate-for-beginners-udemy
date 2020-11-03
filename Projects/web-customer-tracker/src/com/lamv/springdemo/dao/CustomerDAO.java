package com.lamv.springdemo.dao;

import java.util.List;

import com.lamv.springdemo.entity.Customer;

public interface CustomerDAO {

	public List<Customer> getCustomers();

	public void saveCustomer(Customer theCustomer);
	
}
