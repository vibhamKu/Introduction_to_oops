package com.java.collections;

import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

public class MapRunner {

	public static void main(String[] args) {
//		String str = "This is an awesome occasion." +
//					"This has never happen";
		
		List<String> st = List.of("Vibham", "Vibham", "Vibham", "Vibham", "Mukesh", "Mukesh", "Mukesh", "Pallavi", "Pallavi");

		
		
		HashMap<String, Integer> occurence = new HashMap<>();
		
		//char[] letter = str.replaceAll(" ", "").toCharArray();
		
		for (String let : st) {
			Integer count = occurence.get(let);
			
			if (count == null) {
				occurence.put(let, 1);
				
			}
			else {
				occurence.put(let, count +1);
			}
			
		}
		System.out.println(occurence);
		
//		Set<Entry<Character, Integer>> entrySet = occurence.entrySet();
//		HashMap<Character, Integer> occured = new HashMap<>();
//		
//		char maxChar = 0;
//		int maxOcc = 0;
//		
//		for (Entry<Character, Integer> entry : entrySet) {
//			if (entry.getValue() == 1) {
//				maxOcc = entry.getValue();
//				maxChar = entry.getKey();
//				occured.put(maxChar, maxOcc);
//			}
//			
//			
//		}
//		System.out.println(occured);
		
	

	}

}
