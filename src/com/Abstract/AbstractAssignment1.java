package com.Abstract;

abstract class Payment{
    private int customerId;
    protected String paymentId;
    protected double serviceTaxPercentage;
    
    public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(String paymentId) {
		this.paymentId = paymentId;
	}

	public double getServiceTaxPercentage() {
		return serviceTaxPercentage;
	}

	public void setServiceTaxPercentage(double serviceTaxPercentage) {
		this.serviceTaxPercentage = serviceTaxPercentage;
	}

    public Payment(int customerId)
    {
    	this.customerId = customerId;
    }
    
    public abstract double payBill(double amount);
}

class DebitCardPayment extends Payment{
	private static int counter;
	private double discountPercentage;
	
	static {
		counter = 1000;
	}
	
	public DebitCardPayment(int customerId)
	{
		super(customerId);
		this.paymentId = "D"+ ++counter;
	}
	
	public static int getCounter() {
		return counter;
	}

	public static void setCounter(int counter) {
		DebitCardPayment.counter = counter;
	}

	public double getDiscountPercentage() {
		return discountPercentage;
	}

	public void setDiscountPercentage(double discountPercentage) {
		this.discountPercentage = discountPercentage;
	}
	
	public double payBill(double amount)
	{
		if(amount<=500)
		{
			serviceTaxPercentage =2.5;
			discountPercentage = 1.0;
		}
		else if(amount>500 && amount <=1000)
		{
			serviceTaxPercentage =4;
			discountPercentage = 2;
		}
		else if(amount>1000)
		{
			serviceTaxPercentage =5;
			discountPercentage = 3;
		}
		
		double finalBill = amount+(amount*(serviceTaxPercentage/100.0))-(amount*(discountPercentage/100.0));
		return finalBill;
	}
}

class CreditCardPayment extends Payment{
	private static int counter;
	
	static {
		counter=1000;
	}
	
	public CreditCardPayment(int customerId)
	{
		super(customerId);
		this.paymentId = "C"+ ++counter;
	}
	
	public static int getCounter() {
		return counter;
	}

	public static void setCounter(int counter) {
		CreditCardPayment.counter = counter;
	}
	
	public double payBill(double amount)
	{
		if(amount<=500)
		{
			serviceTaxPercentage = 3;
		}
		else if(amount>500 && amount <=1000)
		{
			serviceTaxPercentage = 5;
		}
		else if(amount>1000)
		{
			serviceTaxPercentage = 6;
		}
		
		double finalBill = amount*(1 + serviceTaxPercentage/100);
		return finalBill;
	}
}

public class AbstractAssignment1 {

	 public static void main(String args[]){
	        DebitCardPayment debitCardPayment = new DebitCardPayment(101);
	        double billAmount=Math.round(debitCardPayment.payBill(500)*100)/100.0;
			System.out.println("Customer Id: " + debitCardPayment.getCustomerId());
			System.out.println("Payment Id: " + debitCardPayment.getPaymentId());
			System.out.println("Service tax percentage: " + debitCardPayment.getServiceTaxPercentage());
			System.out.println("Discount percentage: " + debitCardPayment.getDiscountPercentage());
			System.out.println("Total bill amount: " + billAmount);
			
			CreditCardPayment creditCardPayment = new CreditCardPayment(102);
	        billAmount=Math.round(creditCardPayment.payBill(1000)*100)/100.0;
			System.out.println("Customer Id: " + creditCardPayment.getCustomerId());
			System.out.println("Payment Id: " + creditCardPayment.getPaymentId());
			System.out.println("Service tax percentage: " + creditCardPayment.getServiceTaxPercentage());
			System.out.println("Total bill amount: " + billAmount);
	    }

}
