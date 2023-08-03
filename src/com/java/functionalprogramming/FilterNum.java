package com.java.functionalprogramming;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FilterNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> string = List.of("Apple", "Car", "Bat", "banana");
		endWithAT(string);
		
		List<Integer> number = List.of(1,2,3,4,5,5,6);
		printEvenNumber(number);
		
		oddAsList();
		squaresAsList();
		maxFromList();

	}

	private static void endWithAT(List<String> string) {
		// TODO Auto-generated method stub
		string.stream().filter(s -> s.endsWith("at"))
						.forEach(s -> System.out.println(s));
		
	}

	private static void printEvenNumber(List<Integer> number) {
		// TODO Auto-generated method stub
		number.stream().filter(e -> e%2 == 0)
						.forEach(e -> System.out.println(e));
	}
	
	private static void oddAsList() {
		List<Integer> num1 = List.of(23,12,34,53).stream().filter(n -> n%2 ==1).collect(Collectors.toList());
	
	System.out.println(num1);
	}
	
	private static void squaresAsList() {
		List<Integer> square = IntStream.range(1, 10).map(e -> e*e).boxed().toList();
		System.out.println(square);
	}
	
	private static void maxFromList() {
//		int num1 = List.of(23,12,34,53).stream().max(Integer :: compare).get();
//		System.out.println(num1);
		
		int num1 = List.of(23,12,34,53).stream().max((n1, n2) -> Integer.compare(n1, n2)).get();
		System.out.println(num1);
	}
}

