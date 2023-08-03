package com.java.exceptionHandling;

import java.util.Scanner;

public class ExceptionHandlingRunner {

	public static void main(String[] args) {
		
		Scanner scanner = null;
		try {
		scanner = new Scanner(System.in);
		
		int [] numbers = {12,3,4,5};
		
		int number = numbers[5];
		
		
		}catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("Before scanner close");
			
			scanner.close();
		}
		System.out.println("Just before closing out main");

	}

}
