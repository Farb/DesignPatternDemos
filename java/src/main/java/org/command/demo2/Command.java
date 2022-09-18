package org.command.demo2;

public abstract class Command {
    public abstract int execute();

    public abstract int undo();
    public abstract int redo();
}
