package com.designpattern.factory;

/**
 * Square resembles shape so we implement this interface.
 * */
public class Square implements Shape{

	@Override
	public void draw(){
		System.out.println("Square Called");
	}
}
