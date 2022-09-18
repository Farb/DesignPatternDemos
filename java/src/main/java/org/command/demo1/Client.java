package org.command.demo1;

public class Client {
    public static void main(String[] args) {
        Switch aSwitch = new Switch();
        aSwitch.setCommand(new OpenLightCommand());
        aSwitch.act();
        aSwitch.setCommand(new CloseLightCommand());
        aSwitch.act();

        aSwitch.setCommand(new OpenFanCommand());
        aSwitch.act();
        aSwitch.setCommand(new CloseFanCommand());
        aSwitch.act();
    }
}
