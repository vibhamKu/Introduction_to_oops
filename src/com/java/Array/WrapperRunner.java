package com.java.Array;

public class WrapperRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WrapperClass wrapper = new WrapperClass();
		
		wrapper.insert(3);
		wrapper.insert(6);
		wrapper.insert(9);
		
		System.out.println("Maximum of all the numbers : " +wrapper.max());
		System.out.println("Total no of elements : " +wrapper.noOfEelements());

	}

}
