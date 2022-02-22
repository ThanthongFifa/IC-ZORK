package io.muzoo.ssc.zork.Monster.impl;

import io.muzoo.ssc.zork.Item.Item;
import io.muzoo.ssc.zork.Monster.Monster;
import io.muzoo.ssc.zork.Room;

public class Skeleton extends Monster {
    public Skeleton(Room location, Item dropItem) {
        super(true, 200, 500, location, dropItem);
        name = "Skeleton";
        asciiArt = "      .-.\n" +
                "     (o.o)\n" +
                "      |=|\n" +
                "     __|__\n" +
                "   //.=|=.\\\\\n" +
                "  // .=|=. \\\\\n" +
                "  \\\\ .=|=. //\n" +
                "   \\\\(_=_)//\n" +
                "    (:| |:)\n" +
                "     || ||\n" +
                "     () ()\n" +
                "     || ||\n" +
                "     || ||\n" +
                "    ==' '==";
    }
}
