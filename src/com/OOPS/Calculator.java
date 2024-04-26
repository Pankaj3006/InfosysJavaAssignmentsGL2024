package com.OOPS;

public class Calculator {

	public int num;

		public int sumOfDigits() {
			int r = 0;
			int sum = 0;

			while (num > 0) {
				r = num % 10;
				sum = sum + r;
				num = num / 10;
			}
			return sum;
		}
		
		public double findAverage(int num1, int num2, int num3) {
		 return (double)(num1 + num2 + num3)/3;	
		}
}
