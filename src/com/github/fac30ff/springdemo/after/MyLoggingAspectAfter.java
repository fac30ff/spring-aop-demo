package com.github.fac30ff.springdemo.after;

import java.util.List;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import com.github.fac30ff.springdemo.Account;

@Aspect
@Component
public class MyLoggingAspectAfter {
	@AfterReturning(pointcut="execution(* *.find*(..))", returning="result")
	public void afterReturningFindAccountsAdvice(JoinPoint joinPoint, List<Account> result) {
		result.forEach(System.out::println);
		
		convertAccountNameToUpperCase(result);
		result.forEach(System.out::println);
	}

	private void convertAccountNameToUpperCase(List<Account> result) {
		result.forEach(e -> e.setName(e.getName().toUpperCase()));
	}
	
	@AfterThrowing(pointcut="execution(* *.find*(..))", throwing="npe")
	public void afterThrowingFindAccountsAdvice(JoinPoint joinPoint, Throwable npe) {
		System.out.println("this method: " + joinPoint.getSignature().toShortString() + " throwing this exception: " + npe.getClass().getCanonicalName());
	}

}
