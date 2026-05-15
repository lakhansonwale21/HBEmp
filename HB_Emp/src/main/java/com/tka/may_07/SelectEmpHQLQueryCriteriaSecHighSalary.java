package com.tka.may_07;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Order;

public class SelectEmpHQLQueryCriteriaSecHighSalary {

	public static void main(String[] args) {
		
		SessionFactory facto = new Configuration().configure().buildSessionFactory();
		Session snn  = facto.openSession();
		
		Criteria cri = snn.createCriteria(Employee.class);
		 cri.addOrder(Order.desc("salary"));
	        cri.setFirstResult(1);

	        cri.setMaxResults(1);
	        
	     List<Employee> resultList = cri.list();
	     
	     for(Employee e : resultList) {
	    	   System.out.println(e.toString());
	     }

		
		
	}
	
}
