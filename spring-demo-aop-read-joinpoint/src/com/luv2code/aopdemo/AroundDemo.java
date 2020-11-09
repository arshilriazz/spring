package com.luv2code.aopdemo;

import java.util.*;
import java.util.logging.Logger;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.luv2code.aopdemo.dao.AccountDAO;
import com.luv2code.aopdemo.service.TrafficFortuneService;

public class AroundDemo {

	private static Logger myLogger = Logger.getLogger(AroundDemo.class.getName());
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(DemoConfig.class);
		
		TrafficFortuneService theFortuneService = 
				context.getBean("trafficFortuneService", TrafficFortuneService.class);
		myLogger.info("Main Program: AroundDemo");
		myLogger.info("Calling getFortune");
//		String data = theFortuneService.getFortune();
		boolean tripWire = true;
		String data2 = theFortuneService.getFortune(tripWire);
//		myLogger.info("\nMy fortune is: " + data);
		myLogger.info("\nMy fortune is: " + data2);
		context.close();
	}


}










