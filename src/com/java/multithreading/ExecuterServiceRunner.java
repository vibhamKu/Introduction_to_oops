package com.java.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Task implements Runnable{
	
	
	private int number;

	public Task(int number) {
		this.number = number;
	}

	@Override
	public void run() {
		System.out.println("\nTask" + number + "Kicked of");
		for (int i = number * 100; i < number*100 + 99; i++) {
			System.out.print(i + " ");
		}
		System.out.println("\nTask" + number + "completed");
	}	
}

public class ExecuterServiceRunner {
	public static void main(String[] args) {
		//for SingleThreadExecutor
		//ExecutorService executorService = Executors.newSingleThreadExecutor();
		
		//
		ExecutorService executorService = Executors.newFixedThreadPool(2);

		executorService.execute(new Task(1));
		executorService.execute(new Task(2));
		executorService.execute(new Task(3));
		executorService.execute(new Task(4));
		executorService.execute(new Task(5));

		
		executorService.shutdown();
	}

}
