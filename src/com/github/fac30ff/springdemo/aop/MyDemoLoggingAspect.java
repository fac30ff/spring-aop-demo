package com.github.fac30ff.springdemo.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyDemoLoggingAspect {
	//this is where we add all of our related advices for logging
	@Before("execution(* add*())")
	public void beforeAddAccountAdvice() {
		System.out.println("\n ====> executing @before advice method on any add method");
	}
	
	@Before("execution(public void com.github.fac30ff.springdemo.dao.AccountDAO.addAccount())")
	public void beforeAddAccountAdviceOnlyForAccount() {
		System.out.println("\n ====> specific for 1 class");
	}
	
	@Before("execution(* add*(..))")
	public void beforeAddMethodsWithAnyParameters() {
		System.out.println("\n ====> any add methods with any parameters");
	}
}
