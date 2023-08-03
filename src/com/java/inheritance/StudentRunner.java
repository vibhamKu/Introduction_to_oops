package com.java.inheritance;

public class StudentRunner {
	
	public static void main(String[] args) {
		
		//Student student = new Student();
		Employee employee = new Employee("Vibham", "Developer");
		employee.setName("Vibham");
		employee.setEmail("vibham@gmail.com");
		employee.setPhoneNumber("8755987575");
		employee.setGrade('A');
		employee.setTitle("Developer");
		employee.setEmployerl("Gyajmd");
		
		System.out.println(employee);
	}

}
