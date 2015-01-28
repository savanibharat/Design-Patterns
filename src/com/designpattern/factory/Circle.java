package com.designpattern.factory;

/**
 * Circle resembles shape so we implement this interface.
 * */
public class Circle implements Shape {
	@Override
	public void draw() {
		System.out.println("Circle Called");
	}
}
