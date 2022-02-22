package io.muzoo.ssc.zork.command.impl;

import io.muzoo.ssc.zork.Game;
import io.muzoo.ssc.zork.GameMap.GameMap;
import io.muzoo.ssc.zork.GameMap.GameMapFactory;
import io.muzoo.ssc.zork.GameMap.map1;
import io.muzoo.ssc.zork.command.Command;

import java.util.List;

public class MapCommand implements Command {
    @Override
    public int numArgs() {
        return 0;
    }

    @Override
    public String getCommand() {
        return "map";
    }

    @Override
    public void execute(Game game, List<String> args) {
        if (game.isStart()){
            GameMap gameMap = GameMapFactory.get(game.getMapName());
            gameMap.printMap();
        } else {
            System.out.println("type 'play [map name]' to start the game");
        }

    }
}
