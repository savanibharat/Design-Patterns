package com.designpattern.singleton;

/**
 * Lazy initialization method to implement Singleton pattern creates the
 * instance in the global access method. The above implementation works fine
 * in case of single threaded environment but when it comes to multi-threaded
 * systems, it can cause issues if multiple threads are inside the if loop at
 * the same time. It will destroy the singleton pattern and both threads will
 * get the different instances of singleton class.
 * */
public class LazyInitializationSingleton {

	private static LazyInitializationSingleton instance;

	private LazyInitializationSingleton() {
	}

	public static LazyInitializationSingleton getInstance() {
		if (instance == null) {
			instance = new LazyInitializationSingleton();
		}
		return instance;
	}
}
