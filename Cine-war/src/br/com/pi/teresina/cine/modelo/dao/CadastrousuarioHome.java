package br.com.pi.teresina.cine.modelo.dao;

// Generated 26/05/2014 22:06:43 by Hibernate Tools 3.4.0.CR1

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import br.com.pi.teresina.cine.modelo.Cadastrousuario;

/**
 * Home object for domain model class Cadastrousuario.
 * @see modelo.Cadastrousuario
 * @author Hibernate Tools
 */
@Stateless
public class CadastrousuarioHome {

	private static final Log log = LogFactory.getLog(CadastrousuarioHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Cadastrousuario transientInstance) {
		log.debug("persisting Cadastrousuario instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Cadastrousuario persistentInstance) {
		log.debug("removing Cadastrousuario instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Cadastrousuario merge(Cadastrousuario detachedInstance) {
		log.debug("merging Cadastrousuario instance");
		try {
			Cadastrousuario result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Cadastrousuario findById(int id) {
		log.debug("getting Cadastrousuario instance with id: " + id);
		try {
			Cadastrousuario instance = entityManager.find(
					Cadastrousuario.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
