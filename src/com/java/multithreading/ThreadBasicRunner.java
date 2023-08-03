package com.java.multithreading;

class Task1 extends Thread{
	@Override
	public void run() {
		System.out.println("\nTask1 Kicked of");
		for (int i = 101; i < 199; i++) {
			System.out.print(i + " ");
		}
		System.out.println("\nTask1 completed");
	}
}

class Task2 implements Runnable{

	@Override
	public void run() { 
		System.out.println("\nTask2 kicked off");
		for(int i = 201; i < 299; i++) {
			System.out.print(i + " ");
		}
		System.out.println("\nTask2 completed");
	}
	
}


public class ThreadBasicRunner {

	public static void main(String[] args) throws InterruptedException {
		Task1 task1 = new Task1();
		task1.start();
		
		Task2 task2 = new Task2();
		Thread task2Thread = new Thread(task2);
		task2Thread.start();
		
		task1.join();
		
		
		
		System.out.println("\nTask3 Kicked off");
		for(int i = 301; i < 399; i++) {
			System.out.print(i + " ");
		}
		System.out.println("\nTask3 Complete");

	}

}
