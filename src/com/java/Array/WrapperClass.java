package com.java.Array;

public class WrapperClass {
	
	private int maximum = 0;
	private int size = 0;
	
	public int insert(int n) {
		this.size++;
		if (n > this.maximum)
		 this.maximum = n;
		
		return this.maximum;
	}
	
	public int max () {
		return this.maximum;
	}
	
	public int noOfEelements () {
		return this.size;
	} 

}
