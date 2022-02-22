package io.muzoo.ssc.zork;

import io.muzoo.ssc.zork.Item.Item;
import io.muzoo.ssc.zork.Monster.Monster;

import java.util.HashMap;
import java.util.Map;

public class Room {

    private String name;
    private String description;
    private Item item;
    private Monster monster;

    private Map<String, Room> adjacentRoom = new HashMap<>();

    public Room(String name,String description) {
        this.description = description;
        this.name = name;
    }

    public Room nextRoom(String direction){
        return adjacentRoom.get(direction);
    }


    public void setNextroom(String direction, Room thisRoom){
        System.out.println(direction + "  " + thisRoom);
        this.adjacentRoom.put(direction, thisRoom);
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public void setMonster(Monster monster) {
        this.monster = monster;
    }

    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }

    public Item getItem() {
        return item;
    }

    public Monster getMonster() {
        return monster;
    }
}
