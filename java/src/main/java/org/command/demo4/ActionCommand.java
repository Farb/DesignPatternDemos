package org.command.demo4;

public class ActionCommand extends Command {
    private String name;
    private Receiver receiver;

    public ActionCommand(String name) {
        this.name = name;
        receiver = new Receiver(name);
    }

    @Override
    public void execute() {
        receiver.process();
    }
}
