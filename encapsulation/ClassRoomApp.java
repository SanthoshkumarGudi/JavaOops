package com.kn.encapsulation;

import java.util.Scanner;

public class ClassRoomApp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ClassRoom c1=new ClassRoom();
		
		//System.out.println("temperature is"+c1.temperature);
		
		//c1.temperature=200;
		//System.out.println("modified temperature is="+c1.temperature);
		/*
		System.out.println("temperature is"+c1.getTemperature());
		System.out.println("enter the temperature to be changed");
		c1.setTemperature(sc.nextInt());
		
		System.out.println("modified temperature"+c1.getTemperature());
        */
		System.out.println("temperature is="+c1.getTemperature());
		System.out.println("enter the temperature to be changed");
		c1.setTemperature(sc.nextInt());
		System.out.println(c1.getTemperature());
		
		System.out.println("enter the name");
		c1.setName(sc.next());
		System.out.println("name is ="+c1.getName());
		
		System.out.println("enter the strength");
		c1.setStrength(sc.nextInt());
		System.out.println("strength is ="+c1.getStrength());
	}

}
