package br.com.pi.teresina.cine.modelo.dao;

// Generated 26/05/2014 22:06:43 by Hibernate Tools 3.4.0.CR1

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import br.com.pi.teresina.cine.modelo.Bilhete;
import br.com.pi.teresina.cine.modelo.BilheteId;

/**
 * Home object for domain model class Bilhete.
 * @see modelo.Bilhete
 * @author Hibernate Tools
 */
@Stateless
public class BilheteHome {

	private static final Log log = LogFactory.getLog(BilheteHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Bilhete transientInstance) {
		log.debug("persisting Bilhete instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Bilhete persistentInstance) {
		log.debug("removing Bilhete instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Bilhete merge(Bilhete detachedInstance) {
		log.debug("merging Bilhete instance");
		try {
			Bilhete result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Bilhete findById(BilheteId id) {
		log.debug("getting Bilhete instance with id: " + id);
		try {
			Bilhete instance = entityManager.find(Bilhete.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
