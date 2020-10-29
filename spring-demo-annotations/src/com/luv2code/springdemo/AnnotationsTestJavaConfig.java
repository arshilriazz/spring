package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationsTestJavaConfig {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(SportConfig.class);
		CricketCoach coach = context.getBean("cricketCoach", CricketCoach.class);
		System.out.println(coach.tips());
		System.out.println(coach.getDailyFortune());
		System.out.println(coach.getTeam());
		context.close();
	}

}
