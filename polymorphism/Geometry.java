package com.kn.polymorphism;

public class Geometry {
	public void doActivity(Shape sh) {
		sh.draw();
		System.out.println(sh.calculateArea());
		
		if(sh instanceof Circle) {
			System.out.println(((Circle)(sh)).calculateCirclePerimeter());
		}
		
		else {
			System.out.println(((Rectangle)(sh)).calculateRectanglePerimeter());
		}
		
		
	}

}



