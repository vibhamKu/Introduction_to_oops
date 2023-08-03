package com.java.collections;

import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;


class StringComaparator implements Comparator<String>{

	@Override
	public int compare(String val1, String val2) {
		// TODO Auto-generated method stub
		return Integer.compare(val1.length(), val2.length());
	}
	
}


public class QueueRunner {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Queue<String> queue = new PriorityQueue<>(new StringComaparator());
		queue.addAll(List.of("banana", "cat", "Dog"));
		
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());


	}

}
