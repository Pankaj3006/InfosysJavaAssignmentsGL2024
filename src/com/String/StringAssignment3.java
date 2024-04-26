package com.String;

public class StringAssignment3 {

	public static String reverseEachWord(String str)
	{
		String[] each_word = str.split("\\s");
		String revEachWord = "";
		String revString = ""; 
		
		for(int i=0; i<each_word.length; i++)
		{
			char[] ch = each_word[i].toCharArray();
			for(int j=ch.length-1; j>=0; j--)
			{
				revEachWord = revEachWord + ch[j];
			}
			revEachWord = revEachWord + " ";
		}
		revString = revString + revEachWord;
		return revString.trim();
	}
	
	public static void main(String args[]){
	    String str = "I love programming";
	    System.out.println(reverseEachWord(str));
	}
}
