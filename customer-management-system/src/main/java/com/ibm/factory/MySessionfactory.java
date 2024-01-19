package com.ibm.factory;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.ibm.model.Customer;

public class MySessionfactory {
	
	private static SessionFactory sessionFactory;
	
	static
	{
		try {
			sessionFactory=new Configuration().configure().addAnnotatedClass(Customer.class).buildSessionFactory();	
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	
	public static SessionFactory getSessionFactory()
	{
		return sessionFactory;
	}

}
