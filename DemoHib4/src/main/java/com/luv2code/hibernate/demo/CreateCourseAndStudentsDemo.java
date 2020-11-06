package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Course;
import com.luv2code.hibernate.demo.entity.Student;

public class CreateCourseAndStudentsDemo {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Course.class)
								.addAnnotatedClass(Student.class)
								.buildSessionFactory();
		
		Session session = factory.openSession();
		
		try {			
			
			session.beginTransaction();
						
			Course tempCourse = new Course("Ece");
						
			System.out.println("\nSaving the course ...");
			session.save(tempCourse);
			
			System.out.println("Saved the course: " + tempCourse);
			Student tempStudent1 = new Student("Arshil", "Riaz", "ars@luv2code.com");
			Student tempStudent2 = new Student("Sameer", "Miriyala", "smr@luv2code.com");
						
			tempCourse.addStudent(tempStudent1);
			tempCourse.addStudent(tempStudent2);
			
			System.out.println("\nSaving students ...");
			session.save(tempStudent1);
			session.save(tempStudent2);
			System.out.println("Saved students: " + tempCourse.getStudents());
			session.getTransaction().commit();
			
			System.out.println("Done!");
		}
		finally {
			session.close();
			
			factory.close();
		}
	}

}





