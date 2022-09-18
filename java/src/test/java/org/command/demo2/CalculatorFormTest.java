package org.command.demo2;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorFormTest {
    private static CalculatorForm form;

    @BeforeAll
    static void setup() {
        form = new CalculatorForm();
    }

    @Test
    void calculate() {
        List<Command> commands = new ArrayList<>();
        commands.add(new AddCommand(3));
        commands.add(new AddCommand(5));
        form.setCommands(commands);

        int result = form.calculate();

        assertEquals(8, result);
    }

    @Test
    void undo() {
        List<Command> commands = new ArrayList<>();
        commands.add(new AddCommand(3));
        commands.add(new AddCommand(5));
        commands.add(new AddCommand(1));
        commands.add(new AddCommand(2));
        form.setCommands(commands);

        form.calculate();
        int result = form.undo();

        assertEquals(9, result);
    }

    @Test
    void redo() {
        List<Command> commands = new ArrayList<>();
        commands.add(new AddCommand(3));
        commands.add(new AddCommand(5));
        commands.add(new AddCommand(1));
        commands.add(new AddCommand(2));
        form.setCommands(commands);

        form.calculate();
        form.undo();
        int result = form.redo();

        assertEquals(11, result);
    }
}