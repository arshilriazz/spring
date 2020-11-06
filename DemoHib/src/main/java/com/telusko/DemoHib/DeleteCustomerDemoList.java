package com.telusko.DemoHib;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.*;

public class DeleteCustomerDemoList {
	
	public static void main(String[] args) {
		Configuration con = new Configuration().configure().addAnnotatedClass(Customer.class);
		SessionFactory sf = con.buildSessionFactory();
		Session session = sf.openSession();
		try {
			session.beginTransaction();
//			Customer customer = (Customer) session.get(Customer.class, "C112");
//			session.delete(customer);
			session.createQuery("delete Customer where ID='C110'").executeUpdate();
			session.getTransaction().commit();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			session.close();
		}
	}

	private static void displayCustomers(List<Customer> customers) {
		for(Customer customer : customers) {
			System.out.println(customer);
		}
	}

}
