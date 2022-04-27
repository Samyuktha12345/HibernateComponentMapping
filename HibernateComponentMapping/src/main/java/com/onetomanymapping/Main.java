package com.onetomanymapping;

import java.util.ArrayList;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class Main {
public static void main(String[]args)
{
	SessionFactory factory=new Configuration().configure().buildSessionFactory();
	
	Session ses=factory.openSession();
	Transaction tx=ses.beginTransaction();
	Question q=new Question();
	q.setQname("Features of Java");
	
	Answer a=new Answer();
	a.setId(1);
	a.setSolution("Secure");
	a.setQue(q);
	
	Answer a1=new Answer();
	a1.setId(2);
	a1.setSolution("Platform Independent");
	a1.setQue(q);
	
	Answer a2=new Answer();
	a2.setId(3);
	a2.setSolution("Multithreaded");
	a2.setQue(q);
	List<Answer>list=new ArrayList<Answer>();
	list.add(a);
	list.add(a1);
	list.add(a2);
	
	q.setAns(list);
	ses.save(q);
	ses.save(a);
	ses.save(a1);
	ses.save(a2);
	/*Query query = ses.createQuery("from Answer");
List<Answer>list1=query.list();
	for(Answer ans:list1)
	{
		System.out.println("ans id:"+ans.getId()+",ans solution:"+ans.getSolution());
	}*/
	tx.commit();
	ses.close();
	factory.close();
}
}
