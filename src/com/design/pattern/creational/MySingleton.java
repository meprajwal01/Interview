package com.design.pattern.creational;

import java.io.ObjectStreamException;
import java.io.Serializable;

/*
 * Singleton restricts the instantiation of a class to one "single" instance.
 * It Saves memory because object is not created at each request.
 *  
 * Usages:
 * Singleton pattern is mostly used in multi-threaded and database applications. 
 * It is used in logging, caching, thread pools, configuration settings etc.
 *  
 * Break & Prevent Singleton
 * 
 *  1. 
 *  
 * Use of readResolve in Singleton
 *  
 * If we are creating a complete Singleton class, we need to take care the serialization of singleton class. 
 * readResolve is the method which returns the instance of the class when a serialized class is de-serialized. 
 * So implement the readResolve method to return the same object.
 *  
 */
public class MySingleton {

	public static void main(String[] args) {

		ThreadSafeSingleton a1 = ThreadSafeSingleton.getInstance();
		ThreadSafeSingleton a2 = ThreadSafeSingleton.getInstance();

		System.out.println(a1);
		System.out.println(a2);

	}
}

/*
 * The easier way to create a thread-safe singleton class is to make the global
 * access method synchronized, so that only one thread can execute this method
 * at a time.
 */

class ThreadSafeSingleton implements Cloneable, Serializable {

	/**
	 * 
	  */
	private static final long serialVersionUID = 1L;
	private static volatile ThreadSafeSingleton obj = null;

	private ThreadSafeSingleton() {
	}

	// Double checked locking
	public static ThreadSafeSingleton getInstance() {
		if (obj == null) {
			synchronized (ThreadSafeSingleton.class) {
				if (obj == null)
					obj = new ThreadSafeSingleton();
			}
		}
		return obj;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return obj;
	}

	private Object readResolve() throws ObjectStreamException {
		return obj;
	}

}

/*
 * In eager initialization, the instance of Singleton class is created at the
 * time of class loading, this is the easiest method to create a singleton class
 * but it has a drawback that instance is created even though client application
 * might not be using it.
 */

class EagerInitializedSingleton {

	private static final EagerInitializedSingleton instance = new EagerInitializedSingleton();

	// private constructor to avoid client applications to use constructor
	private EagerInitializedSingleton() {
	}

	public static EagerInitializedSingleton getInstance() {
		return instance;
	}
}

/*
 * Static block initialization implementation is similar to eager
 * initialization, except that instance of class is created in the static block
 * that provides option for exception handling.
 */

class StaticBlockSingleton {

	private static StaticBlockSingleton instance;

	private StaticBlockSingleton() {
	}

	// static block initialization for exception handling
	static {
		try {
			instance = new StaticBlockSingleton();
		} catch (Exception e) {
			throw new RuntimeException("Exception occured in creating singleton instance");
		}
	}

	public static StaticBlockSingleton getInstance() {
		return instance;
	}
}