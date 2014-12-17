package com.designpattern.singleton;

/**
 * Static block initialization implementation is similar to eager
 * initialization, except that instance of class is created in the static block
 * that provides option for exception handling. Both eager initialization and
 * static block initialization creates the instance even before it�s being used
 * and that is not the best practice to use. So in further sections, we will
 * learn how to create Singleton class that supports lazy initialization.
 * 
 * */
public class StaticBlockSingleton {

	private static StaticBlockSingleton instance;

	private StaticBlockSingleton() {
	}

	static {
		try {
			instance = new StaticBlockSingleton();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static StaticBlockSingleton getInstance() {
		return instance;
	}
}
