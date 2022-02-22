package io.muzoo.ssc.zork.Item.impl;

import io.muzoo.ssc.zork.Game;
import io.muzoo.ssc.zork.Item.Item;

public class Potion extends Item {
    public Potion() {
        super(1, 100, 1);
        name = "Health potion";
        text = "This heal you. +100HP";
        asciiArt = "\n" +
                "  |~|  \n" +
                "  | |  \n" +
                ".'H P`.\n" +
                "`.___.'\n";
    }
}
