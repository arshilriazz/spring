package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationsTest {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		Coach coach = context.getBean("cricketCoach", Coach.class);
		System.out.println(coach.tips());
		System.out.println(coach.getDailyFortune());
		context.close();
	}

}
