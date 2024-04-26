package com.Array;

public class ArrayAssignment7 {

	public static void findPermutations(String str) {
		char[] ch = str.toCharArray();
		int start =0;
		int end= str.length();
		
		for(int i=start; i<end; i++)
		{
			swap(ch, i, start);
			findPermutations(ch.toString());
			start=start+1;
			swap(ch, i, start);			
		}
		
		if(start>=end)
		{
			System.out.println(new String(ch));
		}
		
		
	}
	
	public static void swap(char[] input, int i, int j)
	{
		char c= input[i];
		input[i]=input[j];
		input[j]=c;
	}


	
	public static void main(String args[]) {
		String str = "abc";
		findPermutations(str);
//		String permutations[] = findPermutations(str);
//		for (String permutation : permutations) {
//			if (permutation != null)
//				System.out.println(permutation);
//		}
	}

}
