package com.azam.common;

import java.util.List;


public interface ICommonDAO <T>{
	public T save(T t);
	public List<T> getAll();
	public T getById(int pid);
	public T update(T t);
	public int delete(T t);
}
