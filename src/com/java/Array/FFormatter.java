package com.java.Array;

public class FFormatter extends Thread{

	private int num;
	
	FFormatter(int num){
		this.num = num;
	}
	
	
	public void run() {
		System.out.println("Table of: "+num);
		for(int i = 1; i<= 10; i++) {		
			System.out.println(num+ "*" +i+ "=" +num*i);
		}
	}
	
	public static void main(String[] args) {
		
		
		Thread t1 = new Thread(new FFormatter(10));
		Thread t2 = new Thread(new FFormatter(20));
		
		t1.start();
		t2.start();

	}
}



