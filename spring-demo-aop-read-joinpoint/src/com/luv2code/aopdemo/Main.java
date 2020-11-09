package com.luv2code.aopdemo;

public class Main {

	public static void main(String[] args) {
		try {
			int a = 9, b = 0;
			if(b == 0) throw new RuntimeException("b cannot be zero");
			System.out.println("a/b");
		}
		catch(Exception e) {
			System.out.println("a/b cannot be possible");
		}
	}
}
