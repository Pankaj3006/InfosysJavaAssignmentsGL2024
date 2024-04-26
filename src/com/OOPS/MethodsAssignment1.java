package com.OOPS;

public class MethodsAssignment1 {
	
	public static void main(String[] args) {
		Order order = new Order();
		order.orderId = 101;
		order.orderedFoods = "Spinach Alfredo Pasta";
		order.status = "Ordered";
		System.out.println("Total Price: "+order.calculateTotalPrice(35));

	}

}
