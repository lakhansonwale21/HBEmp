package com.tka.may_07;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class stuhb {

	public static void main(String[] args) {
		
		
		Configuration config = new Configuration();
		config.configure("hibernate.cfg.xml");
		SessionFactory factory = config.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx =  session.beginTransaction();
		Student st= new Student(2,"Raviraj","Latur",56867793);
		//session.save(st);
		tx.commit();
		
		st = (Student) session.get(Student.class, 2);
		System.out.println("student obj record="+ st.name);
		
		session.close();
		System.out.println("Record saved successfully");
		
	}
}
