package com.logdesign;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class logger {
    private List<command> commandList = new ArrayList<>();

    public void addCommand(command command) {
        commandList.add(command);
    }

    public void processCommands() {
        Iterator<command> iterator = commandList.iterator();
        while (iterator.hasNext()) {
            command command = iterator.next();
            command.exe("This is a log message.");
        }
    }
}
