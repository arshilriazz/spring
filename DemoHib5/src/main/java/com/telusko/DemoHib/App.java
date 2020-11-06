package com.telusko.DemoHib;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
        System.out.println( "Hello World!" );
        Aadhar aadhar = new Aadhar();
        aadhar.setId(1);
        aadhar.setAddress("Hyderabad, India");
        Alien alien = new Alien();
        alien.setId(103);
        alien.setColor("red");
        alien.setName("Alien3");
        alien.setAadhar(aadhar);
        Configuration con = new Configuration().configure().addAnnotatedClass(Alien.class).addAnnotatedClass(Aadhar.class);
        SessionFactory sf = con.buildSessionFactory();
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();
        session.save(alien);
        tx.commit();
    }
}
