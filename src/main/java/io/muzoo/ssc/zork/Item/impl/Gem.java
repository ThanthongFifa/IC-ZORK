package io.muzoo.ssc.zork.Item.impl;

import io.muzoo.ssc.zork.Item.Item;

public class Gem extends Item {
    public Gem() {
        super(1, 0, 999);
        name = "gem";
        text = "with this magical gem you can go home.";
        asciiArt = " .     '     ,\n" +
                "    _________\n" +
                " _ /_|_____|_\\ _\n" +
                "   '. \\   / .'\n" +
                "     '.\\ /.'\n" +
                "       '.'\n";
    }
}
