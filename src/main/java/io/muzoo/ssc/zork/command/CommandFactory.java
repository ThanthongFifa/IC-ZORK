package io.muzoo.ssc.zork.command;

import io.muzoo.ssc.zork.command.impl.*;

import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CommandFactory {

    private static final List<Class<? extends Command>> COMMANDS = Arrays.asList(
            ExitCommand.class,
            InfoCommand.class,
            GoCommand.class,
            PlayCommand.class,
            MapCommand.class,
            TakeCommand.class,
            DropCommand.class,
            QuitCommand.class,
            HelpCommand.class,
            AttackWithCommand.class,
            HealCommand.class,
            SaveCommand.class,
            LoadCommand.class
    );

    private static final Map<String, Command> COMMAND_MAP = new HashMap<>();

    static {{
        for (Class<? extends Command> commandClass: COMMANDS){
            try {
                Command command = commandClass.getDeclaredConstructor().newInstance();
                COMMAND_MAP.put(command.getCommand(), command);
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
            }
        }
    }}

    public static Command get(String command){
        return COMMAND_MAP.get(command);
    }

    public static List<String> getAll(){
        return COMMAND_MAP.keySet().stream().collect(Collectors.toList());
    }
}
