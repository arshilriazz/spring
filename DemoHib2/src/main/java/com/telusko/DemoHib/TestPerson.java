package com.telusko.DemoHib;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class TestPerson {
	public static void main(String[] args) {
		Configuration con = new Configuration()
							.addAnnotatedClass(Person.class)
							.addAnnotatedClass(PersonDetail.class)
							.configure();
		 SessionFactory sf = con.buildSessionFactory();
	     Session session = sf.openSession();
	     
	     session.beginTransaction();
	     PersonDetail alexDetail = new PersonDetail();
	     alexDetail.setZipCode("50090");
	     alexDetail.setJob("Devel");
	     alexDetail.setIncome(8988);
     
	     Person alex = new Person();
	     alex.setPersonName("Alex Barnesa");
	     
	     alex.setpDetail(alexDetail);
	     session.save(alex);
//	     
//	     alexDetail.setP(alex);
//	     session.save(alexDetail);
//	     
//	     System.out.println(alex);
//	     session.delete(alex);
	     
//	     Person p = (Person) session.get(Person.class, 2);
//	     session.delete(p);
	     session.getTransaction().commit();
	}
}
