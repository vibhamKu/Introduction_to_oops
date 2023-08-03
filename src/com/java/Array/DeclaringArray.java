package com.java.Array;

import java.util.Arrays;

public class DeclaringArray {
	
public static void main(String[] args) {
	
int[] marks = {1,2,3,4,5};
	
	int[] marks2 = {1,2,3,4,5};
	
	int[] marks3 = {2,3,4,5};
	
	int[] mark4 = new int[5];
	
	DeclaringArray da = new DeclaringArray();

	System.out.println(Arrays.toString(mark4));
	
	for (int mark : marks) {
		System.out.println(mark);
	}
	
	Arrays.fill(mark4, 30);
	System.out.println(Arrays.toString(mark4));
	
	if (Arrays.equals(marks, marks2))
	{
		System.out.println(true);
	}
	else {
		System.out.println(false);
	}
	
	
//	System.out.println(da.marks2);
//	System.out.println(da.mark);
//	da.marks == da.marks2;
//	System.out.println(da.marks);
//	System.out.println(da.marks2);

	
}

}
