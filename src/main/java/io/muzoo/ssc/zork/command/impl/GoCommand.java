package io.muzoo.ssc.zork.command.impl;

import io.muzoo.ssc.zork.Game;
import io.muzoo.ssc.zork.Player;
import io.muzoo.ssc.zork.Room;
import io.muzoo.ssc.zork.command.Command;

import java.util.ArrayList;
import java.util.List;

public class GoCommand implements Command {

    private Player player;
    private Room currentRoom;
    private String dir;

    @Override
    public int numArgs() {
        return 1;
    }

    @Override
    public String getCommand() {
        return "go";
    }

    @Override
    public void execute(Game game, List<String> args) {
        this.player = game.getPlayer();
        this.currentRoom = game.getPlayer().getLocation();
        this.dir = args.get(0);

        if (args.size() < numArgs()){
            System.out.println("go where?");
        } else if (args.size() > numArgs()){
            System.out.println("what do u mean?");
        } else {

            if (!(dir.equals("north") || dir.equals("south") || dir.equals("east") || dir.equals("west"))){
                System.out.println("you cant go there");
                System.out.println("you can go: north, south, east, west");
            } else {
                if (currentRoom.nextRoom(dir) != null){
                    player.setLocation(currentRoom.nextRoom(dir));
                    System.out.println("you just enter " + currentRoom.nextRoom(dir).getName());
                    System.out.println(currentRoom.nextRoom(dir).getDescription());
                } else {
                    System.out.println("no door");
                }
            }
        }
    }
}
