package com.Array;

public class ArrayAssignment2 {
    
    public static double[] findDetails(double[] salary) {
        double[] calculateSalary = new double[3];
        double totalSalary=0;
        double averageSalary=0;
        int NumberOfSalaryLessThanAverageSalary=0;
        int NumberOfSalaryGreaterThanAverageSalary=0;
        for(int i=0; i<salary.length; i++)
        {
        	totalSalary = totalSalary+salary[i];
        }
        averageSalary = totalSalary/salary.length;
        
         for(double sal: salary)
         {
        	 if(sal>averageSalary)
        	 {
        		NumberOfSalaryGreaterThanAverageSalary++; 
        	 }
        	 else if(sal<averageSalary)
        	 {
        		NumberOfSalaryLessThanAverageSalary++; 
        	 }
         }
         calculateSalary[0] = averageSalary;
         calculateSalary[1] = NumberOfSalaryGreaterThanAverageSalary;
         calculateSalary[2] = NumberOfSalaryLessThanAverageSalary;
        return calculateSalary;
    }
       
    public static void main(String[] args) {
        double[] salary = { 23500.0, 25080.0, 28760.0, 22340.0, 19890.0 };
        double[] details = findDetails(salary);
              
        System.out.println("Average salary: "+ details[0]);
        System.out.println("Number of salaries greater than the average salary: "+ details[1]);
        System.out.println("Number of salaries lesser than the average salary: "+ details[2]);
    }
}
