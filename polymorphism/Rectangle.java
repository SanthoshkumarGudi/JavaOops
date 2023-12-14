package com.kn.polymorphism;

public class Rectangle extends Shape {
	int  length=2,breadth=3;
	public  void draw() {
		System.out.println("draw rectangle");
		}
	
	//overriden parent class method
	public double calculateArea() {
		
		return length*breadth;
		
	}
	//creating child specific method
	public double calculateRectanglePerimeter() {
		return 2*(length+breadth);
	}
	

}



