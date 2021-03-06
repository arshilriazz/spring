package com.luv2code.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class CricketCoach implements Coach {
	
	@Autowired
	@Qualifier("hello")
	private FortuneService fortuneService;
	
	@Value("SRH")
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
//	@Autowired
//	public void setFortuneService(FortuneService fortuneService) {
//		System.out.println("setter");
//		this.fortuneService = fortuneService;
//	}
//	@Autowired
//	public void doFortuneService(FortuneService fortuneService) {
//		System.out.println("random");
//		this.fortuneService = fortuneService;
//	}
	@Override
	public String tips() {
		return "cricket tips";
	}	
	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	@PostConstruct
	public void initMethod() {
		System.out.println("start of bean");
	}
	@PreDestroy
	public void destroyMethod() {
		System.out.println("ending of bean");
	}
}
