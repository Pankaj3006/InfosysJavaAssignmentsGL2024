package com.Selection;

public class SelectionAssignment8 {

	public static void main(String[] args) {
		int number =11;
		
		if(number %3==0 && number %5==0)
		{
			System.out.println("Zoom");
		}
		else if(number %5==0)
		{
			System.out.println("Zap");
		}
		else if(number %3==0)
		{
			System.out.println("Zip");
		}
		else
		{
			System.out.println("Invalid");
		}

	}

}
