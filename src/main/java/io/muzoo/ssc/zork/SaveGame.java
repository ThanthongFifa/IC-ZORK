package io.muzoo.ssc.zork;

import io.muzoo.ssc.zork.GameMap.GameMap;

public class SaveGame {

    private GameMap gameMap;

    private Player player;

    public GameMap getGameMap() {
        return gameMap;
    }

    public void setGameMap(GameMap gameMap) {
        this.gameMap = gameMap;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }
}
