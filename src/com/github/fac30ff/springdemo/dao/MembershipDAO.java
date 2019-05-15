package com.github.fac30ff.springdemo.dao;

import org.springframework.stereotype.Component;

@Component
public class MembershipDAO {
	public String addAccount() {
		System.out.println(getClass() + ": doing stuff: adding membership account");
		return "";
	}
	
	public void addSillyMember() {
		System.out.println(getClass() + ": another add method");
	}
	
	public void goToSleep() {
		System.out.println(getClass() + ": I am going sleep now...");
	}
}
