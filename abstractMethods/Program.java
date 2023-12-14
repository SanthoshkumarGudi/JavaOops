package com.kn.abstractMethods;

abstract public class Program {
	
	//static variables
	static int a;
	
	//instance variables
	int b;
	
	//static bock
	static {
		System.out.println("static block");
		
		System.out.println("a is="+a);
        a=10;
		
	}
	//instance block
	{
		System.out.println("instance block");
		b=20;
	}
	
	//concrete static method
	public static void m1() {
		System.out.println("concrete static methods");
		System.out.println("a is="+a);
	}
	
	//concrete instance methods
	public void M2() {
		System.out.println("concrete instance methods");
	}
	
	//abstract methods should not be concrete method
	abstract public void m3();
	
	//constructor
	public Program() {
		System.out.println("parent constructor");
	}
	
	//main method
	public static void main(String[] args) {
		System.out.println("main method");
	}
	
	//final method
	final public void m4() {
		System.out.println("final method");
	}
	

}
