package com.sp;


public class main {
 public static void main(String[] args) {
    
	 
	 
     employee emp1 = new employee("sunny", "Manager");
     employee emp2 = new employee("varsha reddy", "Developer");

     
     salaryCalculator salaryCalculator = new salaryCalculator();

     // Calculate salaries
     System.out.println(emp1.getName() + "'s Salary: " + salaryCalculator.calculateSalary(emp1));
     System.out.println(emp2.getName() + "'s Salary: " + salaryCalculator.calculateSalary(emp2));
 }
}
