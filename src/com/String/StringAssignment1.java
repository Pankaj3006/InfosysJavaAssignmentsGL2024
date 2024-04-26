package com.String;

public class StringAssignment1 {

	public static String moveSpecialCharacters(String str){
		char[] ch = str.toCharArray();
		String stringHavingAlphabets ="";
		String stringHavingSpecialCharacter = "";
		
		for(int i=0; i<ch.length; i++)
		{
			if((ch[i]>='A' && ch[i]<'Z') || (ch[i]>='a' && ch[i]<'z'))
			{
				stringHavingAlphabets = stringHavingAlphabets + ch[i];
			}
			else
			{
				stringHavingSpecialCharacter = stringHavingSpecialCharacter + ch[i];
			}
		}
		str = stringHavingAlphabets + stringHavingSpecialCharacter;
        return str;
	}
	
	public static void main(String args[]){
	    String str = "He@#$llo!*&";
	    System.out.println(moveSpecialCharacters(str));
	}

}
