package com.Iteration;

public class IterationAssignment5 {

	public static void main(String[] args) {
		int number = 1635;
		int temp = number;
		int r=0, sum=0;
		int noOfDigits = 0;
		
		while(temp>0)
		{
			noOfDigits++;
			temp = temp/10;
		}
		System.out.println(noOfDigits);
		
		temp = number;
		while(temp>0)
		{
			r=temp%10;
			sum = sum + (int)Math.pow(r, noOfDigits);
			temp = temp/10;
		}
		
		System.out.println(sum);
		
		if(sum== number)
		{
			System.out.println("Given number "+ number+ " is an Armstrong number" );
		}
		else
		{
			System.out.println("Given number "+ number+ " is not an Armstrong number");
		}

	}

}
