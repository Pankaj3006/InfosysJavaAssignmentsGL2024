package com.Selection;

public class SelectionExercise1 {

	public static void main(String[] args) {
		int num1 = 4;
		int num2 = 4;
		int num3 = 1;

		if (num1 >= num2 && num1 >= num3) {
			System.out.println("The greatest integer is: " + num1);
		} else if (num2 >= num1 && num2 >= num3) {
			System.out.println("The greates integer is: " + num2);
		} else {
			System.out.println("The greatest integer is: " + num3);
		}

	}

}
