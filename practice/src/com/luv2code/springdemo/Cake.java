package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Cake {
	@Autowired
	@Qualifier("peach")
	Fruit fruit;
	public String cakeName() {
		return fruit.getName() + "cake";
	}
}
