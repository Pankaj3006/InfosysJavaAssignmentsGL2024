package com.DataTypeAndOperators;

public class DataTypeExecrcise1 {

	public static void main(String[] args) {
		int principalAmount = 3250;
		int rateOfInterest = 7;
		int timeInYears = 3;
		
		double simpleInterest = (double)(principalAmount * rateOfInterest * timeInYears)/100;
		
		System.out.println(simpleInterest);

	}

}
