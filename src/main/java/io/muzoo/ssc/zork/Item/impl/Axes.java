package io.muzoo.ssc.zork.Item.impl;

import io.muzoo.ssc.zork.Item.Item;

public class Axes extends Item {

    public Axes() {
        super(50, 0, 100);
        name = "Axes";
        text = "war axes deal a lot of damage.";
        asciiArt = " _________________.---.______\n" +
                "(_(______________(_o o_(____()\n" +
                "        mrf  .___.'. .'.___.\n" +
                "             \\ o    Y    o /\n" +
                "              \\ \\__   __/ /\n" +
                "               '.__'-'__.'\n" +
                "                   '''";
    }
}
