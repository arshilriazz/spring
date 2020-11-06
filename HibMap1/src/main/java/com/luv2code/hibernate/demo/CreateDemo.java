package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Instructor;
import com.luv2code.hibernate.demo.entity.InstructorDetail;


public class CreateDemo {	

	public static void main(String[] args) {
		Configuration con = new Configuration().configure().addAnnotatedClass(Instructor.class).addAnnotatedClass(InstructorDetail.class);
		SessionFactory sf = con.buildSessionFactory();
	    Session session = sf.openSession();
		
		try {		
			InstructorDetail tempInstructorDetail = new InstructorDetail("http://www.youtube.com","Drums");
			Instructor tempInstructor = new Instructor("Arshil", "Riaz", "a-z.com");		
			tempInstructor.setInstructorDetail(tempInstructorDetail);
			session.beginTransaction();
			session.save(tempInstructor);					
			session.getTransaction().commit();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			sf.close();
		}
	}

}




