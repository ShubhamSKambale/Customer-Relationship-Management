package com.SpringBootProject.CustomerRelationshipManagement.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SpringBootProject.CustomerRelationshipManagement.entity.Customer;
import com.SpringBootProject.CustomerRelationshipManagement.service.CustomerService;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {

	@Autowired
	CustomerService customerService;

	@PostMapping("/insert")
	public String insertCustomer(@RequestBody Customer customer) {
		String msg = customerService.insertCustomer(customer);
		return msg;
	}

	@GetMapping
	public List<Customer> getCustomersList() {
		List<Customer> list = customerService.getCustomersList();
		return list;
	}

	@PostMapping
	public String insertMultipleCustomers(@RequestBody List<Customer> customers) {
		return customerService.insertMultipleCustomer(customers);
	}

	@GetMapping("/{id}")
	public Customer getCustomerByid(@PathVariable int id) {
		return customerService.getCustomerByid(id);
	}

	@PutMapping
	public String customerUpdate(@RequestBody Customer customer) {
		return customerService.customerUpdate(customer);
	}

	@DeleteMapping("/{id}")
	public String customerDelelteByid(@PathVariable int id) {
		return customerService.customerDelete(id);
	}

	@GetMapping("/byfirstname/{firstName}")
	public List<Customer> getCustomerByFirstName(@PathVariable String firstName) {
		return customerService.getCustomerByFirstName(firstName);

	}

	@GetMapping("/bylastname/{lastName}")
	public List<Customer> getCustomerBylastName(@PathVariable String lastName) {
		return customerService.getCustomerByLastName(lastName);
	}

	@GetMapping("/byemail/{email}")
	public List<Customer> getCustomerByEmail(@PathVariable String email) {
		return customerService.getCustomerByEmail(email);
	}

	@GetMapping("/bymobilenumber/{mobileNumber}")
	public List<Customer> getCustomerByMobileNumber(@PathVariable String mobileNumber) {
		return customerService.getCustomerByMobileNumber(mobileNumber);
	}

	@GetMapping("/byage/{age}")
	public List<Customer> getCustomerByAge(@PathVariable int age) {
		return customerService.getCustomerByAge(age);
	}

	@GetMapping("/bylessthanage/{age}")
	public List<Customer> getCustomerByLessThanAge(@PathVariable int age) {
		return customerService.getCustomerByLessThanAge(age);
	}

	@GetMapping("/bygreaterthanage/{age}")
	public List<Customer> getCustomerByGreaterThanAge(@PathVariable int age) {

		return customerService.getCustomerByGreaterThanAge(age);
	}

	@PutMapping("byfirstname/{id}")
	public String updateFirstName(@PathVariable int id, @RequestBody Map<String, String> request) {
		String firstName = request.get("firstName");
		return customerService.updateFirstName(id, firstName);
	}

	@PutMapping("bylastname/{id}")
	public String updateLastName(@PathVariable int id, @RequestBody Map<String, String> request) {

		String lastName = request.get("lastName");
		return customerService.updateLastName(id, lastName);

	}

	@PutMapping("/byemail/{id}")
	public String updateEmailId(@PathVariable int id, @RequestBody Map<String, String> request) {
		String email = request.get("email");
		return customerService.updateEmailId(id, email);
	}

	@PutMapping("/bymobile/{id}")
	public String updateMobileNumber(@PathVariable int id, @RequestBody Map<String, String> request) {
		String mobileNumber = request.get("mobileNumber");
		return customerService.updateMobileNumber(id, mobileNumber);
	}

	@PutMapping("/byage/{id}")
	public String updateAge( @PathVariable  int id,@RequestBody Map<String, Integer> request) {
		int age = request.get("age");

		return customerService.updateAge(id, age);

	}

	
	
	@GetMapping("/onlyfirstname")
	public List<String>getCustomerFirstName()
	{
		
	return	customerService.getCustomerFirstName();
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
