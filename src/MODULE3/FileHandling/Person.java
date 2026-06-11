package MODULE3.FileHandling;

import java.io.Serializable;

public class Person implements Serializable {
    int age;
    String name;
    char gender;

    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
}
