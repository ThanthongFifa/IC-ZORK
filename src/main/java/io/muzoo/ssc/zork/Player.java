package io.muzoo.ssc.zork;

import io.muzoo.ssc.zork.GameMap.GameMap;
import io.muzoo.ssc.zork.GameMap.GameMapFactory;
import io.muzoo.ssc.zork.Item.Item;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class Player {

    private int maxHP;
    private int curHP;
    private int power;
    private boolean isAlive = true;
    private Room location;
    private Map<String, Item> inventory = new HashMap<>();


    public Player() {
        maxHP = 500;
        curHP = 500;
        power = 50;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }

    public Room getLocation() {
        return location;
    }

    public void setLocation(Room location) {
        this.location = location;
    }

    public int getMaxHP() {
        return maxHP;
    }

    public int getPower() {
        return power;
    }

    public int getCurHP() {
        return curHP;
    }

    public void setCurHP(int curHP) {
        this.curHP = curHP;
    }

    public void takeItem(Item item){
        //System.out.println("take " + item.getName());
        if(!inventory.containsKey(item.getName())){
            inventory.put(item.getName(), item);
        } else {
            System.out.println("** you can't hold more than 1 of each item. **");
        }
    }

    public Item dropItem(String itemName){
        Item item = inventory.get(itemName);
        inventory.remove(itemName);
        return item;
    }

    public Map<String, Item> getInventory() {
        return inventory;
    }

    public int takeDamage(int atkPower){
        if (curHP - atkPower > 0){
            curHP -= atkPower;
        } else {
            curHP = 0;
            isAlive = false;
        }
        return curHP;
    }
}
