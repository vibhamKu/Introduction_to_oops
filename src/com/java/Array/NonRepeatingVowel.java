package com.java.Array;

public class NonRepeatingVowel {
	
	public static void main(String[] args) {
		String s ="HelloJava";
		boolean flag = true;
		
		for(int i = 0; i<s.length();i++) {
			if(s.charAt(i)=='a'||s.charAt(i)== 'e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u') {
				char c = s.charAt(i);
				System.out.println(c);
			}
		}
		
		for(char i: s.toCharArray()) {
				
			if(s.indexOf(i) ==s.lastIndexOf(i)) {
				System.out.println("First Non Repeating Vowel is: "+i);
				flag = false;
				break;
			}
	}

}}
