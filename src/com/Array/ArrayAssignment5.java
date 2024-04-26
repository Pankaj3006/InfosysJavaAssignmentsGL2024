package com.Array;

public class ArrayAssignment5 {

	public static int[] findNumbers(int num1, int num2) {
		int[] numbers = new int[6];
		int index=0;
        int temp=0;
        int r=0, sum=0;
        
		if(num1<num2)
		{
			for(int i=num1;i<=num2; i++)
			{
				temp=i;
				sum=0;
				while(temp>0)
				{
					r=temp%10;
					sum=sum+r;
					temp=temp/10;
				}
				if(sum%3==0 && i%5==0)
				{
					numbers[index]=i;
					index++;
				}
				
			
			}
		}
        

		return numbers;
	}

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 30;

		int[] numbers = findNumbers(num1, num2);
		if (numbers[0] == 0) {
			System.out.println("There is no such number!");
		} else {
			for (int index = 0; index <= numbers.length - 1; index++) {
				if (numbers[index] == 0) {
					break;
				}
				System.out.println(numbers[index]);
			}
		}
	}
}
