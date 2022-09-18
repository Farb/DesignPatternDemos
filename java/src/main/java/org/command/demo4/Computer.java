package org.command.demo4;

import org.utils.SerializeUtil;

import java.util.ArrayList;
import java.util.List;

public class Computer {
    private List<Command> commandList = new ArrayList<>();
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void run() {
        command.execute();
        commandList.add(command);
    }

    public void save() {
        SerializeUtil.serialize(commandList, "err.log");
    }

    public void restore() {
        Object obj = SerializeUtil.deserialize("err.log");
        commandList = (List<Command>) obj;
        for (Command cmd : commandList) {
            cmd.execute();
        }
    }
}
