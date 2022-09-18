package org.command.demo1;

public class OpenLightCommand implements Command {
    private Light light = new Light();

    @Override
    public void execute() {
        light.open();
    }
}
