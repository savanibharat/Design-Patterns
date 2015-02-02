package com.designpattern.abstractfactory;

/**
 * Rectangle resembles shape so we implement this interface.
 * */
public class Rectangle implements Shape {

	@Override
	public void draw() {
		System.out.println("Rectangle Called");
	}
}
