package com.factorymethod;


	public class userauthentication {
	    private static userauthentication instance;
	    private boolean isloggedin;

	    private userauthentication() {
	    	isloggedin = false;
	    }

	    public static userauthentication getInstance() {
	        if (instance == null) {
	            instance = new  userauthentication();
	        }
	        return instance;
	    }

	    public void login() {
	        if (!isloggedin) {
	        	isloggedin = true;
	            System.out.println("customer logged in successfully.");
	        } else {
	            System.out.println("customer already logged in.");
	        }
	    }

	    public void logout() {
	        if (isloggedin) {
	        	isloggedin = false;
	            System.out.println("customer logged out successfully.");
	        } else {
	            System.out.println("No user is logged in.");
	        }
	    }

	    public boolean isLoggedIn() {
	        return isloggedin;
	    }
	}


