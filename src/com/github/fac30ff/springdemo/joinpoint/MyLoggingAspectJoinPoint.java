package com.github.fac30ff.springdemo.joinpoint;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(2)
public class MyLoggingAspectJoinPoint {
	@Before("execution(* add*(..))")
	public void someAspectwithJoinPoint(JoinPoint joinPoint) {
		System.out.println("\n executing before any add method");
		MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
		System.out.println("Method: "+ methodSignature);
		Object[] args = joinPoint.getArgs();
		for (Object object : args) {
			System.out.println("\n methods: " + object);
		}
	}
}
