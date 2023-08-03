package com.java.oops;

public class MotorBike {
	
	int gear;
	private int speed;
	
	void gearNo(int gear) {
		System.out.println("bike in gear : " +gear);
	}
	
	void setSpeed(int speed) {
		this.speed = speed;
	//	System.out.println("Speed of bike :" +speed);
	}
	
	int getSpeed() {
		return this.speed;
	}

}
