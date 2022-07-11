package com.map;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MapDemo {

	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure();
		SessionFactory factory=cfg.buildSessionFactory();
		
		Employee e1=new Employee();
		Employee e2=new Employee();
		Employee e3=new Employee();
		
		
		e1.setEmp_id(10);
		e1.setE_name("sameer");
		
		e2.setEmp_id(20);
		e2.setE_name("kalpesh");
		
		e3.setEmp_id(30);
		e3.setE_name("suraj");

		Projects p1=new Projects();
		Projects p2=new Projects();
		Projects p3=new Projects();
		
		p1.setP_id(1010);
		p1.setP_name("project on hibernate");
		
		p2.setP_id(1020);
		p2.setP_name("project on spring boot");
		
		p3.setP_id(1030);
		p3.setP_name("project on maven");
		
		List<Employee> list1=new ArrayList<Employee>();
		list1.add(e1);
		list1.add(e2);
		list1.add(e3);
		
		List<Projects> list2=new ArrayList<Projects>();
		list2.add(p1);
		list2.add(p2);
		list2.add(p3);
		
		//one employee assign to two projects
		e1.setProject(list2);
		//one project assign to two employee
		p1.setEmp(list1);
		
		e2.setProject(list2);
		
		
		
		Session session=factory.openSession();
		
		Transaction tx=session.beginTransaction();
		
		session.save(e1);
		session.save(e2);
		session.save(p1);
		session.save(p2);
		session.save(e3);
		session.save(p3);
		
		
		
		tx.commit();
		session.close();
		factory.close();
		
		
	}
	
	
}
