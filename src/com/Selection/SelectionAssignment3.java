package com.Selection;

public class SelectionAssignment3 {

	public static void main(String[] args) {
		int num1 = 2;
		int num2 = 6;
		int num3 = 7;
		
		if(num1 == 7)
		{
			System.out.println(num2 * num3);
		}
		else if(num2 == 7)
		{
			System.out.println(num3);
		}
		else if(num3 == 7)
		{
			System.out.println(-1);
		}
		else
		{
			System.out.println(num1 * num2 * num3);
		}

	}

}
