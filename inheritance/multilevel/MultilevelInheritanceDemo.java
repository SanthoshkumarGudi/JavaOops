package com.kn.inheritance.multilevel;

public class MultilevelInheritanceDemo {

	public static void main(String[] args) {
		Vehicle v1=new Vehicle();
		v1.registrationNumber=1221;
		System.out.println("reg Number"+v1.registrationNumber);
		v1.move();
		
		Car c1=new Car();
		c1.registrationNumber=2323;
		System.out.println("reg Number"+c1.registrationNumber);
		c1.move();
        
		Sedan s1=new Sedan();
		s1.registrationNumber=3342;
		System.out.println("reg NUmber="+s1.registrationNumber);
		s1.move();
	}

}
