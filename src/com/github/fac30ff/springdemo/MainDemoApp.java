package com.github.fac30ff.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.github.fac30ff.springdemo.config.DemoConfig;
import com.github.fac30ff.springdemo.dao.AccountDAO;
import com.github.fac30ff.springdemo.dao.MembershipDAO;

public class MainDemoApp {

	public static void main(String[] args) {
		//read spring configuration java class
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);
		//get the bean from spring container
		AccountDAO aDao = context.getBean("accountDAO", AccountDAO.class);
		MembershipDAO mDao = context.getBean("membershipDAO", MembershipDAO.class);
		//call the business method
		aDao.addAccount();
		aDao.addAccount(new Account());
		mDao.addAccount();
		mDao.addSillyMember();
		//close the context
		context.close();
	}

}
