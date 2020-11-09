package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args) {	
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(Config.class);
		Cake cake = context.getBean(Cake.class); 
		System.out.println(cake.cakeName());
	}

}
