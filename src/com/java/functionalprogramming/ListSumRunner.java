package com.java.functionalprogramming;

import java.util.List;

public class ListSumRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> number = List.of(10,2,55,66,78,97);
		sumOfNumbers(number);
	}

	private static void sumOfNumbers(List<Integer> number) {
		// TODO Auto-generated method stub
		int sum = number.stream()
				.filter(n -> n %2 == 0)
				.mapToInt(Integer :: intValue).sum();
		
		System.out.println(sum);
		
	}

}
