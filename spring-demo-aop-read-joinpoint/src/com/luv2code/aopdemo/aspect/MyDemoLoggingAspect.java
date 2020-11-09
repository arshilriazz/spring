package com.luv2code.aopdemo.aspect;

import java.util.List;
import java.util.logging.Logger;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.luv2code.aopdemo.Account;

@Aspect
@Component
@Order(2)
public class MyDemoLoggingAspect {
	
	private Logger myLogger = Logger.getLogger(getClass().getName());
	
	@Around("execution(* com.luv2code.aopdemo.service.*.getFortune(..))")	
	public Object aroundGetFortune(ProceedingJoinPoint theProceedingJoinPoint) throws Throwable {
		String method = theProceedingJoinPoint.getSignature().toShortString();
		myLogger.info("\nExecuting @Around on method: " + method);
		long begin = System.currentTimeMillis();
		Object result = null; 
		try {
			result = theProceedingJoinPoint.proceed();
		}
		catch(Exception e) {
			myLogger.warning(e.getMessage());
			result = "Major accident helcopter is coming";
//			throw e;
		}
		long end = System.currentTimeMillis();
		long duration = end - begin;
		myLogger.info("\nDuration: " + duration / 1000.0 + " seconds");
		return result;
	}
	
	@After("execution(* com.luv2code.aopdemo.dao.AccountDAO.findAccounts(..))")
	public void afterFinallyFindAccountsAdvice(JoinPoint theJoinPoint) {
		String method = theJoinPoint.getSignature().toShortString();
		myLogger.info("\nExecuting @After (finally) on method: " + method);
	}
	
	@AfterThrowing(
			pointcut="execution(* com.luv2code.aopdemo.dao.AccountDAO.findThrowAccounts(..))",
			throwing="theExc")
	public void afterThrowingFindAccountsAdvice(JoinPoint theJoinPoint, Throwable theExc) {
		String method = theJoinPoint.getSignature().toShortString();
		myLogger.info("\nExecuting @AfterThrowing on method: " + method);
		myLogger.info("\nThe exception is: " + theExc);
	
	}
	
	@AfterReturning(
			pointcut="execution(* com.luv2code.aopdemo.dao.AccountDAO.findAccounts(..))",
			returning="result")
	public void afterReturningFindAccountsAdvice(
					JoinPoint theJoinPoint, List<Account> result) {
		String method = theJoinPoint.getSignature().toShortString();
		myLogger.info("\nExecuting @AfterReturning on method: " + method);
		myLogger.info("\nresult is: " + result);
		convertAccountNamesToUpperCase(result);
		myLogger.info("\nresult is: " + result);
	}

	private void convertAccountNamesToUpperCase(List<Account> result) {
		for (Account tempAccount : result) {
			String theUpperName = tempAccount.getName().toUpperCase();
			tempAccount.setName(theUpperName);
		}

	}
	
	@Before("com.luv2code.aopdemo.aspect.LuvAopExpressions.forDaoPackageNoGetterSetter()")
	public void beforeAddAccountAdvice(JoinPoint theJoinPoint) {
		myLogger.info("\nExecuting @Before advice on method");	
		MethodSignature methodSig = (MethodSignature) theJoinPoint.getSignature();
		myLogger.info("Method: " + methodSig);
		Object[] args = theJoinPoint.getArgs();
		for (Object temp : args) {
			myLogger.info((String) temp);
			if (temp instanceof Account) {
				Account theAccount = (Account) temp;
				myLogger.info("account name: " + theAccount.getName());
				myLogger.info("account level: " + theAccount.getLevel());								
			}
		}
	}	
}










