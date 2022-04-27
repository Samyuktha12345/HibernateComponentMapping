package com.hibernate1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class One2OneMain {

	public static void main(String[] args) {
SessionFactory factory= new Configuration().configure().buildSessionFactory();
      	
    	Session ses= factory.openSession();
    	Transaction tx=ses.beginTransaction();
Product p=new Product();
p.setProdid(105);
p.setProdname("Boost");
p.setPrice(1300);
Supplier s=new Supplier();
s.setSuppilerID(11);
s.setSupplierName("Manish");
s.setSupplierAddress("Hyderabad");
s.setSupplierPhone(6258485);
p.setSupplierid(s);

ses.save(p);
ses.save(s);

tx.commit();
ses.close();
factory.close();
	}

}
