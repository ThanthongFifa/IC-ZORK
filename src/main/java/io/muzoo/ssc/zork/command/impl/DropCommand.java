package io.muzoo.ssc.zork.command.impl;

import io.muzoo.ssc.zork.Game;
import io.muzoo.ssc.zork.Player;
import io.muzoo.ssc.zork.command.Command;

import java.util.List;

public class DropCommand implements Command {
    @Override
    public int numArgs() {
        return 1;
    }

    @Override
    public String getCommand() {
        return "drop";
    }

    @Override
    public void execute(Game game, List<String> args) {
        if(game.isStart()) {
            Player player = game.getPlayer();

            if (player.getInventory().containsKey(args.get(0))) {
                player.dropItem(args.get(0));
                System.out.println("you drop " + args.get(0));
            } else {
                System.out.println("you don't have that item in your inventory.");
            }
        } else {
            System.out.println("type 'play' to start the game");
        }
    }
}
