package com.lamv.aopdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.lamv.aopdemo.dao.AccountDAO;
import com.lamv.aopdemo.dao.MembershipDAO;

public class MainDemoApp {

	public static void main(String[] args) {

		// read spring config java class
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);

		// get the bean from spring container
		AccountDAO theAccountDAO = context.getBean("accountDAO", AccountDAO.class);
		
		MembershipDAO theMembershipDAO = context.getBean("membershipDAO", MembershipDAO.class);

		// call the business method
		Account myAccount = new Account();
		myAccount.setName("Madhu");
		myAccount.setLevel("Platinum");
		
		theAccountDAO.addAccount(myAccount, true);
		theAccountDAO.doWork();
		
		theAccountDAO.setName("foobar");
		theAccountDAO.setServiceCode("silver");
		theAccountDAO.getName();
		theAccountDAO.getServiceCode();
		
		theMembershipDAO.addSillyMember();
		theMembershipDAO.goToSleep();
		
		// close the context
		context.close();

	}

}
