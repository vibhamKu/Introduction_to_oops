package com.java.oops;

import java.math.BigDecimal;

public class SimpleIntrestCalculator {
	
	BigDecimal principal;
	BigDecimal interest;

	

	public SimpleIntrestCalculator(String principal, String interest) {
		// TODO Auto-generated constructor stub
		this.principal = new BigDecimal(principal);
		this.interest = new BigDecimal(interest).divide(new BigDecimal(100));
	}

	public BigDecimal calculateInterest(int noOffYears) {
		// TODO Auto-generated method stub
		//pricipal+prin*inteerst*years
		BigDecimal totalValue = principal.add(principal.multiply(interest).multiply(new BigDecimal(noOffYears)));
		return totalValue;
	}

}
