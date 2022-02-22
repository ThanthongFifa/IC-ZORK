package io.muzoo.ssc.zork.Item;

import io.muzoo.ssc.zork.Game;

public abstract class Item {

    protected String text;
    protected String name;
    protected String asciiArt;
    protected int atk;
    protected int hp;
    protected int use;


    public Item(int atk, int hp, int use) {
        this.atk = atk;
        this.hp = hp;
        this.use = use;
    }

    public String getName() {
        return name;
    }

    public String getText() {
        return text;
    }

    public int getAtk() {
        return atk;
    }

    public int getHp() {
        return hp;
    }

    public int getUse() {
        return use;
    }

    public void updateUse() {
        this.use -= 1;
    }

    public String getAsciiArt() {
        return asciiArt;
    }
}
