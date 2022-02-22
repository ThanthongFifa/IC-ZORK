package io.muzoo.ssc.zork.Item.impl;

import io.muzoo.ssc.zork.Item.Item;

public class Bone extends Item {
    public Bone() {
        super(10, 0, 999);
        name = "Bone";
        text = "Bone can be use as weapon.";
        asciiArt = "    .-.               .-.\n" +
                   "    (   `-._________.-'   )\n" +
                   "     >=     _______     =<\n" +
                   "    (   ,-'`       `'-,   )\n" +
                   "     `-'               `-'";
    }
}
