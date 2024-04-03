package manager;

import jakarta.xml.bind.JAXBException;
import locality.City;
import manager.Console;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

            File file = new File(args[0]);
            if (file.canRead() && file.canWrite()){
                Console console = new Console();
                console.start(System.in, args);
            }
            else {
                System.out.println("You do not have enough root");
            }
        }
    }




