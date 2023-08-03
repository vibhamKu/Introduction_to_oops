package com.java.loops;

import java.util.Scanner;

public class MyNumberRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		MyNumber number = new MyNumber();
		System.out.println("Enter the number : ");
		int number1 = scanner.nextInt();
		//scanner.close();
		System.out.println("Number entered : " +number1);
		
		//To check number is prime*
		if (number.isPrime(number1)) {
            System.out.println(number1 + " is prime number");
		}  
		else{
            System.out.println(number1 + " is not prime number");
		}
		
		//Sum of Divisor of number
		 int total = number.sumOfDivisor(number1);
		 System.out.println("Total is : " +total);		

		
		//printing the triangle
		 number.printNumberTriangle(number1);
		 
		// number.squaresOfNumber();
		 
	}

}
