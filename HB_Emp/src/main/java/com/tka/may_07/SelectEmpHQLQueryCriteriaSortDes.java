package com.tka.may_07;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Order;
import org.hibernate.query.Query;

public class SelectEmpHQLQueryCriteriaSortDes {

	public static void main(String[] args) {
		
		SessionFactory facto = new Configuration().configure().buildSessionFactory();
		Session snn = facto.openSession();
		
//		Query query = snn.createQuery("from Employee ORDER BY salary DESC");
//		
//		List<Employee> resultList = query.getResultList();
		
		
		Criteria cri = snn.createCriteria(Employee.class);
		
		cri.addOrder(Order.desc("salary"));
		
		List<Employee> resultList = cri.list();
		
		for(Employee e : resultList) {
			System.out.println(e.toString());
		}
		
	}
	
}
