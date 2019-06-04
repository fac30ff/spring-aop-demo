package com.github.fac30ff.springdemo.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.github.fac30ff.springdemo.Account;

@Component
public class AccountDAO {
	private String name;
	private String serviceCode;
	
	public void addAccount() {
		System.out.println(getClass() + ": doing my db work: adding an account");
	}
	
	public void addAccount(Account account) {
		System.out.println(getClass() + ": method with parameter " + account.toString());
	}
	
	public boolean doWork() {
		System.out.println(getClass() + ": doWork()");
		return true;
	}
	
	public List<Account> findAccounts() {
		List<Account> accounts = new ArrayList<Account>();
		accounts.add(new Account("a", "b"));
		accounts.add(new Account("abc", "def"));
		return accounts;
	}
	
	public List<Account> findAccounts(boolean b) {
		if (b) {
			throw new RuntimeException("exception simulation");
		}
		List<Account> accounts = new ArrayList<Account>();
		accounts.add(new Account("a", "b"));
		accounts.add(new Account("abc", "def"));
		return accounts;
	}
}
