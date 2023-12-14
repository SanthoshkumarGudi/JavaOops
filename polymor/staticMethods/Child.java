package com.kn.polymor.staticMethods;



public class Child extends Parent {
	//static is not part of the inheritance hierarchy
	public static void display() {
		System.out.println("child method");
	}

}
