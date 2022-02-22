package io.muzoo.ssc.zork.Monster;

import io.muzoo.ssc.zork.Item.Item;
import io.muzoo.ssc.zork.Room;

public class Monster {

    protected boolean isAlive = true;
    protected int maxHP;
    protected int curHP;
    protected int power;
    protected Item dropItem;
    protected Room location;
    protected String asciiArt;
    protected String name;

    public Monster(boolean isAlive, int maxHP, int power, Room location, Item dropItem) {
        this.isAlive = isAlive;
        this.maxHP = maxHP;
        this.curHP = maxHP;
        this.power = power;
        this.location = location;
        this.dropItem = dropItem;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public int getMaxHP() {
        return maxHP;
    }

    public int getCurHP() {
        return curHP;
    }

    public int getPower() {
        return power;
    }

    public Item getDropItem() {
        return dropItem;
    }

    public Room getLocation() {
        return location;
    }

    public String getAsciiArt() {
        return asciiArt;
    }

    public String getName() {
        return name;
    }

    public int damage(int atkPower){
        if (curHP - atkPower > 0){
            curHP -= atkPower;
        } else {
            curHP = 0;
            isAlive = false;
        }
        return curHP;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }
}
