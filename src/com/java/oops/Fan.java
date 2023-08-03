package com.java.oops;

public class Fan {
	
	String make;
	double radius;
	String colour;
	boolean isOn;
	byte speed;
	
	public Fan(String make, double radius, String colour) {
		this.make = make;
		this.radius = radius;
		this.colour = colour;
	}
	
	 
	
	
	
	public String toString() {
		return String.format("make - %s,radius - %f, colour- %s", colour, radius, colour);
	}

}
