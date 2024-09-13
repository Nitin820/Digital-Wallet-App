package com.factory;

public class gameworking {
	
	    private static gameworking instance;

	    private int level;
	    private String difficulty;
	    private int playercondition;

	    private gameworking() {
	                this.level = 1;
	        this.difficulty = "Easy";
	        this.playercondition = 100;
	    }

	    public static gameworking getInstance() {
	        if (instance == null) {
	            instance = new gameworking();
	        }
	        return instance;
	    }

	    public void setLevel(int level) {
	        this.level = level;
	    }

	    public int getLevel() {
	        return level;
	    }

	    public void setDifficulty(String difficulty) {
	        this.difficulty = difficulty;
	    }

	    public String getDifficulty() {
	        return difficulty;
	    }

	    public void setPlayerHealth(int health) {
	        this.playercondition = health;
	    }

	    public int getPlayerHealth() {
	        return playercondition;
	    }

	    public void displayState() {
	        System.out.println("Level: " + level);
	        System.out.println("Difficulty: " + difficulty);
	        System.out.println("Player Health: " + playercondition);
	    }
	}


