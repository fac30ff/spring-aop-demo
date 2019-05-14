package com.github.fac30ff.springdemo.dao;

import org.springframework.stereotype.Component;

import com.github.fac30ff.springdemo.Account;

@Component
public class AccountDAO {
	public void addAccount() {
		System.out.println(getClass() + ": doing my db work: adding an account");
	}
	
	public void addAccount(Account account) {
		System.out.println(getClass() + ": method with parameter " + account.toString());
	}
}
