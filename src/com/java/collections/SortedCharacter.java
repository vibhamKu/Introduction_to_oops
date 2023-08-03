package com.java.collections;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SortedCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Character> character = List.of('A','Z', 'A', 'B', 'Z', 'F');
		
		Set<Character> characterTs = new TreeSet<>(character);
		
		System.out.println(characterTs); 
		
		Set<Character> linkedHS = new LinkedHashSet<>(character);
		
		System.out.println(linkedHS); 
		
		
		
		

	}

}