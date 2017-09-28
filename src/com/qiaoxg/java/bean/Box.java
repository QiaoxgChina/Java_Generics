package com.qiaoxg.java.bean;

/**
 * ·ºĞÍÀà
 * 
 * @author admin
 * 
 * @param <T>
 * @param <E>
 */
public class Box<T, E> {

	private T t;
	private E e;

	public void addE(E e) {
		this.e = e;
	}

	public void add(T t) {
		this.t = t;
	}

	public T get() {
		return t;
	}

	public E getE() {
		return e;
	}

}
