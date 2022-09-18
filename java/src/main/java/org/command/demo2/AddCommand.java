package org.command.demo2;

public class AddCommand extends Command{
    private int value;
    private Adder adder = new Adder();

    public AddCommand(int value) {
        this.value = value;
    }

    @Override
    public int execute() {
        return adder.add(value);
    }

    @Override
    public int undo() {
        return adder.add(-value);
    }

    @Override
    public int redo() {
        return adder.add(value);
    }
}
