package commands;

import exceptions.IllegalValueException;
import manager.CommandManager;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class Help extends Command {
    private CommandManager commandManager;
    public Help(CommandManager commandManager){
        super("help","вывести список доступных команд",false);
        this.commandManager = commandManager;
    }

    @Override
    public void execute(String argument, boolean fileMode, Scanner scanner) throws IllegalValueException {
        Collection<Command> commands = commandManager.getCommandMap().values();
        System.out.println("Доступны команды:");
        for (Command command : commands){
            System.out.println(command.getName() + ":" + command.getDescription());
        }
    }
    public void execute(String[] args) throws Exception{
        CommandManager commandManager = new CommandManager();
        LinkedHashMap<String, Command> commandList = commandManager.getCommandList();
        for (String name: commandList.keySet()){
            Command command = commandList.get(name);
            System.out.println(command.getDescription());
        }
    }
}
