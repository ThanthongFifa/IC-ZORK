package io.muzoo.ssc.zork;

import io.muzoo.ssc.zork.command.ExitCommand;

import java.util.Scanner;

public class Game {

    private boolean isExit = false;

    private Scanner scaner = new Scanner(System.in);

    public boolean isExit() {
        return isExit;
    }

    public void exit() {
        isExit = true;
        scaner.close();
    }

    public void run(){
        System.out.println(" Let's the game begin");

        while (!isExit() && scaner.hasNextLine()) {
            System.out.println("Enter command: ");
            String rawInput = scaner.nextLine();

            ExitCommand exitCommand = new ExitCommand();
            exitCommand.execute(this);
        }
        scaner.close();
    }
}
