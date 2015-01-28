package com.designpattern.factory;

/***
 * Shape Factory makes sure that it will create and then return object of that
 * particular class using the String parameter
 * */
public class ShapeFactory {

	public Shape getShape(String object) {
		if (object == null) {
			return null;
		} else if (object.equalsIgnoreCase("Circle")) {
			return new Circle();
		} else if (object.equalsIgnoreCase("Rectangle")) {
			return new Rectangle();
		} else if (object.equalsIgnoreCase("Square")) {
			return new Square();
		}
		return null;
	}
}
