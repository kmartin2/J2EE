package com.gcit.library.hibernate.entity;

// Generated Sep 27, 2013 2:06:00 PM by Hibernate Tools 3.4.0.CR1

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class BookCopies.
 * @see com.gcit.library.hibernate.entity.BookCopies
 * @author Hibernate Tools
 */
@Stateless
public class BookCopiesHome {

	private static final Log log = LogFactory.getLog(BookCopiesHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(BookCopies transientInstance) {
		log.debug("persisting BookCopies instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(BookCopies persistentInstance) {
		log.debug("removing BookCopies instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public BookCopies merge(BookCopies detachedInstance) {
		log.debug("merging BookCopies instance");
		try {
			BookCopies result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public BookCopies findById(BookCopiesId id) {
		log.debug("getting BookCopies instance with id: " + id);
		try {
			BookCopies instance = entityManager.find(BookCopies.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
