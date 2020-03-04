package com.example.Customerlist.domain;

import java.util.List;

public interface CustomerDAO {
	public void save(Customer customer);
	
	public Customer findOne(long id);
	
	public List<Customer> findAll();

}
