package org.command.demo4;

import java.io.Serializable;

public class Receiver implements Serializable {
    private String actionName;
    private static final long serializeVersionUID = 1L;

    public Receiver(String actionName) {
        this.actionName = actionName;
    }

    public void process() {
        System.out.println(actionName + "Command was executed.");
    }
}
