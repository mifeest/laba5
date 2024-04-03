package locality.localityForm;

import exceptions.FailedClassException;
import exceptions.IllegalValueException;
import locality.Coordinates;
import manager.Manager;
import manager.Validator;

import java.util.Scanner;


public class CoordinatesForm extends Manager<Coordinates> {

    @Override
    public Coordinates isFile(Scanner scanner, boolean fileMode) throws IllegalValueException, FailedClassException {
        Float x = isFloat(scanner, fileMode, "координату х");
        Double y = isDouble(scanner, fileMode,"координата y");
        Coordinates newCoords = new Coordinates(x, y);
        if (!Validator.coordValidation(newCoords)){
            throw new FailedClassException("Недопустимое значение в поле!", Coordinates.class);
        }
        return newCoords;
    }
}

