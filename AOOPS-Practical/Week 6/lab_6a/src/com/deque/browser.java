package com.deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class browser {
    private Deque<String> history;
    private Deque<String> forwardStack;
    private String currentPage;

    public browser() {
        history = new ArrayDeque<>();
        forwardStack = new ArrayDeque<>();
        currentPage = null;
    }

    
    public void visitPage(String page) {
        if (currentPage != null) {
            history.push(currentPage);
        }
        currentPage = page;
        forwardStack.clear(); 
        System.out.println("Visited page: " + page);
    }

    
    public void goBack() {
        if (history.isEmpty()) {
            System.out.println("No previous page.");
            return;
        }
        forwardStack.push(currentPage);
        currentPage = history.pop();
        System.out.println("Back to page: " + currentPage);
    }

   
    public void goForward() {
        if (forwardStack.isEmpty()) {
            System.out.println("No next page.");
            return;
        }
        history.push(currentPage);
        currentPage = forwardStack.pop();
        System.out.println("Forward to page: " + currentPage);
    }

    
    public void displayCurrentPage() {
        if (currentPage == null) {
            System.out.println("No page to display.");
        } else {
            System.out.println("Current page: " + currentPage);
        }
    }
}

