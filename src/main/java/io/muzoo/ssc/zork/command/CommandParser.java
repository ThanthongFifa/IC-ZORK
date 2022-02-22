package io.muzoo.ssc.zork.command;

import io.muzoo.ssc.zork.command.impl.HelpCommand;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CommandParser {

    private List<String> allCommand = new ArrayList<>();
    {
        allCommand.addAll(CommandFactory.getAll());
    }


    public List<String> parse(String rawInput){ // make "go north" to ["go", "north"]
        String cmd = null;
        String input = rawInput.trim();

        for (String command: allCommand){
            if (input.startsWith(command)){
                cmd = command;
            }
        }
        if (cmd == null){
            return Arrays.asList("unknown");
        }

        Command command = CommandFactory.get(cmd);

        if (command.numArgs() > 0){
            if (!(input.length() < cmd.length()+1)) {
                String arg = input.substring(cmd.length() + 1);
                //System.out.println(Arrays.asList(cmd, arg));
                return Arrays.asList(cmd, arg);
            } else {
                return Arrays.asList("unknown");
            }
        } else {
            //System.out.println(Arrays.asList(cmd));
            return Arrays.asList(cmd);
        }
    }
}
