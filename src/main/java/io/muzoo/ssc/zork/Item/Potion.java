package io.muzoo.ssc.zork.Item;

import io.muzoo.ssc.zork.Game;

public class Potion implements Item{
    @Override
    public String text() {
        return "This will heal you";
    }

    @Override
    public String name() {
        return "Health Potion";
    }

    @Override
    public void useItem(Game game) {

    }
}
