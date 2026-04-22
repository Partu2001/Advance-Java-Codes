package com.java.daoimplement;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.java.daointerface.GiftHibernateInterface;
import com.java.entity.HibernateGift;

@Repository
public class GiftHibernateImplementation implements GiftHibernateInterface {
	
	@Autowired
	Session session;

	@Override
	public int addGift(HibernateGift hg) {
		Transaction tx=session.beginTransaction();
	   int result= (int) session.save(hg);
	    tx.commit();
	    return result;
	   
	}

	@Override
	public int updateGift(HibernateGift hg) {
		Transaction tx=session.beginTransaction();
		session.update(hg);
		tx.commit();
		
		return 0;
	}

	@Override
	public int deleteGift(HibernateGift hg) {
		Transaction tx=session.beginTransaction();
		session.delete(hg);
		tx.commit();
		return 0;
	}

	@Override
	public List<HibernateGift> getAllGift() {
		
		return null;
	}

}
