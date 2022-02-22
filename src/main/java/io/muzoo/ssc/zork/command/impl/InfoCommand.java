package io.muzoo.ssc.zork.command.impl;

import io.muzoo.ssc.zork.Game;
import io.muzoo.ssc.zork.Monster.Monster;
import io.muzoo.ssc.zork.Player;
import io.muzoo.ssc.zork.Room;
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
        Player player = game.getPlayer();
        Room location = game.getPlayer().getLocation();
        if (game.isStart()) {
            System.out.println("====== Player Info ======");
            System.out.println("Player max HP: " +  player.getMaxHP());
            System.out.println("Player HP: " +  player.getCurHP());
            System.out.println("Player power: " +  player.getPower());
            System.out.println("Inventory:");
            if (!player.getInventory().isEmpty()) {
                System.out.println("    " +  player.getInventory().keySet());
            } else {
                System.out.println("    your inventory is empty.");
            }

            System.out.println("====== GameMap Info ======");
            System.out.println("This place is " + "\"" +  location.getName() + "\"");
            System.out.println("    " +  location.getDescription());

            if (location.getItem() != null) {
                System.out.println("Item: " + location.getItem().getName());
                if (location.getItem().getAsciiArt() != null){
                    System.out.println(location.getItem().getAsciiArt());
                }
                System.out.println("    " + location.getItem().getText());
            } else {
                System.out.println("no item here.");
            }

            if (location.getMonster() != null){
                Monster monster = location.getMonster();
                if (monster.getAsciiArt() != null){
                    System.out.println(monster.getAsciiArt());
                }
                System.out.println("Monster: " + monster.getName());
                System.out.println("    Max HP: " + monster.getMaxHP());
                System.out.println("    Current HP: " + monster.getCurHP());
                System.out.println("    Attack power: " + monster.getPower());
            }

        } else {
            System.out.println("type 'play' to start the game");
        }
    }
}
