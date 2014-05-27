package br.com.pi.teresina.cine.modelo.dao;

// Generated 26/05/2014 22:06:43 by Hibernate Tools 3.4.0.CR1

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import br.com.pi.teresina.cine.modelo.Cinema;

/**
 * Home object for domain model class Cinema.
 * @see modelo.Cinema
 * @author Hibernate Tools
 */
@Stateless
public class CinemaHome {

	private static final Log log = LogFactory.getLog(CinemaHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Cinema transientInstance) {
		log.debug("persisting Cinema instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Cinema persistentInstance) {
		log.debug("removing Cinema instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Cinema merge(Cinema detachedInstance) {
		log.debug("merging Cinema instance");
		try {
			Cinema result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Cinema findById(Integer id) {
		log.debug("getting Cinema instance with id: " + id);
		try {
			Cinema instance = entityManager.find(Cinema.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
