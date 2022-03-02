package io.muzoo.ssc.zork.Item.impl;

import io.muzoo.ssc.zork.Item.Item;

public class Sword extends Item {
    public Sword() {
        super(100, 0, 999);
        name = "sword";
        text = "an old rusty sword";
        asciiArt = "      /| ________________\n" +
                "O|===|* >________________>\n" +
                "      \\|";


    }
}
