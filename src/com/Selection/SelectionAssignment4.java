package com.Selection;

import java.util.Scanner;

public class SelectionAssignment4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		char foodType = 'N';
		System.out.println("Enter the Quantity Ordered");
		int orderedQuantity = sc.nextInt();
		System.out.println("Enter The distance in Km");
		int distance = sc.nextInt();
		
		int totalAmount = 0;

		switch (foodType) {
		case 'V': {
			if (orderedQuantity > 1) {
				if (distance > 0 && distance <= 3)
					totalAmount = 12 * orderedQuantity;
				else if (distance > 3 && distance <= 6)
					totalAmount = 12 * orderedQuantity + (distance - 3) * 1;
				else if (distance > 6)
					totalAmount = 12 * orderedQuantity + (6 - 3) * 1 + (distance - 6) * 2;
				else
					totalAmount = -1;
			} else {
				totalAmount = -1;
			}
		}
			break;
		case 'N': {
			if (orderedQuantity > 1) {
				if (distance > 0 && distance <= 3)
					totalAmount = 15 * orderedQuantity;
				else if (distance > 3 && distance <= 6)
					totalAmount = 15 * orderedQuantity + (distance - 3) * 1;
				else if (distance > 6)
					totalAmount = 15 * orderedQuantity + (6 - 3) * 1 + (distance - 6) * 2;
				else
					totalAmount = -1;
			} else {
				totalAmount = -1;
			}
		}
			break;
		default: {
			totalAmount = -1;
		}
		}
		System.out.println(totalAmount);

		sc.close();
	}
}
