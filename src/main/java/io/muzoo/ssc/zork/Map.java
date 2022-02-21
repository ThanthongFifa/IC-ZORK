package io.muzoo.ssc.zork;

public class Map {

    public static void createMap(Game game){

        Room entrance = new Room("entrane","This it the first room");
        Room secondroom = new Room("dungeon","it is dark in here");

        game.getMap().add(entrance);
        game.getMap().add(secondroom);

        entrance.setNextroom("north", secondroom);

        secondroom.setNextroom("south", entrance);

        game.getPlayer().setLocation(entrance);


    }

    public static void printMap(){
        System.out.println("   --------   ");
        System.out.println("   |      |   ");
        System.out.println("   |      |   ");
        System.out.println("   --| |--"   );
        System.out.println("     | |   "   );
        System.out.println("     | |   "   );
        System.out.println("   --| |--"   );
        System.out.println("   |      |"   );
        System.out.println("   |      |"   );
        System.out.println("   --------"   );
    }
}
