package exceptions;

import lombok.Getter;

@Getter
public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        if (age > 0) {
            this.age = age;
        } else {
            throw new MyRuntimeException("Age < 0");
        }
    }

    public void setAge(int age) throws MyException {
        if (age < 0) {
            throw new MyException("Age < 0");
        }
        this.age = age;
    }
}
