package io.muzoo.ssc.zork.Item.impl;

import io.muzoo.ssc.zork.Item.Item;

public class Axes extends Item {

    public Axes() {
        super(50, 0, 100);
        name = "axes";
        text = "war axes deal alot of damage.";
        asciiArt = "  ,:\\      /:.\n" +
                " //  \\_()_/  \\\\\n" +
                "||   |    |   ||\n" +
                "||   |    |   ||\n" +
                "||   |____|   ||\n" +
                " \\\\  / || \\  //\n" +
                "  `:/  ||  \\;'\n" +
                "       ||\n" +
                "       ||\n" +
                "       XX\n" +
                "       XX\n" +
                "       XX\n" +
                "       XX\n" +
                "       OO\n" +
                "       `'";
    }
}
