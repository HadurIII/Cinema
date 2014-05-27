package br.com.pi.teresina.cine.modelo.dao;

// Generated 26/05/2014 22:06:43 by Hibernate Tools 3.4.0.CR1

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import br.com.pi.teresina.cine.modelo.Sessao;

/**
 * Home object for domain model class Sessao.
 * @see modelo.Sessao
 * @author Hibernate Tools
 */
@Stateless
public class SessaoHome {

	private static final Log log = LogFactory.getLog(SessaoHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Sessao transientInstance) {
		log.debug("persisting Sessao instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Sessao persistentInstance) {
		log.debug("removing Sessao instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Sessao merge(Sessao detachedInstance) {
		log.debug("merging Sessao instance");
		try {
			Sessao result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Sessao findById(int id) {
		log.debug("getting Sessao instance with id: " + id);
		try {
			Sessao instance = entityManager.find(Sessao.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
