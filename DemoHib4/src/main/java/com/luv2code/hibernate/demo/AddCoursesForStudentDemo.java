package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Course;
import com.luv2code.hibernate.demo.entity.Student;

public class AddCoursesForStudentDemo {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Course.class)
								.addAnnotatedClass(Student.class)
								.buildSessionFactory();
		Session session = factory.openSession();
		
		try {			
		
			session.beginTransaction();
			int studentId = 2;
			Student tempStudent = (Student) session.get(Student.class, studentId);
			
			System.out.println("\nLoaded student: " + tempStudent);
			System.out.println("Courses: " + tempStudent.getCourses());
			
			Course tempCourse1 = new Course("Rubik");
			Course tempCourse2 = new Course("Atari");
						
			tempCourse1.addStudent(tempStudent);
			tempCourse2.addStudent(tempStudent);
						
			System.out.println("\nSaving the courses ...");
			
			session.save(tempCourse1);
			session.save(tempCourse2);
						
			session.getTransaction().commit();
			
			System.out.println("Done!");
		}
		finally {
			session.close();
			
			factory.close();
		}
	}

}





