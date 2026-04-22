package com.java.daointerface;

import java.util.List;

import com.java.entity.HibernateGift;

public interface GiftHibernateInterface {
	
	int addGift(HibernateGift hg);
	int deleteGift(HibernateGift hg);
	List<HibernateGift> getAllGift();
	int updateGift(HibernateGift hg);

}
