package org.command.demo3;

public class MenuItem {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void click() {
        command.execute();
    }
}
