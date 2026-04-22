package com.partu.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import com.partu.entity.ProductInfo;

public class MainProductInfo {

	public static void main(String[] args) {
		
		Configuration cfg=new Configuration();
		cfg.configure().addAnnotatedClass(ProductInfo.class);
		SessionFactory factory=cfg.buildSessionFactory();
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		
		System.out.println("Table Create...");

		Scanner sc=new Scanner(System.in);
		
		List<ProductInfo> list=new ArrayList<ProductInfo>();
		
		System.out.println("Enter the  Number of Product Details:");
		int n=sc.nextInt();
		
		for(int i=0;i<=n;i++) {
			ProductInfo p=new ProductInfo();
			System.out.println("Enter Product Name :");
		    p.setName(sc.next());
		    
		    System.out.println("Enter Product Price :");
		    p.setPrice(sc.nextDouble());
		    
		    System.out.println("Enter Product Brand :");
		    p.setBrand(sc.next());
		    
		    System.out.println("Enter Product Date :");
		    p.setManufacturingdate(sc.next());
		    
		   
		    list.add(p);
		    
		 
		    
		}
		   for(ProductInfo pi:list) {
		    	session.save(pi);
		  
		    	 
				    System.out.println("Data inserted...");
		    }
		   
		   tx.commit();
		   
//		ProductInfo pget=session.get(ProductInfo.class,1);
//		System.out.println("Code Of Product :" +pget.getCode());
//		System.out.println("Name Of Product :" +pget.getName());
//		System.out.println("Brand Of Product :" + pget.getBrand());
//		System.out.println("Price Of Product :" +pget.getPrice());
//		System.out.println("Manfacture Data Of Product :" +pget.getManufacturingdate());
//		
//		ProductInfo pdelete=session.get(ProductInfo.class,4);
//		session.delete(pdelete);
//		tx.commit();
//		System.out.println("Data deleted...");
//		
//		ProductInfo pupdate=session.get(ProductInfo.class,1);
//		System.out.println(pupdate.getPrice());
//		double newPrice=(pupdate.getPrice()*5/100);
//		System.out.println(newPrice);
//		session.save(pupdate);
//		

		  
		
		
		
	}

}
