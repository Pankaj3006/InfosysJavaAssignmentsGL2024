package com.Iteration;

public class IterationAssignment3 {

	public static void main(String[] args) {
		int number = 123;
		int temp = number;
		int sumOfDigits = 0;
		int r = 0;
		while (number > 0) {
			r = number % 10;
			sumOfDigits = sumOfDigits + r;
			number = number / 10;
		}

		if (temp % sumOfDigits == 0) {
			System.out.println(temp + " is divisble by sum of its digits");
		} else {
			System.out.println(temp + " is not divisible by sum of its digits");
		}

	}

}
