package locality;

public class Human {
    private long age; //Значение поля должно быть больше 0
    private void checkAge(long age){
        if(age <= 0) throw new IllegalArgumentException("Age can't be below 0");
    }
    public void setAge(long age){
        checkAge(age);
        this.age = age;
    }
    public long getAge(){
        return age;
    }
}
