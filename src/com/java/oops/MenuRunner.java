package com.java.oops;

import java.util.Scanner;

public class MenuRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner(System.in);
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number 1 :");
		int number1 = scanner.nextInt();
		System.out.println("The first number entered is : " +number1);
		System.out.println("Enter the second number :");
		int number2 = scanner.nextInt();
		System.out.println("The second number entered is :" +number2);
		System.out.println("Print the menu :");
		System.out.println("1. Add" +'\n'+ "2. Substract" +'\n'+ "3. Divide" +'\n'+ "4. Multiply");
		System.out.println("Enter the choice :");
		int  choice = scanner.nextInt();
		System.out.println("Your choice is : " +choice);
		
		switch(choice) {
		case 1: 
			int sum = number1 + number2;
			System.out.println("Sum is : " +sum);
			break;
		case 2:
			int sub = number1 - number2;
			System.out.println("Substraction is : " +sub);
			break;
		case 3:
			double div = (double) number1 / number2;
			System.out.println("Result after division : " +div);
			break;
		case 4:
			long multiply = number1 * number2 ;
			System.out.println("Multiplication of numbers is : " +multiply);
			break;
		default:{
			System.out.println("Please enter the valid choice");
		}
		}
	}

}
