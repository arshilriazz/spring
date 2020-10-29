package com.luv2code.springdemo;


public class SwimCoach implements Coach {
	private FortuneService fortuneService; 
	public SwimCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	@Override
	public String tips() {
		return "swimming tips";
	}
	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
}
