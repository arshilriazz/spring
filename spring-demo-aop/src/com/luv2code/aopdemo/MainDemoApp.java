package com.luv2code.aopdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.luv2code.aopdemo.dao.AccountDAO;
import com.luv2code.aopdemo.dao.ExperimentDAO;
import com.luv2code.aopdemo.dao.MembershipDAO;

public class MainDemoApp {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(DemoConfig.class);

		AccountDAO theAccountDAO = context.getBean("accountDAO", AccountDAO.class);

		MembershipDAO theMembershipDAO = 
				context.getBean("membershipDAO", MembershipDAO.class);

		ExperimentDAO theExprimentDAO = context.getBean(ExperimentDAO.class);
		
		Account myAccount = new Account();
		
		theAccountDAO.addAccount(myAccount, true);

		theMembershipDAO.addSillyMember();
		
		theExprimentDAO.addNumbers(2, 3);

		theExprimentDAO.subNumbers(5, 6);
		
		context.close();
	}

}










