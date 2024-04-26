package com.Interface;

interface Tax {
	public double calculateTax(double price);
}

class PurchaseDetails implements Tax {
	
	private String purchaseId;
	private String paymentType;
	private double taxPercentage;
	 
	public PurchaseDetails(String purchaseId, String paymentType) {
		this.purchaseId = purchaseId;
		this.paymentType=paymentType;		
	}
	
	public String getPurchaseId() {
		return purchaseId;
	}


	public void setPurchaseId(String purchaseId) {
		this.purchaseId = purchaseId;
	}


	public String getPaymentType() {
		return paymentType;
	}


	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}


	public double getTaxPercentage() {
		return taxPercentage;
	}


	public void setTaxPercentage(double taxPercentage) {
		this.taxPercentage = taxPercentage;
	}

	
	public double calculateTax(double price) {
		if(paymentType.equals("Debit Card"))
			taxPercentage = 2;
		else if(paymentType.equals("Credit Card"))
			taxPercentage = 3;
		else
			taxPercentage = 4;
		return price + price * taxPercentage/100.0;
	}
	
}

class Seller implements Tax{
	private String location;
	private double taxPercentage;
	
	public Seller(String location)
	{
		this.location = location;
	}
	
	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public double getTaxPercentage() {
		return taxPercentage;
	}

	public void setTaxPercentage(double taxPercentage) {
		this.taxPercentage = taxPercentage;
	}	

	public double calculateTax(double price) {
		if(location.equals("Middle east"))
			taxPercentage = 15;
		else if(location.equals("Europe"))
			taxPercentage = 25;
		else if(location.equals("Canada"))
			taxPercentage = 22;
		else if(location.equals("Japan"))
			taxPercentage = 12;
		return price * (taxPercentage/100);
	}
	
}

public class InterfaceExercise1 {

	public static void main(String args[]) {
		System.out.println("Purchase Details\n***************");
		PurchaseDetails purchaseDetails = new PurchaseDetails("P1001","Credit Card");
		System.out.println("Total purchase amount: " + Math.round(purchaseDetails.calculateTax(100)*100)/100.0);
		System.out.println("Tax percentage: "+purchaseDetails.getTaxPercentage());

        System.out.println("Seller Details\n***************");
		Seller seller = new Seller("Canada");
		System.out.println("Tax to be paid by the seller: " + Math.round(seller.calculateTax(100)*100)/100.0);
		System.out.println("Tax percentage: "+seller.getTaxPercentage());
	}

}
