package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Course;
import com.luv2code.hibernate.demo.entity.Student;

public class DeleteCourseDemo {

	public static void main(String[] args) {

		SessionFactory factory = new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Course.class)
								.addAnnotatedClass(Student.class)
								.buildSessionFactory();
		
		Session session = factory.openSession();
		
		try {			
			
			session.beginTransaction();

			int courseId = 14;
			Course tempCourse = (Course) session.get(Course.class, courseId);
			
			System.out.println("Deleting course: " + tempCourse);
			
			session.delete(tempCourse);
						
			session.getTransaction().commit();
			
			System.out.println("Done!");
		}
		finally {

			session.close();
			
			factory.close();
		}
	}

}





