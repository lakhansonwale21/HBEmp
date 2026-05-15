package com.tka.may_07;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

public class SelectEmpHQLQueryCriteriaRowWise {

	public static void main(String[] args) {
		
		SessionFactory snfact = new Configuration().configure().buildSessionFactory();
		Session snn = snfact.openSession();
		
		Criteria cri = snn.createCriteria(Employee.class);
		
		cri.add(Restrictions.gt("salary", 60000.00));
		cri.add(Restrictions.eq("role", "dev"));
		
		List<Employee> resultList = cri.list();
		
		for (Employee rows : resultList) {
			System.out.print(rows+ " , ");
		}
		

	}

}
