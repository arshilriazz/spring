package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationsTest {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		Coach coach = context.getBean("cricketCoach", Coach.class);
		Coach track = context.getBean("asdf",TrackCoach.class);
		System.out.println(track.tips());
		System.out.println(coach.tips());
		System.out.println(coach.getDailyFortune());
		context.close();
	}

}
