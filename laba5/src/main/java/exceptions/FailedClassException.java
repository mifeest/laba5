package exceptions;

public class FailedClassException extends Exception {
    private Class<?> problemClass;

    public FailedClassException(String message, Class<?> problemClass) {
        super(message + " Проблема в классе: " + problemClass.getSimpleName());
        this.problemClass = problemClass;
    }

    public Class<?> getProblemClass() {
        return problemClass;
    }
}
