package br.com.pi.teresina.cine.modelo.dao;

// Generated 26/05/2014 22:06:43 by Hibernate Tools 3.4.0.CR1

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import br.com.pi.teresina.cine.modelo.ControleAcesso;

/**
 * Home object for domain model class ControleAcesso.
 * @see modelo.ControleAcesso
 * @author Hibernate Tools
 */
@Stateless
public class ControleAcessoHome {

	private static final Log log = LogFactory.getLog(ControleAcessoHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(ControleAcesso transientInstance) {
		log.debug("persisting ControleAcesso instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(ControleAcesso persistentInstance) {
		log.debug("removing ControleAcesso instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public ControleAcesso merge(ControleAcesso detachedInstance) {
		log.debug("merging ControleAcesso instance");
		try {
			ControleAcesso result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public ControleAcesso findById(int id) {
		log.debug("getting ControleAcesso instance with id: " + id);
		try {
			ControleAcesso instance = entityManager.find(ControleAcesso.class,
					id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
