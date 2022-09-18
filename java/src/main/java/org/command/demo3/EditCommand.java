package org.command.demo3;

public class EditCommand extends Command {
    private BoardScreen boardScreen = new BoardScreen();

    @Override
    public void execute() {
        boardScreen.edit();
    }
}
