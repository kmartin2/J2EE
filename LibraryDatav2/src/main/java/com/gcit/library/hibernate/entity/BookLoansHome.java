package com.gcit.library.hibernate.entity;

// Generated Sep 27, 2013 2:06:00 PM by Hibernate Tools 3.4.0.CR1

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class BookLoans.
 * @see com.gcit.library.hibernate.entity.BookLoans
 * @author Hibernate Tools
 */
@Stateless
public class BookLoansHome {

	private static final Log log = LogFactory.getLog(BookLoansHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(BookLoans transientInstance) {
		log.debug("persisting BookLoans instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(BookLoans persistentInstance) {
		log.debug("removing BookLoans instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public BookLoans merge(BookLoans detachedInstance) {
		log.debug("merging BookLoans instance");
		try {
			BookLoans result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public BookLoans findById(BookLoansId id) {
		log.debug("getting BookLoans instance with id: " + id);
		try {
			BookLoans instance = entityManager.find(BookLoans.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
