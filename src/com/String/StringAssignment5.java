package com.String;

public class StringAssignment5 {

	public static String removeDuplicatesandSpaces(String str){
        String stringWithoutSpaces= str.replaceAll(" ", "");
        String stringWithoutDuplicates="";  
        
        for (int i = 0; i < stringWithoutSpaces.length(); i++)    
        {               
            char charAtPosition = stringWithoutSpaces.charAt(i);   
                 
            if (stringWithoutDuplicates.indexOf(charAtPosition) < 0)   
            {   
                stringWithoutDuplicates += charAtPosition;   
            }   
        }      
      return stringWithoutDuplicates;
	}
	
	public static void main(String args[]){
	    String str = "object oriented programming";
	    System.out.println(removeDuplicatesandSpaces(str));
	}

}
