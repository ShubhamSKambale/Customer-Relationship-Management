package com.SpringBootProject.CustomerRelationshipManagement.service;


import java.util.List;

import com.SpringBootProject.CustomerRelationshipManagement.entity.Customer;

public interface CustomerService {

	//interface methods are always public abstract no need to write 
    String insertCustomer(Customer customer);
    
    String insertMultipleCustomer(List<Customer> customers);
    
    List<Customer>getCustomersList();
	
    Customer getCustomerByid(int id);
    
    String customerUpdate(Customer customer);
    
    String customerDelete(int id);
    
    List<Customer> getCustomerByFirstName(String firstName);
    
    List<Customer>getCustomerByLastName(String lastName);
    
    List<Customer> getCustomerByEmail(String email);
    
    List<Customer> getCustomerByMobileNumber(String mobileNumber);
    
    List<Customer> getCustomerByAge(int age);
    
    List<Customer> getCustomerByLessThanAge(int age);
    
    List<Customer> getCustomerByGreaterThanAge(int age);
    
    String updateFirstName(int id, String firstName);
    
    String updateLastName(int id,String lastName);
    
    String updateEmailId(int id, String email);
    
    String updateMobileNumber(int id ,String mobileNumber);
    
    String updateAge(int id,int age);
    
    List<String> getCustomerFirstName();
    
    
}
