package com.ibm;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.ibm.model.Customer;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        try {
        	SessionFactory sessionFactory=new Configuration().configure().addAnnotatedClass(Customer.class).buildSessionFactory();
        	Session session=sessionFactory.openSession();
        	session.getTransaction().begin();
        	session.persist(new Customer("John Doe", "Calofornia"));
        	session.getTransaction().commit();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
    }
}
