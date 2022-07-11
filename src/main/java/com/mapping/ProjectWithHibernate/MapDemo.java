package com.mapping.ProjectWithHibernate;

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
		
		Question que=new Question();
		que.setQuetionId(101);
        que.setQuetion("what is java ?");
        
        Answer ans=new Answer();
        ans.setAnswerId(101);
        ans.setAnswer("java is higly secure!");
        
        Answer an1 =new Answer();
		an1.setAnswerId(102);
		an1.setAnswer("java is robust!");
		
		Answer an2 =new Answer();
		an2.setAnswerId(103);
		an2.setAnswer("java is object oriented !");
		
		List<Answer> list=new ArrayList<Answer>();
		list.add(ans);
	    list.add(an1);
		list.add(an2);
		
	    que.setAnswer(list);
	    
	    Session session=factory.openSession();
	    
	    Transaction tx=session.beginTransaction();
	    
	    session.save(que);
	    session.save(ans);
	    session.save(an1);
	    session.save(an2);
	    
	    tx.commit();
	    
	    Question q=(Question)session.get(Question.class, 101);
	    System.out.println(q.getQuetion());
	    
	    for(Answer a:q.getAnswer()) {
	    	System.out.println(a.getAnswer());
	    }
	    
	    session.close();
	    factory.close();
		
	}
	
	
	
}
