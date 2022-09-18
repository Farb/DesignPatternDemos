package org.command.demo1;

public class Switch {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void act() {
        command.execute();
    }

}
