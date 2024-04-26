package com.Iteration;

public class IterationAssignment8 {

	public static void main(String[] args) {
//		output:
//			*
//			**
//			***
//			****
//			*****
		int numberOfRows = 5;
		
		for(int i=1; i<= numberOfRows; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
		System.out.println("=================================");
		
//		Output:
//			*****
//			****
//			***
//			**
//			*
		
		for(int i= numberOfRows; i>=1; i--)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		

	}

}
