package com.sp;


public class salaryCalculator {
    
    public double calculateSalary(employee employee) {
        String role = employee.getRole();
        
        // Salary calculation based on role
        switch(role) {
            case "Manager":
                return 80000;
            case "Developer":
                return 60000;
            case "Intern":
                return 30000;
            default:
                return 40000;  // Default salary for other roles
        }
    }
}
