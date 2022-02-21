package io.muzoo.ssc.zork;

import io.muzoo.ssc.zork.command.Command;
import io.muzoo.ssc.zork.command.CommandFactory;
import io.muzoo.ssc.zork.command.CommandParser;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Game {

    private boolean isExit = false;
    private Scanner scaner = new Scanner(System.in);
    private CommandParser commandParser = new CommandParser();
    private boolean start = false;

    private Player player = new Player();
    private List<Room> map = new ArrayList<>();

    public List<Room> getMap() {
        return map;
    }

    public Player getPlayer() {
        return player;
    }

    public boolean isExit() {
        return isExit;
    }

    public void exit() {
        isExit = true;
        scaner.close();
    }

    public void setStart(boolean start) {
        this.start = start;
    }

    public boolean isStart() {
        return start;
    }

    public void run(){
        System.out.println("===================== Main Menu =====================");
        System.out.println("type play to start the game");

        while (!isExit() && scaner.hasNextLine()) {
            System.out.println("Enter command: ");
            String rawInput = scaner.nextLine();

            List<String> input = commandParser.parse(rawInput);
            Command command = CommandFactory.get(input.get(0)); // get first command word

            if (command == null){
                System.out.println("this command does not exist");
            } else{
                command.execute(this, input.subList(1, input.size()));
            }
        }
    }
}
