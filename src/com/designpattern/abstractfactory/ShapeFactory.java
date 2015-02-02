package com.designpattern.abstractfactory;

// TODO: Auto-generated Javadoc
/**
 * *
 * Shape Factory makes sure that it will create and then return object of that
 * particular class using the String parameter.
 */
public class ShapeFactory extends AbstractFactory{

	/* (non-Javadoc)
	 * @see com.designpattern.abstractfactory.AbstractFactory#getShape(java.lang.String)
	 */
	@Override
	Shape getShape(String object) {
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

	/* (non-Javadoc)
	 * @see com.designpattern.abstractfactory.AbstractFactory#getColor(java.lang.String)
	 */
	@Override
	Color getColor(String color) {
		// Nothing to do here
		//return null
		return null;
	}
}
