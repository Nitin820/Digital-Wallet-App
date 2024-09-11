package com.solidprinciple;


	public class book {
	    private String title;
	    private String author;
	    private boolean isAvailable;

	    public book(String title, String author) {
	        this.title = title;
	        this.author = author;
	        this.isAvailable = true;  // Initially available
	    }

	    public String getTitle() {
	        return title;
	    }

	    public String getAuthor() {
	        return author;
	    }

	    public boolean isAvailable() {
	        return isAvailable;
	    }

	    public void setAvailable(boolean available) {
	        isAvailable = available;
	    }
	}


