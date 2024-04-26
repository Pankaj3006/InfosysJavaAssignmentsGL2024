package com.Iteration;

public class IterationAssignment4 {

	public static void main(String[] args) {
		int smallerNumber = 123;
		int largerNumber = 738;
		int temp=smallerNumber;
		int r=0;
		
		while(smallerNumber >0)
		{
			r = smallerNumber%10;
			temp = temp*r;
			smallerNumber = smallerNumber/10;
		}
		
		if(temp==largerNumber)
		{
			System.out.println("Smaller number is seed of larger number");
		}
		else
		{
			System.out.println("Smaller Number is not seed of Larger number");
		}

	}

}
