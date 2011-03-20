package org.noisyteam.samples.spring.entitymanager.service;

import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 * @author Roman Romanchuk (fatroom@gmail.com)
 */
public abstract class GenericService<T> {
    private EntityManager em;

    @PersistenceContext(unitName = "sample_pu")
    public void setEm(EntityManager manager) {
        this.em = manager;
    }

    public void persist(T object) {
        em.persist(object);
    }


    @Transactional
    public T merge(T object) {
        return em.merge(object);
    }

    public void remove(T object) {
        em.remove(object);
    }

    protected Query createNamedQuery(String queryName) {
        return em.createNamedQuery(queryName);
    }
}
