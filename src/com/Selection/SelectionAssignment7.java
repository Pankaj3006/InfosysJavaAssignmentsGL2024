package com.Selection;

import java.util.Scanner;

public class SelectionAssignment7 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Day");
		int day = sc.nextInt();
		System.out.println("Enter the Month");
		int month = sc.nextInt();
		System.out.println("Enter the Year");
		int year = sc.nextInt();

		if (day > 30) 
		{
			System.out.println("The Date entered by User is Not Valid. User must enter valid date");
		} 
		else if (day == 30)
		{
			day = 1;
			if (month > 12) 
			{
				System.out.println("The Date entered by User is Not Valid. User must enter valid date");
			} 
			else if (month == 12) 
			{
				year = year + 1;
				month = 1;
				System.out.println(day + "-" + month + "-" + year);
			} 
			else 
			{
				month = month + 1;
				System.out.println(day + "-" + month + "-" + year);
			}
		} 
		else 
		{
			System.out.println(day + 1 + "-" + month + "-" + year);
		}
		sc.close();
	}
}
