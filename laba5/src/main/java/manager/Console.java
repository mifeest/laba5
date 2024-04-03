package manager;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Console {


    public static String data_path;

    public void start(InputStream input, String[] args) {
        Scanner scanner = new Scanner(input);

        CommandManager commandManager = new CommandManager();

        new CollectionManager();
        try {
            System.out.println("Downloading data from file...");
            XMLReader.read(args[0], true);
            data_path = args[0];
            System.out.println("Everything is OK.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Error while reading file\n" + args[0]);
            System.exit(0);

            System.out.println("Welcome to app!");
            while (scanner.hasNextLine()) {
                String command = scanner.nextLine().trim();
            }
        }
    }
    public static void print(String output, boolean fileMode){
        if (fileMode){
            return;
        }
        else {
            System.out.println(output);
        }
    }
    }

