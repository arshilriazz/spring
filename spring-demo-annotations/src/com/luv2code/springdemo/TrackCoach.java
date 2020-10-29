package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TrackCoach implements Coach {
	
	@Autowired
	@Qualifier("hello")
	private FortuneService fortuneService; 

//	public TrackCoach(FortuneService fortuneService) {
//		this.fortuneService = fortuneService;
//	}
	@Override
	public String tips() {
		return "Running tips";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
}
