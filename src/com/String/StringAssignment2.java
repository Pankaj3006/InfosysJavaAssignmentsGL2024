package com.String;

public class StringAssignment2 {

	public static boolean checkPalindrome(String str)
	{
		char[] ch = str.toCharArray();
		String revString = "";

		for (int i = ch.length - 1; i >= 0; i--)
		{
			revString += ch[i];
		}

		if (str.equals(revString))
			return true;
		else
			return false;
	}

	public static void main(String args[])
	{
		String str = "radar";
		if (checkPalindrome(str))
			System.out.println("The string is a palindrome!");
		else
			System.out.println("The string is not a palindrome!");
	}

}
