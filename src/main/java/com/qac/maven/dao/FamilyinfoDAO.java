package com.qac.maven.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.qac.maven.Entity.Familyinfo;

    
public class FamilyinfoDAO {
	private SessionFactory factory =null;
	public FamilyinfoDAO() {
		Configuration configuration = new Configuration();
		configuration.configure();
		 factory =configuration.buildSessionFactory();
		
	}
	public void getAll() {
		
		Session session=factory.openSession();
	
		Familyinfo familyinfo= session.get(Familyinfo.class, 1);
		Familyinfo familyinfo1= session.get(Familyinfo.class, 2);
		Familyinfo familyinfo2= session.get(Familyinfo.class, 3);
		Familyinfo familyinfo3= session.get(Familyinfo.class, 4);
		Familyinfo familyinfo4= session.get(Familyinfo.class, 5);
		Familyinfo familyinfo5= session.get(Familyinfo.class, 6);
		Familyinfo familyinfo6= session.get(Familyinfo.class, 7);
		Familyinfo familyinfo7= session.get(Familyinfo.class, 8);
		Familyinfo familyinfo8= session.get(Familyinfo.class, 13);
		Familyinfo familyinfo9= session.get(Familyinfo.class, 22);
		
		
		System.out.println(familyinfo);
		System.out.println(familyinfo1);
		System.out.println(familyinfo2);
		System.out.println(familyinfo3);
		System.out.println(familyinfo4);
		System.out.println(familyinfo5);
		System.out.println(familyinfo6);
		System.out.println(familyinfo7);
		System.out.println(familyinfo8);
		System.out.println(familyinfo9);
		
		}
	public void save(Familyinfo family) {
		Session session = factory.openSession();
		Transaction transaction= session.beginTransaction();
		session.save(family);
		System.out.println("data saved ");
		transaction.commit();
		session.close();
		
	}
	public void delete(Familyinfo family) {
		Session session = factory.openSession();
		Transaction transaction= session.beginTransaction();
		session.remove(family);
		System.out.println("data deleted ");
		transaction.commit();
		session.close();
	}
	
	public void update(String email,int id) {
		Session session= factory.openSession();
		
		Familyinfo familyinfo=session.get(Familyinfo.class,4 );
		familyinfo.setEmail(email);
		Transaction transaction= session.beginTransaction();
		session.save(familyinfo);
		System.out.println("data updated");
		transaction.commit();
		
		session.close();
		}
}


