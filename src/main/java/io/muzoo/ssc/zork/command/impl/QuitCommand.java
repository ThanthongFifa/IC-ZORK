package io.muzoo.ssc.zork.command.impl;

import io.muzoo.ssc.zork.Game;
import io.muzoo.ssc.zork.GameMap.GameMap;
import io.muzoo.ssc.zork.GameMap.GameMapFactory;
import io.muzoo.ssc.zork.command.Command;

import java.util.List;

public class QuitCommand implements Command {
    @Override
    public int numArgs() {
        return 0;
    }

    @Override
    public String getCommand() {
        return "quit";
    }

    @Override
    public void execute(Game game, List<String> args) {
        if (game.isStart()){
            GameMap gameMap = GameMapFactory.get(game.getMapName());
            gameMap.deleteMap(game);
            game.setStart(false);
            game.mainMenu();
        } else {
            System.out.println("game haven't start.");
        }

    }
}
