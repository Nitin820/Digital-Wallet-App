package com.app;

import java.util.ArrayList;
import java.util.List;

public class todolist {
    private List<task> tasks;

    public todolist() {
        tasks = new ArrayList<>();
    }

    
    public void addTask(String description) {
        tasks.add(new task(description));
        System.out.println("Task added: " + description);
    }

    
    public void updateTask(int index, String newDescription) {
        if (index >= 0 && index < tasks.size()) {
            task task = tasks.get(index);
            task.setDescription(newDescription);
            System.out.println("Task updated at index " + index + ": " + newDescription);
        } else {
            System.out.println("Invalid task index.");
        }
    }

    
    public void removeTask(int index) {
        if (index >= 0 && index < tasks.size()) {
            tasks.remove(index);
            System.out.println("Task removed at index " + index);
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
