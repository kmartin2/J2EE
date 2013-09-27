package com.gcit.library.hibernate.entity;

// Generated Sep 27, 2013 2:06:00 PM by Hibernate Tools 3.4.0.CR1

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class Publisher.
 * @see com.gcit.library.hibernate.entity.Publisher
 * @author Hibernate Tools
 */
@Stateless
public class PublisherHome {

	private static final Log log = LogFactory.getLog(PublisherHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Publisher transientInstance) {
		log.debug("persisting Publisher instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Publisher persistentInstance) {
		log.debug("removing Publisher instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Publisher merge(Publisher detachedInstance) {
		log.debug("merging Publisher instance");
		try {
			Publisher result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Publisher findById(String id) {
		log.debug("getting Publisher instance with id: " + id);
		try {
			Publisher instance = entityManager.find(Publisher.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
