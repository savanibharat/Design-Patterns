package com.designpattern.iterator;

public class IteratorPatternDemo {

	public static void main(String[] args) {
		
		NameRepository namerepository=new NameRepository();
		Iterator iter=namerepository.getIterator();
		while(iter.hasNext()){
			System.out.println(iter.next());
		}
		
	}
	
}
