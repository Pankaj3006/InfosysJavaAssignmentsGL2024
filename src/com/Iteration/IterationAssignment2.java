package com.Iteration;

public class IterationAssignment2 {

	public static void main(String[] args) {
		int numberOfHeads = 150;
		int numberOfFoots = 500;
		boolean headFlag = false;
		boolean footFlag = false;
				
		for(int numberOfChickens=0; numberOfChickens<=numberOfHeads; numberOfChickens++)
		{
			for(int numberOfRabbits=0; numberOfRabbits<=numberOfHeads; numberOfRabbits++)
			{
				headFlag = (numberOfChickens + numberOfRabbits == numberOfHeads);
				footFlag = (2 * numberOfChickens + 4 * numberOfRabbits == numberOfFoots);
				
				if(headFlag && footFlag)
				{
					System.out.println("The Number of Chickens are: "+numberOfChickens);
					System.out.println("The Number of Rabbits are: "+numberOfRabbits);
					break;
				}
			}
		}
	}
}
