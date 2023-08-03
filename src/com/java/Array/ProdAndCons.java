package com.java.Array;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ProdAndCons{
	
	
	public static void main(String[] args) {
		
		
		BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(10);
		Thread t1 = new Thread(new Producer(queue));
		Thread t2  = new Thread(new Consumer(queue));
		
		t1.start();
		t2.start();	
	}
}

class Producer implements Runnable{

	private final BlockingQueue<Integer> queue;
	
	public Producer(BlockingQueue<Integer> queue) {
		this.queue = queue;	
	}
	
	@Override
	public void run() {
		for(int i = 1; i<= 10 ; i++) {
			try {
				queue.put(i);
				System.out.println("Producer: " +i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class Consumer implements Runnable{

	private final BlockingQueue<Integer> queue;
	
	public Consumer(BlockingQueue<Integer> queue) {
		this.queue = queue;	
	}
	@Override
	public void run() {
		for(int i =0; i<=10; i++) {
			try {
				int val = queue.take();
				System.out.println("Consumer : "+val);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
	
}

