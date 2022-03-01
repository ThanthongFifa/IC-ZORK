package io.muzoo.ssc.zork.command.impl;

import io.muzoo.ssc.zork.Game;
import io.muzoo.ssc.zork.SaveGame;
import io.muzoo.ssc.zork.command.Command;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.List;

public class SaveCommand implements Command {
    SaveGame save = new SaveGame();

    @Override
    public int numArgs() {
        return 1;
    }

    @Override
    public String getCommand() {
        return "save";
    }

    @Override
    public void execute(Game game, List<String> args) throws IOException {
        save.setGameMap(game.getGameMap());
        save.setPlayer(game.getPlayer());
        try {
            FileOutputStream fileOut = new FileOutputStream(args.get(0) + ".txt");

            ObjectOutputStream objOut = new ObjectOutputStream(fileOut);

            objOut.writeObject(save);
        } catch (Exception e) {
            e.getStackTrace();
        }

    }
}
