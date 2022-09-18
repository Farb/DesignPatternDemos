package org.command.demo4;

public class Client {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.setCommand(new ActionCommand("Insert"));
        computer.run();
        computer.setCommand(new ActionCommand("Update"));
        computer.run();
        computer.setCommand(new ActionCommand("Delete"));
        computer.run();
        computer.save();
        try {
            throw new Exception("Unexpected exception..."); // mock the case that the computer banged.
        } catch (Exception exception) {
            System.out.println("The computer banged...It will recover and run again automatically");
            computer.restore();
        }

    }
}
