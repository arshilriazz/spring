package com.telusko.DemoHib;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.*;

public class UpdateCustomerDemoList {
	
	public static void main(String[] args) {
		Configuration con = new Configuration().configure().addAnnotatedClass(Customer.class);
		SessionFactory sf = con.buildSessionFactory();
		Session session = sf.openSession();
		try {
			session.beginTransaction();
//			Customer customer = (Customer) session.get(Customer.class, "C109");
//			customer.setName("VolleyBall");
			session.createQuery("Update Customer set name='Cricket' where ID like 'c11%'").executeUpdate();
			List<Customer> customers = session.createQuery("from Customer").list();
			session.getTransaction().commit();
			displayCustomers(customers);
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
