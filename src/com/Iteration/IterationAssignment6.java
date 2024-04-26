package com.Iteration;

public class IterationAssignment6 {

	public static void main(String[] args) {
		int number = 1623;
		int temp = number;
		int r=0, sum=0;
		int noOfDigits = 0;
		
		while(temp>0)
		{
			noOfDigits++;
			temp = temp/10;
		}
		System.out.println(noOfDigits);
		
		
		int arr[] =new int[noOfDigits];
		
		temp=number;
		for(int i=0; i<arr.length; i++)
		{
			arr[i]=temp%10;
			temp=temp/10;
		}
		
		for(int i=arr.length-1; i>0; i--)
		{
			if(i%2 == 0)
			{
				number = number/10;
				continue;
			}
			else
			{
				r = number % 10;
				sum = sum + r * r;
				number = number/10;
			}
		}
		System.out.println(sum);
		
		if(sum % 9 == 0)
		{
			System.out.println("The given number is lucky number");
		}
		else
		{
			System.out.println("the given number is not a lucky number");
		}
		

	}

}
