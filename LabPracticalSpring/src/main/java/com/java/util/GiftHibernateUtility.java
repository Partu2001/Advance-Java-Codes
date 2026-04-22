package com.java.util;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import com.java.entity.HibernateGift;

@org.springframework.context.annotation.Configuration
@Component
public class GiftHibernateUtility {

   @Bean	
   public static Session getsession() {	
		Configuration cfg=new Configuration();
		cfg.configure().addAnnotatedClass(HibernateGift.class);
		SessionFactory factory=cfg.buildSessionFactory();
		Session session=factory.openSession();
		return session;
		
	}
}
