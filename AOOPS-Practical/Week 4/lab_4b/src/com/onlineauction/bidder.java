package com.onlineauction;


public class bidder implements observer {
    private String name;

    public bidder(String name) {
        this.name = name;
    }

    @Override
    public void update(String event) {
        System.out.println(name + " received update: " + event);
    }

    public String getName() {
        return name;
    }
}
