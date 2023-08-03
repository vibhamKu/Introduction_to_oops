package com.java.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {

	public static void main(String[] args)
    {
		ArrayList<Integer> l1 = new ArrayList<Integer>();
		        l1.add(1);
		        l1.add(3);
		        l1.add(5);
		ArrayList<Integer> l2 = new ArrayList<Integer>();
		        l2.add(2);
		        l2.add(4);
		        l2.add(6);
		
		ArrayList<Integer> Itmerge = new ArrayList<Integer>();
		        Iterator i = l1.iterator();
		        while (i.hasNext()) {
		           Itmerge.add((Integer) i.next());
		        }

		           System.out.println(Itmerge);

		        i=l2.iterator();
		        while (i.hasNext()) {
		            Itmerge.add((Integer) i.next());
		        }
		System.out.println("L1 : "+l1);
		System.out.println("L2 : "+l2);
		System.out.println("Merged : "+Itmerge);
		}
}
