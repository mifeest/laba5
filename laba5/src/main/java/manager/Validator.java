package manager;

import locality.Coordinates;

public class Validator {
    public static boolean coordValidation(Coordinates coords){
        if (coords == null){
            return false;
        }
        return coords.getX() != null;
    }
}
