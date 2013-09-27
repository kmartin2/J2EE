package com.gcit.library.hibernate.entity;

// Generated Sep 27, 2013 2:06:00 PM by Hibernate Tools 3.4.0.CR1

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class LibraryBranch.
 * @see com.gcit.library.hibernate.entity.LibraryBranch
 * @author Hibernate Tools
 */
@Stateless
public class LibraryBranchHome {

	private static final Log log = LogFactory.getLog(LibraryBranchHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(LibraryBranch transientInstance) {
		log.debug("persisting LibraryBranch instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(LibraryBranch persistentInstance) {
		log.debug("removing LibraryBranch instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public LibraryBranch merge(LibraryBranch detachedInstance) {
		log.debug("merging LibraryBranch instance");
		try {
			LibraryBranch result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public LibraryBranch findById(int id) {
		log.debug("getting LibraryBranch instance with id: " + id);
		try {
			LibraryBranch instance = entityManager
					.find(LibraryBranch.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
