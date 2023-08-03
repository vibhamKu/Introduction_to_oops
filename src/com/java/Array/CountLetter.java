package com.java.Array;

import java.util.HashMap;

public class CountLetter {

	public static void main (String[] args) {
		
		String s = "My name is Vibham";
		
		HashMap<Character, Integer> occurence = new HashMap<>();
		
		char[] ch = s.replaceAll(" ", "").toCharArray();
		
		for(char c : ch) {
			Integer count = occurence.get(c);
			
			if(count == null) {
				occurence.put(c, 1);
			}
			else {
				occurence.put(c, count+1);
			}
		}
		System.out.println(occurence);
	}
}

