package com.kn.polymor.staticMethods;

public class ParentChildDemo {

	public static void main(String[] args) {
		
		Parent p1=new Parent();
		p1.display();
		System.out.println("=====");
		Child c=new Child();
		c.display();
		
		System.out.println("=====");
		//this is no longer object oriented method it is class orientd because we have used static words in the instance methods
		Parent p2=new Child();
		p2.display();

	}

}
