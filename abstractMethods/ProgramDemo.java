package com.kn.abstractMethods;

public class ProgramDemo {

	public static void main(String[] args) {
		
		
//		static methods doesnt involve creation of object 
//		by class name only we must call the static methods
		Program.m1();
		
		Program p=new Program2();
		p.M2();
		p.m3();
		p.m4();
		

	}

}
