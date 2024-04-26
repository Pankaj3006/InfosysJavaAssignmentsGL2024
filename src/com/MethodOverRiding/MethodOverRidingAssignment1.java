package com.MethodOverRiding;

class Faculty {
	private String name;
	private float basicSalary;
	private float bonusPercentage;
	private float carAllowancePercentage;

	public Faculty(String name, float basicSalary) {
		this.name = name;
		this.basicSalary = basicSalary;
		this.bonusPercentage = 4f;
		this.carAllowancePercentage = 2.5f;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getBasicSalary() {
		return basicSalary;
	}

	public void setBasicSalary(float basicSalary) {
		this.basicSalary = basicSalary;
	}

	public float getBonusPercentage() {
		return bonusPercentage;
	}

	public void setBonusPercentage(float bonusPercentage) {
		this.bonusPercentage = bonusPercentage;
	}

	public float getCarAllowancePercentage() {
		return carAllowancePercentage;
	}

	public void setCarAllowancePercentage(float carAllowancePercentage) {
		this.carAllowancePercentage = carAllowancePercentage;
	}

	public double calculateSalary() {
		double totalSalary = basicSalary * (1 + bonusPercentage / 100 + carAllowancePercentage / 100);
		         
		return totalSalary;
	}
}

class OfficeStaff extends Faculty {
	private String designation;

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public OfficeStaff(String name, float basicSalary, String designation) {
		super(name, basicSalary);
		this.designation = designation;
	}

	public double calculateSalary() {

		double additionalPay = 0.0;

		if (designation.equals("Accountant"))
			additionalPay = 10000.0;
		else if (designation.equals("Clerk"))
			additionalPay = 7000.0;
		else if (designation.equals("Peon"))
			additionalPay = 4500.0;
		else
			additionalPay = 0.0;

		double totalSalary = getBasicSalary() * (1 + getBonusPercentage() / 100 + getCarAllowancePercentage() / 100)
				+ additionalPay;
        

		return totalSalary;
	}
}

class Teacher extends Faculty {
	private String qualification;

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public Teacher(String name, float basicSalary, String qualification) {
		super(name, basicSalary);
		this.qualification = qualification;
	}

	public double calculateSalary() {
		double additionalPay = 0.0;

		if (qualification.equals("Doctoral"))
			additionalPay = 20000.0;
		else if (qualification.equals("Masters"))
			additionalPay = 18000.0;
		else if (qualification.equals("Bachelors"))
			additionalPay = 15500.0;
		else if (qualification.equals("Associate"))
			additionalPay = 10000.0;
		else
			additionalPay = 0.0;

		double totalSalary = getBasicSalary() * (1 + getBonusPercentage() / 100 + getCarAllowancePercentage() / 100)
				+ additionalPay;
		

		return totalSalary;
	}

}

public class MethodOverRidingAssignment1 {

	public static void main(String[] args) {
		Teacher teacher = new Teacher("Caroline", 30500f, "Masters");
		OfficeStaff officeStaff = new OfficeStaff("James", 24000f, "Accountant");

		System.out.println("Teacher Details\n***************");
		System.out.println("Name: " + teacher.getName());
		System.out.println("Qualification: " + teacher.getQualification());
		System.out.println("Total salary: $" + Math.round(teacher.calculateSalary() * 100) / 100.0);
		System.out.println();

		System.out.println("Office Staff Details\n***************");
		System.out.println("Name: " + officeStaff.getName());
		System.out.println("Designation: " + officeStaff.getDesignation());
		System.out.println("Total salary: $" + Math.round(officeStaff.calculateSalary() * 100) / 100.0);

	}

}
