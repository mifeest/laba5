package commands;

import exceptions.IllegalValueException;
import lombok.Getter;

import java.util.Scanner;

@Getter

public abstract class Command {
    protected String name = "";
    protected String description = "";
    protected boolean args;
    public Command(String name,String description,Boolean args){
        this.name = name;
        this.description = description;
        this.args = args;
    }
    public Command(){}
    public abstract void execute(String argument, boolean fileMode, Scanner scanner) throws IllegalValueException;

    public abstract void execute(String[] s) throws Exception;
}
