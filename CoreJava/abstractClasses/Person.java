package CoreJava.abstractClasses;

public abstract class Person {
    public abstract String getDescription();
    private String name;

    public Person(String s){
        name = s;
    }

    public String getName(){
        return name;
    }
}
