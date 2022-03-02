package io.muzoo.ssc.zork.GameMap.Maps;

import io.muzoo.ssc.zork.Game;
import io.muzoo.ssc.zork.GameMap.GameMap;
import io.muzoo.ssc.zork.Item.impl.*;
import io.muzoo.ssc.zork.Monster.impl.Lich;
import io.muzoo.ssc.zork.Monster.impl.Skeleton;
import io.muzoo.ssc.zork.Room;

public class map1 implements GameMap {

    @Override
    public String name() {
        return "map1";
    }

    @Override
    public void createMap(Game game) {
        //create room
        Room room1 = new Room("Room1", "You stuck in this dungeon, defeat the dungeon master to go out");
        Room room2 = new Room("Room2", "");
        Room room3 = new Room("Room3", "");
        Room room4 = new Room("Room4", "");
        Room room5 = new Room("Room5", "");
        Room room6 = new Room("Room6", "");
        Room room7 = new Room("Room7", "Defeat THE LICH");

        //add room to game
        game.getMap().add(room1);
        game.getMap().add(room2);
        game.getMap().add(room3);
        game.getMap().add(room4);
        game.getMap().add(room5);
        game.getMap().add(room6);
        game.getMap().add(room7);

        //room1
        room1.setNextroom("north", room4);
        room1.setNextroom("east", room2);
        room1.setItem(new Potion());

        //room2
        room2.setNextroom("north", room3);
        room2.setNextroom("west", room1);
        room2.setNextroom("east", room6);
        room2.setItem(new Axes());
        room2.setMonster(new Skeleton(room2,new Bone()));

        //room3
        room3.setNextroom("west",room2);
        room3.setItem(new Potion());

        //room4
        room4.setNextroom("north", room5);
        room4.setNextroom("south", room1);
        room4.setItem(new Sword());
        room4.setMonster(new Skeleton(room4,null));

        //room5
        room5.setNextroom("south", room4);
        room5.setNextroom("west", room7);
        room5.setMonster(new Skeleton(room5,null));
        room6.setItem(new Potion());

        //room6
        room6.setNextroom("north", room7);
        room6.setNextroom("west", room2);
        room6.setMonster(new Skeleton(room6,null));
        room6.setItem(new Potion());

        //room7
        room7.setNextroom("east", room5);
        room7.setNextroom("south", room6);
        room7.setMonster(new Lich(room7, new Gem()));

        //set start location
        game.getPlayer().setLocation(room1);


    }

    @Override
    public void deleteMap(Game game) {
        game.getMap().clear();
        game.getPlayer().setLocation(null);
    }

    @Override
    public void printMap(){
        System.out.println("    +-----------------------------+                                               +------------------------------------+\n" +
                "    |                             |                                               |                                    |\n" +
                "    |                             |                                               |                                    |\n" +
                "    |                             |                                               |                                    |\n" +
                "    |                             |                                               |                                    |\n" +
                "    |                             |                                               |                                    |\n" +
                "    |             5               +-----------------------------------------------+                                    |\n" +
                "    |                             |                                               |                   7                |\n" +
                "    |                             |                                               |                                    |\n" +
                "    |                             |                                               |                                    |\n" +
                "    |                             |                                               |                                    |\n" +
                "    |                             |                                               |                                    |\n" +
                "    +--------------+--------------+                                               |                                    |\n" +
                "                   |                                                              +------------------------+-----------+\n" +
                "                   |                                                                                       |\n" +
                "+------------------+---------------------+                                                                 |\n" +
                "|                                        |                                                          +------+------+\n" +
                "|                                        |                                                          |             |\n" +
                "|                                        |                                                          |             |\n" +
                "|                                        |                                                          |             |\n" +
                "|                                        |                                                          |     6       |\n" +
                "|                   4                    |                                                          |             +----------+\n" +
                "|                                        |          +-----------------------------+                 |             |          |\n" +
                "|                                        |          |                             |                 |             |          |\n" +
                "|                                        |          |                             |                 |             |          |\n" +
                "|                                        |          |              3              +------+          +-------------+          |\n" +
                "|                                        |          |                             |      |                                   |\n" +
                "+---------------------+------------------+          |                             |      |                                   |\n" +
                "                      |                             +-----------------------------+      |                                   |\n" +
                "                      |                                                                  |                                   |\n" +
                "                      |                                                                  |                                   |\n" +
                "                      |                                                                  |                                   |\n" +
                "                      |                                                                  |                                   |\n" +
                "                      |                                                      +-----------+-------------------------+         |\n" +
                "     +----------------+------------------+                                   |                                     |         |\n" +
                "     |                                   |                                   |                                     |         |\n" +
                "     |                                   |                                   |                                     |         |\n" +
                "     |                                   +-----------------------------------+                2                    +---------+\n" +
                "     |                1                  |                                   |                                     |\n" +
                "     |                                   |                                   |                                     |\n" +
                "     |                                   |                                   |                                     |\n" +
                "     |                                   |                                   +-------------------------------------+\n" +
                "     +-----------------------------------+");
    }

}
