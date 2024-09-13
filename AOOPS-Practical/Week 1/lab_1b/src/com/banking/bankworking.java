package com.banking;

public class bankworking {
	private double balance;
	public bankworking() {
		balance=0.0;
	}
	public void viewbal() {
		if (loginworking.getinstance().isloggedin()) {
			System.out.println("Current bal: "+balance);
		}
		else {
			System.out.println("log in to view bal");
		}
	}
	public void deposit(double amount) {
		if (loginworking.getinstance().isloggedin()) {
			if (amount>0) {
				balance+=amount;
				System.out.println("deposited bal: "+amount);
				System.out.println("new bal: "+balance);
			} else {
				System.out.println("not valid deposit");
			}
		}
			else {
				System.out.println("Current bal: "+balance);
			}
		}
	public void withdraw(double amount) {
		if (loginworking.getinstance().isloggedin()) {
			if (amount>0&&amount<=balance) {
				balance-=amount;
				System.out.println("withdraw: "+amount);
				System.out.println("new balance: "+balance);
			} else {
				System.out.println("not valid or insufficient bal");
			}
		}
		else {
			System.out.println("log in to withdraw money");
		}
	}
	}

