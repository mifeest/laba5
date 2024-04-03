package manager;

import commands.Command;
import commands.Help;

import java.util.LinkedHashMap;

public class CommandManager {
    private static LinkedHashMap<String, Command> commandMap;
    public CommandManager(){
        commandMap = new LinkedHashMap<>();
        commandMap.put("help",new Help(this));
    }
    public LinkedHashMap<String, Command> getCommandMap(){
        return commandMap;
    }


    public static void startExecuting(String line) throws Exception {
        String commandName = line.split(" ")[0];

        Command command = commandMap.get(commandName);
        command.execute(line.split(" "));

    }
    public LinkedHashMap<String, Command> getCommandList() {
        return commandMap;
    }

}
