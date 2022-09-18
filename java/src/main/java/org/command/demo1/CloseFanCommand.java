package org.command.demo1;

public class CloseFanCommand implements Command {
    private Fan fan = new Fan();

    @Override
    public void execute() {
        fan.close();
    }
}
