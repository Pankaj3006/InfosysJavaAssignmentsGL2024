package com.Array;

public class ArrayAssignment3 
{
	public static int[] findLeapYears(int year)
	{
		int[] listOfLeapYears = new int[15];
		int count = 0;

		while (count < listOfLeapYears.length)
		{
			if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) 
			{
				listOfLeapYears[count] = year;
				count++;
			}
			year += 1;
		}
		return listOfLeapYears;
	}

	public static void main(String[] args) 
	{
		int year = 2001;
		int[] leapYears;
		leapYears = findLeapYears(year);
		for (int index = 0; index < leapYears.length; index++) 
		{
			System.out.println(leapYears[index]);
		}
	}
}
