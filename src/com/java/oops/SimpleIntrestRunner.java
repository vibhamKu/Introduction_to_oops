package com.java.oops;

import java.math.BigDecimal;

public class SimpleIntrestRunner {

	public static void main(String[] args) {
		SimpleIntrestCalculator simpleInterest = new SimpleIntrestCalculator("4500.00","6");
		BigDecimal totalValue1 = simpleInterest.calculateInterest(5);
		System.out.println(totalValue1);
	}

}
