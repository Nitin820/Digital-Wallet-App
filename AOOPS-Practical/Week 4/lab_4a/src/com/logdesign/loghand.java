package com.logdesign;



	public abstract class loghand {
	    protected loghand nextHandler;

	    public void setNextHandler(loghand nextHandler) {
	        this.nextHandler = nextHandler;
	    }

	    public void handle(loglevel level, String message) {
	        if (canHandle(level)) {
	            writeMessage(message);
	        } else if (nextHandler != null) {
	            nextHandler.handle(level, message);
	        }
	    }

	    protected abstract boolean canHandle(loglevel level);

	    protected abstract void writeMessage(String message);
	}


