package com.luv2code.springdemo;

public class Main {

	public static void main(String[] args) {
		int a = 9;
		int b = 8;
		swap(a,b);
		System.out.println(a);
		System.out.println(b);
	}
	
	public static void swap(int a, int b) {
		int temp = a;
		a = b;
		b = temp;
	}

}
