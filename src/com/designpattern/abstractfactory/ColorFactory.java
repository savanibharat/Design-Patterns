package com.designpattern.abstractfactory;

// TODO: Auto-generated Javadoc
/**
 * A factory for creating Color objects.
 */
public class ColorFactory extends AbstractFactory {

	/* (non-Javadoc)
	 * @see com.designpattern.abstractfactory.AbstractFactory#getColor(java.lang.String)
	 */
	@Override
	Color getColor(String color) {
		
		if(color==null){
			return null;
		}
		else if(color.equalsIgnoreCase("Red")){
			return new Red();
		}
		else if(color.equalsIgnoreCase("Green")){
			return new Green();
		}
		else if(color.equalsIgnoreCase("Blue")){
			return new Blue();
		}
		return null;
	}

	/* (non-Javadoc)
	 * @see com.designpattern.abstractfactory.AbstractFactory#getShape(java.lang.String)
	 */
	@Override
	Shape getShape(String shape) {
		// Nothing to do here
		//return null
		return null;
	}

}
