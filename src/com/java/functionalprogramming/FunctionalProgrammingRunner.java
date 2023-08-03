package com.java.functionalprogramming;

import java.util.List;

public class FunctionalProgrammingRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> number = List.of(1,2,3,4,5,5,6);
		printNumber(number);
		
	

	}
	
	static void printNumber(List<Integer> num) {
		num.stream().forEach(e -> System.out.println(e));
	}

}
