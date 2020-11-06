package com.riaz.manytoone;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class GetStudents {
	public static void main(String[] args) {
		 Configuration con = new Configuration()
				 				.configure()
				 				.addAnnotatedClass(Student.class)
				 				.addAnnotatedClass(StudentAddress.class);
		 SessionFactory sf = con.buildSessionFactory();
	     Session session = sf.openSession();
			try {
				session.beginTransaction();
				Student student = (Student) session.get(Student.class, 2);
				System.out.println(student);
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
