package io.muzoo.ssc.zork.command.impl;

import io.muzoo.ssc.zork.Game;
import io.muzoo.ssc.zork.Item.Item;
import io.muzoo.ssc.zork.Player;
import io.muzoo.ssc.zork.command.Command;

import java.util.List;

public class HealCommand implements Command {
    @Override
    public int numArgs() {
        return 0;
    }

    @Override
    public String getCommand() {
        return "heal";
    }

    @Override
    public void execute(Game game, List<String> args) {
        Player player = game.getPlayer();

        if (player.getInventory().containsKey("HP potion")){
            Item potion = player.getInventory().get("HP potion");
            int heal = potion.getHp();
            if (player.getCurHP() + heal > player.getMaxHP()){
                player.setCurHP(player.getMaxHP());
            } else {
                player.setCurHP(player.getCurHP() + heal);
            }
            player.getInventory().remove("HP potion");

        } else {
            System.out.println("you dont have HP potion");
        }

    }
}
