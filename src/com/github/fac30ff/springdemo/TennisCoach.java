package com.github.fac30ff.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component("TennisCoach")
public class TennisCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Practice your backhand volley";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return null;
	}
	
	//define init method
	//in java 9 javax annotation do not workable
	@PostConstruct
	public void doMyStartupStuff() {
		System.out.println("do my startup stuff");
	}
	
	//define destroy method
	//same as init method this problem within eclipse bug
	@PreDestroy
	public void doMyClenupStuff() {
		System.out.println("do my clean up stuff");
	}

}
