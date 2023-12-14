package com.kn.encapsulation;

public class ClassRoom {
	private int temperature;
	private String name;
	private int strength;
	//getter
	/*
	public int getTemperature() {
		return this.temperature;
	}
	//setter
	public void setTemperature(int temperature) {
		if(temperature>=16&&temperature<=25) {
			this.temperature=temperature;
		}
		else {
			System.out.println("invalid temperature");
		}
	}

}
*/
	public int getTemperature() {
		return temperature;
	}
	public void setTemperature(int temperature) {
		this.temperature = temperature;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getStrength() {
		return strength;
	}
	public void setStrength(int strength) {
		this.strength = strength;
	}
}
