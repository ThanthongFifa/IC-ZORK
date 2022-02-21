package io.muzoo.ssc.zork.command.impl;

import io.muzoo.ssc.zork.Game;
import io.muzoo.ssc.zork.Map;
import io.muzoo.ssc.zork.command.Command;

import java.util.List;

public class InfoCommand implements Command {
    @Override
    public int numArgs() {
        return 0;
    }

    @Override
    public String getCommand() {
        return "info";
    }

    @Override
    public void execute(Game game, List<String> args) {
        if (game.isStart()) {
            System.out.println("Map Info");
        } else {
            System.out.println("type 'play' to start the game");
        }
    }
}
