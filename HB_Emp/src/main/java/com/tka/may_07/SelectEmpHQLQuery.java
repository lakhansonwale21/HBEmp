package com.tka.may_07;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class SelectEmpHQLQuery {

	public static void main(String[] args) {
		
		SessionFactory factory =  new Configuration().configure("hibernate.cfg.xml")  .buildSessionFactory();
		Session snn = factory.openSession();
		
		Query query = snn.createQuery("from Employee");
		
		List<Employee> resultList = query.getResultList();
		
		for (Employee e : resultList) {
			System.out.println(e.toString());
			
		}
		
	}
	
}
