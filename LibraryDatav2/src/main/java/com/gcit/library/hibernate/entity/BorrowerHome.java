package com.gcit.library.hibernate.entity;

// Generated Sep 27, 2013 2:06:00 PM by Hibernate Tools 3.4.0.CR1

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class Borrower.
 * @see com.gcit.library.hibernate.entity.Borrower
 * @author Hibernate Tools
 */
@Stateless
public class BorrowerHome {

	private static final Log log = LogFactory.getLog(BorrowerHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Borrower transientInstance) {
		log.debug("persisting Borrower instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Borrower persistentInstance) {
		log.debug("removing Borrower instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Borrower merge(Borrower detachedInstance) {
		log.debug("merging Borrower instance");
		try {
			Borrower result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Borrower findById(int id) {
		log.debug("getting Borrower instance with id: " + id);
		try {
			Borrower instance = entityManager.find(Borrower.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
