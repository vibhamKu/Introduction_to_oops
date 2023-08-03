package com.java.Array;

import java.util.Arrays;
import java.util.Comparator;

class CountCharacter{
	
	public static void main(String[] args) {
		
		String[] s = {"apple", "bannana", "cherry", "date", "mango"};
		
		Arrays.stream(s).sorted((s1,s2) -> Integer.compare(s1.length(),s2.length()))
		.forEach(System.out:: println);
		
		
		Arrays.stream(s).sorted(Comparator.comparingInt(String :: length).reversed()).forEach(w -> System.out.println(w + ":" +w.length()));
	}
}