package com.designpattern.abstractfactory;

public class FactoryProducer {

	public static AbstractFactory getFactory(String choice){
		if(choice==null){
			return null;
		}
		else if(choice.equalsIgnoreCase("Color")){
			return new ColorFactory();
		}
		else if(choice.equalsIgnoreCase("Shape")){
			return new ShapeFactory();
		}
		return null;
	}
}
