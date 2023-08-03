package com.java.Array;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Scanner;

public class StudentsRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the name of student ");
		String name = scanner.next();
		System.out.println("Name of the student is : " +name);
		System.out.println("Enter no. of marks : ");
		int noOfMarks = scanner.nextInt();
		System.out.println("No of marks entere are : " +noOfMarks);
		int[] marks = new int[noOfMarks];
		for(int i = 0; i<noOfMarks; i++) {
			marks[i] = scanner.nextInt();
		}
			System.out.println("Marks Entered are : " +Arrays.toString(marks));

		Students student = new Students(name, marks);
		
		int total = student.totalSumOfMarks(marks);
		System.out.println("Total of marks is : " +total);
		
		int max = student.maxOfMarks(marks);
		System.out.println("Maximum of all the marks : " +max);
		
		int min = student.minOfMarks(marks);
		System.out.println("Minimum of all the marks : " +min);
		
		//BigDecimal average = student.averageOfMarks();
		System.out.println("Average of marks : " + new BigDecimal(total).
				divide(new BigDecimal(noOfMarks), 3, RoundingMode.UP));
		
		System.out.println("Entrr the new mark : ");
		int newMark = scanner.nextInt();
		student.addNewMark(newMark);
		System.out.println("New mark entered is : " +newMark);
		
		System.out.println(student);

	}

}
