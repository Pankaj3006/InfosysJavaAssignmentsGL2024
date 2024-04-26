package com.Iteration;

public class IterationAssignment7 {

	public static void main(String[] args) {
		int firstNumber = 7;
		int secondNumber = 9;
		
		int multiplication = firstNumber * secondNumber;
		int maxNumber = (firstNumber>secondNumber)?firstNumber:secondNumber;
		
		
		for(int i=maxNumber; i<=multiplication; i=i+maxNumber)
		{
			if(i%firstNumber==0 && i%secondNumber==0)
			{
				System.out.println("LCM of both the numbers are: "+i);
				break;
			}
			
		}

	}

}
