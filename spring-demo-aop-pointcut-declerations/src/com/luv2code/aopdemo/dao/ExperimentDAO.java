package com.luv2code.aopdemo.dao;

import org.springframework.stereotype.Component;

@Component
public class ExperimentDAO {
	public void addNumbers(int a, int b) {
		System.out.println(a+b);
	}
	public void subNumbers(int a, int b) {
		System.out.println(a-b);
	}
}
