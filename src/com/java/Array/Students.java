package com.java.Array;

import java.util.ArrayList;
import java.util.Collections;

public class Students {
	
	private String name;
	//private int[] marks;
	private ArrayList<Integer> marks = new ArrayList<Integer>();

	public Students(String name, int... marks)
	{
		this.name = name;
		//this.marks = marks;
		for (int mark : marks) {
			this.marks.add(mark);
		}
	}

	public int totalSumOfMarks(int[] marks2 ) {
		// TODO Auto-generated method stub
		int sum = 0;
		for (int mark : marks) {
			sum += mark; 
		}
		return sum;
	}

	public int maxOfMarks(int[] marks2) {
		// TODO Auto-generated method stub
//		int maxMarks = 0;
//		for (int mark : marks) {
//			if (maxMarks < mark) {
//				maxMarks = mark; 
//			}
//		}
//		return maxMarks;
		
		return Collections.max(marks);
	}
	
	public int minOfMarks(int[] marks2) {
		// TODO Auto-generated method stub
//		int minMarks = Integer.MAX_VALUE;
//		for (int mark : marks) {
//			if (minMarks > mark) {
//				minMarks = mark; 
//			}
//		}
//		return minMarks;
		return Collections.min(marks);
	}

	public void addNewMark(int newMark) {
		// TODO Auto-generated method stub
		marks.add(newMark);
		
	}

//	public BigDecimal averageOfMarks() {
//		// TODO Auto-generated method stub
//		int totalsum = totalSumOfMarks();
//		int noOfMarks = ;
//		
//		return average;
//	}
	
	public String toString() {
		return name + marks;
	}

}
