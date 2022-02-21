package io.muzoo.ssc.zork.Item;

import io.muzoo.ssc.zork.Game;

public interface Item {

    String text();

    String name();

    void useItem(Game game);


}
