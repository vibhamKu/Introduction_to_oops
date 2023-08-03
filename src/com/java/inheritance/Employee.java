package com.java.inheritance;

import java.math.BigDecimal;

public class Employee extends Person {

	private String title;
	private String  employer;
	private char grade;
	private BigDecimal salary;
	
	public Employee(String name, String title) {
		super(name);
		this.title =title;
		System.out.println("Employee cons");
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getEmployerl() {
		return employer;
	}
	public void setEmployerl(String employerl) {
		this.employer = employerl;
	}
	public char getGrade() {
		return grade;
	}
	public void setGrade(char grade) {
		this.grade = grade;
	}
	public BigDecimal getSalary() {
		return salary;
	}
	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}
	
	
	public String toString() {
		return  super.toString() + " # " +title + " # " + employer + " # " + grade; 
	}

}
