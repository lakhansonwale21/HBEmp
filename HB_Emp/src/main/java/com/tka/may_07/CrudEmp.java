package com.tka.may_07;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class CrudEmp {
		
	void create () {
		Configuration config = new Configuration();
		config.configure("hibernate.cfg.xml");
		SessionFactory factory = config.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx =  session.beginTransaction();
		Employee emp= new Employee(102, "raj", "dev", 55000.00);
		session.save(emp);
		
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
		
		Employee e1 = (Employee) session.get(Employee.class, 101);
		System.out.println("Employee obj record="+ e1);
		
		tx.commit();
		session.close();
		System.out.println("Select successfully");
		
	}
	
	String update() {
		
		Configuration config = new Configuration();
		config.configure("hibernate.cfg.xml");
		SessionFactory factory = config.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx =  session.beginTransaction();
		Employee emp= new Employee(101, "rajveer", "dev", 55000.00);
		session.update(emp);
		
		tx.commit();
		session.close();
		return "Updated Successfully";
		
	}
	
	void delete () {
		
		Configuration config = new Configuration();
		config.configure("hibernate.cfg.xml");
		SessionFactory factory = config.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx =  session.beginTransaction();
		Employee emp= new Employee(101, "raj", "dev", 55000.00);
		session.delete(emp);
		
		tx.commit();
		session.close();
		System.out.println("deleted Successfully");
		
	}

}
