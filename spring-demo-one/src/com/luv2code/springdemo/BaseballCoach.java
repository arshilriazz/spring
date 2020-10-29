package com.luv2code.springdemo;

public class BaseballCoach implements Coach {
	private FortuneService fortuneService; 
	public BaseballCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	@Override
	public String tips() {
		return "baseball tips";
	}
	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	
	public void initMethod() {
		System.out.println("start of bean");
	}
	
	public void destroyMethod() {
		System.out.println("ending of bean");
	}
}
