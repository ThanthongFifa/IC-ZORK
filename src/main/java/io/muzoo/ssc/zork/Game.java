package io.muzoo.ssc.zork;

import io.muzoo.ssc.zork.command.Command;
import io.muzoo.ssc.zork.command.CommandFactory;

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

            Command command = CommandFactory.get(rawInput);
            if (command == null){
                System.out.println("this command does not exist");
            } else {
                command.execute(this);
            }
        }

        scaner.close();
    }
}
