package com.tka.may_07;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

public class SelectEmpHQLQueryCriteriaRowsColmn {

	public static void main(String[] args) {

		SessionFactory facto = new Configuration().configure().buildSessionFactory();
		Session snn = facto.openSession();
		
		Criteria cri = snn.createCriteria(Employee.class);
		
		cri.add(Restrictions.gt("salary", 50000.00));
		cri.add(Restrictions.eq("role", "dev"));
		
		ProjectionList plist = Projections.projectionList()
				.add(Projections.property("name"))
				.add(Projections.property("salary"));
		
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
