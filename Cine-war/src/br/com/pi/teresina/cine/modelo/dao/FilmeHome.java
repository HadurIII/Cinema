package br.com.pi.teresina.cine.modelo.dao;

// Generated 26/05/2014 22:06:43 by Hibernate Tools 3.4.0.CR1

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import br.com.pi.teresina.cine.modelo.Filme;

/**
 * Home object for domain model class Filme.
 * @see modelo.Filme
 * @author Hibernate Tools
 */
@Stateless
public class FilmeHome {

	private static final Log log = LogFactory.getLog(FilmeHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Filme transientInstance) {
		log.debug("persisting Filme instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Filme persistentInstance) {
		log.debug("removing Filme instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Filme merge(Filme detachedInstance) {
		log.debug("merging Filme instance");
		try {
			Filme result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Filme findById(Integer id) {
		log.debug("getting Filme instance with id: " + id);
		try {
			Filme instance = entityManager.find(Filme.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
