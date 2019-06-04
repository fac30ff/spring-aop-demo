package com.github.fac30ff.springdemo.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
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
	@Order(Integer.MIN_VALUE)
	public void beforeAddAccountAdviceOnlyForAccount() {
		System.out.println("\n ====> specific for 1 class");
	}
	
	@Before("execution(* add*(com.github.fac30ff.springdemo.Account, ..))")
	@Order(1)
	public void beforeAddMethodsWithAnyParameters() {
		System.out.println("\n ====> any add methods with any parameters");
	}
	
	@Pointcut("execution(* com.github.fac30ff.springdemo.dao.*.*(..))")
	public void anyMethodInSpecificPackage() {
		
	}
	
	@Pointcut("execution(* *.*(..))")
	public void anyMethodInAnyPackage() {
		
	}
	
	@Before("anyMethodInSpecificPackage()")
	public void reusePointcutAnnotatedMethod() {
		System.out.println("reused pointcut expression");
	}
	
	@Pointcut("anyMethodInAnyPackage() && anyMethodInSpecificPackage()")
	public void combiningPointcuts() {
		System.out.println("pointcuts combining");
	}
	
	@Pointcut("execution(* com.github.fac30ff.springdemo.Account.get*())")
	public void allGettersInAccount() {
		
	}
	
	@Pointcut("execution(* com.github.fac30ff.springdemo.Account.set*(..))")
	public void allSettersInAccount() {
		
	}	
	
	@Pointcut("anyMethodInAnyPackage() && !(allGettersInAccount() || allSettersInAccount())")
	public void anyMethodWithoutGettersOrSetters() {
		
	}
}
