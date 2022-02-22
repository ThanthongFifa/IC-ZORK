package io.muzoo.ssc.zork.GameMap.Maps;

import io.muzoo.ssc.zork.Game;
import io.muzoo.ssc.zork.GameMap.GameMap;
import io.muzoo.ssc.zork.Item.impl.Axes;
import io.muzoo.ssc.zork.Item.impl.Potion;
import io.muzoo.ssc.zork.Monster.impl.Skeleton;
import io.muzoo.ssc.zork.Room;

public class map2 implements GameMap {

    @Override
    public String name() {
        return "map2";
    }

    @Override
    public void createMap(Game game) {
        Room entrance = new Room("gate","you are in front of a gate of a dungeon");
        Room secondroom = new Room("dungeon","it is dark in here");

        game.getMap().add(entrance);
        game.getMap().add(secondroom);

        entrance.setNextroom("north", secondroom);

        secondroom.setNextroom("south", entrance);
        secondroom.setMonster(new Skeleton(secondroom, null));
        secondroom.setItem(new Axes());

        game.getPlayer().setLocation(entrance);
    }

    @Override
    public void deleteMap(Game game) {
        game.getMap().clear();
        game.getPlayer().setLocation(null);
    }

    @Override
    public void printMap(){
        System.out.println("================= MAP =================");
        System.out.println("                --------             ");
        System.out.println("                |      |             ");
        System.out.println("                |      |             ");
        System.out.println("                --| |--              ");
        System.out.println("                  | |                ");
        System.out.println("                  | |                ");
        System.out.println("                --| |--              ");
        System.out.println("                |      |             ");
        System.out.println("                |      |             ");
        System.out.println("                --------             ");
        System.out.println("=======================================");
    }

}
