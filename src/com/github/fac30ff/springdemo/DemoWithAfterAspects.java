package com.github.fac30ff.springdemo;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.github.fac30ff.springdemo.config.DemoConfig;
import com.github.fac30ff.springdemo.dao.AccountDAO;

public class DemoWithAfterAspects {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);
		AccountDAO acBean = context.getBean("accountDAO", AccountDAO.class);
		List<Account> findAccounts = acBean.findAccounts();
		context.close();
	}

}
