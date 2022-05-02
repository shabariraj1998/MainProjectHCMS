package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Customer;

public interface CustomerService {


	Customer savecust(Customer customer);

	List<Customer> fetchCustomer();

	Customer fetchCustomerById(int customerid);

	Customer updateCustomer(int customerid,Customer customer);

	void deleteCustomerById(int customerid);

		
}
