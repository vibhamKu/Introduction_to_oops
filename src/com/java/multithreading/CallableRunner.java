package com.java.multithreading;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

//Callable interface allows the thread to return the result whereas using  Runnable we are not able to do so
class CallableTask implements Callable<String>{
	
	private String name;

	public CallableTask(String name) {
		this.name = name;
	}
	
	//Callable implements Call method, Runnable implements run method which does not return result
	// we can not create thread using Callable
	@Override
	public String call() throws Exception {
		// TODO Auto-generated method stub
		Thread.sleep(1000);
		return "Hello" + name;
	}
}

public class CallableRunner {

	public static void main(String[] args) throws  ExecutionException, InterruptedException {
		ExecutorService executorService = Executors.newFixedThreadPool(1);
		
		//Future is promise that it will return the values after the complete execution of program
		Future<String> welcomeFuture = executorService.submit(new CallableTask("Vibham"));
		
		System.out.println("\nnew CallableTask(\"Vibhan\") executed");
		
		String message = welcomeFuture.get();
		
		System.out.println(message);
		
		System.out.println("\n Main Method");

	}

	

}
