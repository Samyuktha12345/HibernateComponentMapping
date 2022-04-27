package com.onetoonemapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainOne2One {
	public static void main( String[] args )
    {
    	SessionFactory factory= new Configuration().configure().buildSessionFactory();
      	
    	Session ses= factory.openSession();
    	Transaction tx=ses.beginTransaction();
    	Que q=new Que();
    	q.setId(12);
    	q.setQ_Name("what is JDK");
    	
    	Ans a=new Ans();
    	a.setA_id(102);
    	a.setA_sol("JAVA DEVELOPMENT KIT");
    	q.setA_id(a);
    	
    	//ses.save(q);
    	//ses.save(a);
    	Que q1=(Que)ses.load(Que.class,11);
    	ses.delete(q1);
    	System.out.println("Deleted Successfully");
    	Ans a1=(Ans)ses.load(Ans.class,101);
    	ses.delete(a1);
    	System.out.println("Deleted Successfully");
    	tx.commit();
    	ses.close();
    	factory.close();
}
}
