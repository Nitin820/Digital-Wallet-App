package com.ticket;


import java.util.LinkedList;
import java.util.Queue;

public class ticketqueue {
    private Queue<ticket> tickets;

    public ticketqueue() {
        tickets = new LinkedList<>();
    }

    
    public void addTicket(String description) {
        ticket ticket = new ticket(description);
        tickets.add(ticket);
        System.out.println("Ticket added: " + ticket);
    }

    
    public void processTicket() {
        ticket ticket = tickets.poll();
        if (ticket != null) {
            System.out.println("Processing ticket: " + ticket);
        } else {
            System.out.println("No tickets to process.");
        }
    }

    
    public void displayTickets() {
        if (tickets.isEmpty()) {
            System.out.println("No pending tickets.");
            return;
        }

        System.out.println("Pending Tickets:");
        for (ticket ticket : tickets) {
            System.out.println(ticket);
        }
    }
}

