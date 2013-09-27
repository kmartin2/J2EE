package com.gcit.library.hibernate.entity;

// Generated Sep 27, 2013 2:06:00 PM by Hibernate Tools 3.4.0.CR1

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class Libraryborrower.
 * @see com.gcit.library.hibernate.entity.Libraryborrower
 * @author Hibernate Tools
 */
@Stateless
public class LibraryborrowerHome {

	private static final Log log = LogFactory.getLog(LibraryborrowerHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Libraryborrower transientInstance) {
		log.debug("persisting Libraryborrower instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Libraryborrower persistentInstance) {
		log.debug("removing Libraryborrower instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Libraryborrower merge(Libraryborrower detachedInstance) {
		log.debug("merging Libraryborrower instance");
		try {
			Libraryborrower result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Libraryborrower findById(String id) {
		log.debug("getting Libraryborrower instance with id: " + id);
		try {
			Libraryborrower instance = entityManager.find(
					Libraryborrower.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
