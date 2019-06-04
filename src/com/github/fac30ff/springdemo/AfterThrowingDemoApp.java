package com.github.fac30ff.springdemo;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.github.fac30ff.springdemo.config.DemoConfig;
import com.github.fac30ff.springdemo.dao.AccountDAO;

public class AfterThrowingDemoApp {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);
		AccountDAO acBean = context.getBean("accountDAO", AccountDAO.class);
		try {
			boolean tripWire = true;
			List<Account> findAccounts = acBean.findAccounts(true);
		} catch (Exception e) {
			System.out.println("\n caught exception" + e);
		}
		
		context.close();
	}

}
