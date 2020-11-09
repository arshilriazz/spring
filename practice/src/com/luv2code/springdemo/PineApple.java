package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

@Component("pineapple")
public class PineApple implements Fruit {

	@Override
	public int getSweetness() {
		// TODO Auto-generated method stub
		return 4;
	}

	@Override
	public String getColor() {
		// TODO Auto-generated method stub
		return "yellow";
	}

	@Override
	public String getTaste() {
		// TODO Auto-generated method stub
		return "goodish";
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "pineapple";
	}

}
