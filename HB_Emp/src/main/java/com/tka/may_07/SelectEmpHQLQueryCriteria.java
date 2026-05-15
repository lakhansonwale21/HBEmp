package com.tka.may_07;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class SelectEmpHQLQueryCriteria {
	
	public static void main(String[] args) {
		SessionFactory factory =  new Configuration().configure("hibernate.cfg.xml")  .buildSessionFactory();
		Session snn = factory.openSession();
		
		Criteria cri = snn.createCriteria(Employee.class);
		
		List<Employee> resultList = cri.list();
		
		for(Employee e : resultList) {
			System.out.println(e.toString());
			
		}
	
	}
		
}
