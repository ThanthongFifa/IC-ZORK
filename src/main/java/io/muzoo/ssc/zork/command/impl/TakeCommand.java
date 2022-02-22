package io.muzoo.ssc.zork.command.impl;

import io.muzoo.ssc.zork.Game;
import io.muzoo.ssc.zork.Player;
import io.muzoo.ssc.zork.Room;
import io.muzoo.ssc.zork.command.Command;

import java.util.List;

public class TakeCommand implements Command {
    @Override
    public int numArgs() {
        return 0;
    }

    @Override
    public String getCommand() {
        return "take";
    }

    @Override
    public void execute(Game game, List<String> args) {
        if (game.isStart()) {
            Player player = game.getPlayer();
            Room location = game.getPlayer().getLocation();

            if (location.getItem() != null) {
                System.out.println(location.getItem().getName() + " has been added to your inventory.");
                player.takeItem(location.getItem());
                location.setItem(null);
            } else {
                System.out.println("no item in this room.");
            }
        } else {
            System.out.println("type 'play' to start the game");
        }
    }
}
