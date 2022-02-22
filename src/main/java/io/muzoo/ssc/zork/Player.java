package io.muzoo.ssc.zork;

import io.muzoo.ssc.zork.Item.Item;

import java.util.HashMap;
import java.util.Map;

public class Player {

    private int fullHealth;
    private int currentHealth;
    private int power;
    private boolean isAlive = true;
    private Room location;
    private Map<String, Item> inventory = new HashMap<>();


    public Player() {
        fullHealth = 500;
        currentHealth = 500;
        power = 50;
    }


    public Room getLocation() {
        return location;
    }

    public void setLocation(Room location) {
        this.location = location;
    }

    public int getFullHealth() {
        return fullHealth;
    }

    public int getPower() {
        return power;
    }

    public int getCurrentHealth() {
        return currentHealth;
    }

    public void takeItem(Item item){
        //System.out.println("take " + item.getName());
        if(!inventory.containsKey(item.getName())){
            inventory.put(item.getName(), item);
        } else {
            System.out.println("** you can't hold more than 1 of each item. **");
        }
    }

    public void dropItem(String itemName){
        inventory.remove(itemName);

    }

    public Map<String, Item> getInventory() {
        return inventory;
    }
}
