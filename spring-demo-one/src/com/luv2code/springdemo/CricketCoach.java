package com.luv2code.springdemo;

public class CricketCoach implements Coach {
	private FortuneService fortuneService;
	private String team;
	private String emailAddress;
	public String getTeam() {
		return team;
	}
	public void setTeam(String team) {
		this.team = team;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public CricketCoach() {
		System.out.println("cricket coach");
	}
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	@Override
	public String tips() {
		return "cricket tips";
	}	
	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
}
