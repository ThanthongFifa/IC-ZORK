package io.muzoo.ssc.zork.GameMap;

import io.muzoo.ssc.zork.Game;

public interface GameMap {

    String name();

    void createMap(Game game);

    void deleteMap(Game game);

    void printMap();
}
