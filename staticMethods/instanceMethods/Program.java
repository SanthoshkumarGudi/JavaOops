package com.kn.staticMethods.instanceMethods;

public class Program {
	static int x,y;
	static
	{
		System.out.println("====Static block");
		System.out.println("x= "+x);
		System.out.println("y= "+y);
		x=10;
		y=20;
		
	}
	public static void display1() {
		System.out.println("static method");
		System.out.println("x= "+x);
		System.out.println("y= "+y);
		
	}
	//instance
	int a,b;
	{
		System.out.println("instance block");
		a=100;
		b=200;
//		x=300;
//		y=400;
		
	}
	public void display2() {
		System.out.println("instance method");
		System.out.println("a= "+a);
		System.out.println("b= "+b);
		System.out.println("c= "+x);
		System.out.println("y= "+y);
		
	}
	public void method() {
		System.out.println("instance method ");
	}

}
