package io.muzoo.ssc.zork.Monster.impl;

import io.muzoo.ssc.zork.Item.Item;
import io.muzoo.ssc.zork.Monster.Monster;
import io.muzoo.ssc.zork.Room;

public class Lich extends Monster {
    public Lich(Room location, Item dropItem) {
        super(true, 1000, 150, location, dropItem);
        name = "Lich";
        asciiArt = "                 /\\\n" +
                "                 ||\n" +
                "   ____ (((+))) _||_\n" +
                "  /.--.\\  .-.  /.||.\\\n" +
                " /.,   \\\\(0.0)// || \\\\\n" +
                "/;`\";/\\ \\\\|m|//  ||  ;\\\n" +
                "|:   \\ \\__`:`____||__:|\n" +
                "|:    \\__ \\T/ (@~)(~@)|\n" +
                "|:    _/|     |\\_\\/  :|\n" +
                "|:   /  |     |  \\   :|\n" +
                "|'  /   |     |   \\  '|\n" +
                " \\_/    |     |    \\_/\n" +
                "        |     |\n" +
                "        |_____|\n" +
                "        |_____|";
    }
}
