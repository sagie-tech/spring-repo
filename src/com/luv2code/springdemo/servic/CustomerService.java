package com.luv2code.springdemo.servic;

import java.util.List;

import com.luv2code.springdemo.entity.Customer;

public interface CustomerService {
	
	public List<Customer> getCustomers();
	public void saveCustomer(Customer theCustomer);
	public Customer getCustomer(int theId);
	public void deleteCustomer(int theId);

}
