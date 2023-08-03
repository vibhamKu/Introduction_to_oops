package com.java.oops;

import java.util.Scanner;

public class FanRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the makers name : ");
		String name = scanner.nextLine();
		System.out.println("Makers name is : " +name);
		System.out.println("Enter the radius of fan :");
		double radius = scanner.nextDouble();
		System.out.println("Radius of the fan is : " +radius);
		System.out.println("Enter the colour of the fan : ");
		String colour = scanner.next();
		System.out.println("Colour of the fan is : " +colour);
		Fan fan = new Fan(name, radius, colour);
		
		System.out.println("Details of the fan is : " + fan);

	}

}
