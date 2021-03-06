package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
//		ClassPathXmlApplicationContext context2 = 
//				new ClassPathXmlApplicationContext("applicationContext.xml");
//		Coach theCoach = context2.getBean("myCoach", Coach.class);
//		System.out.println(cricketCoach.tips());
//		System.out.println(cricketCoach.getDailyFortune());
//		System.out.println(theCoach.tips());
		Coach cricketCoach = context.getBean("myCricketCoach", Coach.class);
		System.out.println(cricketCoach.getDailyFortune());
//		System.out.println(cricketCoach.getEmailAddress());
		context.close();
	}
}