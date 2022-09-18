package org.command.demo1;

public class CloseLightCommand implements Command {
    private Light light = new Light();

    @Override
    public void execute() {
        light.close();
    }
}
