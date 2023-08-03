package com.java.oops;

public class MotorBikeRunner {
	
	public static void main(String[] args) {
		MotorBike ducati = new MotorBike();
		MotorBike honda = new MotorBike();
		
		honda.gearNo(3);
		System.out.println("vibham");
		
		ducati.setSpeed(200);
		System.out.println("Speed of ducati : " +ducati.getSpeed());
		
		
	}
		
	}


