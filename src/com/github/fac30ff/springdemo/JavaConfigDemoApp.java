package com.github.fac30ff.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigDemoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create context from configuration files
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfiguration.class);
		//Java configuration bean
		Coach swimCoach = context.getBean("swimCoach", Coach.class);
		//call method on the bean
		System.out.println(swimCoach.getDailyWorkout());
		System.out.println(swimCoach.getDailyFortune());
		System.out.println(((SwimCoach) swimCoach).getTeam());
		System.out.println(((SwimCoach) swimCoach).getEmail());
		//close context
		context.close();
	}
}
