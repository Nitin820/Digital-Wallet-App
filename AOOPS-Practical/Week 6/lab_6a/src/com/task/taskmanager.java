package com.task;

import java.util.ArrayList;

public class taskmanager {
    private ArrayList<task> tasks;

    public taskmanager() {
        tasks = new ArrayList<>();
    }

    // Add a task to the list
    public void addTask(String description) {
        tasks.add(new task(description));
        System.out.println("Task added: " + description);
    }

    public void updateTask(int index, String newDescription) {
        if (index >= 0 && index < tasks.size()) {
            task task = tasks.get(index);
            task.setDescription(newDescription);
            System.out.println("Task updated at position " + index + ": " + newDescription);
        } else {
            System.out.println("Invalid task index.");
        }
    }

    
    public void removeTask(int index) {
        if (index >= 0 && index < tasks.size()) {
            tasks.remove(index);
            System.out.println("Task removed at position " + index);
        } else {
            System.out.println("Invalid task index.");
        }
    }

    
    public void displayTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks to display.");
            return;
        }

        System.out.println("Tasks:");
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println(i + ": " + tasks.get(i));
        }
    }
}
