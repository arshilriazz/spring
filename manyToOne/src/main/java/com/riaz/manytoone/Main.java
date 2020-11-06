package com.riaz.manytoone;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class Main {
	public static void main(String[] args) {
		 Configuration con = new Configuration()
				 				.configure()
				 				.addAnnotatedClass(Student.class)
				 				.addAnnotatedClass(StudentAddress.class);
		 SessionFactory sf = con.buildSessionFactory();
	     Session session = sf.openSession();
			try {
				session.beginTransaction();
				StudentAddress address = new StudentAddress();
				address.setAddressDetail("Hyderabad India");
//				address.setAddressId(1);
				Student student1 = new Student();
				Student student2 = new Student();
				student1.setStudentName("Vinay");
				student1.setStudentAddress(address);
//				student1.setStudentId(1);
				student2.setStudentName("Swaroop");
				student2.setStudentAddress(address);
//				student2.setStudentId(2);
				session.save(student1);
				session.save(student2);
				session.getTransaction().commit();
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			finally {
				session.close();
			}
	}
}
