package com.lamv.aopdemo.dao;

import org.springframework.stereotype.Component;

@Component
public class MembershipDAO {

	public boolean addSillyMember() {
		
		System.out.println(getClass() + " :DOING MY DB WORK: ADDING A MEMBERSHIP ACCOUNT");
		
		return true;
	}
	
}
