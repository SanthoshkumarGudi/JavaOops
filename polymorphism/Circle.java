package com.kn.polymorphism;

public class Circle extends Shape {
	double radius=2;
	
	public double calculateArea() {
		return Math.PI*radius*radius;
	}
	
	//child specific method
	public double calculateCirclePerimeter() {
		return 2*Math.PI*radius;
	}

}
