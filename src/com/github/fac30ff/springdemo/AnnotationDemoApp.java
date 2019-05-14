package com.github.fac30ff.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create context from configuration files
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		//get bean from container
		Coach coach = context.getBean("TennisCoach", Coach.class);
		//default bin id
		Coach deCoach = context.getBean("defaultCoach", Coach.class);
		
		Coach consCoach = context.getBean("constructorInjectionCoach", Coach.class);
		System.out.println(consCoach.getDailyFortune());
		
		
		//call method on the bean
		System.out.println(coach.getDailyWorkout());
		System.out.println(deCoach.getDailyWorkout());
		
		//close context
		context.close();
	}

}
