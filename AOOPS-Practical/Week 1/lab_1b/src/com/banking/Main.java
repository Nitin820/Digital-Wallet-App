package com.banking;

import java.util.Scanner;
public class Main {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	      bankworking bankOperations = new bankworking();
	      loginworking loginManager = loginworking.getinstance();

	        while (true) {
	            System.out.println("\n>>>>>>>>>>>>>>BANKING SYSTEM<<<<<<<<<<<<<<<<<<<<");
	            System.out.println("1. Login");
	            System.out.println("2. Logout");
	            System.out.println("3. View Balance");
	            System.out.println("4. Deposit");
	            System.out.println("5. Withdraw");
	            System.out.println("6. Exit");
	            System.out.print("Enter your choice: ");
	            int choice = scanner.nextInt();

	            switch (choice) {
	                case 1:
	                    if (!loginManager.isloggedin()) {
	                        loginManager.log();
	                    } else {
	                        System.out.println("customer already logged in.");
	                    }
	                    break;
	                case 2:
	                    if (loginManager.isloggedin()) {
	                        loginManager.log();
	                    } else {
	                        System.out.println("customer is not logged in.");
	                    }
	                    break;
	                case 3:
	                    bankOperations.viewbal();
	                    break;
	                case 4:
	                    System.out.print("Enter amount to deposit: ");
	                    double depositAmount = scanner.nextDouble();
	                    bankOperations.deposit(depositAmount);
	                    break;
	                case 5:
	                    System.out.print("Enter amount to withdraw: ");
	                    double withdrawAmount = scanner.nextDouble();
	                    bankOperations.withdraw(withdrawAmount);
	                    break;
	                case 6:
	                    System.out.println("Exiting...");
	                    scanner.close();
	                    return;
	                default:
	                    System.out.println("not valid choice. Please try again.");
	            }
	        }
	    }
	}


