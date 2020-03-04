package com.example.Customerlist.domain;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;



@Repository
public class CustomerDAOlmpl implements CustomerDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	public void save(Customer customer) {
		String sql = "insert into customer(name) values(?)";
		Object[] parameters = new Object[] { customer.getName() };

		jdbcTemplate.update(sql, parameters);

	}
	public Customer findOne(long id) {
		String sql = "select customer_id,name from customer where customer_id = ?";
		Object[] parameters = new Object[] { id };
		RowMapper<Customer> mapper = new CustomerRowmapper();

		Customer customer = jdbcTemplate.queryForObject(sql, parameters, mapper);
		return customer;

	}

	public List<Customer> findAll() {

		String sql = "select customer_id, name from customer";
		RowMapper<Customer> mapper = new CustomerRowmapper();
		List<Customer> customers = jdbcTemplate.query(sql, mapper);

		return customers;
	}
	
	
}
