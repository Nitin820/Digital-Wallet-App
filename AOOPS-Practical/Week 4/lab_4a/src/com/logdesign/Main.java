package com.logdesign;

public class Main {
    public static void main(String[] args) {
        
        loghand infoHandler = new allhandler();
        loghand debugHandler = new DebugHandler();
        loghand errorHandler = new ErrorHandler();

        // Configure Chain of Responsibility
        infoHandler.setNextHandler(debugHandler);
        debugHandler.setNextHandler(errorHandler);

        // Create Logger
        logger logger = new logger();

        // Add Log Commands for different levels
        logger.addCommand(new logcom(loglevel.INFO, infoHandler));
        logger.addCommand(new logcom(loglevel.DEBUG, infoHandler));
        logger.addCommand(new logcom(loglevel.ERROR, infoHandler));

        // Process all commands
        logger.processCommands();
    }
}

