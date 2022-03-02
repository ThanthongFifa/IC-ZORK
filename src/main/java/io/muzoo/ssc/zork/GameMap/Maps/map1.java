package io.muzoo.ssc.zork.GameMap.Maps;

import io.muzoo.ssc.zork.Game;
import io.muzoo.ssc.zork.GameMap.GameMap;
import io.muzoo.ssc.zork.Item.impl.Axes;
import io.muzoo.ssc.zork.Item.impl.Potion;
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
        Room room1 = new Room("Room1", "");
        Room room2 = new Room("Room2", "");
        Room room3 = new Room("Room3", "");
        Room room4 = new Room("Room4", "");
        Room room5 = new Room("Room5", "");
        Room room6 = new Room("Room6", "");
        Room room7 = new Room("Room7", "");

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

        //room2
        room2.setNextroom("north", room3);
        room2.setNextroom("west", room1);
        room2.setNextroom("east", room6);

        //room3
        room3.setNextroom("west",room2);

        //room4
        room4.setNextroom("north", room5);
        room4.setNextroom("south", room1);

        //room5
        room5.setNextroom("south", room4);
        room5.setNextroom("west", room7);

        //room6
        room6.setNextroom("north", room7);
        room6.setNextroom("west", room2);

        //room7
        room7.setNextroom("east", room5);
        room7.setNextroom("south", room6);


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
