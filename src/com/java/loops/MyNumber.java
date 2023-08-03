package com.java.loops;
import java.util.*;

public class MyNumber {
	
	Scanner scanner = new Scanner(System.in);
//	MyNumber(int num){
//		this.num = num ;
//	}

      boolean isPrime(int number1) {
		// TODO Auto-generated method stub
	
		if(number1 < 2) {
			return false;
		}
		for (int i = 2 ; i<= number1 / 2 ; i++) {
			if(number1 % i ==0) {
			//System.out.println("Number is not prime");
			return false;
			}
		}
		//System.out.println("Number is prime");
		return true;
		     }

      
      int sumOfNo(int n) {
    	  int sum = 0;
    	  for (int i = 0; i <= n; i++) {
    		sum = sum + i ; 
    		
    	  }
    	  return sum;
      }
      
      int sumOfDivisor(int n) {
    	  int sum = 0;
    	  for (int i = 2; i <= n/2; i++) {
    		  if (n%i == 0) {
        		  sum = sum + i;
    		  }
    	  }
    	  return sum;
      }


	public void printNumberTriangle(int n) {
		// TODO Auto-generated method stub
		for(int i = 1; i<=n; i++) {
			for (int j = 1; j<=i; j++) {
				System.out.print(j+ " ");
			}
			System.out.println();
		}
		
	}


	public void squaresOfNumber() {
		int num = 0;
		//int i = 1;
		// TODO Auto-generated method stub
		do {
			System.out.println("Enter the number to be squared : ");
			 num = scanner.nextInt();
			System.out.println("Number entered for square : " +num);
			System.out.println("Square is :" +num * num);
		}
		while(num > 0); 
	}	
}
