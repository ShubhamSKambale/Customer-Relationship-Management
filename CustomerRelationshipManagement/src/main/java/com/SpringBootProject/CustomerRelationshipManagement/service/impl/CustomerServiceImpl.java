package com.SpringBootProject.CustomerRelationshipManagement.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SpringBootProject.CustomerRelationshipManagement.dao.CustomerDao;
import com.SpringBootProject.CustomerRelationshipManagement.entity.Customer;
import com.SpringBootProject.CustomerRelationshipManagement.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	CustomerDao customerDao;

	@Override
	public String insertCustomer(Customer customer) {

		String msg = customerDao.insertCustomer(customer);

		return msg;
	}

	@Override
	public String insertMultipleCustomer(List<Customer> customers) {

		return customerDao.insertMultipleCustomers(customers);

	}

	@Override
	public List<Customer> getCustomersList() {
		List<Customer> list = customerDao.getCustomersList();
		return list;
	}

	@Override
	public Customer getCustomerByid(int id) {
		Customer customer = customerDao.getCustomerByid(id);
		return customer;
	}

	@Override
	public String customerUpdate(Customer customer) {
		return customerDao.updateCustomer(customer);

	}

	@Override
	public String customerDelete(int id) {

		return customerDao.deleteCustomer(id);
	}

	@Override
	public List<Customer> getCustomerByFirstName(String firstName) {
		return customerDao.getCustomerByFirstName(firstName);
	}

	@Override
	public List<Customer> getCustomerByLastName(String lastName) {
		return customerDao.getCustomerByLastName(lastName);

	}

	@Override
	public List<Customer> getCustomerByEmail(String email) {
		return customerDao.getCustomerByEmail(email);
	}

	@Override
	public List<Customer> getCustomerByMobileNumber(String mobileNumber) {
		return customerDao.getCustomerByMobileNumber(mobileNumber);
	}

	@Override
	public List<Customer> getCustomerByAge(int age) {
		return customerDao.getCustomerByAge(age);
	}

	@Override
	public List<Customer> getCustomerByLessThanAge(int age) {

		return customerDao.getCustomerByLessThanAge(age);
	}

	@Override
	public List<Customer> getCustomerByGreaterThanAge(int age) {
		return customerDao.getCustomerByGreaterThanAge(age);
	}

	@Override
	public String updateFirstName(int id, String firstName) {
		return customerDao.updateFirstName(id, firstName);
	}

	@Override
	public String updateLastName(int id, String lastName) {
		return customerDao.updatelastName(id, lastName);
	}

	@Override
	public String updateEmailId(int id, String email) {
		return customerDao.updatEmailId(id, email);
	}

	@Override
	public String updateMobileNumber(int id, String mobileNumber) {
		return customerDao.updateMobileNumber(id, mobileNumber);
	}

	@Override
	public String updateAge(int id,int age) {
		return customerDao.updateAge(id, age);
	}

	

	@Override
	public List<String> getCustomerFirstName() {
	return	customerDao.getCustomersFirstName();
	}

}
