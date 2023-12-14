package com.kn.polymor.covarient;

public class Child extends Parent {
	public NexonCar display() {
		System.out.println("child");
		return new NexonCar();
	}

}
