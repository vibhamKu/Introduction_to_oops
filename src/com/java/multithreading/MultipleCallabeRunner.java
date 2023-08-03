package com.java.multithreading;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MultipleCallabeRunner {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		ExecutorService executorService = Executors.newFixedThreadPool(1);
		
		List<CallableTask> tasks = List.of(new CallableTask("Vibham"), new CallableTask("Shaily"), new CallableTask("Job"));
		
		
		//using invokeAll()------> returns all the values as type Future
//		  List<Future<String>> results = executorService.invokeAll(tasks);
//		  for(Future<String> result : results) {
//			  System.out.println(result.get());
//		  }
		
		//using invokeAny()-------> Returns a single value
		  String res = executorService.invokeAny(tasks);
		  System.out.println(res);

		  
		  
		
		executorService.shutdown();

	}
}
