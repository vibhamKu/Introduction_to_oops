package com.java.Array;

import java.util.Arrays;

class DivisiblebyThree{
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,7,8,9,10};
		Arrays.stream(arr).filter(s -> s%3 ==0).forEach(s -> System.out.println(s));
	}
	
	
}
