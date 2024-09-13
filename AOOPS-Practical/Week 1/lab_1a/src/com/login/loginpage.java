package com.login;


	public class loginpage {
	    
	    private static loginpage instance;

	    
	    private loginpage() {
	        
	    }

	   
	    public static loginpage getInstance() {
	        if (instance == null) {
	            instance = new loginpage();
	        }
	        return instance;
	    }

	    
	    public void log(String message) {
	        System.out.println("Login message: " + message);
	    }
	}



