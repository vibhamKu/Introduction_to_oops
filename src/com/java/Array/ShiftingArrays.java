package com.java.Array;

import java.util.Scanner;

public class ShiftingArrays {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		int i,temp;
		System.out.println("Enter the elements");
		for(i = 0; i<n ; i++) {
			a[i]= sc.nextInt();
		}
		System.out.println("Array is: ");
	for(i = 0; i<n; i++) {
		System.out.println(a[i] + "");
	}
	temp = a[0];
	for(i =0; i<n-1; i++) {
		a[i] = a[i+1];
	}
	a[n-2] = temp;
	System.out.println("New Array");
	for(i = 0; i<n; i++) {
		System.out.println(a[i]+ "");
	}
	}

}
