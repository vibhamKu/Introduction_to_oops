package com.java.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class AcsenComparator implements Comparator<Student>{

	@Override
	public int compare(Student student1, Student student2) {
		// TODO Auto-generated method stub
		return Integer.compare(student1.getId(), student2.getId());
	}
	
}


public class StudentsCollectionRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Student> students = List.of(new Student("Vibham", 2)
				,new Student("Shaily", 3), new Student("RajniKant", 4));
		
		List<Student> studentsAl = new ArrayList<>(students);
		
		System.out.println(students);
		
		
		Collections.sort(studentsAl);
		System.out.println("Descend" +studentsAl);
		
		Collections.sort(studentsAl, new AcsenComparator());
		//studentsAl.sort(new AcsenComparator());

		System.out.println("Ascending" + studentsAl);
		
		
		//Student stu = new Student();

	}

}
