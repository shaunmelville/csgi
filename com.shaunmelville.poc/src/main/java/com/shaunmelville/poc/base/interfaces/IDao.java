package com.shaunmelville.poc.base.interfaces;

import java.util.List;

public interface IDao<T> {

	public String getName();

	public T findOne(final String id);

	public List<T> findAll();

	public T create(final T entity);

	public T update(final T entity);

	public void delete(final T entity);

	public void deleteById(final String entityId);

	public List<T> createNativeQuery(String sql);

}
