package com.tka.may_07;
	
	import java.util.List;

	import org.hibernate.Criteria;
	import org.hibernate.Session;
	import org.hibernate.SessionFactory;
	import org.hibernate.cfg.Configuration;
	import org.hibernate.criterion.Projections;
	import org.hibernate.criterion.Restrictions;
	import org.hibernate.query.Query;

public class SelectEmpHQLQueryCriteriaCountCondn {

		public static void main(String[] args) {
			
			SessionFactory facto = new Configuration().configure().buildSessionFactory();
			Session snn = facto.openSession();
			
			Criteria cri = snn.createCriteria(Employee.class);
			
			cri.add(Restrictions.eq("role", "dev"));
			cri.add(Restrictions.gt("salary", 60000.00));
			
			cri.setProjection(Projections.rowCount());

	        Long count = (Long) cri.uniqueResult();
			
				System.out.println(count);
			
		}
		
	}

	
