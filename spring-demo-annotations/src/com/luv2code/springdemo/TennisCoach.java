package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

	@Override
	public String tips() {
		// TODO Auto-generated method stub
		return "tennis tips";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "you will do well";
	}

}
