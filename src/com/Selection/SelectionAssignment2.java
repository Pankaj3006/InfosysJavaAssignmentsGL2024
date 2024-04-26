package com.Selection;

public class SelectionAssignment2 {

	public static void main(String[] args) {
		int a = 1;
		int b = 5;
		int c = 6;

		int discriminant = b * b - 4 * a * c;

		double x1 = (-b + Math.sqrt(discriminant)) / 2 * a;

		double x2 = (-b - Math.sqrt(discriminant)) / 2 * a;

		if (discriminant == 0) {
			System.out.println("Both the Roots are same and roots are " + x1 + " and " + x2);
		} else if (discriminant > 0) {
			System.out.println("Both the Roots are unequal and their values are " + x1 + " and " + x2);
		} else {
			System.out.println("the Equation does not have real roots");
		}

	}

}
