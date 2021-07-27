package com.shaunmelville.poc.base.persistence;

import java.io.Serializable;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import com.shaunmelville.poc.base.interfaces.IDao;

@Component("baseDao")
@Primary
@Transactional
public class BaseDao<T extends Serializable> implements IDao<T> {

	private Class<T> clazz;

	@PersistenceContext
	private EntityManager entityManager;

	public final void setClazz(final Class<T> clazzToSet) {
		this.clazz = clazzToSet;
	}

	@Override
	public T findOne(final String id) {
		return entityManager.find(clazz, id);
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<T> findAll() {
		return entityManager.createQuery("from " + clazz.getName()).getResultList();
	}

	@Override
	public T create(final T entity) {
		entityManager.persist(entity);
		return entity;
	}

	@Override
	public T update(final T entity) {
		return entityManager.merge(entity);
	}

	@Override
	public void delete(final T entity) {
		entityManager.remove(entity);
	}

	@Override
	public void deleteById(final String entityId) {
		final T entity = findOne(entityId);
		delete(entity);
	}

	@Override
	public String getName() {

		return "BaseDao";
	}

	@Override
	public List<T> createNativeQuery(String sql) {

		return entityManager.createNativeQuery(sql).getResultList();

	}

}
