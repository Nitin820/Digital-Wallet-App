package com.logdesign;


	public class logcom implements command {
	    private loglevel logLevel;
	    private loghand handler;

	    public logcom(loglevel logLevel, loghand handler) {
	        this.logLevel = logLevel;
	        this.handler = handler;
	    }

	    @Override
	    public void exe(String message) {
	        handler.handle(logLevel, message);
	    }
	}


