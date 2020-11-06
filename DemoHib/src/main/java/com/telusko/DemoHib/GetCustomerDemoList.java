package com.telusko.DemoHib;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.*;

public class GetCustomerDemoList {
	
	public static void main(String[] args) {
		Configuration con = new Configuration().configure().addAnnotatedClass(Customer.class);
		SessionFactory sf = con.buildSessionFactory();
		Session session = sf.openSession();
		try {
			session.beginTransaction();
			List<Customer> customers = session.createQuery("from Customer where ID like 'C10%'").list();
			displayCustomers(customers);
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
