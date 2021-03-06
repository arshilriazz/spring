package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemo {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext2.xml");
		Coach coach1 = context.getBean("myCoach", Coach.class);
		Coach coach2 = context.getBean("myCoach", Coach.class);
		Coach coach_1 = context.getBean("myCoachPrototype", Coach.class);
		Coach coach_2 = context.getBean("myCoachPrototype", Coach.class);
		System.out.println(coach1.equals(coach2));
		System.out.println(coach_1.equals(coach_2));
		context.close();
	}
}
