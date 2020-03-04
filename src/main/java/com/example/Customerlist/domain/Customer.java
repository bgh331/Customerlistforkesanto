package com.example.Customerlist.domain;

public class Customer {

	private long id;
	private String name;
	
	public Customer(long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	

	public Customer(String name) {
		super();
		this.id = 0;
		this.name = name;
	}


	public Customer() {
		super();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return String.format("Customer [id=%d, name='%s']", id, name);
	}

	
}
