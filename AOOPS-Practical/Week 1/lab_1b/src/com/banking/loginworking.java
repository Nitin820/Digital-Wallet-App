package com.banking;

public class loginworking {
	private static loginworking instance;
	private boolean isloggedin;
	private loginworking() {
		isloggedin=false;
	}
	public static loginworking getinstance() {
		if (instance==null) {
			instance =new loginworking();
		}
		return instance;
		
	}
	public void log() {
		isloggedin=true;
		System.out.print("customer logged in");
		
	}
	
	public boolean isloggedin() {
		return isloggedin;
		
	}

}
