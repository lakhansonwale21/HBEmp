package com.tka.may_07;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SelectEmp {

	public static void main(String[] args) {
		
		Configuration config = new Configuration();
		config.configure("hibernate.cfg.xml");
		SessionFactory factory = config.buildSessionFactory();
		Session snn = factory.openSession();
		
		for(int i = 1; i<=10;i++) {
		Employee emp = snn.get(Employee.class, i);
		if(emp != null)
		System.out.println(emp);
		}
	}
	
}
