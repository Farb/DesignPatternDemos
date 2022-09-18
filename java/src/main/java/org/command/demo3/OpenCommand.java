package org.command.demo3;

public class OpenCommand extends Command {
    private BoardScreen boardScreen = new BoardScreen();

    @Override
    public void execute() {
        boardScreen.open();
    }
}
