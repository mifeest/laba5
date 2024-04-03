package manager;

import java.util.Scanner;

public class RunManager {
    private static CommandManager commandManager;
    public static void launch() {
        System.out.println("Введите <help> для вывода доступных команд.");
        commandManager = new CommandManager();

        while (true) {
            Scanner scanner = new Scanner(System.in);
            String request = scanner.nextLine();
            request = request.trim();
            String[] listRequest = request.split(" ");


        }
    }
}
