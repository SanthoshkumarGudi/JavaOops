package com.kn.polymorphism;

public class MainShape {

	public static void main(String[] args) {
		
//		Shape sh=new Shape();
//		
//		sh=new Rectangle();
//		
//		//calling inherited child class method
//		sh.draw();
//		
//		//calling override child class method
//		System.out.println("area of rectangle is= "+sh.caclculateArea());
//		
////		calling child specific method using parent object reference
////		System.out.println("perimeter of a rectangle is= "+sh.calculatePerimeter);
////		 will not be executed because child specific method cant be called using parent object reference
//		
//		//rather we can call child specific method using perent object reference by child class name in the first
//		
//		System.out.println("periemeter of the rectangle is = "+((Rectangle)(sh)).calculatePerimeter());
		
		Geometry g=new Geometry();
		
		Circle c=new Circle();
		Rectangle r=new Rectangle();
		
		
		g.doActivity(c);
		g.doActivity(r);

	}

}
