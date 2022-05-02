package com.example.demo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.entity.Customer;
import com.example.demo.service.CustomerService;

@RestController
public class CustomerController {
	@Autowired
	CustomerService customerservice;
	
		//post method
		@PostMapping("/customerpost/")
		public Customer savecust(@RequestBody Customer customer) {
		return customerservice.savecust(customer);
		}
		//get method by all
		@GetMapping("/getcustomer/")
		public List<Customer> fetchCustomer(){
			return customerservice.fetchCustomer();
		}
		//get department by id
		@GetMapping("/getcustomer/{id}")
		public Customer fetchCustomerById(@PathVariable("id") int customerid) {
			return customerservice.fetchCustomerById(customerid);
		}
		// update
		@PutMapping("/customerupdate/{id}")
		public Customer updateCustomer(@PathVariable("id")int customerid,@RequestBody Customer customer) {
			return customerservice.updateCustomer(customerid,customer);
		}
		
	// delete department by id
		@DeleteMapping("/customerdelete/{id}")
		public String deleteCustomerById(@PathVariable("id") int customerid) {
			 customerservice.deleteCustomerById(customerid);
			 return "particular customer's detail deleted successfully";
		}
		
}
