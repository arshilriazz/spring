package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

@Component("peach")
public class Peach implements Fruit {

	@Override
	public int getSweetness() {
		// TODO Auto-generated method stub
		return 10;
	}

	@Override
	public String getColor() {
		// TODO Auto-generated method stub
		return "peach";
	}

	@Override
	public String getTaste() {
		// TODO Auto-generated method stub
		return "awesome";
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "peach";
	}

}
