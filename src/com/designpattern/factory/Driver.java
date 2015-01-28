package com.designpattern.factory;

public class Driver {

	public static void main(String[] args) {
		
		ShapeFactory factory=new ShapeFactory();
		Shape shape=factory.getShape("Square");
		shape.draw();
		shape=factory.getShape("Rectangle");
		shape.draw();
		shape=factory.getShape("Circle");
		shape.draw();
	}
}
