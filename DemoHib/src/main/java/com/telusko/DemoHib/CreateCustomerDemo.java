package com.telusko.DemoHib;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CreateCustomerDemo {
	
	public static void main(String[] args) {
	 Configuration con = new Configuration().configure().addAnnotatedClass(Customer.class);
	 SessionFactory sf = con.buildSessionFactory();
     Session session = sf.openSession();
		try {
			Customer customer = new Customer("C112", "Hockey", "Address", 'Y', 
											"Coach Harry", "98878", "Hyerabad", "CO", "80309");
			session.beginTransaction();
//			session.save(customer);
			Customer c = (Customer) session.get(Customer.class, customer.getID());
			session.getTransaction().commit();
			System.out.println("generated id: " + customer.getID());
			System.out.println(c);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			session.close();
		}
	}

}
