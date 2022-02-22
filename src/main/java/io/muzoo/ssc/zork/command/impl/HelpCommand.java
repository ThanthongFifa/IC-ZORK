package io.muzoo.ssc.zork.command.impl;

import io.muzoo.ssc.zork.Game;
import io.muzoo.ssc.zork.command.Command;
import io.muzoo.ssc.zork.command.CommandFactory;

import java.util.List;

public class HelpCommand implements Command {

    @Override
    public int numArgs() {
        return 0;
    }

    @Override
    public String getCommand() {
        return "help";
    }

    @Override
    public void execute(Game game, List<String> args) {
        List<String> commands = CommandFactory.getAll();

        for (String command: commands) {
            if (command.equals("go")){
                System.out.println(command + " [north, east, south, west]");
            } else if (command.equals("attack")){
                System.out.println(command + " [item name]");
            }
            else {
                System.out.println(command);
            }
        }
    }
}
