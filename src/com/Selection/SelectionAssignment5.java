package com.Selection;

public class SelectionAssignment5 {

	public static void main(String[] args) {
		int fiveRupeeNotes = 3;
		int oneRupeeNotes = 3;

		int purchaseAmount = 19;

		for (int i = 1; i <= fiveRupeeNotes; i++)
		{
			for (int j = 1; j <= oneRupeeNotes; j++)
			{
				if (purchaseAmount == 5 * i + j) 
				{
					System.out.println(" the Number of 5 rupees Notes" + i);
					System.out.println(" the Number of 1 rupees Notes" + j);
					break;
				}
			}
		}
		if(5*fiveRupeeNotes+oneRupeeNotes<purchaseAmount)
		{
			System.out.println("-1");
		}
	}

}
