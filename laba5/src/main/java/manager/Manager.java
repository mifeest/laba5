package manager;

import exceptions.FailedClassException;
import exceptions.IllegalValueException;

import java.util.Scanner;

public abstract class Manager<T> {
    public abstract T isFile(Scanner scanner, boolean fileMode) throws IllegalValueException, FailedClassException;

    public static Long isLong(Scanner scanner, boolean fileMode, String name, Boolean isNull)
            throws IllegalValueException {
        Console.print("Введите " + name + ":", fileMode);
        Long res = null;
        while (true) {
            String str = scanner.nextLine().trim();
            try {
                res = Long.parseLong(str);
                if (res != null) {
                    return res;
                }
                if (fileMode) {
                    throw new IllegalValueException("Введено недопустимое значение.", str);
                } else {
                    Console.print("Значение должно быть типа Long! Попробуйте еще раз.", fileMode);
                    return res;
                }
            } catch (NumberFormatException e) {
                if (fileMode) {
                    throw new IllegalValueException("Значение должно быть числом типа Long.", str);
                }
                Console.print("Значение должно быть числом типа Long! Попробуйте еще раз.", fileMode);
            }
        }
    }

    public static float isFloat(Scanner scanner, boolean fileMode, String name) throws IllegalValueException {
        Console.print("Введите " + name + ":", fileMode);
        while (true) {
            String str = scanner.nextLine().trim();
            float res;
            try {
                res = Float.parseFloat(str);
                return res;
            } catch (NumberFormatException e) {
                if (fileMode) {
                    throw new IllegalValueException("Введено недопустимое значение.", str);
                }
                Console.print("Значение должно быть числом типа float! Попробуйте еще раз.", fileMode);
            }
        }
    }

    public static double isDouble(Scanner scanner, boolean fileMode, String name) throws IllegalValueException {
        Console.print("Введите " + name + ":", fileMode);
        while (true) {
            String str = scanner.nextLine().trim();
            double res;
            try {
                res = Double.parseDouble(str);
                return res;
            } catch (NumberFormatException e) {
                if (fileMode) {
                    throw new IllegalValueException("Введено недопустимое значение.", str);
                }
                Console.print("Значение должно быть числом типа double! Попробуйте еще раз.", fileMode);
            }
        }
    }
}
