package com.ticket;

public class ticket {
    private static int counter = 0;
    private int id;
    private String description;

    public ticket(String description) {
        this.id = ++counter;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Ticket ID: " + id + ", Description: " + description;
    }
}

