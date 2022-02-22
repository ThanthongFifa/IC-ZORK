package io.muzoo.ssc.zork;

import io.muzoo.ssc.zork.Item.impl.Potion;

public class GameMap {

    public static void createMap(Game game){

        Room entrance = new Room("gate","you are in front of a gate of a dungeon");
        Room secondroom = new Room("dungeon","it is dark in here");

        game.getMap().add(entrance);
        game.getMap().add(secondroom);

        entrance.setNextroom("north", secondroom);
        entrance.setItem(new Potion());

        secondroom.setNextroom("south", entrance);

        game.getPlayer().setLocation(entrance);


    }

    public static void printMap(){
        System.out.println("================= MAP =================");
        System.out.println("              --------             ");
        System.out.println("              |      |             ");
        System.out.println("              |      |             ");
        System.out.println("              --| |--"             );
        System.out.println("                | |   "             );
        System.out.println("                | |   "             );
        System.out.println("              --| |--"             );
        System.out.println("              |      |"             );
        System.out.println("              |      |"             );
        System.out.println("              --------"             );
        System.out.println("=======================================");
    }
}
