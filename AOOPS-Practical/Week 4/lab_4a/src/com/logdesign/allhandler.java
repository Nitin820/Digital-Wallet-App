package com.logdesign;


 public class allhandler extends loghand {
	    @Override
	    protected boolean canHandle(loglevel level) {
	        return level == loglevel.INFO;
	    }

	    @Override
	    protected void writeMessage(String message) {
	        System.out.println("INFO: " + message);
	    }
	}

	 class DebugHandler extends loghand {
	    @Override
	    protected boolean canHandle(loglevel level) {
	        return level == loglevel.DEBUG;
	    }

	    @Override
	    protected void writeMessage(String message) {
	        System.out.println("DEBUG: " + message);
	    }
	}

	 class ErrorHandler extends loghand {
	    @Override
	    protected boolean canHandle(loglevel level) {
	        return level == loglevel.ERROR;
	    }

	    @Override
	    protected void writeMessage(String message) {
	        System.out.println("ERROR: " + message);
	    }
	}

