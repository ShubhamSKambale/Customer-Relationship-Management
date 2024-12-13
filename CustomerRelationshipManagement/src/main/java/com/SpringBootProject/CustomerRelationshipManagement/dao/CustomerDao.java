package com.SpringBootProject.CustomerRelationshipManagement.dao;

import java.util.List;
import java.util.Map;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.hibernate.query.Query;
import com.SpringBootProject.CustomerRelationshipManagement.entity.Customer;

@Repository
public class CustomerDao {

	@Autowired
	private SessionFactory sf;

//CUSTOMER DATA STORED
	public String insertCustomer(Customer customer) {
		// Open a session
		Session session = sf.openSession();

		// Begin transaction
		Transaction tr = session.beginTransaction();

		// Save the customer object
		session.save(customer);

		// Commit the transaction
		tr.commit();

		// Close the session
		session.close();

		return "Customer inserted successfully";
	}

	// INSERT MULTIPLE CUSTOMERS INTO DATABASE
	public String insertMultipleCustomers(List<Customer> customers) {
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		for (Customer customer : customers) {
			session.save(customer);
		}
		tr.commit();
		session.close();
		return "Customers have inserted scuccessfully......";

	}

	// GET ALL CUSTOMERS
	public List<Customer> getCustomersList() {
		Session session = sf.openSession();
		List list = session.createQuery("from Customer").list();
		return (List<Customer>) list;
	}

	// CUSTOMERS FETCHED USING ID
	public Customer getCustomerByid(int id) {
		Session session = sf.openSession();
		Customer customer = session.get(Customer.class, id);
		return customer;
	}

	// UPDATE CUSTOMER FROM DATABASE
	public String updateCustomer(Customer customer)

	{
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		session.update(customer);
		tr.commit();
		session.close();
		return "customer updated scucessfully";
	}

	// DELETE CUSTOMER FROM DATABASE
	public String deleteCustomer(int id) {
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		// first get the customer from db
		Customer customer = session.get(Customer.class, id);
		session.delete(customer);
		tr.commit();
		session.close();
		return "Cusotmer deleted successfully";
	}

	// GET CUSTOMERS LIST BY FIRSTNAME
	public List<Customer> getCustomerByFirstName(String firstName) {
		Session session = sf.openSession();
		Query<Customer> query = session.createQuery("from Customer c where c.firstName = :fName", Customer.class);
		query.setParameter("fName", firstName);
		List<Customer> list = query.list();
		session.close();

		return list;
	}

	// GET CUSTOMERS LIST BY LASTNAME
	public List<Customer> getCustomerByLastName(String lastName) {
		// Open session
		Session session = sf.openSession();
		Query<Customer> query = session.createQuery("from Customer c where c.lastName =:lastName", Customer.class);
		query.setParameter("lastName", lastName);
		List<Customer> list = query.list();
		session.close();
		return list;
	}

	// GET CUSTOMER BY EMAIL
	public List<Customer> getCustomerByEmail(String email) {
		Session session = sf.openSession();
		Query<Customer> query = session.createQuery("from Customer c where c.email=:email", Customer.class);
		query.setParameter("email", email);
		List<Customer> list = query.list();
		session.close();
		return list;

	}

	// GET CUSTOMER BY MOBILE NUMBER
	public List<Customer> getCustomerByMobileNumber(String mobileNumber) {
		Session session = sf.openSession();
		Query<Customer> query = session.createQuery("from Customer c where c.mobileNumber=:mobileNumber",
				Customer.class);
		query.setParameter("mobileNumber", mobileNumber);
		List<Customer> list = query.list();
		session.close();
		return list;

	}

	// GET CUSTOMER BY GIVEN AGE
	public List<Customer> getCustomerByAge(int age) {
		Session session = sf.openSession();
		Query<Customer> customers = session.createQuery("from Customer c where c.age=:age", Customer.class);
		customers.setParameter("age", age);
		List<Customer> list = customers.list();
		return list;

	}

	// GET CUSTOMER LESS THAN GIVEN AGE
	public List<Customer> getCustomerByLessThanAge(int age) {

		Session session = sf.openSession();
		Query<Customer> customers = session.createQuery("from Customer c where c.age<:age", Customer.class);
		customers.setParameter("age", age);
		List<Customer> list = customers.list();
		return list;

	}

	// GET CUSTOMER GREATER THAN GIVEN AGE
	public List<Customer> getCustomerByGreaterThanAge(int age) {

		Session session = sf.openSession();
		Query<Customer> customers = session.createQuery("from Customer c where c.age>:age", Customer.class);
		customers.setParameter("age", age);
		List<Customer> list = customers.list();
		return list;
	}

	// UPDATE CUSOTMER  FIRSTNAME
	public String updateFirstName(int id, String firstName) {

		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		Customer customer = session.get(Customer.class, id);
		customer.setFirstName(firstName);
		tr.commit();
		session.close();
		return "First name has updated sucessfully....";

	}

	// UPDATE CUSOTMER LASTNAME
	public String updatelastName(int id, String lastName) {

		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		Customer customer = session.get(Customer.class, id);
		customer.setLastName(lastName);
		tr.commit();
		session.close();
		return "Last name has updated sucessfully....";

	}

	// UPDATE CUSTOMER  EMAIL
	public String updatEmailId(int id, String email) {

		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		Customer customer = session.get(Customer.class, id);
		customer.setEmail(email);
		tr.commit();
		session.close();
		return "Email Id has updated sucessfully....";

	}
	
	
	//UPDATE CUSTOMER MOBILE NUMBER
	
	public String updateMobileNumber(int id, String mobileNumber) {

		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		Customer customer = session.get(Customer.class, id);
		customer.setMobileNumber(mobileNumber);
		tr.commit();
		session.close();
		return "Mobile Number  has updated sucessfully....";

	}
	
	//UPDATE CUSTOMER AGE 
	
	public String updateAge(int id, int age) {

		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		Customer customer = session.get(Customer.class, id);
		customer.setAge(id);
		tr.commit();
		session.close();
		return "Age  has updated sucessfully....";

	}
	
	//GET CUSTOMERS ONLY FIRST NAMES
	public List<String> getCustomersFirstName()
	{
	Session session=sf.openSession();
  return 	(List<String>) session.createQuery("select c.firstName from Customer c").list();
	}
	
	
	
	

}
