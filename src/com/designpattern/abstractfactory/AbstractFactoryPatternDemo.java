package com.designpattern.abstractfactory;

public class AbstractFactoryPatternDemo {

	public static void main(String[] args) {

		AbstractFactory abstractFactory = FactoryProducer.getFactory("Shape");
		Shape shape = abstractFactory.getShape("Circle");
		shape.draw();

		abstractFactory = FactoryProducer.getFactory("Color");
		Color color = abstractFactory.getColor("Red");
		color.fill();
	}
}
