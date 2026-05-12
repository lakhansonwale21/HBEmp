package com.tka.may_07;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class delete {
	public static void main(String[] args) {
		
		
		Configuration config = new Configuration();
		config.configure("hibernate.cfg.xml");
		SessionFactory factory = config.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx =  session.beginTransaction();
		
		Employee emp= new Employee(101, "rajveer", "dev", 58000.00);
		session.delete(emp);
		
		System.out.println("deleted record");
		
		tx.commit();
		session.close();
	
	}

}
