package io.muzoo.ssc.zork.command.impl;

import io.muzoo.ssc.zork.Game;
import io.muzoo.ssc.zork.GameMap.GameMap;
import io.muzoo.ssc.zork.GameMap.GameMapFactory;
import io.muzoo.ssc.zork.command.Command;

import java.util.List;

public class PlayCommand implements Command {
    @Override
    public int numArgs() {
        return 1;
    }

    @Override
    public String getCommand() {
        return "play";
    }

    @Override
    public void execute(Game game, List<String> args) {
        GameMap gameMap = GameMapFactory.get(args.get(0));
        if (!game.isStart()) {
            game.setStart(true);
            gameMap.createMap(game);
            game.setMapName(args.get(0));
            game.getPlayer().setCurHP(game.getPlayer().getMaxHP());
            System.out.println("map1 created");
            System.out.println("\n" +
                    "███████╗████████╗ █████╗ ██████╗ ████████╗    ███╗   ██╗███████╗██╗    ██╗     ██████╗  █████╗ ███╗   ███╗███████╗\n" +
                    "██╔════╝╚══██╔══╝██╔══██╗██╔══██╗╚══██╔══╝    ████╗  ██║██╔════╝██║    ██║    ██╔════╝ ██╔══██╗████╗ ████║██╔════╝\n" +
                    "███████╗   ██║   ███████║██████╔╝   ██║       ██╔██╗ ██║█████╗  ██║ █╗ ██║    ██║  ███╗███████║██╔████╔██║█████╗  \n" +
                    "╚════██║   ██║   ██╔══██║██╔══██╗   ██║       ██║╚██╗██║██╔══╝  ██║███╗██║    ██║   ██║██╔══██║██║╚██╔╝██║██╔══╝  \n" +
                    "███████║   ██║   ██║  ██║██║  ██║   ██║       ██║ ╚████║███████╗╚███╔███╔╝    ╚██████╔╝██║  ██║██║ ╚═╝ ██║███████╗\n" +
                    "╚══════╝   ╚═╝   ╚═╝  ╚═╝╚═╝  ╚═╝   ╚═╝       ╚═╝  ╚═══╝╚══════╝ ╚══╝╚══╝      ╚═════╝ ╚═╝  ╚═╝╚═╝     ╚═╝╚══════╝\n" +
                    "                                                                                                                  \n");
            System.out.println("=========================================================================================================");
            System.out.println("Map name: " + game.getMapName());
        }
    }
}
