package org.command.demo2;

import java.util.ArrayList;
import java.util.List;

public class CalculatorForm {
    private List<Command> commands = new ArrayList<>();
    private List<Command> undoCommands = new ArrayList<>();
    private int undoIndex;
    private int total;

    public void setCommands(List<Command> commands) {
        this.commands = commands;
        undoIndex = commands.size() - 1;
    }

    public int calculate() {
        int sum = 0;
        for (Command command : commands) {
            sum += command.execute();
        }
        System.out.println("calculate result is " + sum);
        total = sum;
        return sum;
    }

    public int undo() {
        if (commands.isEmpty() || undoIndex < 0) {
            System.out.println("No command to undo!");
            return -1;
        }
        Command command = commands.get(undoIndex);
        total += command.undo();
        System.out.println("Undo result is " + total);
        undoCommands.add(command);
        undoIndex--;
        return total;
    }

    public int redo() {
        if (undoCommands.isEmpty()) {
            System.out.println("No command to redo!");
            return -1;
        }
        Command command = undoCommands.remove(undoCommands.size() - 1);
        total += command.redo();
        System.out.println("Redo result is " + total);
        undoIndex++;
        return total;
    }
}
