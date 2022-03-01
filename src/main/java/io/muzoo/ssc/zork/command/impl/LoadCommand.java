package io.muzoo.ssc.zork.command.impl;

import io.muzoo.ssc.zork.Game;
import io.muzoo.ssc.zork.SaveGame;
import io.muzoo.ssc.zork.command.Command;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

public class LoadCommand implements Command {
    @Override
    public int numArgs() {
        return 1;
    }

    @Override
    public String getCommand() {
        return "load";
    }

    @Override
    public void execute(Game game, List<String> args) throws IOException {
        try{
            FileInputStream fileIn = new FileInputStream(args.get(0) + ".txt");
            ObjectInputStream objIn = new ObjectInputStream(fileIn);

            SaveGame saveGame = (SaveGame) objIn.readObject();

            game.setPlayer(saveGame.getPlayer());
            game.setGameMap(saveGame.getGameMap());
            game.setMapName(saveGame.getGameMap().name());
            game.setStart(true);

        }
        catch (Exception e) {
            e.getStackTrace();
        }
    }
}
