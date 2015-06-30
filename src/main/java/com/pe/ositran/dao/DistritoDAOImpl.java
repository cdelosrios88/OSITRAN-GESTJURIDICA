package com.pe.ositran.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.pe.ositran.model.Distrito;

public class DistritoDAOImpl implements DistritoDao{
	
	private SessionFactory sessionFactory;
	 
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

	public void save(Distrito p) {
		Session session = this.sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        session.persist(p);
        tx.commit();
        session.close();
	}

	@SuppressWarnings("unchecked")
	public List<Distrito> list() {
		Session session = this.sessionFactory.openSession();
		List<Distrito> personList = session.createQuery("from Distrito").list();
        session.close();
        return personList;
	}

}
