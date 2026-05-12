package com.tka.may_07;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class CrudStu {
	
	void create () {
		Configuration config = new Configuration();
		config.configure("hibernate.cfg.xml");
		SessionFactory factory = config.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx =  session.beginTransaction();
		Student st= new Student(1012,"Rohan", "Nanded", 45687135);
		session.save(st);
		
		tx.commit();
		session.close();
		System.out.println("Created Successfully");
		
		
	}
	
	void read () {
		
		Configuration config = new Configuration();
		config.configure("hibernate.cfg.xml");
		SessionFactory factory = config.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx =  session.beginTransaction();
		
		Student st = (Student) session.get(Student.class, 1011);
		System.out.println("student obj record="+ st);
		
		tx.commit();
		session.close();
		System.out.println("Select successfully");
		
	}
	
	void update() {
		
		Configuration config = new Configuration();
		config.configure("hibernate.cfg.xml");
		SessionFactory factory = config.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx =  session.beginTransaction();
		Student st= new Student(1011,"Rahul", "Nanded", 45687135);
		session.update(st);
		
		tx.commit();
		session.close();
		System.out.println("Updated Successfully");
		
	}
	
	void delete () {
		
		Configuration config = new Configuration();
		config.configure("hibernate.cfg.xml");
		SessionFactory factory = config.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx =  session.beginTransaction();
		Student st= new Student(1011,"Rohan", "Nanded", 45687135);
		session.delete(st);
		
		tx.commit();
		session.close();
		System.out.println("deleted Successfully");
		
	}

}
