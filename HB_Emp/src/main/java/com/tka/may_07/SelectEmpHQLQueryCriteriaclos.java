package com.tka.may_07;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;

import com.mysql.cj.x.protobuf.MysqlxCrud.Projection;

public class SelectEmpHQLQueryCriteriaclos {

	public static void main(String[] args) {

		SessionFactory factory =  new Configuration().configure("hibernate.cfg.xml")  .buildSessionFactory();
		Session snn = factory.openSession();
		
		Criteria cri = snn.createCriteria(Employee.class);
		
		ProjectionList plist = Projections.projectionList().add(Projections.property("name")).add(Projections.property("role"));
		cri.setProjection(plist);
		
		List<Object[]> resultList = cri.list();
		
		for(Object[] rows : resultList) {
			for(Object cols : rows) {
				System.out.print(cols + " , ");
			}
			System.out.println();
		}
		
	}

}
