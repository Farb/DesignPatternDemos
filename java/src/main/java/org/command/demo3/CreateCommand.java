package org.command.demo3;

public class CreateCommand extends Command {
    private BoardScreen boardScreen = new BoardScreen();

    @Override
    public void execute() {
        boardScreen.create();
    }
}
