package org.noisyteam.samples.spring.entitymanager.service;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 * @author Roman Romanchuk (fatroom@gmail.com)
 */
public abstract class GenericService<T> {
    @PersistenceContext
    private EntityManager em;

    public void persist(T object) {
        em.persist(object);
    }

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
