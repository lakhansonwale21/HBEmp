package com.tka.may_07;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class SelectEmpSQLQuery {

	public static void main(String[] args) {
		
		SessionFactory factory =  new Configuration().configure("hibernate.cfg.xml")  .buildSessionFactory();
		Session snn = factory.openSession();
		
		Query objQuery=snn.createNativeQuery("select * fom employee");
		
		Object[][] resultList = null;
		for(Object[] rows : resultList ) {
			for(Object cols : rows) {
				System.out.println(cols + ",");
			}
	
		System.out.println();
		}
		
	}
}
