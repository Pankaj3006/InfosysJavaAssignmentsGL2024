package com.Iteration;

public class IterationAssignment1 {

	public static void main(String[] args) {
		int number = 153351;
		int sum=0;
		int r=0;
		int temp = number;
		
		while(number >0)
		{
			r = number % 10;
			sum = sum*10 + r; 
			number = number/10;
		}

		if(temp == sum)
		{
			System.out.println("Given number: "+ temp + " is palindrome");
		}
		else
		{
			System.out.println("Given number is not palindrome");
		}
	}

}
