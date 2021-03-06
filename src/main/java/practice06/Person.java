package practice06;

public class Person {

    private final String name;
    private final int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }


    public Integer getAge() {
        return age;
    }


    public String introduce(){
        return "My name is " + this.name+". I am "+this.age+" years old.";
    }
}

