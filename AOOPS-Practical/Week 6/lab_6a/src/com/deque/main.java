package com.deque;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        browser browserHistory = new browser();

        while (true) {
            System.out.println("\nBrowser History");
            System.out.println("1. Visit Page");
            System.out.println("2. Go Back");
            System.out.println("3. Go Forward");
            System.out.println("4. Display Current Page");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); 
            switch (choice) {
                case 1:
                    System.out.print("Enter page URL: ");
                    String page = scanner.nextLine();
                    browserHistory.visitPage(page);
                    break;
                case 2:
                    browserHistory.goBack();
                    break;
                case 3:
                    browserHistory.goForward();
                    break;
                case 4:
                    browserHistory.displayCurrentPage();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;  
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}

