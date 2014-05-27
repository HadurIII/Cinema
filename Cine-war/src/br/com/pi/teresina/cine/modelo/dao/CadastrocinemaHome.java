package br.com.pi.teresina.cine.modelo.dao;

// Generated 26/05/2014 22:06:43 by Hibernate Tools 3.4.0.CR1

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import br.com.pi.teresina.cine.modelo.Cadastrocinema;

/**
 * Home object for domain model class Cadastrocinema.
 * @see modelo.Cadastrocinema
 * @author Hibernate Tools
 */
@Stateless
public class CadastrocinemaHome {

	private static final Log log = LogFactory.getLog(CadastrocinemaHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Cadastrocinema transientInstance) {
		log.debug("persisting Cadastrocinema instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Cadastrocinema persistentInstance) {
		log.debug("removing Cadastrocinema instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Cadastrocinema merge(Cadastrocinema detachedInstance) {
		log.debug("merging Cadastrocinema instance");
		try {
			Cadastrocinema result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Cadastrocinema findById(int id) {
		log.debug("getting Cadastrocinema instance with id: " + id);
		try {
			Cadastrocinema instance = entityManager.find(Cadastrocinema.class,
					id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
