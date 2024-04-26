package com.OOPS;

class Customer {
	public String customerId;
	public String customerName;
	public long contactNumber;
	public String address;
	
	public Customer(String customerName, long contactNumber, String address) {
		this.customerName = customerName;
		this.contactNumber = contactNumber;
		this.address = address;
	}
	
	public void displayCustomerDetails() {
		System.out.println("Displaying Customer Details");
		System.out.println("Customer Id : "+ customerId);
		System.out.println("Customer name : "+ customerName);
		System.out.println("Contact Number : "+ contactNumber);
		System.out.println("Address : "+ address);
	}
}

public class ThisKeywordExercise1 {

	public static void main(String[] args) {
		Customer customer = new Customer("Jacob", 5648394590l, "13th Street, New York");
		customer.displayCustomerDetails();
	}

}
