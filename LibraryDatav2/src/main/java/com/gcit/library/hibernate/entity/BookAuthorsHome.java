package com.gcit.library.hibernate.entity;

// Generated Sep 27, 2013 2:06:00 PM by Hibernate Tools 3.4.0.CR1

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class BookAuthors.
 * @see com.gcit.library.hibernate.entity.BookAuthors
 * @author Hibernate Tools
 */
@Stateless
public class BookAuthorsHome {

	private static final Log log = LogFactory.getLog(BookAuthorsHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(BookAuthors transientInstance) {
		log.debug("persisting BookAuthors instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(BookAuthors persistentInstance) {
		log.debug("removing BookAuthors instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public BookAuthors merge(BookAuthors detachedInstance) {
		log.debug("merging BookAuthors instance");
		try {
			BookAuthors result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public BookAuthors findById(BookAuthorsId id) {
		log.debug("getting BookAuthors instance with id: " + id);
		try {
			BookAuthors instance = entityManager.find(BookAuthors.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
