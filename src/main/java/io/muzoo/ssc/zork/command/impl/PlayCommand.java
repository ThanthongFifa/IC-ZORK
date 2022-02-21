package io.muzoo.ssc.zork.command.impl;

import io.muzoo.ssc.zork.Game;
import io.muzoo.ssc.zork.Map;
import io.muzoo.ssc.zork.command.Command;

import java.util.List;

public class PlayCommand implements Command {
    @Override
    public int numArgs() {
        return 0;
    }

    @Override
    public String getCommand() {
        return "play";
    }

    @Override
    public void execute(Game game, List<String> args) {
        Map.createMap(game);
        System.out.println("Map created");

    }
}
