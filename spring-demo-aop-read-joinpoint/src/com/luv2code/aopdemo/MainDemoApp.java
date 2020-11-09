package com.luv2code.aopdemo;

import java.util.*;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.luv2code.aopdemo.dao.AccountDAO;

public class MainDemoApp {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(DemoConfig.class);

		AccountDAO theAccountDAO = context.getBean("accountDAO", AccountDAO.class);
		
		theAccountDAO.findAccounts();
		
//		List<Account> accounts = null;
//		
//		try {
//			boolean tripWire = false;
//			accounts = theAccountDAO.findThrowAccounts(tripWire);
//		}
//		catch(Exception e) {
//			e.printStackTrace();
//		}
//		finally {
//			System.out.println("Hello");
//		}
//		
		context.close();
	}

}










