package com.abhi.spring;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
@Service
public class CustomerService {
	

	public List<Customer> fetchAllCustomers(){
		List<Customer> customers = new ArrayList<>();
		Customer c1 = new Customer("Anna","Addams","april 16 1974","523-224-3524");
		Customer c2 = new Customer("Bill","Hunter","aug 24 1948","948-858-7758");
		customers.add(c1);customers.add(c2);
		return customers;
	}

}
