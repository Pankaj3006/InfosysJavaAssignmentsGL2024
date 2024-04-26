package com.OOPS;

public class MethodsAssignment2 {

	public static void main(String[] args) {
		Restaurant restaurant = new Restaurant();
		restaurant.restaurantName = "Mcdonald's";
		restaurant.rating = 4.1f;
		restaurant.restaurantContact = 9988676767l;
		restaurant.restaurantAddress = "SH1109, Carolina Street, Springfield";
		
		restaurant.displayRestaurantDetails();
	}
}
