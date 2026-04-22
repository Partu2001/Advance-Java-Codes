package com.partu.main;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.hibernate.query.Query;

import com.partu.entity.EmpTable;

public class MainEmpTable3 {

	public static void main(String[] args) {
		
		Session session=HibernateConnectivity.getsession();
		Transaction tx=session.beginTransaction();
		
//		Query query = session.createQuery("select name, salary from EmpTable");
//  		 List <Object[]> list = query.list();
//  		 for(Object[] obj : list) {
//  		     System.out.println("Name: " + obj[0] + " Salary: " + obj[1]);
//  		 }
//  		 
		
		Criteria criteria=session.createCriteria(EmpTable.class);
		criteria.add(Restrictions.idEq(2));
		
		ProjectionList pl=Projections.projectionList();
		pl.add(Projections.property("name"));
		pl.add(Projections.property("salary"));
		criteria.setProjection(pl);
		
		Object[] e=(Object[]) criteria.uniqueResult();
		System.out.println(e[0]+ " " +e[1]);
		
  		 
	}
}
