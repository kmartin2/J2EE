package com.gcit.library.hibernate.entity;

// Generated Sep 27, 2013 2:06:00 PM by Hibernate Tools 3.4.0.CR1

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class Librarian.
 * @see com.gcit.library.hibernate.entity.Librarian
 * @author Hibernate Tools
 */
@Stateless
public class LibrarianHome {

	private static final Log log = LogFactory.getLog(LibrarianHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Librarian transientInstance) {
		log.debug("persisting Librarian instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Librarian persistentInstance) {
		log.debug("removing Librarian instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Librarian merge(Librarian detachedInstance) {
		log.debug("merging Librarian instance");
		try {
			Librarian result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Librarian findById(String id) {
		log.debug("getting Librarian instance with id: " + id);
		try {
			Librarian instance = entityManager.find(Librarian.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
