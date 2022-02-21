package io.muzoo.ssc.zork;

public class Player {

    private int fullHealth;
    private int currentHealth;
    private int power;
    private boolean isAlive = true;
    private Room location;


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
}
