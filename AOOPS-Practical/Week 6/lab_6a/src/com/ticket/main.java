package com.ticket;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ticketqueue ticketQueue = new ticketqueue();
        
        while (true) {
            System.out.println("\nCustomer Support Ticket System");
            System.out.println("1. Add Ticket");
            System.out.println("2. Process Ticket");
            System.out.println("3. Display Pending Tickets");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine();  
            
            switch (choice) {
                case 1:
                    System.out.print("Enter ticket description: ");
                    String description = scanner.nextLine();
                    ticketQueue.addTicket(description);
                    break;
                case 2:
                    ticketQueue.processTicket();
                    break;
                case 3:
                    ticketQueue.displayTickets();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;  
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}

