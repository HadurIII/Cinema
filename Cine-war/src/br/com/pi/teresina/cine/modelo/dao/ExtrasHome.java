package br.com.pi.teresina.cine.modelo.dao;

// Generated 26/05/2014 22:06:43 by Hibernate Tools 3.4.0.CR1

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import br.com.pi.teresina.cine.modelo.Extras;

/**
 * Home object for domain model class Extras.
 * @see modelo.Extras
 * @author Hibernate Tools
 */
@Stateless
public class ExtrasHome {

	private static final Log log = LogFactory.getLog(ExtrasHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Extras transientInstance) {
		log.debug("persisting Extras instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Extras persistentInstance) {
		log.debug("removing Extras instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Extras merge(Extras detachedInstance) {
		log.debug("merging Extras instance");
		try {
			Extras result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Extras findById(int id) {
		log.debug("getting Extras instance with id: " + id);
		try {
			Extras instance = entityManager.find(Extras.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
