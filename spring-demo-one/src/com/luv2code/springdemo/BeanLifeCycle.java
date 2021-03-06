package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycle {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext3.xml");
		Coach coach = context.getBean("myCoach", Coach.class);
		System.out.println(coach.tips());
		context.close();
	}

}
