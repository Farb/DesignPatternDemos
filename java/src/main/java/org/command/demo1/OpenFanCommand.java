package org.command.demo1;

public class OpenFanCommand implements Command {
    private Fan fan = new Fan();

    @Override
    public void execute() {
        fan.open();
    }
}
