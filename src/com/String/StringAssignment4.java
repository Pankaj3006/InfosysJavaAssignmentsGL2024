package com.String;

public class StringAssignment4 {

	public static int findHighestOccurrence(String str){
	char[] ch = str.toCharArray();
	int maxFrequency=0;

	for(int i=0; i<ch.length; i++)
	{
		int frequencyOfEachWord=1;
		for(int j=i+1; j<ch.length; j++)
		{
			if(ch[i]==ch[j])
			{
				frequencyOfEachWord++;
			}
			else
			{
				continue;
			}
		}
		if (frequencyOfEachWord>maxFrequency)
			maxFrequency=frequencyOfEachWord;
	}
        return maxFrequency;
	}
	
	public static void main(String args[]){
	    String str = "success";
	    System.out.println(findHighestOccurrence(str));
	}

}
