package com.tka.may_07;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class select {
	public static void main(String[] args) {
		
		
		Configuration config = new Configuration();
		config.configure("hibernate.cfg.xml");
		SessionFactory factory = config.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx =  session.beginTransaction();
		
		Employee e1 = (Employee) session.get(Employee.class, 101);
		System.out.println("student obj record="+ e1);
		
		tx.commit();
		session.close();
		System.out.println("Select successfully");
	}

}
