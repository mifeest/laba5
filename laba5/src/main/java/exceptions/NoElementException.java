package exceptions;

public class NoElementException extends Exception{
    public NoElementException(String key){
        super("Нет элемента с данным ключом: " + key);
    }
    public NoElementException(Integer id){
        super("Нет элемента с данным id: " + id);
    }
}
