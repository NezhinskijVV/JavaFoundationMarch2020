package interfaces;

import java.io.Serializable;

public class Man implements Comparable<Man>, Serializable {
    private String name;
    private int age;

    public Man(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Man o) {
        return this.age - o.getAge();
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}
