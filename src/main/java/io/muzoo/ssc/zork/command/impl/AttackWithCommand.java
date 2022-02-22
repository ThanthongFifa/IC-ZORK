package io.muzoo.ssc.zork.command.impl;

import io.muzoo.ssc.zork.Game;
import io.muzoo.ssc.zork.GameMap.GameMap;
import io.muzoo.ssc.zork.GameMap.GameMapFactory;
import io.muzoo.ssc.zork.Item.Item;
import io.muzoo.ssc.zork.Monster.Monster;
import io.muzoo.ssc.zork.Player;
import io.muzoo.ssc.zork.command.Command;

import java.util.List;
import java.util.Random;

public class AttackWithCommand implements Command {
    @Override
    public int numArgs() {
        return 1;
    }

    @Override
    public String getCommand() {
        return "attack with";
    }

    @Override
    public void execute(Game game, List<String> args) {
        Player player = game.getPlayer();

        int playerCri = 1;
        Random a = new Random();
        int randomIntP = a.nextInt(100) + 1;
        if ( randomIntP <= 10){
            playerCri = 2;
        }

        int monsterCri = 1;
        Random b = new Random();
        int randomIntM = b.nextInt(100) + 1;
        if ( randomIntM <= 10){
            monsterCri = 2;
        }

        if (player.getInventory().containsKey(args.get(0)) && player.getLocation().getMonster() != null) {
            Monster monster = player.getLocation().getMonster();
            Item item = player.getInventory().get(args.get(0));
            System.out.println("================================================================\n");
            System.out.println("you use " + item.getName() + " to attack " + monster.getName());
            if ( playerCri > 1) {
                System.out.println("CRITICAL HIT!!!");
            }
            monster.damage(player.getPower() + item.getAtk() * playerCri);
            System.out.println("you deal " +  (player.getPower() + item.getAtk() * playerCri) + " damege!!");
            System.out.println("current " + monster.getName() + "HP: " + monster.getCurHP());
            if(monster.getCurHP() <= 0){
                System.out.println(monster.getName() + " slain!");
                monster.setAlive(false);
                player.getLocation().setMonster(null);
            }
            System.out.println("================================================================\n");
            if (monster.isAlive()) {
                System.out.println(monster.getName() + "attack back.");
                if (monsterCri > 1) {
                    System.out.println("CRITICAL HIT!!!");
                }
                player.damage(monster.getPower() * monsterCri);
                System.out.println(monster.getName() + "deal " + (monster.getPower() * monsterCri) + " damage!!" );
                System.out.println("current player HP: " + player.getCurHP());
                System.out.println("================================================================\n");
                if (player.getCurHP() <= 0){
                    System.out.println("\n" +
                            "▓██   ██▓ ▒█████   █    ██    ▓█████▄  ██▓▓█████ \n" +
                            " ▒██  ██▒▒██▒  ██▒ ██  ▓██▒   ▒██▀ ██▌▓██▒▓█   ▀ \n" +
                            "  ▒██ ██░▒██░  ██▒▓██  ▒██░   ░██   █▌▒██▒▒███   \n" +
                            "  ░ ▐██▓░▒██   ██░▓▓█  ░██░   ░▓█▄   ▌░██░▒▓█  ▄ \n" +
                            "  ░ ██▒▓░░ ████▓▒░▒▒█████▓    ░▒████▓ ░██░░▒████▒\n" +
                            "   ██▒▒▒ ░ ▒░▒░▒░ ░▒▓▒ ▒ ▒     ▒▒▓  ▒ ░▓  ░░ ▒░ ░\n" +
                            " ▓██ ░▒░   ░ ▒ ▒░ ░░▒░ ░ ░     ░ ▒  ▒  ▒ ░ ░ ░  ░\n" +
                            " ▒ ▒ ░░  ░ ░ ░ ▒   ░░░ ░ ░     ░ ░  ░  ▒ ░   ░   \n" +
                            " ░ ░         ░ ░     ░           ░     ░     ░  ░\n" +
                            " ░ ░                           ░                 \n");
                    GameMap gameMap = GameMapFactory.get(game.getMapName());
                    gameMap.deleteMap(game);
                    game.setStart(false);
                    System.out.println("================================================================\n");
                    System.out.println("type 'play' to start again.");

                }
            }
        } else {
            System.out.println("no such item in your inventory OR there is no monster.");

        }


    }
}
